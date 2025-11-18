package testCases;

import java.util.concurrent.TimeoutException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.wolfapp.base.DashboardPage;
import com.wolfapp.base.ProjectSpecificMethods;

public class TC011AffinityGroups extends ProjectSpecificMethods {
	
	@BeforeTest
	public void setValues() {
		testcaseName = "TC011_Affinity_Groups";
		testDescription = "Affinity_Groups";
		authors = "Aishwarya";
		category = "Smoke";
	}
	
	@Test
	public void AffinityGroups() throws InterruptedException, TimeoutException {
		DashboardPage dashboardPage = runLoginFlow();
		dashboardPage.clickHome().clickCompute().clickAffinityGroup().listAffinity().addAffinity();
}
}
