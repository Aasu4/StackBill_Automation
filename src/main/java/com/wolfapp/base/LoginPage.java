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
/*
 * driver.findElement(By.xpath("//input[@id='email']")).sendKeys(username);
 * System.out.println("Entered Username: " + username); return this; }
 */

/*
 * public LoginPage enterUserName(String username) { WebElement usernameField =
 * driver.findElement(By.xpath("//input[@id='email']"));
 * 
 * // Clear any pre-existing text usernameField.clear();
 * 
 * // Send keys one character at a time to avoid missing characters for (char ch
 * : username.toCharArray()) { usernameField.sendKeys(Character.toString(ch));
 * try { Thread.sleep(50); // Add a small delay to avoid skipping characters }
 * catch (InterruptedException e) { e.printStackTrace(); } }
 * 
 * // Use JavaScriptExecutor to retrieve the entered value JavascriptExecutor js
 * = (JavascriptExecutor) driver; String enteredText = (String)
 * js.executeScript("return arguments[0].value;", usernameField);
 * 
 * // Print the entered username for debugging
 * System.out.println("Entered Username (After Input): " + enteredText);
 * 
 * // Validate if the entered text matches expected if
 * (!enteredText.equals(username)) {
 * System.out.println("Warning: Username entered incorrectly!"); }
 * 
 * return this; }
 */

/*
 * public LoginPage enterUserName() { String username =
 * ConfigReader.getProperty("username");
 * driver.findElement(By.xpath("//input[@id='email']")).sendKeys(username);
 * System.out.println("Entered Username: " + username); return this; }
 * 
 * public LoginPage enterPassword() { String password =
 * ConfigReader.getProperty("password");
 * driver.findElement(By.xpath("//input[@id='password']")).sendKeys(password);
 * System.out.println("Entered Password: " + password); return this; }
 * 
 * public DashboardPage clickLogin() {
 * driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
 * return new DashboardPage(); }
 */

/*
 * old data public LoginPage enterUserName() {
 * driver.findElement(By.xpath("//input[@id='email']")).sendKeys(
 * "qatesting4@assistanz.com"); System.out.println("Entered My Email id");
 * return this; }
 * 
 * public LoginPage enterPassword () {
 * driver.findElement(By.xpath("//input[@id='password']")).sendKeys(
 * "Test@123abc@1233"); System.out.println("Entered My Password"); return this;
 * 
 * }
 * 
 * public DashboardPage clickLogin() {
 * driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
 * return new DashboardPage(); }
 */

/*
 * WebElement emailField = driver.findElement(By.xpath("//input[@id='email']"));
 * 
 * JavascriptExecutor js = (JavascriptExecutor) driver;
 * js.executeScript("arguments[0].value='qtesting4@assistanz.com';",
 * emailField);
 */
/*
 * WebElement pwdField =
 * driver.findElement(By.xpath("//input[@id='password']")); JavascriptExecutor
 * js = (JavascriptExecutor) driver;
 * js.executeScript("arguments[0].value='Test@123abc@123';", pwdField);
 */

// Login with User login credentials
// public void enterUserName () {
/*
 * Object for the login page: LoginPage lp = new LoginPage(); return lp; Instead
 * of storing like above can write, this=LoginPage
 */
// return new LoginPage();////if it is return to this same page can use "This

/*
 * public LoginPage enterUserName () {
 * 
 * driver.findElement(By.xpath("//input[@id='email']")).sendKeys(
 * "qtesting4@assistanz.com");
 * 
 * return this; // //Here get error bcuz of the void,mouse hover and click
 * chanege, the public void changes as above }
 */

/*
 * public LoginPage enterUserName() { WebElement emailField =
 * driver.findElement(By.xpath("//input[@id='email']")); emailField.clear();
 * 
 * Actions actions = new Actions(driver); actions.sendKeys(emailField,
 * "qtesting@assistanz.com").perform(); //
 * emailField.sendKeys("qatesting@assistanz.com");
 * 
 * // Wait for the value to be set completely try { Thread.sleep(500); // Small
 * delay to allow input to register (better: use WebDriverWait) } catch
 * (InterruptedException e) { e.printStackTrace(); }
 * 
 * // Retrieve entered value String enteredValue =
 * emailField.getAttribute("value"); System.out.println("Email Entered: " +
 * enteredValue);
 * 
 * return this; }
 */

/*
 * public LoginPage enterUserName(String username) { // Accepts a parameter
 * driver.findElement(By.xpath("//input[@id='email']")).sendKeys(username);
 * return this; }
 * 
 * public LoginPage enterPassword(String password) { // Accepts a parameter
 * driver.findElement(By.xpath("//input[@id='password']")).sendKeys(password);
 * return this; }
 * 
 * public DashboardPage clickLogin() {
 * driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
 * return new DashboardPage(); } }
 */

/*
 * Login page LoginTest page TestDataProvider.java
 */
