package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.Alert;

import base.MedianSpecificMethods;

public class MedianAddNewExternalSystem extends MedianSpecificMethods 
{
	
	
	public MedianAddNewExternalSystem enterExternalSystemCode() {
		wait(3000);
		enterValue(locateElement("xpath", props.getProperty("Median.FileUploadMaintenance.ExternalSystem.New.ExternalSystemCode.Xpath")), props.getProperty("ExternalSystemCode"));
		return this;
	}
	
	public MedianAddNewExternalSystem enterExternalSystemName() {
		wait(3000);
		enterValue(locateElement("xpath", props.getProperty("Median.FileUploadMaintenance.ExternalSystem.New.ExternalSystemName.Xpath")), props.getProperty("ExternalSystemName"));
		return this;
	}
	
	
	public MedianAddNewExternalSystem selectDepartment() {
		wait(3000);
		clickElement(locateElement("xpath", props.getProperty("Median.FileUploadMaintenance.ExternalSystem.New.Department.Dropdown.Xpath")));
		wait(3000);
		clickElement(locateElement("xpath", props.getProperty("Median.FileUploadMaintenance.ExternalSystem.New.Department.Dropdown.Information.Xpath")));
		return this;
	}
	
	
	public MedianEditExternalSystem clickSaveButton() {
		wait(2000);
		clickElement(locateElement("xpath",props.getProperty("Median.FileUploadMaintenance.ExternalSystem.Save.Xpath")));
		wait(3000);
		clickElement(locateElement("xpath",props.getProperty("Median.FileUploadMaintenance.ExternalSystem.OK.Xpath")));
        return new MedianEditExternalSystem();
	
	}

	public MedianAuthExternalSystem selectExternalAuth() {
		clickElement(locateElement("xpath", props.getProperty("Median.FileUploadMaintenance.ExternalSystem.Auth.Xpath")));
		wait(5000);
		return new MedianAuthExternalSystem();
	}
}