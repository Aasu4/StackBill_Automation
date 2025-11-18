package com.wolfapp.DashBoardCreatePages;

import com.framework.base.Locators;
import com.framework.base.SeleniumWrapper;

public class CreateLoadBalancerPage extends SeleniumWrapper {
	
	public CreateLoadBalancerPage clickLoadBalancer1() {
		click(Locators.XPATH,"//div[@class='dropdown-menu show']//button[@class='dropdown-item'][7]");
		System.out.println("Used Top LoadBalancer");
		return this;
		
	}

}
