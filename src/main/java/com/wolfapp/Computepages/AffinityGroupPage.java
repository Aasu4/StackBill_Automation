package com.wolfapp.Computepages;

import com.framework.base.Locators;
import com.framework.base.SeleniumWrapper;

public class AffinityGroupPage extends SeleniumWrapper {
	
	public AffinityGroupPage listAffinity() {
		
		System.out.println("Listed Affinity groups");
	return this;
	}
	
	
	public AffinityGroupPage addAffinity() {
		click(Locators.XPATH,"//button//span[normalize-space()='Add']");
		clearAndType(locateElement(Locators.XPATH,"//input[@id='name']"), "Test-aff");
		clearAndType(locateElement(Locators.XPATH,"//input[@id='description']"), "Test");
		selectDropDownUsingValue(locateElement(Locators.XPATH,"//select[@formcontrolname='type']"), "2: Object");
	    click(Locators.XPATH,"//button[@type='submit']");
		
		return this;
		
		
	}

}
