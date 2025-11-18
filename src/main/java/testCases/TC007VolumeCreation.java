package testCases;

import java.util.concurrent.TimeoutException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.wolfapp.base.DashboardPage;
import com.wolfapp.base.ProjectSpecificMethods;

public class TC007VolumeCreation extends ProjectSpecificMethods {
	
	@BeforeTest
	public void setValues() {
		testcaseName = "TC007_volume_ creation";
		testDescription = "Create volume";
		authors = "Aishwarya";
		category = "Smoke";
	}
	
	@Test
	public void VolumePage() throws InterruptedException, TimeoutException {
		 DashboardPage dashboardPage = runLoginFlow();
	     dashboardPage.clickHome().clickCompute().clickVolume().addVolume().selectVolumeSize().createVolume().listvolume();
	}
}
