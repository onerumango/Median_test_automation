package pages;

import base.MedianSpecificMethods;

public class MedianDashboard extends MedianSpecificMethods {

	public MedianDashboard clickSystemparamMaintenanceLink() {
		wait(15000);
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

	public MedianChangePassword clickUserName() {
		wait(2000);
		clickElement(locateElement("xpath", props.getProperty("MedianDashboard.username.Xpath")));

		return new MedianChangePassword();
	}

	public MedianDashboard clickfileUploadMaintenance() {
		clickElement(locateElement("xpath", props.getProperty("Median.FileUploadMaintenance.Xpath")));
		wait(7000);
		return this;
	}

	public MedianExternalSystemSummary clickexternalSystem() {
		clickElement(locateElement("xpath", props.getProperty("Median.FileUploadMaintenance.ExternalSystem.Xpath")));
		wait(7000);

		return new MedianExternalSystemSummary();
	}

	public MedianDashboard clickFileUploadMaintenanceLink() {
		clickElement(locateElement("xpath", props.getProperty("MedianNavbar.FileUploadMaintenance.Xpath")));
		return this;
	}

	public ProcesscodeMappingSummary clickProcesscodemapping() {
		clickElement(locateElement("xpath", props.getProperty("MedianNavbar.ProcessCodeMapping.Xpath")));
return new ProcesscodeMappingSummary();
   
}
	public TemplateMappingSummary clickTemplatemapping() {
		clickElement(locateElement("xpath", props.getProperty("MedianNavbar.Templatemapping.Xpath")));
        return new TemplateMappingSummary();
}


	public MedianDashboard selectSystemMaintenance() {
		clickElement(locateElement("xpath", props.getProperty("Median.SystemMaintenance.Dropdown.Xpath")));
		wait(7000);
		return this;
	}

	public MedianroleSummary selectrole() {
		clickElement(locateElement("xpath", props.getProperty("Median.SystemMaintenance.Dropdown.Role.Xpath")));
		wait(7000);
		return new MedianroleSummary();
	}

	public MedianDashboard selectFileUpload() {
		clickElement(locateElement("xpath", props.getProperty("Median.FileUpload.Xpath")));
		wait(7000);
		return this;
	}

	public MedianUploadExcel selectUploadExcel() {
		clickElement(locateElement("xpath", props.getProperty("Median.FileUpload.UploadExcel.Xpath")));
		wait(7000);
		return new MedianUploadExcel();
	}

	public FileUploadSummary selectAuthorizeExcel() {
		clickElement(locateElement("xpath", props.getProperty("Median.AuthorizeExcel.Xpath")));
		wait(7000);
		return new FileUploadSummary();
	}
	public MedianDashboard clickSystemInterface() {
		wait(2000);
		clickElement(locateElement("xpath", props.getProperty("MedianNavbar.SystemInterface.Xpath")));
		wait(2000);
		return this;
	}
	public MedianRuleTranslation clickRuleTranslation() {
		clickElement(locateElement("xpath", props.getProperty("Median.RuleTranslation.Xpath")));
		wait(7000);
		return new MedianRuleTranslation();
	}
	public MedianAddSystemSummary clickAddSystem() {
		wait(2000);
		clickElement(locateElement("xpath", props.getProperty("MedianNavbar.SystemInterface.AddSystem.Xpath")));
		wait(7000);
		return new MedianAddSystemSummary();
	}
	
	public MedianLoginAndLogout clickLogout() {
		clickElement(locateElement("xpath", props.getProperty("MedianDashboard.Logout.Xpath")));
		return new MedianLoginAndLogout();

	}

	

}



