package com.wolfapp.NetworkPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.framework.base.Locators;
import com.framework.base.SeleniumWrapper;

public class NetworkPages extends SeleniumWrapper {

	private WebElement locateToNetwork() {
		return locateElement(Locators.XPATH, "//div[normalize-space()='Network']");
	}

	public BasicNetworkPage clickBasicNetwork() throws InterruptedException {
		// To click side-bar-Network
		WebElement toBasicNetwork = locateElement(Locators.XPATH, "//span[normalize-space()='Basic Network']");
		click(toBasicNetwork);
//		Actions computeList = new Actions(getDriver());
//		computeList.moveToElement(locateToNetwork()).click(toBasicNetwork).perform();
		return new BasicNetworkPage();
	}

	public VPCPage clickVPC() {
		WebElement toVPC = locateElement(Locators.XPATH, "//span[normalize-space()='VPC']");
		click(toVPC);
//		Actions computeList = new Actions(getDriver());
//		computeList.moveToElement(locateToNetwork()).click(toVPC).perform();
		return new VPCPage();
	}

	public VPNGatewayPage clickVPN() {
		WebElement toVPN = locateElement(Locators.XPATH, "//span[normalize-space()='VPN Gateway']");
		click(toVPN);
//		Actions computeList = new Actions(getDriver());
//		computeList.moveToElement(locateToNetwork()).click(toVPN).perform();
		return new VPNGatewayPage();
	}

	public SecurityGroupPage clickSecurityGroup() {
		WebElement toSecutrityGroup = locateElement(Locators.XPATH, "//span[normalize-space()='Security Group']");
		Actions computeList = new Actions(getDriver());
		computeList.moveToElement(locateToNetwork()).click(toSecutrityGroup).perform();
		return new SecurityGroupPage();
	}

	public IPManagerPage clickIPManager() {
		WebElement toIpManager = locateElement(Locators.XPATH, "//span[normalize-space()='IP Manager']");
		click(toIpManager);
//		Actions computeList = new Actions(getDriver());
//		computeList.moveToElement(locateToNetwork()).click(toIpManager).perform();
		return new IPManagerPage();
	}

	public LoadBalancerPage clickLoadBalancer() {
		WebElement toLoadBalancer = locateElement(Locators.XPATH, "//span[normalize-space()='Load Balancer']");
		click(toLoadBalancer);
//		Actions computeList = new Actions(getDriver());
//		computeList.moveToElement(locateToNetwork()).click(toLoadBalancer).perform();
		return new LoadBalancerPage();
	}

}
