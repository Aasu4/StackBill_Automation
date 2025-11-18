package com.wolfapp.Addons;

import com.framework.base.Locators;
import com.framework.base.SeleniumWrapper;

public class AddonsPage extends SeleniumWrapper {

	public AddonsPage clickObjectStorage() {
		click(Locators.XPATH, "//div//span[normalize-space()='Object Storage']");
		
		System.out.println("Unleash the Power of Object Storage");
		
		return this;
	}
	
	public AddonsPage clickSupportPlans() {
		click(Locators.XPATH, "");
		System.out.println("Click to view Support Plan");
		return this;
	}
}
