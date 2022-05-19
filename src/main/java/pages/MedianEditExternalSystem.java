package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.Alert;

import base.MedianSpecificMethods;

public class MedianEditExternalSystem extends MedianSpecificMethods 
{
	public MedianEditExternalSystem selectEdit() {
		clickElement(locateElement("xpath", props.getProperty("Median.FileUploadMaintenance.ExternalSystem.Edit.Xpath")));
		wait(5000);
		return this;
	}
	
	public MedianEditExternalSystem enterExternalSystemCode() {
		enterValue(locateElement("xpath", props.getProperty("Median.FileUploadMaintenance.ExternalSystem.Edit.ExternalSystemCode.Xpath")), props.getProperty("EditExternalSystemCode"));
		return this;
	}
	
	public MedianEditExternalSystem enterExternalSystemName() {
		enterValue(locateElement("xpath", props.getProperty("Median.FileUploadMaintenance.ExternalSystem.Edit.ExternalSystemName.Xpath")), props.getProperty("EditExternalSystemName"));
		return this;
	}
	
	
	public MedianEditExternalSystem selectDepartment() {
		clickElement(locateElement("xpath", props.getProperty("Median.FileUploadMaintenance.ExternalSystem.New.Department.Dropdown.Xpath")));
		wait(1000);
		clickElement(locateElement("xpath", props.getProperty("Median.FileUploadMaintenance.ExternalSystem.New.Department.Dropdown.Information.Xpath")));
		return this;
	}
	
	
	public MedianEditExternalSystem clickSaveButton() {
		wait(2000);
		clickElement(locateElement("xpath",props.getProperty("Median.FileUploadMaintenance.ExternalSystem.Save.Xpath")));
		wait(5000);
        return new MedianEditExternalSystem();
	
	}

	public MedianAuthExternalSystem selectRoleAuth() {
		clickElement(locateElement("xpath", props.getProperty("Median.FileUploadMaintenance.ExternalSystem.Edit.Save.Xpathh")));
		wait(5000);
		return new MedianAuthExternalSystem();
	}

}