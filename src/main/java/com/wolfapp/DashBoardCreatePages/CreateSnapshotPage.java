package com.wolfapp.DashBoardCreatePages;

import com.framework.base.Locators;
import com.framework.base.SeleniumWrapper;

public class CreateSnapshotPage extends SeleniumWrapper {

	public CreateSnapshotPage clickSnapshot1() {
		click(Locators.XPATH,"//div[@class='dropdown-menu show']//button[@class='dropdown-item'][5]");
		System.out.println("Used Top Create Snapshot");
		return this;
	}
}
