package testCases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.wolfapp.base.DashboardPage;
import com.wolfapp.base.ProjectSpecificMethods;

public class TC024CreateSubUsers extends ProjectSpecificMethods {

	@BeforeTest
	public void setValues() {
		testcaseName = "TC024_Create_Subusers";
		testDescription = "Verify Sub User accounts";
		authors = "Aiswarya";
		category = "Smoke";
	}

	@Test
	public void CreateSubUsers() throws InterruptedException {

		DashboardPage dashboardPage = runLoginFlow();
		dashboardPage.clickHome().clickCompany().clickSubUsers().clickAdduser()	 ;
	}
}



