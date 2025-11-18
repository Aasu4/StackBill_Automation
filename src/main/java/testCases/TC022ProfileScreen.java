package testCases;
	
	
	import java.util.concurrent.TimeoutException;

	import org.testng.annotations.BeforeTest;
	import org.testng.annotations.Test;

	import com.wolfapp.base.DashboardPage;
	import com.wolfapp.base.ProjectSpecificMethods;


	public class TC022ProfileScreen extends ProjectSpecificMethods{
		
		@BeforeTest
		public void setValues() {
			testcaseName = "TC0022_ProfileScreen";
			testDescription = "Profile_Screen";
			authors = "Aiswarya";
			category = "Smoke";
		}
		
		@Test
		public void Profilescreen() throws InterruptedException, TimeoutException {
			DashboardPage dashboardPage = runLoginFlow();
			dashboardPage.clickHome().clickCompany().clickProfilescreen1().uploadLogo().completeUserProfile();
	}


}



