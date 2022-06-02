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
	
	public MedianAddSystemDB clickNewAddDB() {
		clickElement(locateElement("xpath", props.getProperty("MedianNavbar.SystemInterface.AddSystem.Summary.New.Xpath")));
		return new MedianAddSystemDB();
	}
	
	public MedianEditAddSystemDB clickID() {
		clickElement(locateElement("xpath", props.getProperty("Median.AddSystem.SelectID.Xpath")));
		return new MedianEditAddSystemDB();
	}
	public MedianAddSystemAuthDB clickID1() {
		clickElement(locateElement("xpath", props.getProperty("Median.AddSystem.SelectID.Xpath")));
		return new MedianAddSystemAuthDB();
	}
}
