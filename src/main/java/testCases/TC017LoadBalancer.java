package testCases;

import java.util.concurrent.TimeoutException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.wolfapp.base.DashboardPage;
import com.wolfapp.base.ProjectSpecificMethods;

public class TC017LoadBalancer extends ProjectSpecificMethods {
	
	@BeforeTest
	public void setValues() {
		testcaseName = "TC017_Load_Balancer";
		testDescription = "Load Balancer";
		authors = "Aishwarya";
		category = "Smoke";
	}
	
	@Test
	public void CreateLoadBalancer() throws InterruptedException, TimeoutException {
		DashboardPage dashboardPage = runLoginFlow();
		dashboardPage.clickHome().clickNetwork().clickLoadBalancer().addLoadBalancer().createLoadBalancer();
}
}
