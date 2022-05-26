package pages;

import base.MedianSpecificMethods;

public class TemplateMappingAuth extends MedianSpecificMethods{
	public TemplateMappingAuth clickEditAuth() {
		clickElement(locateElement("xpath", props.getProperty("TemplateMappingAuth.Auth.Xpath")));
		return this;
	}
	public TemplateMappingAuth clickExit() {
		clickElement(locateElement("xpath", props.getProperty("TemplateMappingAuth.Exit.Xpath")));
		return this;
	}

}
