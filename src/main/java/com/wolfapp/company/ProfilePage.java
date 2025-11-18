package com.wolfapp.company;
import com.framework.base.Locators;
import com.framework.base.SeleniumWrapper;


public class ProfilePage extends SeleniumWrapper {
	
	public ProfilePage uploadLogo() {
		System.out.println("Click to Upload Logo");
		return this;
	}
	
	public ProfilePage completeUserProfile() {
		
		clearAndType(locateElement(Locators.XPATH, "//input[@id='firstName']"), "Aiswarya");

		clearAndType(locateElement(Locators.XPATH, "//input[@id='lastName']"), "S");
		
		clearAndType(locateElement(Locators.XPATH, "//input[@id='address']"), "123, Sample Street");
		
		clearAndType(locateElement(Locators.XPATH, "//input[@id='secondaryPhone']"), "9123456780");

		clearAndType(locateElement(Locators.XPATH, "//input[@id='cellPhone']"), "9876543210");

		clickUsingJs(locateElement(Locators.XPATH, "//button[normalize-space()='Save Changes']"));
		reportStep("Confirm Save Changes", "pass");

		
		return this;
		
	}

}
