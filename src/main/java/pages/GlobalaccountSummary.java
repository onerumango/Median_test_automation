package pages;

import base.MedianSpecificMethods;

public class GlobalaccountSummary extends MedianSpecificMethods{
	public GlobalAccountCreate clickNew() {
		clickElement(locateElement("xpath", props.getProperty("GlobalaccountSummary.New.Xpath")));
		return new GlobalAccountCreate();
	}
	public GlobalAccountEdit clickFirstRecord() {
		clickElement(locateElement("xpath", props.getProperty("GlobalaccountSummary.FirstRecord.Xpath")));
		return new GlobalAccountEdit();
	}
	
	public GlobalAccountAuth clickUnauthRecord() {
		clickElement(locateElement("xpath", props.getProperty("GlobalaccountSummary.UnauthRecord.Xpath")));
		return new GlobalAccountAuth();
	}
	

}
