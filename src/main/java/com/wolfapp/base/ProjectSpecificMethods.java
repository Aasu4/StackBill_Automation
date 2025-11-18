package com.wolfapp.base;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.framework.base.SeleniumWrapper;
import com.wolfapp.utils.ConfigReader;


public class ProjectSpecificMethods extends SeleniumWrapper{

	@BeforeMethod
	public void preCondition() throws InterruptedException, IOException {
		// Load properties
		ConfigReader.loadProperties();
		String browserName = ConfigReader.getProperty("browser");
		String url = ConfigReader.getProperty("url");
		setNode();
		startApp(browserName, url);
		/*String currentBrowserName =getDriver().getCapabilities().getBrowserName();
		
		if(currentBrowserName.equalsIgnoreCase("chrome")) {
			ConfigReader.setBrowserName("firefox");
		}else if(currentBrowserName.equalsIgnoreCase("firefox")) {
			ConfigReader.setBrowserName("chrome");
		}*/
		System.out.println("WebDriver initialized and launching browser...");
	}

	@AfterMethod
	public void postCondition() {
		quit();
	}
	
	
	 public DashboardPage runLoginFlow() {
	        // Read credentials from config.properties
	        String username = ConfigReader.getProperty("username1");
	        String password = ConfigReader.getProperty("password1");
	        System.out.println(username);
	
	return new LoginPage()
         .enterUserName(username)  // Pass username
         .enterPassword(password)  // Pass password
         .clickLogin()
         .verifyLoginSuccess();
		 } 
	
}