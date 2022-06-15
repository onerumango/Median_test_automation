package pages;

import base.MedianSpecificMethods;

public class EmailManagementCreate extends MedianSpecificMethods{
	public EmailManagementCreate clickDropdown() {
		wait(2000);
		clickElement(locateElement("xpath", props.getProperty("EmailManagementCreate.Dropdown.Xpath")));
		return this;
	}
	public EmailManagementCreate selectOption() {
		wait(2000);
		clickElement(locateElement("xpath", props.getProperty("EmailManagementCreate.Option.Xpath")));
		return this;
	}
	public EmailManagementCreate enterEmailid() {
		wait(2000);
	  enterValue(locateElement("xpath", props.getProperty("EmailManagementCreate.EmailId.Xpath")), props.getProperty("EmailId"));
		return this;
    }
	public EmailManagementCreate clickSave() {
		wait(2000);
		clickElement(locateElement("xpath", props.getProperty("EmailManagementCreate.Save.Xpath")));
		return this;
	}
	
	public EmailManagementCreate clickOK() {
		wait(7000);
		clickElement(locateElement("xpath", props.getProperty("EmailmanagementCreate.OK.Xpath")));
		wait(5000);
		return this;
	}
	 
	 
	 
	
	}


