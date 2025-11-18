package com.wolfapp.AppPages;

import com.framework.base.Locators;
import com.wolfapp.base.ProjectSpecificMethods;

public class ISOPage extends ProjectSpecificMethods {
	
	public ISOPage clickMyISO() {
		click(Locators.XPATH, "//div//ul[@id='marketplace-menus']//a[normalize-space()='ISO']");
		System.out.println("Click to view My ISO");
	return this;	
	}
}
