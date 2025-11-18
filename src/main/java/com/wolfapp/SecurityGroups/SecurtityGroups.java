package com.wolfapp.SecurityGroups;

import com.framework.base.Locators;
import com.framework.base.SeleniumWrapper;
import com.wolfapp.SSHKeys.NewSShKeys;

public class SecurtityGroups extends SeleniumWrapper {
	
	
	public NewSShKeys groupText() {
		String gText = getElementText(locateElement(Locators.XPATH,"//div//h4[normalize-space(text())='Setup Cloud Firewall (Security Policy)']"));
		System.out.println(gText);
		return new NewSShKeys();
	}
	
}
