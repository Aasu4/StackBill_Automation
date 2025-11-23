package com.wolfapp.Computepages;

import com.framework.base.Locators;
import com.framework.base.SeleniumWrapper;

public class VolumeSnapShotPage extends SeleniumWrapper {

	public VolumeSnapShotPage createVolumeSnapshot() {
		click(Locators.XPATH,"//span[normalize-space()='Add Volume Snapshot']");
		
		// Generate a random volume snapshot name
		int randomNum = (int) (Math.random() * 1000);
		String volsnapName = "volSnap" + randomNum;
		System.out.println("Generated SSH Key Name: " + volsnapName);
		typeAndTab(locateElement(Locators.XPATH,"//input[@id='name']"), volsnapName);
		
		//Select from Drop Down
		selectDropDownUsingValue(locateElement(Locators.XPATH,"//select[@formcontrolname='volume']"), "1: Object");
		click(Locators.XPATH,"//div[@id='add-snap-footer']//button[normalize-space()='Create']");
		System.out.println("Created Volume Snapshot");
		return this;
	}
	
	public VolumeSnapShotPage listVolumeSnaps() {
		String numberOfSnaps = getElementText(locateElement(Locators.XPATH,"//div[@class='ms-3 d-flex flex-column align-items-center']//div[@class='text-large text-dark sb-text-dark font-bold']"));
		System.out.println("Number of snaps is "+numberOfSnaps);
		return this;
	}

}
