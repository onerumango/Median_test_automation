package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.Alert;

import base.MedianSpecificMethods;

public class MedianEditRole extends MedianSpecificMethods 
{
	public MedianEditRole selectSystemMaintenance() {
		clickElement(locateElement("xpath", props.getProperty("Median.SystemMaintenance.Dropdown.Xpath")));
		wait(7000);
		clickElement(locateElement("xpath", props.getProperty("Median.SystemMaintenance.Dropdown.Role.Xpath")));
		wait(7000);
		clickElement(locateElement("xpath", props.getProperty("Median.SystemMaintenance.RoleName.Xpath")));
		wait(5000);
		clickElement(locateElement("xpath", props.getProperty("Median.SystemMaintenance.RoleName.Edit.Xpath")));
		return this;
	}
	
	public MedianEditRole enterRoleName() {
		enterValue(locateElement("xpath", props.getProperty("Median.SystemMaintenance.Dropdown.Role.Edit.RoleName.Xpath")), props.getProperty("EditRoleName"));
		return this;
	}
	
	public MedianEditRole enterRoleDescription() {
		enterValue(locateElement("xpath", props.getProperty("Median.SystemMaintenance.Dropdown.Role.Edit.RoleDescription.Xpath")), props.getProperty("EditRoleDescription"));
		return this;
	}
	
	
	public MedianEditRole selectSystemMaintenance1() {
		clickElement(locateElement("xpath", props.getProperty("Median.SystemMaintenance.Edit.SelectAll.Xpath")));
		return this;
	}
	
	public MedianEditRole selectSystemParamMaintenance() {
		clickElement(locateElement("xpath", props.getProperty("Median.SystemMaintenance.Edit.SystemParamMaintenance.Xpath")));
		wait(1000);
		clickElement(locateElement("xpath", props.getProperty("Median.SystemMaintenance.Edit.SystemParamMaintenance.SelectAll.Xpath")));
		return this;
	}
	
	public MedianEditRole selectSystemInterface() {
		clickElement(locateElement("xpath", props.getProperty("Median.SystemMaintenance.Edit.SystemInterface.Xpath")));
		wait(1000);
		clickElement(locateElement("xpath", props.getProperty("Median.SystemMaintenance.Edit.SystemInterface.SelectAll.Xpath")));
		return this;
	}
	
	public MedianEditRole selectFileUploadMaintenance() {
		clickElement(locateElement("xpath", props.getProperty("Median.SystemMaintenance.Edit.FileUploadMaintenance.Xpath")));
		wait(1000);
		clickElement(locateElement("xpath", props.getProperty("Median.SystemMaintenance.Edit.FileUploadMaintenance.SelectAll.Xpath")));
		return this;
	}
	
	public MedianEditRole selectFileupload() {
		clickElement(locateElement("xpath", props.getProperty("Median.SystemMaintenance.Edit.Fileupload.Xpath")));
		wait(1000);
		clickElement(locateElement("xpath", props.getProperty("Median.SystemMaintenance.Edit.Fileupload.SelectAll.Xpath")));
		return this;
	}
	
	
	public MedianEditRole selectAccountBlock() {
		clickElement(locateElement("xpath", props.getProperty("Median.SystemMaintenance.Edit.AccountBlock.Xpath")));
		wait(1000);
		clickElement(locateElement("xpath", props.getProperty("Median.SystemMaintenance.Edit.AccountBlock.SelectAll.Xpath")));
		return this;
	}
	
	public MedianEditRole selectAccountClosure() {
		clickElement(locateElement("xpath", props.getProperty("Median.SystemMaintenance.Edit.AccountClosure.Xpath")));
		wait(1000);
		clickElement(locateElement("xpath", props.getProperty("Median.SystemMaintenance.Edit.AccountClosure.SelectAll.Xpath")));
		return this;
	}
	
	
	public MedianEditRole clickSaveButton() {
		wait(2000);
		clickElement(locateElement("xpath",props.getProperty("Median.SystemMaintenance.Edit.Save.Xpath")));
		wait(5000);
        return this;
	}

}

