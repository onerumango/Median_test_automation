package pages;

import base.MedianSpecificMethods;

public class EmailManagementAuth extends MedianSpecificMethods{
	public EmailManagementAuth clickAuth() {
		clickElement(locateElement("xpath", props.getProperty("EmailManagementCreate.Auth.Xpath")));
		return this;
	}
	

}
