package testCases;

import java.util.concurrent.TimeoutException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.wolfapp.base.DashboardPage;
import com.wolfapp.base.ProjectSpecificMethods;

public class TC015SecurityGroup extends ProjectSpecificMethods {
	
	@BeforeTest
	public void setValues() {
		testcaseName = "TC015_Security_Group";
		testDescription = "Security Group";
		authors = "Aishwarya";
		category = "Smoke";
	}
	
	@Test
	public void CreateSecurityGroup() throws InterruptedException, TimeoutException {
		DashboardPage dashboardPage = runLoginFlow();
		dashboardPage.clickHome().clickNetwork().clickSecurityGroup().addSecurityGroup();
}
}
