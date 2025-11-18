package com.wolfapp.Computepages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.framework.base.Locators;
import com.framework.base.SeleniumWrapper;

public class ComputePage extends SeleniumWrapper {

	private WebElement locateToCompute() {
		return locateElement(Locators.XPATH, "//div[normalize-space()='Compute']");
	}

	public InstancePage clickInstance() throws InterruptedException {
		// To click side-bar-Instance
		WebElement toInstance = locateElement(Locators.XPATH, "//span[normalize-space()='Instance']");
		Actions computeList = new Actions(getDriver());
		computeList.moveToElement(locateToCompute()).click(toInstance).perform();
		return new InstancePage();
	}

	public KubernetesPage clickKubernetes() {
		WebElement toKubernetes = locateElement(Locators.XPATH,"//span[normalize-space()='Kubernetes']");
		Actions computeList = new Actions(getDriver());
		computeList.moveToElement(locateToCompute()).click(toKubernetes).perform();
		return new KubernetesPage();
	}

	public VolumePage clickVolume() {
		WebElement toKubernetes = locateElement(Locators.XPATH,"//span[normalize-space()='Volume']");
		Actions computeList = new Actions(getDriver());
		computeList.moveToElement(locateToCompute()).click(toKubernetes).perform();
		return new VolumePage();
	}

	public VolumeSnapShotPage clickVolumeSnapShot() {
		WebElement toVolumeSnap = locateElement(Locators.XPATH,"//span[normalize-space()='Volume Snapshot']");
		click(toVolumeSnap);
//		Actions computeList = new Actions(getDriver());
//		computeList.moveToElement(locateToCompute()).click(toVolumeSnap).perform();
		return new VolumeSnapShotPage();
	}

	public VmSnapshotPage clickVMSnapShot() {
		WebElement toVmSanp = locateElement(Locators.XPATH,"//span[normalize-space()='VM Snapshots']");
		click(toVmSanp);
//		Actions computeList = new Actions(getDriver());
//		computeList.moveToElement(locateToCompute()).click(toVmSanp).perform();
		return new VmSnapshotPage();
	}

	public SSHKeyPage clickSSHKey() {
		WebElement toKubernetes = locateElement(Locators.XPATH,"//span[normalize-space()='SSH Key Manager']");
		click(toKubernetes);
//		Actions computeList = new Actions(getDriver());
//		computeList.moveToElement(locateToCompute()).click(toKubernetes).perform();
		return new SSHKeyPage();
	}

	public AffinityGroupPage clickAffinityGroup() {
		WebElement toKubernetes = locateElement(Locators.XPATH,"//span[normalize-space()='Affinity Group']");
		click(toKubernetes);
//		Actions computeList = new Actions(getDriver());
//		computeList.moveToElement(locateToCompute()).click(toKubernetes).perform();
		return new AffinityGroupPage();
	}

	public NativeAutoScalePage clickAutoScale() {
		WebElement toKubernetes = locateElement(Locators.XPATH,"//span[normalize-space()='Native Autoscale']") ;
		Actions computeList = new Actions(getDriver());
		computeList.moveToElement(locateToCompute()).click(toKubernetes).perform();
		return new NativeAutoScalePage();
	}
}
