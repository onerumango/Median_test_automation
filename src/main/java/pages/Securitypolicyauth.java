package pages;

import base.MedianSpecificMethods;

public class Securitypolicyauth extends MedianSpecificMethods{
	 
	
	 public Securitypolicyauth clickVersion() {
		 wait(2000);
   	  clickElement(locateElement("xpath", props.getProperty("Median.SystemMaintenance.SecuritypolicyAuth.Version.Xpath")));
   	  return this;
     }
     
      public Securitypolicyauth clickAuth() {
    	  wait(2000);
 		 jsExecutor(locateElement("xpath", props.getProperty("Median.SystemMaintenance.SecuritypolicyAuth.Auth.Xpath")));
 		 wait(2000);
       	  clickElement(locateElement("xpath", props.getProperty("Median.SystemMaintenance.SecuritypolicyAuth.Auth.Xpath")));
       	  return this;
         }
      
      public Securitypolicyauth clicksave() {
    	  wait(2000);
       	  clickElement(locateElement("xpath", props.getProperty("Median.SystemMaintenance.SecuritypolicyAuth.Auth.Save.Xpath")));
       	  return this;
         }
      
      public Securitypolicyauth clickOk() {
    	  wait(2000);
       	  clickElement(locateElement("xpath", props.getProperty("Median.SystemMaintenance.SecuritypolicyAuth.Auth.Ok.Xpath")));
       	  return this;
         }
}
