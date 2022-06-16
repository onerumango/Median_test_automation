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
  
	public MedianAddSystemJSON clickNewAddJSONSystem() {
		clickElement(locateElement("xpath", props.getProperty("MedianNavbar.SystemInterface.AddSystem.Summary.New.Xpath")));
		return new MedianAddSystemJSON();

	}
	
	public MedianEditAddSystemXML clickSystemCode() {
		wait(2000);
		enterValue(locateElement("xpath", props.getProperty("Median.EditSystem.Summary.Search.Xpath")), props.getProperty("Search"));
		wait(2000);
		clickElement(locateElement("xpath", props.getProperty("Median.EditSystem.Summary.SelectID.Xpath")));
		return new MedianEditAddSystemXML();
	}
	
}
