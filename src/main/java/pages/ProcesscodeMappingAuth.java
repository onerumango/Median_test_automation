package pages;

import base.MedianSpecificMethods;

public class ProcesscodeMappingAuth extends MedianSpecificMethods{
	public ProcesscodeMappingAuth clickAuth() {
		wait(3000);
		jsExecutor(locateElement("xpath", props.getProperty("ProcesscodeMappingSummary.Auth.Xpath")));
		wait(3000);
		clickElement(locateElement("xpath", props.getProperty("ProcesscodeMappingSummary.Auth.Xpath")));
		wait(3000);
		clickElement(locateElement("xpath", props.getProperty("ProcesscodeMappingSummary.YES.Xpath")));
		wait(3000);
		clickElement(locateElement("xpath", props.getProperty("ProcesscodeMappingSummary.OK.Xpath")));
		return this;
	}
	

}
