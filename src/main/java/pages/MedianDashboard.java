package pages;

import base.MedianSpecificMethods;

public class MedianDashboard extends MedianSpecificMethods {

	public MedianDashboard clickSystemparamMaintenanceLink() {
		wait(8000);
		clickElement(locateElement("xpath", props.getProperty("MedianNavbar.SystemParamMaintenance.Xpath")));
		return this;
	}

	public DepartmentIdMaintenanceSummary clickDeptidscreen() {
		wait(4000);
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
		wait(7000);
		clickElement(locateElement("xpath", props.getProperty("Median.FileUploadMaintenance.Xpath")));
		wait(3000);
		return this;
	}

	public MedianExternalSystemSummary clickexternalSystem() {
		wait(2000);
		clickElement(locateElement("xpath", props.getProperty("Median.FileUploadMaintenance.ExternalSystem.Xpath")));
		wait(7000);

		return new MedianExternalSystemSummary();
	}

	public MedianDashboard clickFileUploadMaintenanceLink() {
		wait(4000);
		clickElement(locateElement("xpath", props.getProperty("MedianNavbar.FileUploadMaintenance.Xpath")));
		return this;
	}

	public ProcesscodeMappingSummary clickProcesscodemapping() {
		wait(2000);
		clickElement(locateElement("xpath", props.getProperty("MedianNavbar.ProcessCodeMapping.Xpath")));
return new ProcesscodeMappingSummary();
   
}
	public TemplateMappingSummary clickTemplatemapping() {
		wait(2000);
		clickElement(locateElement("xpath", props.getProperty("MedianNavbar.Templatemapping.Xpath")));
        return new TemplateMappingSummary();
}


	public MedianDashboard selectSystemMaintenance() {
		clickElement(locateElement("xpath", props.getProperty("Median.SystemMaintenance.Dropdown.Xpath")));
		wait(7000);
		return this;
	}

	public MedianroleSummary selectrole() {
		wait(2000);
		clickElement(locateElement("xpath", props.getProperty("Median.SystemMaintenance.Dropdown.Role.Xpath")));
		wait(7000);
		return new MedianroleSummary();
	}

	public MedianDashboard selectFileUpload() {
		wait(2000);
		clickElement(locateElement("xpath", props.getProperty("Median.FileUpload.Xpath")));
		wait(7000);
		return this;
	}

	public MedianUploadExcel selectUploadExcel() {
		wait(2000);
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
	public MedianRuleTranslationISOCreateAndAuth clickRuleTranslation() {
		clickElement(locateElement("xpath", props.getProperty("Median.RuleTranslation.Xpath")));
		wait(7000);
		return new MedianRuleTranslationISOCreateAndAuth();
	}
	public MedianAddSystemSummary clickAddSystem() {
		wait(2000);
		clickElement(locateElement("xpath", props.getProperty("MedianNavbar.SystemInterface.AddSystem.Xpath")));
		wait(7000);
		return new MedianAddSystemSummary();
	}
	public MedianCreateAndAuthRule clickCreateRule() {
		wait(2000);
		clickElement(locateElement("xpath", props.getProperty("MedianNavbar.SystemInterface.CreateRule.Xpath")));
		wait(2000);
		return new MedianCreateAndAuthRule();
	}
	
	public MedianLoginAndLogout clickLogout() {
		wait(2000);
		clickElement(locateElement("xpath", props.getProperty("MedianDashboard.Logout.Xpath")));
		return new MedianLoginAndLogout();

	}
	
	public MedianRuleTranslationXMLCreateAndAuth clickRuleTranslationXML() {
		clickElement(locateElement("xpath", props.getProperty("Median.RuleTranslation.Xpath")));
		wait(7000);
		return new MedianRuleTranslationXMLCreateAndAuth();
	}
	public MedianRuleTranslationISOCreateAndAuth clickRuleTranslationISO() {
		clickElement(locateElement("xpath", props.getProperty("Median.RuleTranslation.Xpath")));
		wait(7000);
		return new MedianRuleTranslationISOCreateAndAuth();
	}
	public MedianRuleMappingCreateAndAuth clickRuleMapping() {
		clickElement(locateElement("xpath", props.getProperty("Median.RuleMapping.LeftNavigation")));
		wait(7000);
		return new MedianRuleMappingCreateAndAuth();
	}
	
	public MedianProcessMonitoring clickProcessMonitoring() {
		clickElement(locateElement("xpath", props.getProperty("Median.FileUpload.processMonitoring.Xpath")));
		return new MedianProcessMonitoring();
	}

	public MedianTreasuryReference clickTreasuryReference() {
		clickElement(locateElement("xpath", props.getProperty("Median.TreasuryReference.xpath")));
		return new MedianTreasuryReference();
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
		 wait(2000);
		 clickElement(locateElement("xpath", props.getProperty("Median.SystemMaintenance.Xpath")));
			wait(7000);
			clickElement(locateElement("xpath", props.getProperty("Median.SystemMaintenance.Securitypolicy.Xpath")));
	return new Securitypolicyauth();
}
	 public Securitypolicyedit selectEditSecuritypolicy() {
		 clickElement(locateElement("xpath", props.getProperty("Median.SystemMaintenance.Xpath")));
			wait(7000);
			clickElement(locateElement("xpath", props.getProperty("Median.SystemMaintenance.Securitypolicy.Xpath")));
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
		 wait(5000);
		 clickElement(locateElement("xpath", props.getProperty("Median.SystemParamMaintenance.Xpath")));
			wait(7000);
			clickElement(locateElement("xpath", props.getProperty("Median.SystemParamMaintenance.CreateTransactioncodeMaintenance.Xpath")));
			wait(5000);
			clickElement(locateElement("xpath", props.getProperty("Median.SystemParamMaintenance.CreateTransactioncodeMaintenance.New.Xpath")));
	return new CreateTransactioncodeMaintenance();
	}
	 
	 public EditTransactionCodeMaintenance selectEditTransactioMaintenance() {
		 clickElement(locateElement("xpath", props.getProperty("Median.SystemParamMaintenance.Xpath")));
			wait(7000);
			clickElement(locateElement("xpath", props.getProperty("Median.SystemParamMaintenance.EditTransactionCodeMaintenance.Xpath")));
			return new EditTransactionCodeMaintenance();
	}
	 
	 public AuthTransactionCodeMaintenance selectAuthTransactioMaintenance() {
		 clickElement(locateElement("xpath", props.getProperty("Median.SystemParamMaintenance.Xpath")));
			wait(7000);
			clickElement(locateElement("xpath", props.getProperty("Median.SystemParamMaintenance.AuthTransactioncodeMaintenance.Xpath")));
			return new AuthTransactionCodeMaintenance();
	}
	 public MedianCustomerSearch selectAccountBlockCustomerSearch() {
		    wait(5000);
	    	 clickElement(locateElement("xpath", props.getProperty("Median.Dashboard.AccountBlock.XPath")));
			wait(5000);
			clickElement(locateElement("xpath", props.getProperty("Median.Dashboard.CustomerSearch.XPath")));
			return new MedianCustomerSearch();
	}
	 public MedianAccountClosureMaintenanceSummary selectAccountClosureMaintenance() {
		    wait(5000);
	    	 clickElement(locateElement("xpath", props.getProperty("Median.Dashboard.AccountClosure.XPath")));
			wait(5000);
			clickElement(locateElement("xpath", props.getProperty("Median.Dashboard.AccountClosure.AccountClosureMaintenance.XPath")));
			return new MedianAccountClosureMaintenanceSummary();
	}
	 public MedianChargeMaintenanceSummary selectChargeMaintenance() {
		    wait(5000);
	    	 clickElement(locateElement("xpath", props.getProperty("Median.Dashboard.AccountClosure.XPath")));
			wait(5000);
			clickElement(locateElement("xpath", props.getProperty("Median.Dashboard.AccountClosure.ChargeMaintenance.XPath")));
			return new MedianChargeMaintenanceSummary();
	}
	 
}



