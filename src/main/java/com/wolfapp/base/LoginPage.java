package com.wolfapp.base;

import com.framework.base.Locators;
import com.framework.base.SeleniumWrapper;

public class LoginPage extends SeleniumWrapper {

	public LoginPage enterUserName(String username) {
		typeSlow(locateElement(Locators.XPATH, "//input[@id='email']"), username);
//		pause(1000);
//		clearAndType(locateElement(Locators.XPATH, "//input[@id='email']"), username);
		reportStep("Entered Username: " + username, "pass");
		/*
		 * // Set value and trigger necessary events js.executeScript(
		 * "arguments[0].value = arguments[1]; arguments[0].dispatchEvent(new Event('input', { bubbles: true })); arguments[0].dispatchEvent(new Event('change', { bubbles: true }));"
		 * , emailField, username);
		 */

		System.out.println("Entered Username: " + username);
		return this;
	}

	public LoginPage enterPassword(String password)  {
		typeSlow(locateElement(Locators.XPATH, "//input[@id='password']"), password);
//		clearAndType(locateElement(Locators.XPATH, "//input[@id='password']"), password);
		reportStep("Entered Password: " + password, "pass");
		System.out.println("Entered Password: " + password);
		pause(1000);
		return this;

	}

	public DashboardPage clickLogin() {
		click(Locators.XPATH, "//button[normalize-space()='Login']");
		reportStep("Login button clicked successfull", "pass");
		return new DashboardPage();
		// return this;
	}
}

