package com.wolfapp.Computepages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.framework.base.Locators;
import com.framework.base.SeleniumWrapper;
import com.wolfapp.utils.ConfigReader;

public class KubernetesPage extends SeleniumWrapper {

	public KubernetesPage createKubernetes() {
		click(Locators.XPATH, "//button//span[text()='Create Cluster']");
		clearAndType(locateElement(Locators.XPATH, "//input[@id='clusterName']"), "Test-kub");
		clearAndType(locateElement(Locators.XPATH, "//input[@id='description']"), "For Testing");
		clickUsingJs(locateElement(Locators.XPATH, "//div[@class='os-image-list']//div//p[normalize-space()='v1.28.4']"));
		return this;
	}

	public KubernetesPage kubAllPlans() {
		clickUsingJs(getWait().until(ExpectedConditions.elementToBeClickable(By.xpath("//label[@id='allComputeOffer']"))));
		System.out.println("Selected Kubernetes offerings");
		return this;
	}

	public KubernetesPage searchPlan() throws InterruptedException {
		//WebElement quickSearch = locateElement(Locators.XPATH, "//div//input[@placeholder='Quick Search']");
		//typeUsingAction(quickSearch, planName);
		//click(locateElement(Locators.XPATH,"//button//span[normalize-space()=='" + planName + "']"));
		
		String nodePlans = ConfigReader.getProperty("nodePlans").split(",")[1].trim(); // Assuming this is
		String payPlans = nodePlans;

		// Perform the search and selection for the selected plan
				WebElement quickSearch = locateElement(Locators.XPATH, "//div//input[@placeholder='Quick Search']");
				Actions act = new Actions(getDriver());
				act.click(quickSearch).sendKeys(payPlans).keyDown(Keys.ENTER).keyUp(Keys.ENTER).click().perform();

				//Click on the corresponding plan (after it is available in the UI)
				WebElement clickplan = locateElement(Locators.XPATH, "//div//ul//li[text()='" + payPlans + "']");
				getDriver().executeScript("arguments[0].scrollIntoView(true);", clickplan);

				clickplan = getWait().until(ExpectedConditions.elementToBeClickable(By.xpath("//div//ul//li[text()='" + payPlans + "']")));
				clickUsingJs(clickplan);

				System.out.println("Selected Plan: " + payPlans);
				Thread.sleep(2000); // optional wait before next steps
		return this;
	}

	public KubernetesPage addNetwork() {
		// To select Network
		WebElement selectNetwork = locateElement(Locators.XPATH,"//select[@formcontrolname='network']");
		getDriver().executeScript("arguments[0].scrollIntoView(true);", selectNetwork);
		selectDropDownUsingIndex(selectNetwork, 1);
		return this;
	}

	public KubernetesPage addKey() {
		// To select KeyPair
		WebElement selectKey = locateElement(Locators.XPATH,"//select[@formcontrolname='keypair']");
		getDriver().executeScript("arguments[0].scrollIntoView(true);", selectKey);
		selectDropDownUsingIndex(selectKey, 1);
		return this;
	}

	public void networkMessage() {
		String text = getElementText(locateElement(Locators.XPATH,"//div[@class='accordion-content-header mb-4']"));
		System.out.println(text);
	}

	public InstancePage deployCluster() {
		clickUsingJs(locateElement(Locators.XPATH,"//button//span[text()='Create Cluster']"));
		return new InstancePage();
	}

}
