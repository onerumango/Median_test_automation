package pages;

import base.MedianSpecificMethods;

public class Securitypolicyedit extends MedianSpecificMethods{
	

	
	 public Securitypolicyedit clickVersion() {
		 wait(4000);
   	  clickElement(locateElement("xpath", props.getProperty("Median.SystemMaintenance.Securitypolicyedit.Version.Xpath")));
   	  return this;
     }
	 public Securitypolicyedit clickEdit() {
		 wait(2000);
		 jsExecutor(locateElement("xpath", props.getProperty("Median.SystemMaintenance.Securitypolicyedit.Edit.Xpath")));
		 wait(2000);
	   	  clickElement(locateElement("xpath", props.getProperty("Median.SystemMaintenance.Securitypolicyedit.Edit.Xpath")));
	   	  return this;
	     }
	 
      public Securitypolicyedit updatePasswordComplexity() {
    	  wait(2000);
    	  clickElement(locateElement("xpath", props.getProperty("Median.SystemMaintenance.Securitypolicyedit.UpdatePasswordComplexity.Xpath")));
  		return this;
      }
     
      public Securitypolicyedit clickSave() {
    	  wait(2000);
       	  clickElement(locateElement("xpath", props.getProperty("Median.SystemMaintenance.Securitypolicyedit.Edit.Save.Xpath")));
       	  return this;
         }
      
      public Securitypolicyedit clickOk() {
       	  clickElement(locateElement("xpath", props.getProperty("Median.SystemMaintenance.Securitypolicyedit.Edit.Ok.Xpath")));
       	  return this;
         }
}