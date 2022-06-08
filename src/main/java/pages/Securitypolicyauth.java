package pages;

import base.MedianSpecificMethods;

public class Securitypolicyauth extends MedianSpecificMethods{
	 
	
	 public Securitypolicyauth clickVersion() {
   	  clickElement(locateElement("xpath", props.getProperty("Median.SystemMaintenance.SecuritypolicyAuth.Version.Xpath")));
   	  return this;
     }
     
      public Securitypolicyauth clickAuth() {
       	  clickElement(locateElement("xpath", props.getProperty("Median.SystemMaintenance.SecuritypolicyAuth.Auth.Xpath")));
       	  return this;
         }
      
      public Securitypolicyauth clicksave() {
       	  clickElement(locateElement("xpath", props.getProperty("Median.SystemMaintenance.SecuritypolicyAuth.Auth.Save.Xpath")));
       	  return this;
         }
      
      public Securitypolicyauth clickOk() {
       	  clickElement(locateElement("xpath", props.getProperty("Median.SystemMaintenance.SecuritypolicyAuth.Auth.Ok.Xpath")));
       	  return this;
         }
}
