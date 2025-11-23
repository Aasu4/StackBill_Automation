package com.wolfapp.Computepages;

import com.framework.base.Locators;
import com.framework.base.SeleniumWrapper;

public class InstanceSummary extends SeleniumWrapper{


	public InstancePage destoryVM() throws InterruptedException {
		click(Locators.XPATH,"//button//span[normalize-space()='Destroy']");
		Thread.sleep(3000);
		click(Locators.XPATH,"//label//span[text()='Expunge']");
		clearAndType(locateElement(Locators.XPATH,"//input[@placeholder='Enter the VM Name']"), "Test-VM-14");
		click(Locators.XPATH,"//div[@class='modal-footer']//button[normalize-space()='Destroy']");
		return new InstancePage();
	}
}
