package pages;

import base.MedianSpecificMethods;

public class DepartmentIdMaintenanceSummary extends MedianSpecificMethods{
	public DepartmentIdMaintenanceSummary clickNew() {
		clickElement(locateElement("xpath", props.getProperty("DepartmentIdMaintenanceSummary.New.Xpath")));
		return this;
	}
	public DepartmentIdMaintenanceSummary clickUnauthrecord() {
		clickElement(locateElement("xpath", props.getProperty("DepartmentIdMaintenanceSummary.UnauthRecord.Xpath")));
		return this;
	}

}
