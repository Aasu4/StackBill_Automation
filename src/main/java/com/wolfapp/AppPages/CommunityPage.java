package com.wolfapp.AppPages;

import com.framework.base.Locators;
import com.framework.base.SeleniumWrapper;

public class CommunityPage extends SeleniumWrapper {
	
	public MyImagesPage clickCommunityPage() {
		click(Locators.XPATH, "//div//ul[@id='marketplace-menus']//a[normalize-space()='Community']");
		System.out.println("Click to View Community List");
		return new MyImagesPage();
	}
	

}
