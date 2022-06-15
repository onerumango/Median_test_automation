
package pages;

import base.MedianSpecificMethods;

public class EditTransactionCodeMaintenance extends MedianSpecificMethods{
	
	 public EditTransactionCodeMaintenance clickUserID() {
		 wait(3000);
   	  clickElement(locateElement("xpath", props.getProperty("Median.SystemParamMaintenance.EditTransactionCodeMaintenance.SelectUserID.Xpath")));
   	  return this;
     }
	 public EditTransactionCodeMaintenance clickEdit() {
		 wait(2000);
	   	  clickElement(locateElement("xpath", props.getProperty("Median.SystemParamMaintenance.EditTransactionCodeMaintenance.Edit.Xpath")));
	   	  return this;
	     }
			/*
			 * public EditTransactionCodeMaintenance clearTrnCode() { wait(2000);
			 * clearElement(locateElement("xpath", props.getProperty(
			 * "Median.SystemParamMaintenance.EditTransactionCodeMaintenance.trncode1.Xpath"
			 * ))); return this; }
			 * 
			 * public EditTransactionCodeMaintenance reEntertrncode() { wait(4000);
			 * enterValue(locateElement("xpath", props.getProperty(
			 * "Median.SystemParamMaintenance.EditTransactionCodeMaintenance.trncode1.Xpath"
			 * )), props.getProperty("trncode1")); return this; }
			 */
	 public EditTransactionCodeMaintenance clearTrnDesc() {
		 wait(2000);
		 clearElement(locateElement("xpath", props.getProperty("Median.SystemParamMaintenance.EditTransactionCodeMaintenance.trnDesc1.Xpath")));
	   	  return this;
	     }
	 
      public  EditTransactionCodeMaintenance reEntertrnDesc() {
    	  wait(4000);
    	  enterValue(locateElement("xpath", props.getProperty("Median.SystemParamMaintenance.EditTransactionCodeMaintenance.trnDesc1.Xpath")), props.getProperty("trnDesc1"));
  		return this;
      }
      
      
      public EditTransactionCodeMaintenance clickSave() {
    	  wait(5000);
    	  jsExecutor(locateElement("xpath", props.getProperty("Median.SystemParamMaintenance.EditTransactionCodeMaintenance.Save.Xpath")));
    	  wait(5000);
    	  clickElement(locateElement("xpath", props.getProperty("Median.SystemParamMaintenance.EditTransactionCodeMaintenance.Save.Xpath")));
    	  return this;
      }
      public EditTransactionCodeMaintenance clickOk() {
    	  wait(2000);
    	  clickElement(locateElement("xpath", props.getProperty("Median.SystemParamMaintenance.EditTransactionCodeMaintenance.OK.Xpath")));
    	  return this;
      }
      
      
}