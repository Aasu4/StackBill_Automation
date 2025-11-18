package com.wolfapp.AppPages;

import com.framework.base.Locators;
import com.wolfapp.base.ProjectSpecificMethods;

public class FeaturedPage extends ProjectSpecificMethods {

	public FeaturedPage clickFeatured() {
		click(Locators.XPATH, "//div//ul[@id='marketplace-menus']//a[normalize-space()='Featured']");
		System.out.println("Click to View Featured List");
		return this;
	}

	public FeaturedPage clickMarketPlace() {
		click(Locators.XPATH, "//div//ul[@id='marketplace-menus']//a[normalize-space()='Marketplace']");
		System.out.println("Click to View Featured List");
		return this;
	}

	public FeaturedPage clickCommunity() {
		click(Locators.XPATH, "//div//ul[@id='marketplace-menus']//a[normalize-space()='Community']");
		System.out.println("Click to View Featured List");
		return this;
	}

	public MyImagesPage clicMyImagesAndIso() {
		click(Locators.XPATH, "//div//ul[@id='marketplace-menus']//a[normalize-space()='My Images & ISO']");
		System.out.println("Click to View Featured List");
		return new MyImagesPage();
	}

}
