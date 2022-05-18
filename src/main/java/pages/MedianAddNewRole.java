package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.Alert;

import base.MedianSpecificMethods;

public class MedianAddNewRole extends MedianSpecificMethods 
{
	public MedianAddNewRole selectSystemMaintenance() {
		clickElement(locateElement("xpath", props.getProperty("Median.SystemMaintenance.Dropdown.Xpath")));
		wait(7000);
		clickElement(locateElement("xpath", props.getProperty("Median.SystemMaintenance.Dropdown.Role.Xpath")));
		wait(7000);
		clickElement(locateElement("xpath", props.getProperty("Median.SystemMaintenance.Dropdown.Role.New.Xpath")));
		wait(5000);
		return this;
	}
	
	public MedianAddNewRole enterRoleName() {
		enterValue(locateElement("xpath", props.getProperty("Median.SystemMaintenance.Dropdown.Role.New.RoleName.Xpath")), props.getProperty("RoleName"));
		return this;
	}
	
	public MedianAddNewRole enterRoleDescription() {
		enterValue(locateElement("xpath", props.getProperty("Median.SystemMaintenance.Dropdown.Role.New.RoleDescription.Xpath")), props.getProperty("RoleDescription"));
		return this;
	}
	
	
	public MedianAddNewRole selectSystemMaintenance1() {
		clickElement(locateElement("xpath", props.getProperty("Median.SystemMaintenance.SystemMaintenance.Xpath")));
		wait(1000);
		clickElement(locateElement("xpath", props.getProperty("Median.SystemMaintenance.SystemMaintenance.SelectAll.Xpath")));
		return this;
	}
	
	public MedianAddNewRole selectSystemParamMaintenance() {
		clickElement(locateElement("xpath", props.getProperty("Median.SystemMaintenance.SystemParamMaintenance.Xpath")));
		wait(1000);
		clickElement(locateElement("xpath", props.getProperty("Median.SystemMaintenance.SystemParamMaintenance.SelectAll.Xpath")));
		return this;
	}
	
	public MedianAddNewRole selectSystemInterface() {
		clickElement(locateElement("xpath", props.getProperty("Median.SystemMaintenance.SystemInterface.Xpath")));
		wait(1000);
		clickElement(locateElement("xpath", props.getProperty("Median.SystemMaintenance.SystemInterface.SelectAll.Xpath")));
		return this;
	}
	
	public MedianAddNewRole selectFileUploadMaintenance() {
		clickElement(locateElement("xpath", props.getProperty("Median.SystemMaintenance.FileUploadMaintenance.Xpath")));
		wait(1000);
		clickElement(locateElement("xpath", props.getProperty("Median.SystemMaintenance.FileUploadMaintenance.SelectAll.Xpath")));
		return this;
	}
	
	public MedianAddNewRole selectFileupload() {
		clickElement(locateElement("xpath", props.getProperty("Median.SystemMaintenance.Fileupload.Xpath")));
		wait(1000);
		clickElement(locateElement("xpath", props.getProperty("Median.SystemMaintenance.Fileupload.SelectAll.Xpath")));
		return this;
	}
	
	
	public MedianAddNewRole selectAccountBlock() {
		clickElement(locateElement("xpath", props.getProperty("Median.SystemMaintenance.AccountBlock.Xpath")));
		wait(1000);
		clickElement(locateElement("xpath", props.getProperty("Median.SystemMaintenance.AccountBlock.SelectAll.Xpath")));
		return this;
	}
	
	public MedianAddNewRole selectAccountClosure() {
		clickElement(locateElement("xpath", props.getProperty("Median.SystemMaintenance.AccountClosure.Xpath")));
		wait(1000);
		clickElement(locateElement("xpath", props.getProperty("Median.SystemMaintenance.AccountClosure.SelectAll.Xpath")));
		return this;
	}
	
	
	public MedianAddNewRole clickSaveButton() {
		wait(2000);
		clickElement(locateElement("xpath",props.getProperty("Median.SystemMaintenance.Save.Xpath")));
		wait(5000);
        return this;
	}

}


