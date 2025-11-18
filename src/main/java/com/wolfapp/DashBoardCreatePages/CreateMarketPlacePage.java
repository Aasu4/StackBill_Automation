package com.wolfapp.DashBoardCreatePages;

import com.framework.base.Locators;
import com.wolfapp.base.ProjectSpecificMethods;

public class CreateMarketPlacePage extends ProjectSpecificMethods{

	public CreateMarketPlacePage clickMarketplace1() {
		click(Locators.XPATH,"//div[@class='dropdown-menu show']//button[@class='dropdown-item'][3]");
		System.out.println("Used Top Create Marketplace");
		return this;
	}
	
	

}
