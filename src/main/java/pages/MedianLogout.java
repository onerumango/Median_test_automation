package pages;

import base.MedianSpecificMethods;

public class MedianLogout extends MedianSpecificMethods {
	
	public MedianLogout clickLogout() {
		
		clickElement(locateElement("xpath", props.getProperty("MedianDashboard.Logout.Xpath")));
		
        return this;
		
	}


}
