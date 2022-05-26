package pages;

import base.MedianSpecificMethods;

public class ProcesscodeMappingAuth extends MedianSpecificMethods{
	public ProcesscodeMapping clickAuth() {
		clickElement(locateElement("xpath", props.getProperty("ProcesscodeMappingSummary.Auth.Xpath")));
		return new ProcesscodeMapping();
	}
	

}
