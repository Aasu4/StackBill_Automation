package com.wolfapp.Computepages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.framework.base.Locators;
import com.framework.base.SeleniumWrapper;
import com.github.javafaker.Faker;

public class VmSnapshotPage extends SeleniumWrapper {

	public VmSnapshotPage createVmSnapshot() {
		click(Locators.XPATH,"//button//span[normalize-space()='Add VM Snapshot']");
		// ✅ Wait until loader disappears
		getWait().until(ExpectedConditions.invisibilityOfElementLocated(By.className("loader-overlay")));
		
		selectDropDownUsingValue(locateElement(Locators.XPATH,"//select[@formcontrolname='virtualmachine']"), "1: Object");
		String name = new Faker().name().name();
		clearAndType(locateElement(Locators.XPATH,"//input[@id='name']"), name);
		clearAndType(locateElement(Locators.XPATH,"//textarea[@id='description']"), "Vmsnap-one");
		click(Locators.XPATH,"//button[normalize-space()='Create']");
		return this;
	}
}
