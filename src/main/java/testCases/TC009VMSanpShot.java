package testCases;

import java.util.concurrent.TimeoutException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.wolfapp.base.DashboardPage;
import com.wolfapp.base.ProjectSpecificMethods;

public class TC009VMSanpShot extends ProjectSpecificMethods {

	@BeforeTest
	public void setValues() {
		testcaseName = "TC009_VM_snapshot";
		testDescription = "VM snapshot";
		authors = "Aishwarya";
		category = "Smoke";
	}

	@Test
	public void VMSnapshotPage() throws InterruptedException, TimeoutException {
		DashboardPage dashboardPage = runLoginFlow();
		dashboardPage.clickHome().clickCompute().clickVMSnapShot().createVmSnapshot();
	}
}
