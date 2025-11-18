package com.wolfapp.NetworkPages;

import com.framework.base.Locators;
import com.framework.base.SeleniumWrapper;

public class IPManagerPage extends SeleniumWrapper {
	
	public IPManagerPage addIPManager() {
		click(Locators.XPATH,"//button//span[normalize-space()='Acquire new Public IP']");
		selectDropDownUsingText(locateElement(Locators.XPATH,"//select[@formcontrolname='network']"), "default-network1");
		click(Locators.XPATH,"//input[@formcontrolname='agree']");
		click(Locators.XPATH,"//button[normalize-space()='Acquire']");
	    return this;
		
	}

}
