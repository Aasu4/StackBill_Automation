package com.wolfapp.OSimages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.framework.base.Locators;
import com.framework.base.SeleniumWrapper;
import com.wolfapp.ComputeofferingPlans.AllOfferings;
import com.wolfapp.utils.ConfigReader;

public class AllOsImages extends SeleniumWrapper {

	public AllOfferings listOsImages() throws InterruptedException {

		
		// Option-1

		// Option-2
		String osList = ConfigReader.getProperty("osImages").split(",")[0].trim();
		String osName = osList;

		// Click the "All" filter button
		clickUsingJs(locateElement(Locators.XPATH,"//label[@for='all' and @class='btn btn-outline-primary']"));
		WebElement quickSearch = locateElement(Locators.XPATH,"//input[@placeholder='Template Search']");
		// Set value using JavaScript (to trigger Angular/React events properly)
		getDriver().executeScript("arguments[0].value = '';", quickSearch);
		Thread.sleep(300);
		getDriver().executeScript("arguments[0].value = arguments[1];"
				+ "arguments[0].dispatchEvent(new Event('input', { bubbles: true }));"
				+ "arguments[0].dispatchEvent(new Event('change', { bubbles: true }));", quickSearch, osName); // Option-2
		System.out.println("Searched OS: " + osName);
		Thread.sleep(1000);
		// Click on the OS image
		/*clickUsingJs(locateElement(Locators.XPATH,"//p[text()='" + osName + "']/ancestor::a"));
		System.out.println("Selected OS Image: " + osName);
		Thread.sleep(2000); // optional wait before next OS
		return new AllOfferings();*/
		
		String xpath = "//p[starts-with(normalize-space(.), '" + osName + "')]/ancestor::a";
		WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(10));
		WebElement osElement = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(xpath)));
		clickUsingJs(osElement);
		System.out.println("Selected OS Image: " + osName);
		Thread.sleep(2000); // optional wait before next OS
		return new AllOfferings();
	}
}

//old		
/*
 * WebElement quickSearch =
 * driver.findElement(By.xpath("//input[@placeholder='Template Search']"));
 * Actions act =new Actions(driver);
 * act.click(quickSearch).sendKeys("Ubuntu-20.04")
 * .keyDown(Keys.ENTER).keyUp(Keys.ENTER).perform();
 * 
 * //need to check this part tmrw WebElement clickplan = driver.findElement(By.
 * xpath("//div//div[@class='row os-image-wrapper']//p[normalize-space()='Ubuntu-20.04']"
 * )); //Thread.sleep(2000);
 * js.executeScript("arguments[0].scrollIntoView(true);", clickplan);
 * 
 * clickplan = clickOSWait.until(ExpectedConditions.elementToBeClickable(By.
 * xpath("//div//div[@class='row os-image-wrapper']//p[normalize-space()='Ubuntu-20.04']"
 * ))); //Thread.sleep(3000); js.executeScript("arguments[0].click();",
 * clickplan); return new AllOfferings();
 */
