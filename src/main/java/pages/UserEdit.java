package pages;

import base.MedianSpecificMethods;

public class UserEdit extends MedianSpecificMethods{
	
	 public UserEdit clickEdit() {
   	  clickElement(locateElement("xpath", props.getProperty("Median.SystemMaintenance.Users.Edit.Xpath")));
   	  return this;
     }
	 
      public UserEdit enterUserName() {
    	  enterValue(locateElement("xpath", props.getProperty("Median.SystemMaintenance.Users.New.Username.Xpath")), props.getProperty("User Name"));
  		return this;
      }
     
      public UserEdit clickSave() {
       	  clickElement(locateElement("xpath", props.getProperty("Median.SystemMaintenance.Users.Edit.Save.Xpath")));
       	  return this;
         }
      
      public UserEdit clickOk() {
       	  clickElement(locateElement("xpath", props.getProperty("Median.SystemMaintenance.Users.Edit.Ok.Xpath")));
       	  return this;
         }
}