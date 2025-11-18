package testCases;

import java.util.concurrent.TimeoutException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.wolfapp.base.DashboardPage;
import com.wolfapp.base.ProjectSpecificMethods;


public class TC020BillingPages extends ProjectSpecificMethods{
	
	@BeforeTest
	public void setValues() {
		testcaseName = "TC020_Billing_Pages";
		testDescription = "Addon_Page";
		authors = "Aiswarya";
		category = "Smoke";
	}
	
	@Test
	public void BillingPages() throws InterruptedException, TimeoutException {
		DashboardPage dashboardPage = runLoginFlow();
		dashboardPage.clickHome().clickBilling().clickOverview().OverView()
		.clickBilling().clickCostExplorer().displayCostExplorer();
		//.clickBilling().clickSavingsPlan().displayedRIPlan().displayBundlePlan();
}

}
