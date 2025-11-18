package com.wolfapp.NetworkPages;

import com.framework.base.Locators;
import com.framework.base.SeleniumWrapper;

public class VPNGatewayPage  extends SeleniumWrapper{
	
	
	public VPNGatewayPage addVPN() {
		click(Locators.XPATH,"//button[@class='btn btn-primary sb-btn-primary rounded-pill']//span[normalize-space()='Add VPN']");
		click(Locators.XPATH,"//button[normalize-space()='Cancel']");
		return this;
	}

}
