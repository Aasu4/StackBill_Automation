package com.wolfapp.NetworkPages;

import com.framework.base.Locators;
import com.framework.base.SeleniumWrapper;
import com.github.javafaker.Faker;

public class VPCPage extends SeleniumWrapper {

	public VPCPage addVPC() {
		click(Locators.XPATH,"//button[@class='btn btn-primary sb-btn-primary rounded-pill']//span[normalize-space()='Add VPC']");
		clearAndType(locateElement(Locators.XPATH,"//input[@id='name']"), new Faker().name().title());
		clearAndType(locateElement(Locators.XPATH,"//input[@id='description']"), "VPC test");
		clearAndType(locateElement(Locators.XPATH,"//input[@id='SuperCIDR']"), "192.168.1.0/24");
		clearAndType(locateElement(Locators.XPATH,"//input[@id='DNSDomain']"), "255.255.255.192");
		selectDropDownUsingValue(locateElement(Locators.XPATH,"//select[@formcontrolname='vpcOffering']"), "1: Object");
		click(Locators.XPATH,"//button[normalize-space()='Add']");
	    System.out.println("VPC account created");
	return this;
	}
	
}
