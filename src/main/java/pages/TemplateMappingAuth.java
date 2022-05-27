package pages;

import base.MedianSpecificMethods;

public class TemplateMappingAuth extends MedianSpecificMethods{
	public TemplateMappingAuth clickAuth() {
		clickElement(locateElement("xpath", props.getProperty("TemplateMappingAuth.Auth.Xpath")));
		return this;
	}
	public MedianDashboard clickExit() {
		clickElement(locateElement("xpath", props.getProperty("TemplateMappingAuth.Exit.Xpath")));
		return new MedianDashboard();
	}

}
