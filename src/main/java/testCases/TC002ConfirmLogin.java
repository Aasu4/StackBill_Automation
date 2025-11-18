package testCases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.wolfapp.base.LoginPage;
import com.wolfapp.base.ProjectSpecificMethods;
import com.wolfapp.utils.ConfigReader;

public class TC002ConfirmLogin extends ProjectSpecificMethods {

	@BeforeTest
	public void setValues() {
		testcaseName = "TC002_Confirm_Login";
		testDescription = "Verify Login functionality with positive data";
		authors = "Aiswarya";
		category = "Smoke";
	}

	@DataProvider(name = "loginData")
	public Object[][] getData() {
		return new Object[][] { { ConfigReader.getProperty("username1"), ConfigReader.getProperty("password1") }};
				//{ ConfigReader.getProperty("username2"), ConfigReader.getProperty("password2") } };
	}

	@Test(dataProvider = "loginData")
	public void verifyLogin(String username, String password) throws InterruptedException {
		new LoginPage().enterUserName(username).enterPassword(password).clickLogin().verifyLoginSuccess();

		System.out.println("Login Test Completed for: " + username);

	}
}
