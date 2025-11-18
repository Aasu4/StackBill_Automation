package testCases;

import java.util.concurrent.TimeoutException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.wolfapp.base.DashboardPage;
import com.wolfapp.base.ProjectSpecificMethods;

public class TC012BasicNetworks extends ProjectSpecificMethods {
	
	@BeforeTest
	public void setValues() {
		testcaseName = "TC012_Basic_Network";
		testDescription = "Basic Network";
		authors = "Aishwarya";
		category = "Smoke";
	}
	
	@Test
	public void BasicNetwork() throws InterruptedException, TimeoutException {
		DashboardPage dashboardPage = runLoginFlow();
		dashboardPage.clickHome().clickNetwork().clickBasicNetwork().addNetwork();
}
}
