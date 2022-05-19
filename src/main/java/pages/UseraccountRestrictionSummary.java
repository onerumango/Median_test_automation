package pages;

import base.MedianSpecificMethods;

public class UseraccountRestrictionSummary extends MedianSpecificMethods{
	public UseraccountRestrictionCreate  clickNew() {
		clickElement(locateElement("xpath", props.getProperty("UseraccountRestrictionSummary.New.Xpath")));
		return new UseraccountRestrictionCreate();
	}
	public UseraccountRestrictionSummary clickUseridDropdown() {
		clickElement(locateElement("xpath", props.getProperty("UseraccountRestrictionSummary.UseridDropdown.Xpath")));
		return this;
	}
	public UseraccountRestrictionSummary selectUserid() {
		clickElement(locateElement("xpath", props.getProperty("UseraccountRestrictionSummary.Userid.Xpath")));
		return this;
	}
	public UseraccountRestrictionSummary clickGetTransactions() {
		clickElement(locateElement("xpath", props.getProperty("UseraccountRestrictionSummary.GetTransactions.Xpath")));
		return this;
	}
	
	}
	



