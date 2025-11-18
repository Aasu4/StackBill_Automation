package com.wolfapp.company;

import com.framework.base.Locators;
import com.framework.base.SeleniumWrapper;

public class CompanyPages extends SeleniumWrapper {

	public ProfilePage clickProfilescreen1() {
		click(Locators.XPATH,"//div//span[normalize-space()='Profile']");
		System.out.println("User specific settings");
		return new ProfilePage();	
	}

	public UsersPage clickSubUsers() {
		click(Locators.XPATH,"//div//span[normalize-space()='Users']");
		System.out.println("User management");
		return new UsersPage();	
	}

	public RolePage clickRolePrivileges() {
		click(Locators.XPATH,"//div//span[normalize-space()='Role Privileges']");
		System.out.println("RBAC Control");
		return new RolePage();	
	}


	public QuotaLimitPage clickQuotaLimit() {
		click(Locators.XPATH,"//div//span[normalize-space()='Quota Limit']");
		System.out.println("Quota Manager");
		return new QuotaLimitPage();	
	}


	public MyActivityPage clickMyActivity() {
		click(Locators.XPATH,"//div//span[normalize-space()='My Activity']");
		System.out.println("User activity log");
		return new MyActivityPage();	
	}
	
	
}
