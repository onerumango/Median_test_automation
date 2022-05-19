package pages;

import base.MedianSpecificMethods;

public class EmailManagementCreate extends MedianSpecificMethods{
	public EmailManagementCreate clickDropdown() {
		clickElement(locateElement("xpath", props.getProperty("EmailManagementCreate.Dropdown.Xpath")));
		return this;
	}
	public EmailManagementCreate selectOption() {
		clickElement(locateElement("xpath", props.getProperty("EmailManagementCreate.Option.Xpath")));
		return this;
	}
	public EmailManagementCreate enterEmailid() {
	  enterValue(locateElement("xpath", props.getProperty("EmailManagementCreate.EmailId.Xpath")), props.getProperty("EmailId"));
		return this;
    }
	public EmailManagementCreate clickSave() {
		clickElement(locateElement("xpath", props.getProperty("EmailManagementCreate.Save.Xpath")));
		return this;
	}
	
	}


