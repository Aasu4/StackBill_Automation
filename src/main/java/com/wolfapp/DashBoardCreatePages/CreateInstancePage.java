package com.wolfapp.DashBoardCreatePages;

import com.framework.base.Locators;
import com.framework.base.SeleniumWrapper;

public class CreateInstancePage extends SeleniumWrapper {

	public CreateInstancePage clickInstance1() {
		click(locateElement(Locators.XPATH, "//div[@class='dropdown-menu show']//button[@class='dropdown-item'][1]"));
		System.out.println("Used Top Create Instance");
		return this;
	}

}
