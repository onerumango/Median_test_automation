package pages;

import base.MedianSpecificMethods;

public class DepartmentidEdit extends MedianSpecificMethods{
	public DepartmentidEdit clickEdit() {
		clickElement(locateElement("xpath", props.getProperty("DepartmentidAuth.Auth.Xpath")));
		return this;
	}
	public DepartmentidEdit editDeptid() {
		enterValue(locateElement("xpath", props.getProperty("DepartmentidEdit.EditDeptId.Xpath")), props.getProperty("Deptid"));
		return this;
	}
	}


