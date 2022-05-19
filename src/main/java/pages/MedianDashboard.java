package pages;

import base.MedianSpecificMethods;

public class MedianDashboard extends MedianSpecificMethods {

	public MedianDashboard clickSystemparamMaintenanceLink() {
		clickElement(locateElement("xpath", props.getProperty("MedianNavbar.SystemParamMaintenance.Xpath")));
		return this;
	}

	public DepartmentIdMaintenanceSummary clickDeptidscreen() {
		clickElement(locateElement("xpath", props.getProperty("MedianNavbar.DepartmentIdScreen.Xpath")));
		return new DepartmentIdMaintenanceSummary();
	}

	public GlobalaccountSummary clickGlobalAccountRestriction() {
		clickElement(locateElement("xpath", props.getProperty("MedianNavbar.GlobalaccountRestriction.Xpath")));
		return new GlobalaccountSummary();
	}
	public UseraccountRestrictionSummary clickUseraccountRestriction() {
		clickElement(locateElement("xpath", props.getProperty("MedianNavbar.UseraccountRestriction.Xpath")));
		return new UseraccountRestrictionSummary();
	}
	public EmailManagementSummary clickEmailManagement() {
		clickElement(locateElement("xpath", props.getProperty("MedianNavbar.EmailManagement.Xpath")));
		return new EmailManagementSummary();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	public MedianAddNewRole selectSystemMaintenance() {
		clickElement(locateElement("xpath", props.getProperty("Median.SystemMaintenance.Dropdown.Xpath")));
		wait(7000);
		clickElement(locateElement("xpath", props.getProperty("Median.SystemMaintenance.Dropdown.Role.Xpath")));
		wait(7000);
		return new MedianAddNewRole();
	}

}
