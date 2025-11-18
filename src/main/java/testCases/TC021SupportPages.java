package testCases;
	
	import java.util.concurrent.TimeoutException;

	import org.testng.annotations.BeforeTest;
	import org.testng.annotations.Test;

	import com.wolfapp.base.DashboardPage;
	import com.wolfapp.base.ProjectSpecificMethods;


	public class TC021SupportPages extends ProjectSpecificMethods{
		
		@BeforeTest
		public void setValues() {
			testcaseName = "TC021_Support_Pages";
			testDescription = "Support_Pages";
			authors = "Aiswarya";
			category = "Smoke";
		}
		
		@Test
		public void supportPages() throws InterruptedException, TimeoutException {
			DashboardPage dashboardPage = runLoginFlow();
			dashboardPage.clickHome().clickSupport().displayTickets();
			//.clickTotalTickets().clickActiveTickets().clickOpenTickets()
			//.clickInprogressTickets().clickClosedTickets().clickFeedbackTickets();

	}


}
