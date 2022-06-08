
package pages;

import base.MedianSpecificMethods;

public class EditTransactionCodeMaintenance extends MedianSpecificMethods{
	
	 public EditTransactionCodeMaintenance clickVersion() {
   	  clickElement(locateElement("xpath", props.getProperty("Median.SystemMaintenance.EditTransactionCodeMaintenance.Version.Xpath")));
   	  return this;
     }
	 public EditTransactionCodeMaintenance clickEdit() {
	   	  clickElement(locateElement("xpath", props.getProperty("Median.SystemMaintenance.EditTransactionCodeMaintenance.Edit.Xpath")));
	   	  return this;
	     }
	 
      public  EditTransactionCodeMaintenance entertrncode() {
    	  enterValue(locateElement("xpath", props.getProperty("Median.SystemMaintenance.CreateTransactioncodeMaintenance.New.trncode.Xpath")), props.getProperty("trnCode"));
  		return this;
      }
      
      
      public EditTransactionCodeMaintenance clickSave() {
    	  clickElement(locateElement("xpath", props.getProperty("Median.SystemMaintenance.EditTransactionCodeMaintenance.Edit.Save.Xpath")));
    	  return this;
      }
      public EditTransactionCodeMaintenance clickOk() {
    	  clickElement(locateElement("xpath", props.getProperty("Median.SystemMaintenance.EditTransactionCodeMaintenance.Edit.OK.Xpath")));
    	  return this;
      }
      
      
}