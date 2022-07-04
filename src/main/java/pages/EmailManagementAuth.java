package pages;

import base.MedianSpecificMethods;

public class EmailManagementAuth extends MedianSpecificMethods{
	
	public EmailManagementAuth clickAuth() {
		wait(2000);
		clickElement(locateElement("xpath", props.getProperty("EmailManagementCreate.Auth.Xpath")));
		wait(2000);
		clickElement(locateElement("xpath", props.getProperty("EmailManagementCreate.YES.Xpath")));
		wait(2000);
		clickElement(locateElement("xpath", props.getProperty("EmailManagementCreate.OK.Xpath")));
		return this;
	}
	

}
