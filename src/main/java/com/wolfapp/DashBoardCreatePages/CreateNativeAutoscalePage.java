package com.wolfapp.DashBoardCreatePages;

import com.framework.base.Locators;
import com.framework.base.SeleniumWrapper;

public class CreateNativeAutoscalePage extends SeleniumWrapper {
	
	public CreateNativeAutoscalePage clickNativeAutoscale1() {
		click(Locators.XPATH,"//div[@class='dropdown-menu show']//button[@class='dropdown-item'][9]");
	System.out.println("Used Top ativeAutoscale");
	return this;
	}
}
