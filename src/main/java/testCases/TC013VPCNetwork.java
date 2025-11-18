package testCases;

import java.util.concurrent.TimeoutException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.wolfapp.base.DashboardPage;
import com.wolfapp.base.ProjectSpecificMethods;

public class TC013VPCNetwork extends ProjectSpecificMethods {
	
	
	@BeforeTest
	public void setValues() {
		testcaseName = "TC013_VPC_Network";
		testDescription = "VPC Network";
		authors = "Aiswarya";
		category = "Smoke";
	}
	
	@Test
	public void CreateVPCNetwork() throws InterruptedException, TimeoutException {
		DashboardPage dashboardPage = runLoginFlow();
		dashboardPage.clickHome().clickNetwork().clickVPC().addVPC();
}
}