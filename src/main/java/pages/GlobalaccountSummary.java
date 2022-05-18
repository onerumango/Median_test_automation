package pages;

import base.MedianSpecificMethods;

public class GlobalaccountSummary extends MedianSpecificMethods{
	public GlobalAccountCreate clickNew() {
		clickElement(locateElement("xpath", props.getProperty("GlobalaccountSummary.New.Xpath")));
		return new GlobalAccountCreate();
	}
	
	

}
