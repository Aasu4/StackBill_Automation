package testCases;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.wolfapp.base.DashboardPage;
import com.wolfapp.base.ProjectSpecificMethods;



public class TC003CreateInstance extends ProjectSpecificMethods {
	
	@BeforeTest
	public void setValues() {
		testcaseName = "TC003_Create_Instance";
		testDescription = "Verify the user can create new instance";
		authors = "Aiswarya";
		category = "Smoke";
	}
	
	@Test
	public void CreateNewInstance() throws InterruptedException, IOException {
		
		 DashboardPage dashboardPage = runLoginFlow();
		  
	     dashboardPage.clickHome().clickCompute().clickInstance().clickAddUp().quickDeploy().selectLocation().zoneA().clickLinux().listOsImages().clickALLPlans().allWithPayAsGo()
	     .selectNetwork().groupText().sshKeys().InstanceName().clickDeploy().listInstances();
	}
	
}

	     
