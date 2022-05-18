package pages;

import base.MedianSpecificMethods;

public class MedianDashboard extends MedianSpecificMethods{

	public MedianAddNewRole selectSystemMaintenance() {
			clickElement(locateElement("xpath", props.getProperty("Median.SystemMaintenance.Dropdown.Xpath")));
			wait(7000);
			clickElement(locateElement("xpath", props.getProperty("Median.SystemMaintenance.Dropdown.Role.Xpath")));
			wait(7000);
			return new MedianAddNewRole();
	}
	
	
	

}
