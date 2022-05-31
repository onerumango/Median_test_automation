package pages;

import base.MedianSpecificMethods;

public class MedianAddSystemSummary extends MedianSpecificMethods{

	public MedianAddSystemISO clickNewAddISOSystem() {
		clickElement(locateElement("xpath", props.getProperty("MedianNavbar.SystemInterface.AddSystem.Summary.New.Xpath")));
		return new MedianAddSystemISO();
	}

	public MedianAddSystemXML clickNewAddXMLSystem() {
		clickElement(locateElement("xpath", props.getProperty("MedianNavbar.SystemInterface.AddSystem.Summary.New.Xpath")));
		return new MedianAddSystemXML();
	}
	
	
	
}
