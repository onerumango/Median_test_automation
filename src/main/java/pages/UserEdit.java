package pages;

import base.MedianSpecificMethods;

public class UserEdit extends MedianSpecificMethods{
	
	 public UserEdit clickEdit() {
		 wait(2000);
	 jsExecutor(locateElement("xpath", props.getProperty("Median.SystemMaintenance.Users.Edit.Xpath")));
	 wait(1000);
   	  clickElement(locateElement("xpath", props.getProperty("Median.SystemMaintenance.Users.Edit.Xpath")));
   	  return this;
     }
	 

     
      public UserEdit clickSave() {
    	  wait(2000);
       	  clickElement(locateElement("xpath", props.getProperty("Median.SystemMaintenance.Users.Edit.Save.Xpath")));
       	  return this;
         }
      
      public UserEdit clickOk() {
    	  wait(2000);
       	  clickElement(locateElement("xpath", props.getProperty("Median.SystemMaintenance.Users.Edit.Ok.Xpath")));
       	  return this;
         }
}