package com.wolfapp.DashBoardCreatePages;

import com.framework.base.Locators;
import com.framework.base.SeleniumWrapper;

public class CreateVolumePage extends SeleniumWrapper{
	
	public CreateVolumePage clickVolume1() {
		click(Locators.XPATH,"//div[@class='dropdown-menu show']//button[@class='dropdown-item'][4]");
		System.out.println("Used Top Create Volume");
		return this;
	}

}
