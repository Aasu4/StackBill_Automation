package com.wolfapp.SupportPages;

import com.framework.base.Locators;
import com.framework.base.SeleniumWrapper;

public class SupportCurrentPlan extends SeleniumWrapper {
	
	public SupportCurrentPlan clickCurrentPlan() {
		click(Locators.XPATH,"//div//a[@class='ms-3']//h6[normalize-space()='Current Plan']");
		System.out.println("Click to View Current Plan");
		return this;
		
	}

}
