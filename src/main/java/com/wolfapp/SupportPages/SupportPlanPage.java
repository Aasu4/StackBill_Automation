package com.wolfapp.SupportPages;

import com.framework.base.Locators;
import com.framework.base.SeleniumWrapper;

public class SupportPlanPage extends SeleniumWrapper {
	
	public SupportPlanPage displayTickets() {
		System.out.println("Looks like you don't have any Support Ticket created.");
		return this;
	}
	
	public SupportPlanPage clickTotalTickets() {
		click(Locators.XPATH,"//div[@class='mb-3']//div//div//a//div[text()='Total']");
		System.out.println("Total Support tickets");
		return this;
	}
	
	public SupportPlanPage clickActiveTickets() {
		click(Locators.XPATH,"//div[@class='mb-3']//div//div//a//div[text()='Active']");
		System.out.println("Active Support tickets");
		return this;
	}
	
	
	public SupportPlanPage clickOpenTickets() {
		click(Locators.XPATH,"//div[@class='mb-3']//div//div//a//div[text()='Open']");
		System.out.println("Open Support tickets");
		return this;
	}
	
	public SupportPlanPage clickInprogressTickets() {
		click(Locators.XPATH,"//div[@class='mb-3']//div//div//a//div[text()='Inprogress']");
		System.out.println("Inprogress Support tickets");
		return this;
	}
	
	public SupportPlanPage clickClosedTickets() {
		click(Locators.XPATH,"//div[@class='mb-3']//div//div//a//div[text()='Closed']");
		System.out.println("Closed Support tickets");
		return this;
	}
	
	public SupportPlanPage clickFeedbackTickets() {
		click(Locators.XPATH,"//div[@class='mb-3']//div//div//a//div[text()='Feedback']");
		System.out.println("Feedback Support tickets");
		return this;
	}
}
