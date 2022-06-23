package pages;

import base.MedianSpecificMethods;

public class ProcesscodeMappingSummary extends MedianSpecificMethods{
	public ProcesscodeMappingCreate clickNew() {
		wait(3000);
		clickElement(locateElement("xpath", props.getProperty("ProcesscodeMappingSummary.New.Xpath")));
		return new ProcesscodeMappingCreate();
	}
	
	public ProcesscodeMappingSummary searchProcessCode() {
		wait(3000);
		enterValue(locateElement("xpath", props.getProperty("ProcesscodeMappingSummary.searchProcessCode.Xpath")), props.getProperty("searchProcessCode"));
		return this;
	}
public ProcessCodeMappingEdit selectRecord() {
	wait(3000);
	clickElement(locateElement("xpath", props.getProperty("ProcesscodeMappingSummary.Record.Xpath")));
	return new ProcessCodeMappingEdit();
}
public ProcesscodeMappingAuth selectRecordforAuth() {
	wait(3000);
	clickElement(locateElement("xpath", props.getProperty("ProcesscodeMappingSummary.Record.Xpath")));
	return new ProcesscodeMappingAuth();
}
public ProcesscodeMappingAuth selectUnauthRecord() {
	wait(3000);
	clickElement(locateElement("xpath", props.getProperty("ProcesscodeMappingSummary.AuthRecord.Xpath")));
	return new ProcesscodeMappingAuth();
}

}



