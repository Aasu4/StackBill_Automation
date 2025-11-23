package testCases;

import java.util.concurrent.TimeoutException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.wolfapp.base.DashboardPage;
import com.wolfapp.base.ProjectSpecificMethods;

public class TC008VolumeSnapShot extends ProjectSpecificMethods {
	
	@BeforeTest
	public void setValues() {
		testcaseName = "TC008_volume_snapshot";
		testDescription = "volume snapshot";
		authors = "Aishwarya";
		category = "Smoke";
	}
	
	@Test
	public void VolumeSnapshotPage() throws InterruptedException, TimeoutException {
		 DashboardPage dashboardPage = runLoginFlow();
	     dashboardPage.clickHome().clickCompute().clickVolumeSnapShot();
	}
}
	

