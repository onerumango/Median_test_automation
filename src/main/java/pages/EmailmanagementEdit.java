package pages;

import base.MedianSpecificMethods;

public class EmailmanagementEdit extends MedianSpecificMethods{
	
	public EmailmanagementEdit clickEdit() {
		clickElement(locateElement("xpath", props.getProperty("EmailmanagementEdit.Edit.Xpath")));
		return this;
	}
	public EmailmanagementEdit editEmailid() {
		  enterValue(locateElement("xpath", props.getProperty("EmailManagementCreate.EditEmailId.Xpath")), props.getProperty("EmailId"));
			return this;
	    }
	
	public EmailmanagementEdit clickSave() {
		clickElement(locateElement("xpath", props.getProperty("EmailmanagementEdit.Save.Xpath")));
		return this;
	}
		
	}
	

