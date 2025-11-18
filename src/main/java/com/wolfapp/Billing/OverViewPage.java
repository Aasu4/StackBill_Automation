package com.wolfapp.Billing;

import com.framework.base.Locators;
import com.framework.base.SeleniumWrapper;
import com.wolfapp.SidebarPages.SideBarPages;

public class OverViewPage extends SeleniumWrapper { 

	public SideBarPages OverView() {
		System.out.println("Screenshot of OverView");		
		return new SideBarPages();
	}

	public OverViewPage billingSummary() {
		locateElement(Locators.XPATH, "//div//p");
		return this;
	}

	public OverViewPage viewResources() {
		locateElement(Locators.XPATH, "Top 5 Resource Usage");
		return this;
	}

	public OverViewPage billingNotification() {
		locateElement(Locators.XPATH, "Billing Notifications");
		return this;
	}

	public OverViewPage budgetAlert() {
		locateElement(Locators.XPATH, "//button[normalize-space()='Setup Alert']");
		return this;
	}
}
