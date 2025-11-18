package testCases;

import java.util.concurrent.TimeoutException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.wolfapp.base.DashboardPage;
import com.wolfapp.base.ProjectSpecificMethods;

public class TC016IpManager extends ProjectSpecificMethods {
	
	
	@BeforeTest
	public void setValues() {
		testcaseName = "TC016_IPManager";
		testDescription = "IP Manager";
		authors = "Aishwarya";
		category = "Smoke";
	}
	
	@Test
	public void CreateIPManager() throws InterruptedException, TimeoutException {
		DashboardPage dashboardPage = runLoginFlow();
		dashboardPage.clickHome().clickNetwork().clickIPManager().addIPManager();
}
}
