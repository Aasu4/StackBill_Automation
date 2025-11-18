package testCases;

import java.util.concurrent.TimeoutException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.wolfapp.base.DashboardPage;
import com.wolfapp.base.ProjectSpecificMethods;

public class TC010SSHKeyCreation extends ProjectSpecificMethods {
	
	@BeforeTest
	public void setValues() {
		testcaseName = "TC010_SSHKey_Creation";
		testDescription = "SSH Key Creation";
		authors = "Aishwarya";
		category = "Smoke";
	}
	
	@Test
	public void SshCreation() throws InterruptedException, TimeoutException {
		DashboardPage dashboardPage = runLoginFlow();
		dashboardPage.clickHome().clickCompute().clickSSHKey().listSSHKeys().addSSHKey();
}
}
