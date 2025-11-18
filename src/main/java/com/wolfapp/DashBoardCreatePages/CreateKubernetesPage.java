package com.wolfapp.DashBoardCreatePages;

import com.framework.base.Locators;
import com.framework.base.SeleniumWrapper;

public class CreateKubernetesPage extends SeleniumWrapper{
	
	public CreateKubernetesPage clickKubernetes1() {
		click(Locators.XPATH,"//div[@class='dropdown-menu show']//button[@class='dropdown-item'][2]");
		System.out.println("Used Top Create Kubernetes");
		return this;
	}

}
