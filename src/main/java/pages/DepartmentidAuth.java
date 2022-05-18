package pages;

import base.MedianSpecificMethods;

public class DepartmentidAuth extends MedianSpecificMethods{
	public DepartmentidAuth clickAuth() {
		clickElement(locateElement("xpath", props.getProperty("DepartmentidAuth.Auth.Xpath")));
		return this;
	}
	

}
