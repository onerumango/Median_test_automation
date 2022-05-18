package pages;

import base.MedianSpecificMethods;

public class MedianDashboard extends MedianSpecificMethods{
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
}
	
	
	


