package pages;

import base.MedianSpecificMethods;

public class DepartmentIdMaintenanceSummary extends MedianSpecificMethods{
	public DepartmentIdCreate clickNew() {
		wait(5000);
		clickElement(locateElement("xpath", props.getProperty("DepartmentIdMaintenanceSummary.New.Xpath")));
		return new DepartmentIdCreate();
	}
	
	public DepartmentidEdit clickDepartmentID() {
		wait(3000);
		clickElement(locateElement("xpath", props.getProperty("DepartmentIdMaintenanceSummary.FirstRecord.Xpath")));
		return new DepartmentidEdit();
	}
	public DepartmentidAuth clickDepartmentIDAuth() {
		wait(3000);
		clickElement(locateElement("xpath", props.getProperty("DepartmentIdMaintenanceSummary.FirstRecord.Xpath")));
		return new DepartmentidAuth();
	}
	

}
