package com.wolfapp.SSHKeys;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

import com.framework.base.Locators;
import com.framework.base.SeleniumWrapper;
import com.wolfapp.Computepages.CreateInstance;

public class NewSShKeys extends SeleniumWrapper {

	public CreateInstance sshKeys() throws InterruptedException {
		clickUsingJs(locateElement(Locators.XPATH, "//span[text()='Add SSH Key Pair']"));

		// Generate a random SSH key name
		int randomNum = (int) (Math.random() * 1000);
		String sshKeyName = "ssh-key-" + randomNum;
		System.out.println("Generated SSH Key Name: " + sshKeyName);
		
		typeAndTab(locateElement(Locators.XPATH,"//input[@id='sshKeyName']"), sshKeyName);
		typeAndTab(locateElement(Locators.XPATH,"//textarea[@id='description']"), sshKeyName);
		hoverAndClick(locateElement(Locators.XPATH,"//button[normalize-space(text())='Add']"));
		Thread.sleep(10000);
		click(Locators.XPATH,"//div//div[@class='modal-header']//button[@class='btn-close']");
		
		WebElement selectKey = getWait().until(ExpectedConditions.presenceOfElementLocated(By.xpath("//select[@formcontrolname='keypair']"))); // Improved
																														// XPath

		Select clickKey = new Select(selectKey);

		boolean keyFound = false;
		for (int i = 0; i < 15; i++) {
			List<WebElement> options = clickKey.getOptions();
			for (WebElement option : options) {
				if (option.getText().equals(sshKeyName)) {
					clickKey.selectByVisibleText(sshKeyName);
					System.out.println("Created key is selected: " + sshKeyName);
					keyFound = true;
					break;
				}
			}
			if (keyFound)
				break;
			Thread.sleep(1000); // wait and retry
		}

		if (!keyFound) {
			throw new TimeoutException("SSH Key '" + sshKeyName + "' not found in dropdown.");
		}

		System.out.println("Created key is selected");
		return new CreateInstance();
	}
}
