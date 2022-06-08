
package pages;

import base.MedianSpecificMethods;

public class AuthTransactionCodeMaintenance extends MedianSpecificMethods{
	
	 public AuthTransactionCodeMaintenance clickVersion() {
   	  clickElement(locateElement("xpath", props.getProperty("Median.SystemMaintenance.AuthTransactionCodeMaintenance.Version.Xpath")));
   	  return this;
     }
	 public AuthTransactionCodeMaintenance clickAuth() {
	   	  clickElement(locateElement("xpath", props.getProperty("Median.SystemMaintenance.AuthTransactionCodeMaintenance.Auth.Xpath")));
	   	  return this;
	     }
	 
      
      public AuthTransactionCodeMaintenance clickSave() {
    	  clickElement(locateElement("xpath", props.getProperty("Median.SystemMaintenance.AuthTransactionCodeMaintenance.Yes.Xpath")));
    	  return this;
      }
      public AuthTransactionCodeMaintenance clickOk() {
    	  clickElement(locateElement("xpath", props.getProperty("Median.SystemMaintenance.AuthTransactionCodeMaintenance.Ok.Xpath")));
    	  return this;
      }
      
      
}