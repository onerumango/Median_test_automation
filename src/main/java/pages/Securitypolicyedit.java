package pages;

import base.MedianSpecificMethods;

public class Securitypolicyedit extends MedianSpecificMethods{
	

	
	 public Securitypolicyedit clickVersion() {
   	  clickElement(locateElement("xpath", props.getProperty("Median.SystemMaintenance.Securitypolicyedit.Version.Xpath")));
   	  return this;
     }
	 public Securitypolicyedit clickEdit() {
	   	  clickElement(locateElement("xpath", props.getProperty("Median.SystemMaintenance.Securitypolicyedit.Edit.Xpath")));
	   	  return this;
	     }
	 
      public Securitypolicyedit entermaxIN() {
    	  enterValue(locateElement("xpath", props.getProperty("Median.SystemMaintenance.Securitypolicyedit.Edit.maxIN.Xpath")), props.getProperty("maxInvLogins"));
  		return this;
      }
     
      public Securitypolicyedit clickSave() {
       	  clickElement(locateElement("xpath", props.getProperty("Median.SystemMaintenance.Securitypolicyedit.Edit.Save.Xpath")));
       	  return this;
         }
      
      public Securitypolicyedit clickOk() {
       	  clickElement(locateElement("xpath", props.getProperty("Median.SystemMaintenance.Securitypolicyedit.Edit.Ok.Xpath")));
       	  return this;
         }
}