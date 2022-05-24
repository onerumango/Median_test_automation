package pages;

import base.MedianSpecificMethods;

public class MedianLogout extends MedianSpecificMethods {
	
	public MedianLogout clickLogout() throws Throwable  {
		Thread.sleep(10000);
		clickElement(locateElement("xpath", props.getProperty("MedianDashboard.Logout.Xpath")));
		wait(1000);
        return this;
		
	}


}
