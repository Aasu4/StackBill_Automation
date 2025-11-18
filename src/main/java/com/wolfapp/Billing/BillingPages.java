package com.wolfapp.Billing;

import com.framework.base.Locators;
import com.framework.base.SeleniumWrapper;

public class BillingPages extends SeleniumWrapper {
	
	public OverViewPage clickOverview() {
		click(Locators.XPATH, "//div//span[normalize-space()='Overview']");
	return new OverViewPage();	
	}
	
	public costExplorer clickCostExplorer() {
		click(Locators.XPATH, "//div//span[normalize-space()='Cost Explorer']");
		return new costExplorer();	
		}
	
	public SavingsPlan clickSavingsPlan() {
		click(Locators.XPATH, "//div//span[normalize-space()='Savings Plans']");
		return new SavingsPlan();	
		}
	
	public BillingPages clickInvoices() {
		click(Locators.XPATH, "//div//span[normalize-space()='Invoices']");
		return this;	
		}
	
	public BillingPages clickReports() {
		click(Locators.XPATH, "//div//span[normalize-space()='Reports']");
		return this;	
		}
	
	
	
	
	
	
	
	

}
