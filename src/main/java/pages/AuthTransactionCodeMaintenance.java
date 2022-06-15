
package pages;

import base.MedianSpecificMethods;

public class AuthTransactionCodeMaintenance extends MedianSpecificMethods{
	
	 public AuthTransactionCodeMaintenance SelectUserID() {
		 wait(2000);
   	  clickElement(locateElement("xpath", props.getProperty("Median.SystemMaintenance.AuthTransactionCodeMaintenance.SelectUserID.Xpath")));
   	  return this;
     }
	 public AuthTransactionCodeMaintenance clickAuth() {
		 wait(2000);
	   	  clickElement(locateElement("xpath", props.getProperty("Median.SystemMaintenance.AuthTransactionCodeMaintenance.Auth.Xpath")));
	   	  return this;
	     }
	 
      
      public AuthTransactionCodeMaintenance clickSave() {
    	  wait(2000);
    	  clickElement(locateElement("xpath", props.getProperty("Median.SystemMaintenance.AuthTransactionCodeMaintenance.Yes.Xpath")));
    	  return this;
      }
      public AuthTransactionCodeMaintenance clickOk() {
    	  wait(2000);
    	  clickElement(locateElement("xpath", props.getProperty("Median.SystemMaintenance.AuthTransactionCodeMaintenance.Ok.Xpath")));
    	  wait(2000);
    	  return this;
      }
      
      
}