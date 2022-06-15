package pages;

import base.MedianSpecificMethods;

public class DepartmentidAuth extends MedianSpecificMethods{
	public DepartmentidAuth clickAuth() {
		wait(2000);
		clickElement(locateElement("xpath", props.getProperty("DepartmentidAuth.Auth.Xpath")));
		return this;
	}

	public DepartmentidAuth clickYES() {
		wait(2000);
		clickElement(locateElement("xpath", props.getProperty("DepartmentidAuth.YES.Xpath")));
		return this;
		
	}
	

}
