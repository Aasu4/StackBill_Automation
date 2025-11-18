package com.wolfapp.AppPages;

import com.framework.base.Locators;
import com.wolfapp.base.ProjectSpecificMethods;

public class MarketPlacePage extends ProjectSpecificMethods {
	
	public CommunityPage clickMarketplace() {
		click(Locators.XPATH, "//div//ul[@id='marketplace-menus']//a[normalize-space()='Marketplace']");
		System.out.println("Click to View Marketplace");
		return new CommunityPage();
	}
	
	

}
