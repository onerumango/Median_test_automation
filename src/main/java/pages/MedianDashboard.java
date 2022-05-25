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
//For Handle Toast Button	
//	public MedianChangePassword clickToastbutton() {
//		clickElement(locateElement("xpath", props.getProperty("MedianDashboard.clickToastbutton.Xpath")));
//		wait(1000);
//        return new MedianChangePassword();
//        }
	
//	public MedianLogout clickChangePassword() {
//		clickElement(locateElement("xpath", props.getProperty("MedainDashboard.changePassword.Xpath")));
//		wait(1000);
//		return new MedianLogout();
//	}
	
// MedianChangePasswordAndLogout
	public MedianChangePassword clickUserName() {
		wait(2000);
		clickElement(locateElement("xpath", props.getProperty("MedianDashboard.username.Xpath")));
		
        return new MedianChangePassword();
	}
	public MedianChangePassword clickLogout() {
		clickElement(locateElement("xpath", props.getProperty("MedianDashboard.Logout.Xpath")));
	//	wait(1000);
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
	
	
	
	

	public MedianDashboard selectSystemMaintenance() throws InterruptedException {
		wait(10000);
		clickElement(locateElement("xpath", props.getProperty("Median.SystemMaintenance.Dropdown.Xpath")));
		
		return this;
	}
	
	 public MedianroleSummary selectrole() {
		clickElement(locateElement("xpath", props.getProperty("Median.SystemMaintenance.Dropdown.Role.Xpath")));
		return new MedianroleSummary();
	}

	 public MedianDashboard selectFileUpload() {
		 	wait(10000);
			clickElement(locateElement("xpath", props.getProperty("Median.FileUpload.Xpath")));
			return this;
		}
	 
	 public FileUploadSummary selectAuthorizeExcel() {
		 	wait(10000);
			clickElement(locateElement("xpath", props.getProperty("Median.AuthorizeExcel.Xpath")));
			return new FileUploadSummary();
		}
	 
	 public pages.MedianRuleTranslation clickSystemInterface() {
		    wait(10000);
			clickElement(locateElement("xpath", props.getProperty("Median.SystemInterface.Xpath")));
			return new MedianRuleTranslation();
		}
}

