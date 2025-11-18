package testCases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.wolfapp.base.ProjectSpecificMethods;

public class TC001Login extends ProjectSpecificMethods {
	
	@BeforeTest
	public void setValues() {
		testcaseName = "TC001_Login";
		testDescription ="Verify Login functionality with positive data";
		authors="Aiswarya";
		category ="Smoke";
	}
	
	 @Test
	    public void runLogin() throws InterruptedException {
		 runLoginFlow();
		 }
    }	