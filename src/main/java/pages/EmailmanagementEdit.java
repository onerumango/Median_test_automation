package pages;

import base.MedianSpecificMethods;

public class EmailmanagementEdit extends MedianSpecificMethods{
	
	public EmailmanagementEdit clickEdit() {
		wait(2000);
		clickElement(locateElement("xpath", props.getProperty("EmailmanagementEdit.Edit.Xpath")));
		return this;
	}
	public EmailmanagementEdit editEmailid() {
		wait(2000);
		clearElement(locateElement("xpath", props.getProperty("EmailManagementCreate.EditEmailId.Xpath")));
		wait(2000);
		  enterValue(locateElement("xpath", props.getProperty("EmailManagementCreate.EditEmailId.Xpath")), props.getProperty("EmailId1"));
			return this;
	    }
	
	public EmailmanagementEdit clickSave() {
		wait(2000);
		clickElement(locateElement("xpath", props.getProperty("EmailmanagementEdit.Save.Xpath")));
		wait(2000);
		clickElement(locateElement("xpath", props.getProperty("EmailmanagementEdit.OK.Xpath")));
		return this;
	}
		
	}
	

