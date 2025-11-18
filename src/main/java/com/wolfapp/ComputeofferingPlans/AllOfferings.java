package com.wolfapp.ComputeofferingPlans;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.framework.base.Locators;
import com.framework.base.SeleniumWrapper;
import com.wolfapp.NetworkOfferings.ChooseNetworks;
import com.wolfapp.utils.ConfigReader;

public class AllOfferings extends SeleniumWrapper {

	public AllOfferings clickALLPlans() throws InterruptedException {
		WebElement forAll = locateElement(Locators.XPATH, "//label[@id='allComputeOffer']");
		getDriver().executeScript("arguments[0].scrollIntoView(true);", forAll);
		Thread.sleep(3000);
		forAll = getWait().until(ExpectedConditions.elementToBeClickable(By.xpath("//label[@id='allComputeOffer']")));
		clickUsingJs(forAll);
		System.out.println("Select Compute offerings");
		return this;
	}

	public ChooseNetworks allWithPayAsGo() throws InterruptedException {

		// Retrieve the "payAsYouGoPlan" property as a comma-separated list of plans
		String payAsyouGoPlan = ConfigReader.getProperty("payAsyouGoPlan").split(",")[1].trim(); // Assuming this is
		// like
		// "BundlePlan01,sfs-compute-offering,BundlePlan03,..."
		String payPlans = payAsyouGoPlan;

		// Click the "Pay as you go" option
		WebElement payAsGo = locateElement(Locators.XPATH,
				"//div[@class='col-xl-3 col-lg-4 col-md-6']//div[text()='Pay as you go']");
		Thread.sleep(2000);
		getDriver().executeScript("arguments[0].scrollIntoView(true);", payAsGo);
		payAsGo = getWait().until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='col-xl-3 col-lg-4 col-md-6']//div[text()='Pay as you go']")));
		Thread.sleep(2000);
		getDriver().executeScript("arguments[0].click();", payAsGo);

		// Perform the search and selection for the selected plan
		WebElement quickSearch = locateElement(Locators.XPATH, "//input[@id='typeahead-prevent-manual-entry']");
		Actions act = new Actions(getDriver());
		act.click(quickSearch).sendKeys(payPlans).keyDown(Keys.ENTER).keyUp(Keys.ENTER).perform();

		// Click on the corresponding plan (after it is available in the UI)
		WebElement clickplan = locateElement(Locators.XPATH, "//div//ul//li[text()='" + payPlans + "']");
		getDriver().executeScript("arguments[0].scrollIntoView(true);", clickplan);

		clickplan = getWait().until(ExpectedConditions.elementToBeClickable(By.xpath("//div//ul//li[text()='" + payPlans + "']")));
		clickUsingJs(clickplan);

		System.out.println("Selected Plan: " + payPlans);
		Thread.sleep(2000); // optional wait before next steps

		return new ChooseNetworks();
	}

	public ChooseNetworks allWithBundle() throws InterruptedException {
		return new ChooseNetworks();

	}

	/*
	 * For manual entry WebElement payAsGo = driver.findElement(By.
	 * xpath("//div[@class='col-xl-3 col-lg-4 col-md-6']//div[text()='Pay as you go']"
	 * )); Thread.sleep(2000);
	 * js.executeScript("arguments[0].scrollIntoView(true);", payAsGo);
	 * 
	 * payAsGo = offerWait.until(ExpectedConditions.elementToBeClickable(By.
	 * xpath("//div[@class='col-xl-3 col-lg-4 col-md-6']//div[text()='Pay as you go']"
	 * ))); Thread.sleep(2000); js.executeScript("arguments[0].click();", payAsGo);
	 * 
	 * 
	 * //WebElement quickSearch =
	 * driver.findElement(By.xpath("//input[@placeholder='Quick Search']"));
	 * WebElement quickSearch =
	 * driver.findElement(By.xpath("//input[@id='typeahead-prevent-manual-entry']"))
	 * ; Actions act =new Actions(driver);
	 * act.click(quickSearch).sendKeys("BundlePlan03")
	 * .keyDown(Keys.ENTER).keyUp(Keys.ENTER).perform();
	 * 
	 * 
	 * WebElement clickplan =
	 * driver.findElement(By.xpath("//div//ul//li[text()='BundlePlan03']"));
	 * //Thread.sleep(2000); js.executeScript("arguments[0].scrollIntoView(true);",
	 * clickplan);
	 * 
	 * clickplan = offerWait.until(ExpectedConditions.elementToBeClickable(By.xpath(
	 * "//div//ul//li[text()='BundlePlan03']"))); //Thread.sleep(3000);
	 * js.executeScript("arguments[0].click();", clickplan);
	 * 
	 * return new ChooseNetworks();
	 */

}
