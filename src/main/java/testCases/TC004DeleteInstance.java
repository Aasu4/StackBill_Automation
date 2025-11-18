package testCases;


import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.wolfapp.base.DashboardPage;
import com.wolfapp.base.ProjectSpecificMethods;

public class TC004DeleteInstance extends ProjectSpecificMethods{
	
	@BeforeTest
	public void setValues() {
		testcaseName = "TC004_Delete_Instance";
		testDescription = "Verify the user can delete the existig instance";
		authors = "Aiswarya";
		category = "Smoke";
	}
	
	@Test
	public void DeleteInstance() throws InterruptedException {
	
	DashboardPage dashboardPage = runLoginFlow();
	dashboardPage.clickHome().clickCompute().clickInstance().listInstances().selectInstance().destoryVM();

}
}