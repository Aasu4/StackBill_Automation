package com.wolfapp.Billing;

import com.framework.base.Locators;
import com.framework.base.SeleniumWrapper;

public class SavingsPlan extends SeleniumWrapper {

	
	public SavingsPlan displayedRIPlan() {
		click(Locators.XPATH,"//button//span[text()='Add Instance']");

		System.out.println("RI-Summary");
		reportStep("Display RI summary Page", "pass");

		return this;
	}
	
	public SavingsPlan displayBundlePlan() {
		click(Locators.XPATH,"//button//span[text()='Add Instance']");

		System.out.println("Display Bundle Summary");
		reportStep("Display Bundle Summary Page", "pass");

		return this;
	}
}
