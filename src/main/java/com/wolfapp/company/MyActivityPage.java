package com.wolfapp.company;
import com.framework.base.Locators;
import com.framework.base.SeleniumWrapper;
import com.wolfapp.base.DashboardPage;


public class MyActivityPage extends SeleniumWrapper {

	public MyActivityPage displayAlert() {
		click(Locators.XPATH,"//li//a[normalize-space()='Alerts']");
		System.out.println("Display Alerts");
		reportStep("Display Alert Page", "pass");
		return this;	
	}

	public DashboardPage displayEvents() {
		click(Locators.XPATH,"//li//a[normalize-space()='Events']");
		System.out.println("Display Events");
		reportStep("Display Event Page", "pass");
		return new DashboardPage();
	}
}
