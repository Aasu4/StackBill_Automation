package testCases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.wolfapp.base.DashboardPage;
import com.wolfapp.base.ProjectSpecificMethods;

public class TC026HelpCenter extends ProjectSpecificMethods {

	@BeforeTest
	public void setValues() {
		testcaseName = "TC026_HelpCneter";
		testDescription = "Verify HelpCenter";
		authors = "Aiswarya";
		category = "Smoke";
		
	}

	@Test
	public void HelpCenter() throws InterruptedException {

		DashboardPage dashboardPage = runLoginFlow();
		dashboardPage.clickHome().clickSideHelpCenter().viewHelpCenter();
	}
}