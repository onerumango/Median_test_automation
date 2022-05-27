package pages;

import base.MedianSpecificMethods;

public class MedianAddSystemSummary extends MedianSpecificMethods{

	public MedianAddSystemISO clickNewAddSystem() {
		clickElement(locateElement("xpath", props.getProperty("MedianNavbar.SystemInterface.AddSystem.Summary.New.Xpath")));
		return new MedianAddSystemISO();
	}
	
	
	
}
