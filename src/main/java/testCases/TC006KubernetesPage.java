package testCases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.wolfapp.base.DashboardPage;
import com.wolfapp.base.ProjectSpecificMethods;

public class TC006KubernetesPage extends ProjectSpecificMethods {
	
	@BeforeTest
	public void setValues() {
		testcaseName = "TC006_Kunernetes_Page";
		testDescription = "Verify the kubernetes";
		authors = "Aiswarya";
		category = "Smoke";
	}
	
	@Test
	public void KubernetesPage() throws InterruptedException {
	
	 DashboardPage dashboardPage = runLoginFlow();
	 dashboardPage.clickHome().clickCompute().clickKubernetes()
	.createKubernetes().kubAllPlans();
	//.searchPlan().addNetwork().addKey().deployCluster().listInstances().kubernetList();
	 
	}
}
