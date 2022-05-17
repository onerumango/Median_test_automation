package pages;

import base.MedianSpecificMethods;

public class DepartmentIdMaintenanceSummary extends MedianSpecificMethods{
	public DepartmentIdMaintenanceSummary clickNew() {
		clickElement(locateElement("xpath", props.getProperty("DepartmentIdMaintenanceSummary.New.Xpath")));
		return this;
	}
	

}
