package pages;

import base.MedianSpecificMethods;

public class UserAuth extends MedianSpecificMethods{
	
	

	 public UserAuth clickAuth() {
		 wait(1000);
		 jsExecutor(locateElement("xpath", props.getProperty("Median.SystemMaintenance.Users.Auth.Xpath")));
		 wait(1000);
   	  clickElement(locateElement("xpath", props.getProperty("Median.SystemMaintenance.Users.Auth.Xpath")));
   	  return this;
     }
	 
	 public UserAuth clickYes() {
		 wait(1000);
   	  clickElement(locateElement("xpath", props.getProperty("Median.SystemMaintenance.Users.Auth.Save.Xpath")));
   	  return this;
     }
	
	
	 public UserAuth clickOK() {
		 wait(1000);
   	  clickElement(locateElement("xpath", props.getProperty("Median.SystemMaintenance.Users.Auth.Ok.Xpath")));
   	  return this;
     }
}