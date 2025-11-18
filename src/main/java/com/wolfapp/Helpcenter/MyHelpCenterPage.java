package com.wolfapp.Helpcenter;

import com.framework.base.SeleniumWrapper;
import com.wolfapp.base.DashboardPage;

public class MyHelpCenterPage extends SeleniumWrapper {

	public DashboardPage viewHelpCenter() {
	

		System.out.println("Display Help Docs");
		reportStep("Click to View Help Center", "pass");


		return new DashboardPage();
	}
}
