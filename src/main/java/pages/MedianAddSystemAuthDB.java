package pages;

import base.MedianSpecificMethods;


public class MedianAddSystemAuthDB extends MedianSpecificMethods{
	
	public MedianAddSystemAuthDB clickAuth() {
		wait(2000);
		clickElement(locateElement("xpath", props.getProperty("Median.SystemInterface.AddSystem.SystemInformation.Auth.Xpath")));
	  	 return this;
	    }
	
	public MedianAddSystemAuthDB clickYes() {
	  	clickElement(locateElement("xpath", props.getProperty("Median.SystemInterface.AddSystem.SystemInformation.Auth.Yes.Xpath")));
	  	wait(5000);
	  	return this;
	    }
	public MedianAddSystemAuthDB clickOK() {
	  	clickElement(locateElement("xpath", props.getProperty("Median.SystemInterface.AddSystem.SystemInformation.Auth.OK.Xpath")));
	  	wait(5000);
	  	return this;
	    }
}