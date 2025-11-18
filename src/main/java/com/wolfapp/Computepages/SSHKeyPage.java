package com.wolfapp.Computepages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebElement;

import com.framework.base.Locators;
import com.framework.base.SeleniumWrapper;
import com.github.javafaker.Faker;

public class SSHKeyPage extends SeleniumWrapper {
	
	public SSHKeyPage listSSHKeys() {
		List<WebElement> sshKeysListEle = locateElements(Locators.XPATH,"//datatable-body-row");
		List<String> sshKeysList = new ArrayList<String>();
		for (WebElement webElement : sshKeysListEle) {
			sshKeysList.add(getElementText(webElement));
		}
				
		System.out.println("Listed available SSH keys are \n"+sshKeysList);
		return this;
	}
	
	public SSHKeyPage addSSHKey() {
		click(Locators.XPATH,"//button//span[normalize-space()='Add']");
		clearAndType(locateElement(Locators.XPATH,"//input[@id='addSshName']"), new Faker().name().name()+"-key");
		clearAndType(locateElement(Locators.XPATH,"//textarea[@id='description']"), "Test");
		click(Locators.XPATH,"//button[@type='submit']");
		return this;
	}
}
