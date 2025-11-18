package com.wolfapp.DeployTypes;


import com.framework.base.Locators;
import com.framework.base.SeleniumWrapper;
import com.wolfapp.Computepages.CreateInstance;

public class DeployTypes extends SeleniumWrapper{
	

	public CreateInstance quickDeploy () {
		clickUsingJs(locateElement(Locators.XPATH,"//div//h4[contains(text(),'Quick Deploy')]"));
		return new CreateInstance();
	}

	public CreateInstance AdvancedDeploy () {
		click(Locators.XPATH,"//div//h4[normalize-space()='Advanced Deploy']");
		return new CreateInstance();
	}

}
