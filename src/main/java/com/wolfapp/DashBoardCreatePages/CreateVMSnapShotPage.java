package com.wolfapp.DashBoardCreatePages;

import com.framework.base.Locators;
import com.framework.base.SeleniumWrapper;

public class CreateVMSnapShotPage extends SeleniumWrapper{

	public CreateVMSnapShotPage clickVMSnapshots1() {
		click(Locators.XPATH,"//div[@class='dropdown-menu show']//button[@class='dropdown-item'][6]");
		System.out.println("Used Top VMSnapshots");
		return this;
	}
}
