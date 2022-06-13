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
	public MedianRuleTranslationISO clickRuleTranslation() {
		clickElement(locateElement("xpath", props.getProperty("Median.RuleTranslation.Xpath")));
		wait(7000);
		return new MedianRuleTranslationISO();
	}
	public MedianAddSystemSummary clickAddSystem() {
		wait(2000);
		clickElement(locateElement("xpath", props.getProperty("MedianNavbar.SystemInterface.AddSystem.Xpath")));
		wait(7000);
		return new MedianAddSystemSummary();
	}
	
	public MedianLoginAndLogout clickLogout() {
		wait(2000);
		clickElement(locateElement("xpath", props.getProperty("MedianDashboard.Logout.Xpath")));
		return new MedianLoginAndLogout();

	}
	
	public MedianRuleTranslationXML clickRuleTranslationXML() {
		clickElement(locateElement("xpath", props.getProperty("Median.RuleTranslation.Xpath")));
		wait(7000);
		return new MedianRuleTranslationXML();
	}
	
	public MedianProcessMonitoring clickProcessMonitoring() {
		clickElement(locateElement("xpath", props.getProperty("Median.FileUpload.processMonitoring.Xpath")));
		return new MedianProcessMonitoring();
	}

	public MedianTreasuryReference clickTreasuryReference() {
		clickElement(locateElement("xpath", props.getProperty("Median.TreasuryReference.xpath")));
		return new MedianTreasuryReference();
	}
	public MedianRuleTranslationISO clickRuleTranslationISO() {
		clickElement(locateElement("xpath", props.getProperty("Median.RuleTranslation.Xpath")));
		wait(7000);
		return new MedianRuleTranslationISO();
	}

	 public UserCreate selectSystemMaintenance1() {
		 clickElement(locateElement("xpath", props.getProperty("Median.SystemMaintenance.Xpath")));
			wait(7000);
			clickElement(locateElement("xpath", props.getProperty("Median.SystemMaintenance.Users.Xpath")));
			wait(5000);
			clickElement(locateElement("xpath", props.getProperty("Median.SystemMaintenance.Users.New.Xpath")));
	return new UserCreate();
}

	 public UserAuth selectSystemMaintenance11() {
		 clickElement(locateElement("xpath", props.getProperty("Median.SystemMaintenance.Xpath")));
			wait(7000);
			clickElement(locateElement("xpath", props.getProperty("Median.SystemMaintenance.Users.Xpath")));
			wait(5000);
			clickElement(locateElement("xpath", props.getProperty("Median.SystemMaintenance.Users.AuthName.Xpath")));
	return new UserAuth();
	 }	

	 public UserEdit selectEditMaintenance() {
		 clickElement(locateElement("xpath", props.getProperty("Median.SystemMaintenance.Xpath")));
			wait(7000);
			clickElement(locateElement("xpath", props.getProperty("Median.SystemMaintenance.Users.Xpath")));
			wait(5000);
			clickElement(locateElement("xpath", props.getProperty("Median.SystemMaintenance.Users.Editname.Xpath")));
	return new UserEdit();
}
	 
	 public Securitypolicyauth selectAuthSecuritypolicy() {
		 clickElement(locateElement("xpath", props.getProperty("Median.SystemMaintenance.Xpath")));
			wait(7000);
			clickElement(locateElement("xpath", props.getProperty("Median.SystemMaintenance.SecuritypolicyAuth.Xpath")));
	return new Securitypolicyauth();
}
	 public Securitypolicyedit selectEditSecuritypolicy() {
		 clickElement(locateElement("xpath", props.getProperty("Median.SystemMaintenance.Xpath")));
			wait(7000);
			clickElement(locateElement("xpath", props.getProperty("Median.SystemMaintenance.SecuritypolicyAuth.Xpath")));
	return new Securitypolicyedit();
}
	 public Auditlogs selectAuditlogs() {
		 wait(7000);
		 clickElement(locateElement("xpath", props.getProperty("Median.SystemMaintenance.Xpath")));
			wait(3000);
			clickElement(locateElement("xpath", props.getProperty("Median.SystemMaintenance.Auditlogs.Xpath")));
			wait(5000);
	return new Auditlogs();
}
	 public CreateTransactioncodeMaintenance selectTransactioMaintenance() {
		 clickElement(locateElement("xpath", props.getProperty("Median.SystemMaintenance.Xpath")));
			wait(7000);
			clickElement(locateElement("xpath", props.getProperty("Median.SystemMaintenance.CreateTransactioncodeMaintenance.Xpath")));
			wait(5000);
			clickElement(locateElement("xpath", props.getProperty("Median.SystemMaintenance.CreateTransactioncodeMaintenance.New.Xpath")));
	return new CreateTransactioncodeMaintenance();
	}
	 
	 public EditTransactionCodeMaintenance selectEditTransactioMaintenance() {
		 clickElement(locateElement("xpath", props.getProperty("Median.SystemMaintenance.Xpath")));
			wait(7000);
			clickElement(locateElement("xpath", props.getProperty("Median.SystemMaintenance.CreateTransactioncodeMaintenance.Xpath")));
			wait(5000);
			clickElement(locateElement("xpath", props.getProperty("Median.SystemMaintenance.CreateTransactioncodeMaintenance.New.Xpath")));
	return new EditTransactionCodeMaintenance();
	}
	 
	 public AuthTransactionCodeMaintenance selectAuthTransactioMaintenance() {
		 clickElement(locateElement("xpath", props.getProperty("Median.SystemMaintenance.Xpath")));
			wait(7000);
			clickElement(locateElement("xpath", props.getProperty("Median.SystemMaintenance.CreateTransactioncodeMaintenance.Xpath")));
			wait(5000);
			clickElement(locateElement("xpath", props.getProperty("Median.SystemMaintenance.CreateTransactioncodeMaintenance.New.Xpath")));
	return new AuthTransactionCodeMaintenance();
	}
	 
	 
}



