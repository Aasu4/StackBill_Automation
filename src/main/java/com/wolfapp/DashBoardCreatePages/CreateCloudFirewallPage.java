 package com.wolfapp.DashBoardCreatePages;

import com.framework.base.Locators;
import com.framework.base.SeleniumWrapper;

public class CreateCloudFirewallPage extends SeleniumWrapper {
	
	public CreateCloudFirewallPage clickCloudFirewall1() {
		click(Locators.XPATH,"//div[@class='dropdown-menu show']//button[@class='dropdown-item'][8]");
		System.out.println("Used Top CloudFirewall");
		return this;
	}
	
	

}
