package com.wolfapp.DashBoardCreatePages;

import com.framework.base.Locators;
import com.framework.base.SeleniumWrapper;

public class CreateSSHKeyPage extends SeleniumWrapper {
	
	public CreateSSHKeyPage clickSSHkey1() {
		click(Locators.XPATH,"//div[@class='dropdown-menu show']//button[@class='dropdown-item'][11]");
		System.out.println("Used Top SSHkey");
		return this;
	}

}
