package testCases;

import java.util.concurrent.TimeoutException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.wolfapp.base.DashboardPage;
import com.wolfapp.base.ProjectSpecificMethods;
public class TC018AppsPage {
	

	

	public class TC013VPCNetwork extends ProjectSpecificMethods {
		
		
		@BeforeTest
		public void setValues() {
			testcaseName = "TC018_Apps_Page";
			testDescription = "APPS Page";
			authors = "Aiswarya";
			category = "Smoke";
		}
		
		@Test
		public void CreateApps() throws InterruptedException, TimeoutException {
			DashboardPage dashboardPage = runLoginFlow();
			dashboardPage.clickHome().clickAPPS().clickMarketPlace().clickCommunity().clicMyImagesAndIso().clickMyISO().clickMyTemplate();
	}
	}

}
