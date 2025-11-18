package com.wolfapp.company;
import com.framework.base.SeleniumWrapper;
import com.wolfapp.base.DashboardPage;


public class QuotaLimitPage extends SeleniumWrapper{
	
	public DashboardPage displayQuota() {
		System.out.println("Display Quota Limit");
		return new DashboardPage();
	}

}
