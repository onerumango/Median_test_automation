package pages;

import base.MedianSpecificMethods;

public class GlobalaccountSummary extends MedianSpecificMethods{
	public GlobalAccountCreate clickGLaccountNew() {
		wait(2000);
		clickElement(locateElement("xpath", props.getProperty("GlobalaccountSummary.New.Xpath")));
		return new GlobalAccountCreate();
	}
	public GlobalAccountEdit clickFirstRecord() {
		wait(2000);
		clickElement(locateElement("xpath", props.getProperty("GlobalaccountSummary.FirstRecord.Xpath")));
		return new GlobalAccountEdit();
	}
	
	public GlobalAccountAuth clickUnauthRecord() {
		wait(2000);
		clickElement(locateElement("xpath", props.getProperty("GlobalaccountSummary.UnauthRecord.Xpath")));
		wait(2000);
		return new GlobalAccountAuth();
	}
	

}
