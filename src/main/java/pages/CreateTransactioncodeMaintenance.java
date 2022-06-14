
package pages;

import base.MedianSpecificMethods;

public class CreateTransactioncodeMaintenance extends MedianSpecificMethods{
	

      
      public CreateTransactioncodeMaintenance selectUserID() {
    	wait(2000);
  		clickElement(locateElement("xpath", props.getProperty("Median.SystemParamMaintenance.CreateTransactioncodeMaintenance.New.UserDropdown.Xpath")));
  		wait(2000);
  		clickElement(locateElement("xpath", props.getProperty("Median.SystemParamMaintenance.CreateTransactioncodeMaintenance.New.SelectUserDropdown.Xpath")));
  		return this;
  	}
      public  CreateTransactioncodeMaintenance entertrncode() {
    	  wait(2000);
    	  enterValue(locateElement("xpath", props.getProperty("Median.SystemParamMaintenance.CreateTransactioncodeMaintenance.New.trncode.Xpath")), props.getProperty("trnCode"));
  		return this;
      }
      
      public  CreateTransactioncodeMaintenance entertrndesc() {
    	  wait(2000);
    	  enterValue(locateElement("xpath", props.getProperty("Median.SystemParamMaintenance.CreateTransactioncodeMaintenance.New.trndesc.Xpath")), props.getProperty("trnDesc"));
  		return this;
      }
      
      public CreateTransactioncodeMaintenance clickSave() {
    	  wait(2000);
    	  clickElement(locateElement("xpath", props.getProperty("Median.SystemParamMaintenance.CreateTransactioncodeMaintenance.New.Save.Xpath")));
    	  return this;
      }
      public CreateTransactioncodeMaintenance clickOk() {
    	  wait(2000);
    	  clickElement(locateElement("xpath", props.getProperty("Median.SystemParamMaintenance.CreateTransactioncodeMaintenance.New.OK.Xpath")));
    	  return this;
      }
      
      
}