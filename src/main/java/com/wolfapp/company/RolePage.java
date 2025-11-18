package com.wolfapp.company;
import com.framework.base.Locators;
import com.framework.base.SeleniumWrapper;


public class RolePage extends SeleniumWrapper {
	
	public RolePage displayRoles() {
		System.out.println("Displayed Role Priviledges");
		return this;
	}
	
	public RolePage  createRole() {
		reportStep("Display Event Page", "pass");
		click(Locators.XPATH, "//button//span[normalize-space()='Create New Role']");
		clearAndType(locateElement(Locators.XPATH, "//input[@id='roleName']"), "Full-Role");
		clearAndType(locateElement(Locators.XPATH, "//input[@id='description']"), "Full-Role");
		clickUsingJs(locateElement(Locators.XPATH, "//span[normalize-space()='Check All']"));
		
		click(Locators.XPATH, "//button[normalize-space()='Create']");
		reportStep("Display Created", "pass");


		return this;
		
	}
	
	

}
