package com.wolfapp.NetworkOfferings;
import com.framework.base.Locators;
import com.framework.base.SeleniumWrapper;
import com.wolfapp.SecurityGroups.SecurtityGroups;


public class ChooseNetworks  extends SeleniumWrapper{
	
	public SecurtityGroups selectNetwork() throws InterruptedException {
		String net = getElementText(locateElement(Locators.XPATH,"//div//h4[text()='Choose Your Network']"));
		System.out.println(net);
		return new SecurtityGroups();
	}
	
	

}
