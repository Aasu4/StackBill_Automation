package com.wolfapp.AppPages;

import com.framework.base.Locators;
import com.framework.base.SeleniumWrapper;

public class MyImagesPage extends SeleniumWrapper {
	
	public MyImagesPage clickMyImageISO() {
		click(Locators.XPATH, "//div//ul[@id='marketplace-menus']//a[normalize-space()='My Images & ISO']");
		System.out.println("View My Images & ISO");
		return this;
	}
	
	public MyImagesPage clickMyISO() {
		click(Locators.XPATH, "//li//a[normalize-space()='ISO']");
		System.out.println("Click to view My Images");
		return this;
	}
	
	public MyImagesPage clickMyTemplate() {
		click(Locators.XPATH, "//li//a[normalize-space()='My Template']");
		System.out.println("Click to view My Images");
		return this;
	}
	
	

}
