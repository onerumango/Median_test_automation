package pages;

import base.MedianSpecificMethods;

public class DepartmentidEdit extends MedianSpecificMethods{
	public DepartmentidEdit clickEdit() {
		wait(2000);
		clickElement(locateElement("xpath", props.getProperty("DepartmentidEdit.Edit.Xpath")));
		return this;
	}
	public DepartmentidEdit clearDeptName() {
		wait(2000);
		clearElement(locateElement("xpath", props.getProperty("DepartmentidEdit.EditDeptName.Xpath")));
		return this;
	}
	public DepartmentidEdit editDeptName() {
		wait(4000);
		enterValue(locateElement("xpath", props.getProperty("DepartmentidEdit.EditDeptName.Xpath")), props.getProperty("DepartmentName"));
		return this;
	}
    public DepartmentidEdit clickSave() {
    	wait(2000);
    	clickElement(locateElement("xpath", props.getProperty("DepartmentidEdit.Save.Xpath")));
		return this;
    }
    public DepartmentidEdit clickOK() {
    	wait(2000);
    	clickElement(locateElement("xpath", props.getProperty("DepartmentidEdit.OK.Xpath")));
    	wait(2000);
		return this;
    }
	}


