package pages;

import base.MedianSpecificMethods;

public class ProcesscodeMappingSummary extends MedianSpecificMethods{
	public ProcesscodeMapping clickNew() {
		clickElement(locateElement("xpath", props.getProperty("ProcesscodeMappingSummary.New.Xpath")));
		return new ProcesscodeMapping();
	}

}
