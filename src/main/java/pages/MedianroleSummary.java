 package pages;

import base.MedianSpecificMethods;

public class MedianroleSummary extends MedianSpecificMethods{
	
	
	public MedianAddNewRole selectNew() {
		clickElement(locateElement("xpath", props.getProperty("Median.SystemMaintenance.Dropdown.Role.New.Xpath")));
		wait(5000);
		return new MedianAddNewRole();
	}
	
	public MedianEditRole selectEdit() {
		wait(5000);
		clickElement(locateElement("xpath", props.getProperty("Median.SystemMaintenance.RoleName.Xpath")));
		wait(5000);
		jsExecutor(locateElement("xpath", props.getProperty("Median.SystemMaintenance.RoleName.Edit.Xpath")));
		wait(2000);
		clickElement(locateElement("xpath", props.getProperty("Median.SystemMaintenance.RoleName.Edit.Xpath")));
		return new MedianEditRole();
	}
	
	public MedianAuthRole selectRoleAuth() {
		clickElement(locateElement("xpath", props.getProperty("Median.SystemMaintenance.RoleName.Xpath")));
		wait(5000);
		return new MedianAuthRole();
	}
	

}
