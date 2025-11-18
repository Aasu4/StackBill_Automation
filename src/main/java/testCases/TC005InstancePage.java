package testCases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.wolfapp.base.DashboardPage;
import com.wolfapp.base.ProjectSpecificMethods;

public class TC005InstancePage extends ProjectSpecificMethods {

	@BeforeTest
	public void setValues() {
		testcaseName = "TC005_Instance_Page";
		testDescription = "Verify the instance";
		authors = "Aiswarya";
		category = "Smoke";
	}

	@Test
	public void DisplayListInstance() throws InterruptedException {
		DashboardPage dashboardPage = runLoginFlow();
		dashboardPage.clickHome().clickCompute().clickInstance().listInstances();
	}
}