package com.wolfapp.NetworkPages;

import com.framework.base.Locators;
import com.framework.base.SeleniumWrapper;
import com.github.javafaker.Faker;

public class SecurityGroupPage extends SeleniumWrapper {

	public SecurityGroupPage addSecurityGroup() {
		click(Locators.XPATH,"//button[@class='btn btn-primary sb-btn-primary rounded-pill']//span[normalize-space()='Add']");
		//Add secutiry Group
		clearAndType(locateElement(Locators.XPATH,"//input[@id='name']"), "Security-group-"+ new Faker().name().title());
		clearAndType(locateElement(Locators.XPATH,"//textarea[@id='description']"), "Test-Security-Group");
		click(Locators.XPATH,"//label[@class='form-check sb-custom-radio']//span[normalize-space()='Enable']");	
		click(Locators.XPATH,"//button[@type='submit']");
		return this;
	}
	
}
