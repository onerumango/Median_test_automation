package pages;

import base.MedianSpecificMethods;

public class ProcesscodeMappingSummary extends MedianSpecificMethods{
	public ProcesscodeMapping clickNew() {
		clickElement(locateElement("xpath", props.getProperty("ProcesscodeMappingSummary.New.Xpath")));
		return new ProcesscodeMapping();
	}
public ProcessCodeMappingEdit selectRecord() {
	clickElement(locateElement("xpath", props.getProperty("ProcesscodeMappingSummary.EditRecord.Xpath")));
	return new ProcessCodeMappingEdit();
}
public ProcesscodeMappingAuth selectUnauthRecord() {
	clickElement(locateElement("xpath", props.getProperty("ProcesscodeMappingSummary.AuthRecord.Xpath")));
	return new ProcesscodeMappingAuth();
}

}



