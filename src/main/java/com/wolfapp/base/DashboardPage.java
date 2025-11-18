package com.wolfapp.base;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.framework.base.Locators;
import com.wolfapp.SidebarPages.SideBarPages;

public class DashboardPage extends ProjectSpecificMethods {

	public DashboardPage verifyLoginSuccess() {
		String dashPage = getElementText(locateElement(Locators.XPATH, "//h6[contains(@class, 'title1-medium mb-0')]"));
		System.out.println("To Demo Portal:"+" "+dashPage);
		return this;
	}

	public SideBarPages clickHome() {
		click(Locators.XPATH, "//div[normalize-space()='Home']");
		System.out.println("SideBar Home");
		return new SideBarPages();
	}

	public DashboardPage createList() {
		click(Locators.XPATH, "//span[text()='Create']");
		System.out.println("Used Top Create List");
		return this;
	}
	
	public DashboardPage creditLimit() {
		String creditBalance = getElementText(locateElement(Locators.XPATH, "//div[@class='text-primary sb-text-primary fw-medium']"));
		System.out.println("Available Credit Limit is:"+" "+creditBalance);
		return this;
	}

	public DashboardPage moreLinks() {
		click(Locators.XPATH, "//div[@id='moreLinksDropdown']");
		System.out.println("Used Top moreLinks");
		return this;
	}

	public DashboardPage notifications() {
		click(Locators.XPATH, "//a[@id='notification']");
		System.out.println("View Notifications");
		//Locate the notification details
		List<WebElement> allList = locateElements(Locators.XPATH, "//div[@class='dropdown-menu dropdown-menu-end show']");
		for(WebElement listAll:allList) {
		// Print the text of each notification detail
		listAll.getText();
		}
		return this;
	}

	public DashboardPage topHelpCenter() {
		WebElement hc = locateElement(Locators.XPATH, "//a[@class='help']");
		click(hc);
		List<WebElement> hcCounts=hc.findElements(By.xpath("//div[starts-with(@class, 'helpCenterMenus')]"));
		System.out.println("Total HelpCenter Topics"+" "+hcCounts.size());
		return this;
	}

	public DashboardPage myProfile() {
		WebElement listDrop =getWait().until(ExpectedConditions.elementToBeClickable(By.xpath("//span[contains(@class,'d-inline-flex border')]//img[1]")));
		listDrop.click();
		WebElement myProfile= getWait().until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='dropdown-menu dropdown-menu-end show']//a[1]")));
		myProfile.click();
		String billType = getElementText(locateElement(Locators.XPATH, "//div[@class='text-center mt-2']"));
		System.out.println(billType);
		return this;

	}

	public DashboardPage myActivity() {
		WebElement listDrop =getWait().until(ExpectedConditions.elementToBeClickable(By.xpath("//span[contains(@class,'d-inline-flex border')]//img[1]")));
		listDrop.click();
		WebElement myActivity= getWait().until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='dropdown-menu dropdown-menu-end show']//a[2]")));
		myActivity.click();		
		return this;
	}

	public DashboardPage appInfo() {
		WebElement listDrop =getWait().until(ExpectedConditions.elementToBeClickable(By.xpath("//span[contains(@class,'d-inline-flex border')]//img[1]")));
		listDrop.click();
		WebElement appInfo= getWait().until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='dropdown-menu dropdown-menu-end show']//a[3]")));
		appInfo.click();
		String appStatus = getElementText(locateElement(Locators.XPATH, "//tr//td[normalize-space()='Status']"));
		System.out.println(appStatus);
		return this;

	}

	public DashboardPage mainEvent() {
		WebElement listDrop =getWait().until(ExpectedConditions.elementToBeClickable(By.xpath("//span[contains(@class,'d-inline-flex border')]//img[1]")));
		listDrop.click();
		WebElement mainEvent= getWait().until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='dropdown-menu dropdown-menu-end show']//a[4]")));
		mainEvent.click();
		//WebElement eventCounts=driver.findElement(By.xpath("//div[@class='container-fluid']"));
		List<WebElement> allCount= mainEvent.findElements(By.xpath("//div[@class='event mb-4 pb-4 col-lg-6']"));
		System.out.println("Total number of Events:"+" "+allCount.size());
		return this;

	}

	public  LoginPage clickLogout() {
		WebElement listDrop =getWait().until(ExpectedConditions.elementToBeClickable(By.xpath("//span[contains(@class,'d-inline-flex border')]//img[1]")));
		listDrop.click();
		WebElement logOut = getWait().until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='dropdown-menu dropdown-menu-end show']//a[5]")));
		logOut.click();
		String text = getElementText(locateElement(Locators.XPATH, "//span[normalize-space()='Not a member?']"));
		System.out.println(text);
		return new LoginPage();
	}

}



