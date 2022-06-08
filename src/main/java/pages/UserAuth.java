package pages;

import base.MedianSpecificMethods;

public class UserAuth extends MedianSpecificMethods{
	
	

	 public UserAuth clickAuth() {
   	  clickElement(locateElement("xpath", props.getProperty("Median.SystemMaintenance.Users.Auth.Xpath")));
   	  return this;
     }
	 
	 public UserAuth clickYes() {
   	  clickElement(locateElement("xpath", props.getProperty("Median.SystemMaintenance.Users.Auth.Save.Xpath")));
   	  return this;
     }
	
	
	 public UserAuth clickOK() {
   	  clickElement(locateElement("xpath", props.getProperty("Median.SystemMaintenance.Users.Auth.Ok.Xpath")));
   	  return this;
     }
}