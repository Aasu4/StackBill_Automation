package com.wolfapp.NetworkPages;

import com.framework.base.Locators;
import com.framework.base.SeleniumWrapper;

public class LoadBalancerPage extends SeleniumWrapper {

	public LoadBalancerPage addLoadBalancer() {
		click(Locators.XPATH,"//button//span[normalize-space()='Create Load Balancer']");
		return this;	
	}

	public LoadBalancerPage createLoadBalancer() {
		clearAndType(locateElement(Locators.XPATH,"//input[@id='lbGroupName']"), "LB-1");
		clearAndType(locateElement(Locators.XPATH,"//input[@id='description']"), "LB-1");
		selectDropDownUsingText(locateElement(Locators.XPATH,"//select[@formcontrolname='network']"), "default-network1");
		selectDropDownUsingValue(locateElement(Locators.XPATH,"//select[@formcontrolname='ipAddress']"), "1: Object");
		clearAndType(locateElement(Locators.XPATH,"//input[@id='name']"), "Policy-1");
		selectDropDownUsingText(locateElement(Locators.XPATH,"//div[normalize-space(text())='Load Balancer']/following::select[@id='protocol'][1]"), "TCP");
		//Select public port
		clearAndType(locateElement(Locators.XPATH,"//input[@id='publicPort']"), "80");
		//To select Protocol -Instance
		selectDropDownUsingText(locateElement(Locators.XPATH,"//div[normalize-space(text())='Load Balancer']/following::select[@id='protocol'][2]"), "TCP");
		clearAndType(locateElement(Locators.XPATH,"//input[@id='privatePort']"), "8080");
		//Choose algorithm 
		click(Locators.XPATH,"//div[@class='row']//div[@class='col-lg-4 mb-3 col-md-6 algorithm-sticky-session'][1]");

		// Wait for the sticky session option to become clickable
		// Wait for element to be clickable
		click(Locators.XPATH,"//input[@value='None']");
		click(Locators.XPATH,"//button[normalize-space()='Cancel']");
		return this;
	}



}
