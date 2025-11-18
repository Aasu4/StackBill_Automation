package testCases;

import java.util.concurrent.TimeoutException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.wolfapp.base.DashboardPage;
import com.wolfapp.base.ProjectSpecificMethods;

public class TC014VPNGateway extends ProjectSpecificMethods {
	
	@BeforeTest
	public void setValues() {
		testcaseName = "TC014_VPC_Gateway";
		testDescription = "VPC Gateway";
		authors = "Aishwarya";
		category = "Smoke";
	}
	
	@Test
	public void CreateVPN() throws InterruptedException, TimeoutException {
		DashboardPage dashboardPage = runLoginFlow();
		dashboardPage.clickHome().clickNetwork().clickVPN().addVPN();
}
}
