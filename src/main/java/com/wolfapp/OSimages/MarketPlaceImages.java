package com.wolfapp.OSimages;

import com.framework.base.Locators;
import com.framework.base.SeleniumWrapper;
import com.github.javafaker.Faker;
import com.wolfapp.NetworkPages.VPCPage;
import com.wolfapp.base.DashboardPage;

public class MarketPlaceImages  extends SeleniumWrapper {
	
	public MarketPlaceImages viewMarketplace() {
		click(Locators.XPATH,"//ul//li//a[normalize-space()='Marketplace']");
		reportStep("Viewed MarketPlace Successful", "pass");
	return this;
	}
}
