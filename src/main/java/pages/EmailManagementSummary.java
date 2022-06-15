package pages;

import base.MedianSpecificMethods;

public class EmailManagementSummary extends MedianSpecificMethods{
	public EmailManagementCreate clickNew() {
		wait(2000);
		clickElement(locateElement("xpath", props.getProperty("EmailManagementSummary.New.Xpath")));
			return new EmailManagementCreate();
		}
	public EmailmanagementEdit selectRecord() {
		wait(2000);
		clickElement(locateElement("xpath", props.getProperty("EmailManagementSummary.Record.Xpath")));
		return new EmailmanagementEdit();
	}
	public EmailManagementAuth selectUnauthRecord() {
		wait(2000);
		clickElement(locateElement("xpath", props.getProperty("EmailManagementSummary.UnauthRecord.Xpath")));
		return new EmailManagementAuth();
	}
	}
	
		
	

