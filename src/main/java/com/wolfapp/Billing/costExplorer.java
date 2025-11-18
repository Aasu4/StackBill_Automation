package com.wolfapp.Billing;

import com.framework.base.SeleniumWrapper;
import com.wolfapp.SidebarPages.SideBarPages;

public class costExplorer extends SeleniumWrapper {
	
	public SideBarPages displayCostExplorer() {
		System.out.println("Payment Summary and Savings Plans");
		return new SideBarPages();
	}
	

}
