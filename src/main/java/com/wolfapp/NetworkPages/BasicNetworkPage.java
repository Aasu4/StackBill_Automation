package com.wolfapp.NetworkPages;

import com.framework.base.Locators;
import com.framework.base.SeleniumWrapper;
import com.github.javafaker.Faker;

public class BasicNetworkPage extends SeleniumWrapper {

	public BasicNetworkPage clickBasicNetwork() {
		click(Locators.XPATH,"//div[@class='page-header py-3 bg-white sb-bg-white']//span[normalize-space()='Basic Network']");
		System.out.println("Basic Networks Listed");
		return this;
	}

	public BasicNetworkPage addNetwork() {
		click(Locators.XPATH,"//button[@id='addNetwork']");
		click(Locators.XPATH,"//button[normalize-space()='Add Isolated Network']");
		clearAndType(locateElement(Locators.XPATH,"//input[@id='name']"), new Faker().name().title());
		selectDropDownUsingText(locateElement(Locators.XPATH,"//select[@class='form-control form-select ng-untouched ng-pristine ng-invalid']"), "DefaultIsolatedNetworkOfferingWithSourceNatService");
		click(Locators.XPATH,"//button[@class='btn ms-1 btn-primary sb-btn-primary']//span[normalize-space()='Create']");
		return this;
	}
}
