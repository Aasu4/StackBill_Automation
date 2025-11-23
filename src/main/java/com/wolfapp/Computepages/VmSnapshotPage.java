package com.wolfapp.Computepages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.framework.base.Locators;
import com.framework.base.SeleniumWrapper;
import com.github.javafaker.Faker;
import com.wolfapp.utils.TestUtil;

public class VmSnapshotPage extends SeleniumWrapper {

	public VmSnapshotPage createVmSnapshot() {
		click(Locators.XPATH,"//button//span[normalize-space()='Add VM Snapshot']");
		// ✅ Wait until loader disappears
		//getWait().until(ExpectedConditions.invisibilityOfElementLocated(By.className("loader-overlay")));
		
		//selectDropDownUsingValue(locateElement(Locators.XPATH,"//select[@formcontrolname='virtualmachine']"), "1: Object");
		//String name = new Faker().name().fullName();
		String vmSnapName = TestUtil.generateName("vm-snap");
		clearAndType(locateElement(Locators.XPATH,"//input[@id='name']"), vmSnapName);
		clearAndType(locateElement(Locators.XPATH,"//textarea[@id='description']"), "Vmsnap-one");
		//click(Locators.XPATH,"//button[normalize-space()='Create']");
		click(Locators.XPATH,"//button[normalize-space()='Cancel']");

		return this;
	}
}
