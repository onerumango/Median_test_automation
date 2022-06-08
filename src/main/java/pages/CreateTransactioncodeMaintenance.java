
package pages;

import base.MedianSpecificMethods;

public class CreateTransactioncodeMaintenance extends MedianSpecificMethods{
	

      
      public CreateTransactioncodeMaintenance selectDefault() {
  		clickElement(locateElement("xpath", props.getProperty("Median.SystemMaintenance.CreateTransactioncodeMaintenance.New.Default.Dropdown.Xpath")));
  		wait(1000);
  		clickElement(locateElement("xpath", props.getProperty("Median.SystemMaintenance.CreateTransactioncodeMaintenance.New.Default.Dropdown.ASHADM.Xpath")));
  		return this;
  	}
      public  CreateTransactioncodeMaintenance entertrncode() {
    	  enterValue(locateElement("xpath", props.getProperty("Median.SystemMaintenance.CreateTransactioncodeMaintenance.New.trncode.Xpath")), props.getProperty("trnCode"));
  		return this;
      }
      
      public  CreateTransactioncodeMaintenance entertrndesc() {
    	  enterValue(locateElement("xpath", props.getProperty("Median.SystemMaintenance.CreateTransactioncodeMaintenance.New.trndesc.Xpath")), props.getProperty("trnDesc"));
  		return this;
      }
      
      public CreateTransactioncodeMaintenance clickSave() {
    	  clickElement(locateElement("xpath", props.getProperty("Median.SystemMaintenance.CreateTransactioncodeMaintenance.New.Save.Xpath")));
    	  return this;
      }
      public CreateTransactioncodeMaintenance clickOk() {
    	  clickElement(locateElement("xpath", props.getProperty("Median.SystemMaintenance.CreateTransactioncodeMaintenance.New.OK.Xpath")));
    	  return this;
      }
      
      
}