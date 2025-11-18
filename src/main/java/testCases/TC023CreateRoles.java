package testCases;
	

	import org.testng.annotations.BeforeTest;
	import org.testng.annotations.Test;

	import com.wolfapp.base.DashboardPage;
	import com.wolfapp.base.ProjectSpecificMethods;

	public class TC023CreateRoles extends ProjectSpecificMethods {
		
		@BeforeTest
		public void setValues() {
			testcaseName = "TC023_Create_Roles";
			testDescription = "Create Roles";
			authors = "Aiswarya";
			category = "Smoke";
		}
		
		@Test
		public void CreateRoles() throws InterruptedException {
		
		 DashboardPage dashboardPage = runLoginFlow();
		 dashboardPage.clickHome().clickCompany().clickRolePrivileges().displayRoles().createRole();
		}
	}

