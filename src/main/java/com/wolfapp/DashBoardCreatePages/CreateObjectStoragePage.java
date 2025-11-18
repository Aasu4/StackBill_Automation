package com.wolfapp.DashBoardCreatePages;

import com.framework.base.Locators;
import com.framework.base.SeleniumWrapper;

public class CreateObjectStoragePage extends SeleniumWrapper {
	

	public CreateObjectStoragePage clickNativeAutoscale1() {
		click(Locators.XPATH,"//div[@class='dropdown-menu show']//button[@class='dropdown-item'][10]");
		 System.out.println("Store and retrieve your data");
		return this;

}
}
