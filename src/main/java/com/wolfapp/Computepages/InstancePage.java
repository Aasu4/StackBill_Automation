package com.wolfapp.Computepages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebElement;

import com.framework.base.Locators;
import com.framework.base.SeleniumWrapper;
import com.wolfapp.DeployTypes.DeployTypes;

public class InstancePage extends SeleniumWrapper {

	// List Instances
	public InstancePage listInstances() throws InterruptedException {
		List<WebElement> instancesList = locateElements(Locators.XPATH, "//datatable-body-row[contains(@class,'datatable-body-row datatable-row-')]//datatable-body-cell[@class='align-items-center d-flex datatable-body-cell sort-active'][1]");
		//String stoppedVM = driver.findElement(By.xpath("//div[text()='Stopped']")).getText();
		List<String> instancesNames = new ArrayList<String>();
		for(WebElement ele: instancesList) {
			instancesNames.add(ele.getText());
		}
		System.out.println(instancesNames);
		return this;
	}

	// Delete Instance
	public InstanceSummary selectInstance() {
		click(Locators.XPATH,"//datatable-body-row[contains(@class,'datatable-body-row datatable-row-')]//datatable-body-cell[@class='align-items-center d-flex datatable-body-cell sort-active'][1]");
		return new InstanceSummary();
	}

	// add Instance
	public DeployTypes clickAddUp() throws InterruptedException {
		click(Locators.XPATH,"//button//span[text()='Add Instance']");
		return new DeployTypes();
	}

	public DeployTypes clickAddDown() throws InterruptedException {
		click(Locators.XPATH,"//span//span[text()='Add Instance']");
		return new DeployTypes();
	}

	// List Kubernetes
	public InstancePage kubernetList() {
		List<WebElement> lists = locateElements(Locators.XPATH, "//datatable-body");
		// Calculate the total number of instances
		int totalInstanceCount = lists.size();
		// Output the total instance count
		System.out.println("Total instance count: " + totalInstanceCount);
		return this;
	}

}
