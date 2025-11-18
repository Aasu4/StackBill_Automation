package com.wolfapp.Computepages;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.framework.base.Locators;
import com.framework.base.SeleniumWrapper;
import com.wolfapp.OSimages.AllOsImages;
import com.wolfapp.utils.ConfigReader;

public class CreateInstance extends SeleniumWrapper {

	// Instance Location
	public CreateInstance selectLocation() throws InterruptedException {
		// Get the first location from config
		String locationName = ConfigReader.getProperty("instanceLocation").split(",")[0].trim();

		// Optional: Print it for debugging
		System.out.println("Selected Location: " + locationName);

		// Locate the zone header (optional if you just need the location click)
		String zone = getElementText(
				locateElement(Locators.XPATH, "//div//h4[normalize-space(text())='Choose your Instance Location']"));
		Thread.sleep(2000);
		System.out.println(zone);
		WebElement location = getWait().until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				"//div[@id='ngb-accordion-item-0']//div//div//div//div//div//div//p[text()='" + locationName + "']")));
		getDriver().executeScript("arguments[0].scrollIntoView(true);", location);
		clickUsingJs(location); // safer than .click() in case of overlays

		// location.click();
		return this;
	}

	// Instance Zone
	public CreateInstance zoneA() throws InterruptedException {
		String platform = getElementText(
				locateElement(Locators.XPATH, "//div//h4[normalize-space(text())='Choose Your Platform']"));
		System.out.println(platform);
		Thread.sleep(2000);
		return this;
	}

	public AllOsImages clickLinux() throws InterruptedException {
		// Linux platform
		WebElement linux = locateElement(Locators.XPATH, "//div[@class='row os-image-wrapper']//div//a[@class='os-image platform-image px-3 py-2 active']");
		Thread.sleep(2000);
		getDriver().executeScript("arguments[0].scrollIntoView(true);", linux);
		return new AllOsImages();
	}

	// Os images updated into= com.wolpapp.OSimages//

	// Plans updated into = com.wolfapp.ComputeOfferingPlans

	// NetworkOfferings = ChooseNetworks

	// SecurityGroups =SecurityGroups

	// SSHKeys =NewSShKeys

	
	// Read last used number from file
		private int readLastNumber() throws IOException {
			String vmFilePath = System.getProperty("user.dir")+File.separator+"vm_count.txt";
			File file = new File(vmFilePath);
			if (!file.exists())
				return 0; // If file doesn't exist, start from 0
			List<String> lines = Files.readAllLines(Paths.get(vmFilePath));
			return lines.isEmpty() ? 0 : Integer.parseInt(lines.get(0)); // Read number or default to 0
		}

		// Save new number to file
		private void saveLastNumber(int number) throws IOException {
			String vmFilePath = System.getProperty("user.dir")+File.separator+"vm_count.txt";
			FileWriter fw = new FileWriter(vmFilePath, false); // Overwrite file
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write(String.valueOf(number));
			bw.close();
		}
	// Here i used VM unique name steps:
	public CreateInstance InstanceName() throws InterruptedException, IOException {
		String chooseNameText = getElementText(locateElement(Locators.XPATH,"//p[text()='Choose your Instance Name and Number of Instances you want to create']"));
		System.out.println(chooseNameText);
		
		WebElement insNameField = getWait().until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='displayName']")));
		Thread.sleep(3000);
		// To create Unique name
		String uniqueName = generateUniqueName(); // Generate unique Test-VM name
		clearAndType(insNameField, uniqueName); // Enter it into the field 
		// insName.sendKeys("Network-VM");
		return this;
	}

	

	// Method to generate a unique name
	private String generateUniqueName() throws IOException {
		int lastNumber = readLastNumber(); // Get last used number
		int newNumber = lastNumber + 1; // Increment by 1
		saveLastNumber(newNumber); // Save new number to file
		return "Test-VM-" + newNumber; // Generate unique Test-VM name
	}

	public InstancePage clickDeploy() throws InterruptedException {
		File sourceFile = getDriver().getScreenshotAs(OutputType.FILE);
		click(Locators.XPATH,"//a[text()='Total Estimate']");
		reportStep("Total Estimation", "pass");

		Thread.sleep(3000);
		// File sourceFile= ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		File targetFile = new File(System.getProperty("user.dir") + "\\ScreenShots\\cost.png");
		sourceFile.renameTo(targetFile);
		click(Locators.XPATH,"//button[text()='Cancel']");
		clickUsingJs(locateElement(Locators.XPATH,"//span[text()='Deploy']"));
		reportStep("Click to Deploy", "pass");

		return new InstancePage();
	}
}
