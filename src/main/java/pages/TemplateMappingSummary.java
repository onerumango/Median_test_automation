package pages;

import base.MedianSpecificMethods;

public class TemplateMappingSummary extends MedianSpecificMethods{
	public TemplateMappingCreate clickNew() {
		wait(2000);
		clickElement(locateElement("xpath", props.getProperty("TemplateMappingSummary.New.Xpath")));
		return new TemplateMappingCreate();
	}
	public TemplateMappingEdit selectRecord() {
		wait(2000);
		clickElement(locateElement("xpath", props.getProperty("TemplateMappingEdit.Record.Xpath")));
		return new TemplateMappingEdit();
	}
	public TemplateMappingAuth selectUnauthRecord() {
		wait(2000);
		clickElement(locateElement("xpath", props.getProperty("TemplateMappingAuth.UnauthRecord.Xpath")));
		return new TemplateMappingAuth();
	}
}
