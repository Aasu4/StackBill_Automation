package com.wolfapp.SidebarPages;
import com.framework.base.Locators;
import com.framework.base.SeleniumWrapper;
import com.wolfapp.Addons.AddonsPage;
import com.wolfapp.AppPages.FeaturedPage;
import com.wolfapp.Billing.BillingPages;
import com.wolfapp.Computepages.ComputePage;
import com.wolfapp.Helpcenter.MyHelpCenterPage;
import com.wolfapp.NetworkPages.NetworkPages;
import com.wolfapp.SupportPages.SupportPlanPage;
import com.wolfapp.company.CompanyPages;

public class SideBarPages extends SeleniumWrapper {
	
	
	public ComputePage clickCompute() {
		mouseHover(locateElement(Locators.XPATH,"//div[normalize-space()='Compute']"));
		System.out.println("SideBar Compute");
		return new ComputePage();
	}
	
	public NetworkPages clickNetwork() {
		mouseHover(locateElement(Locators.XPATH,"//div[normalize-space()='Network']"));
		System.out.println("SideBar Network");
		return new NetworkPages();
	}
	
	public  FeaturedPage clickAPPS() {
		click(Locators.XPATH,"//div[normalize-space()='Apps']");
		System.out.println("Click to View App MarketPlace");
		reportStep("View APPS Page", "pass");
		return new FeaturedPage();
	}

	public AddonsPage clickSideBarAddons() {
		click(Locators.XPATH,"//div[normalize-space()='Add-On']");
		System.out.println("Click to View Addons");
		return new AddonsPage();
	}
	
	public BillingPages clickBilling() {
		click(Locators.XPATH,"//div[normalize-space()='Billing']");
		System.out.println("SideBar Billing");
		return new BillingPages();
	}

	public SupportPlanPage clickSupport() {
		click(Locators.XPATH,"//div[normalize-space()='Compute']");
		System.out.println("SideBar Support");
		return new SupportPlanPage();
	}

	public CompanyPages clickCompany() {
		click(Locators.XPATH,"//div[normalize-space()='Company']");
		System.out.println("SideBar Company");
		return new CompanyPages();
	}

	public MyHelpCenterPage clickSideHelpCenter() {
		click(Locators.XPATH,"//div[normalize-space()='Help Center']");
		System.out.println("SideBar HelpCenter");
		return new MyHelpCenterPage();
	}

	public SideBarPages clickChangeLog() {
		click(Locators.XPATH,"//div[normalize-space()='Changelog']");
		System.out.println("SideBar ChangeLog");
		return this;
	}
}
