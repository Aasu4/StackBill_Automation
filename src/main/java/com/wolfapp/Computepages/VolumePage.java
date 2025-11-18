package com.wolfapp.Computepages;

import java.util.Random;
import java.util.concurrent.TimeoutException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.framework.base.Locators;
import com.framework.base.SeleniumWrapper;

public class VolumePage extends SeleniumWrapper {

	public VolumePage listvolume() {
		return this;
	}

	public VolumePage addVolume() {
		click(Locators.XPATH,"//button//span[normalize-space()='Add Volume']");

		// Generate a random number between 1 and 1000 (adjust range if needed)
		int randomNum = new Random().nextInt(1000) + 1;
		String volumeName = "Additional-Disk-" + randomNum;
		clearAndType(locateElement(Locators.XPATH,"//input[@id='name']"), volumeName);
		return this;
	}


	/*
	 * choose offering category
	 * WebElement forAll = driver.findElement(By.xpath("//label[@id='allComputeOffer']"));
		js.executeScript("arguments[0].scrollIntoView(true);", forAll);
		Thread.sleep(3000);
		forAll = offerWait.until(ExpectedConditions.elementToBeClickable(By.xpath("//label[@id='allComputeOffer']")));
		js.executeScript("arguments[0].click();", forAll);
		System.out.println("Select Compute offerings");
	 */

	public VolumePage selectVolumeSize() throws TimeoutException, InterruptedException   {
		boolean found = false;
		int maxRetries = 10;
		int retries = 0;

		while (!found && retries < maxRetries) {
			WebElement additionalDisk = getWait().until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='swiper-wrapper']//a[@class='swiper-slide storage-plan swiper-slide-next']")));
			System.out.println("Additional Disk found!");

			// Scroll into view to make sure it's interactable
			getDriver().executeScript("arguments[0].scrollIntoView(true);", additionalDisk);
			Thread.sleep(500);
			click(additionalDisk);
			found = true;

			if (!found) {
				throw new TimeoutException("No additionalDisk found after " + retries + " attempts.");
			}
		}
		return this;
	}


	public VolumePage createVolume() {
		click(locateElement(Locators.XPATH,"//div[@class='ms-4']//button[normalize-space()='Create']"));
		System.out.println("Clicked to Create Additional Volume");
		return this;

	}

	public VolumePage uploadVolume() {
		
		return this;
	} 

}
