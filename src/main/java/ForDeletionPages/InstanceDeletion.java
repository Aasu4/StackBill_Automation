package ForDeletionPages;

import com.framework.base.Locators;
import com.framework.base.SeleniumWrapper;

public class InstanceDeletion extends SeleniumWrapper  {
	
	public void deleteVM() {
		click(Locators.XPATH,"//a[@class='d-inline-block ng-star-inserted']");
		click(Locators.XPATH,"//span[text()=' Destroy']");
	}

}
