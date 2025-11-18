package testCases;

import java.util.concurrent.TimeoutException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.wolfapp.base.DashboardPage;
import com.wolfapp.base.ProjectSpecificMethods;

	public class TC019AddonPages extends ProjectSpecificMethods {
		
		
		@BeforeTest
		public void setValues() {
			testcaseName = "TC019_Addon_Pages";
			testDescription = "Addon_Page";
			authors = "Aiswarya";
			category = "Smoke";
		}
		
		@Test
		public void CreateAddons() throws InterruptedException, TimeoutException {
			DashboardPage dashboardPage = runLoginFlow();
			dashboardPage.clickHome().clickSideBarAddons().clickObjectStorage();
	}
	}


