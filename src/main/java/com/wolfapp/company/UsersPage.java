package com.wolfapp.company;
import com.framework.base.Locators;
import com.framework.base.SeleniumWrapper;


public class UsersPage extends SeleniumWrapper {
	
	public UsersPage clickAdduser() {		
		click(Locators.XPATH, "//button[normalize-space()='Add User']");
		clearAndType(locateElement(Locators.XPATH, "//input[@id='firstName']"), "Aiswarya");
		clearAndType(locateElement(Locators.XPATH, "//input[@id='lastName']"), "S");
		clearAndType(locateElement(Locators.XPATH, "//input[@id='address']"), "123, Sample Street");
		click(Locators.XPATH, "//button[normalize-space()='Cancel']");
		
		reportStep("Add user Successful", "pass");

		return this;
		
		

		
		
	}

}
