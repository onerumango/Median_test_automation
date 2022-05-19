package pages;

import base.MedianSpecificMethods;

public class EmailManagementSummary extends MedianSpecificMethods{
	public EmailManagementCreate clickNew() {
		clickElement(locateElement("xpath", props.getProperty("EmailManagementSummary.New.Xpath")));
			return new EmailManagementCreate();
		}
	public EmailmanagementEdit selectRecord() {
		clickElement(locateElement("xpath", props.getProperty("EmailManagementSummary.Record.Xpath")));
		return new EmailmanagementEdit();
	}
	public EmailManagementAuth selectUnauthRecord() {
		clickElement(locateElement("xpath", props.getProperty("EmailManagementSummary.UnauthRecord.Xpath")));
		return new EmailManagementAuth();
	}
	}
	
		
	

