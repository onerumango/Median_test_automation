package pages;

import base.MedianSpecificMethods;

public class GlobalAccountAuth extends MedianSpecificMethods{
	public GlobalAccountAuth clickAuth() {
		 clickElement(locateElement("xpath", props.getProperty("GlobalAccountAuth.Auth.Xpath")));
	   	  return this;
	     }
	}


