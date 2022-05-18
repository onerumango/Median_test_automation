package pages;

import base.MedianSpecificMethods;

public class DepartmentIdMaintenanceSummary extends MedianSpecificMethods{
	public DepartmentIdCreate clickNew() {
		clickElement(locateElement("xpath", props.getProperty("DepartmentIdMaintenanceSummary.New.Xpath")));
		return new DepartmentIdCreate();
	}
	
	public DepartmentidEdit clickFirstrecord() {
		clickElement(locateElement("xpath", props.getProperty("DepartmentIdMaintenanceSummary.FirstRecord.Xpath")));
		return new DepartmentidEdit();
	}
	public DepartmentidAuth clickUnauthrecord() {
		clickElement(locateElement("xpath", props.getProperty("DepartmentIdMaintenanceSummary.UnauthRecord.Xpath")));
		return new DepartmentidAuth();
	}
	

}
