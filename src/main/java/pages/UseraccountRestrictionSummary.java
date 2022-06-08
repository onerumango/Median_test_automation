package pages;

import base.MedianSpecificMethods;

public class UseraccountRestrictionSummary extends MedianSpecificMethods{
	public UseraccountRestrictionCreate  clickNew() {
		wait(2000);
		clickElement(locateElement("xpath", props.getProperty("UseraccountRestrictionSummary.New.Xpath")));
		return new UseraccountRestrictionCreate();
	}
	public UseraccountRestrictionSummary clickUseridDropdown() {
		wait(2000);
		clickElement(locateElement("xpath", props.getProperty("UseraccountRestrictionSummary.UseridDropdown.Xpath")));
		return this;
	}
	public UseraccountRestrictionSummary selectUserid() {
		wait(2000);
		clickElement(locateElement("xpath", props.getProperty("UseraccountRestrictionSummary.Userid.Xpath")));
		return this;
	}
	public UseraccountRestrictionSummary clickGetTransactions() {
		wait(2000);
		clickElement(locateElement("xpath", props.getProperty("UseraccountRestrictionSummary.GetTransactions.Xpath")));
		wait(2000);
		return this;
	}
	
	}
	



