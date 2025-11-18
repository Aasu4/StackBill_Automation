package testCases;
	
	import org.testng.annotations.BeforeTest;
	import org.testng.annotations.Test;

	import com.wolfapp.base.DashboardPage;
	import com.wolfapp.base.ProjectSpecificMethods;

	public class TC025QuotaAndEvents extends ProjectSpecificMethods {

		@BeforeTest
		public void setValues() {
			testcaseName = "TC025_QuotaAndEvents";
			testDescription = "Verify QuotaAndEvents";
			authors = "Aiswarya";
			category = "Smoke";
		}

		@Test
		public void QuotaAndEvents() throws InterruptedException {

			DashboardPage dashboardPage = runLoginFlow();
			dashboardPage.clickHome().clickCompany().clickQuotaLimit().displayQuota().clickHome().clickCompany().clickMyActivity()
			.displayEvents();
			
			
		}
	}

