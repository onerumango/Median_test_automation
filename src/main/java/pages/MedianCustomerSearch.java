package pages;

import base.MedianSpecificMethods;

public class MedianCustomerSearch extends MedianSpecificMethods{
	
	public MedianCustomerSearch enterAccountNumber() {
		wait(3000);
		enterValue(locateElement("xpath", props.getProperty("Median.CustomerSearch.EnterAccountNumber.XPath")), props.getProperty("EnterAccountNumber"));
		return this;
	}
	public MedianCustomerSearch clickGetCustomer() {
		wait(3000);
		clickElement(locateElement("xpath", props.getProperty("Median.CustomerSearch.clickGetCustomer.XPath")));
		return this;
	}
	public MedianCustomerSearch clickCustomerDetails() {
		wait(3000);
		clickElement(locateElement("xpath", props.getProperty("Median.CustomerSearch.clickCustomerDetails.XPath")));
		return this;
	}
	public MedianCustomerSearch clickTransactions() {
		wait(3000);
		clickElement(locateElement("xpath", props.getProperty("Median.CustomerSearch.clickTransactions.XPath")));
		return this;
	}
	public MedianCustomerSearch closePopup() {
		wait(3000);
		clickElement(locateElement("xpath", props.getProperty("Median.CustomerSearch.closePopup.XPath")));
		return this;
	}
	public MedianCustomerSearch clickExit() {
		wait(3000);
		clickElement(locateElement("xpath", props.getProperty("Median.CustomerSearch.clickExit.XPath")));
		wait(5000);
		return this;
	}
	
}
