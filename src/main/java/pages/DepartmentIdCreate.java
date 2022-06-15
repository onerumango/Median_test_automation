package pages;

import base.MedianSpecificMethods;

public class DepartmentIdCreate extends MedianSpecificMethods{
      public DepartmentIdCreate enterDeptId() {
    	  wait(3000);
    	  enterValue(locateElement("xpath", props.getProperty("DepartmentIdCreate.DepartmentId.Xpath")), props.getProperty("DepartmentId"));
  		return this;
      }
      public DepartmentIdCreate enterDeptName() {
    	  wait(3000);
    	  enterValue(locateElement("xpath", props.getProperty("DepartmentIdCreate.DepartmentName.Xpath")), props.getProperty("DepartmentName"));
  		return this;
      }
      public DepartmentIdCreate enterBatchNofrom() {
    	  wait(3000);
    	  enterValue(locateElement("xpath", props.getProperty("DepartmentIdCreate.BatchNofrom.Xpath")), props.getProperty("BatchNofrom"));
  		return this;
      }
      public DepartmentIdCreate enterBatchNoto() {
    	  wait(3000);
    	  enterValue(locateElement("xpath", props.getProperty("DepartmentIdCreate.BatchNoto.Xpath")), props.getProperty("BatchNoto"));
  		return this;
      }
      public DepartmentIdCreate clickSave() {
    	  wait(3000);
    	  clickElement(locateElement("xpath", props.getProperty("DepartmentIdCreate.Save.Xpath")));
    	  return this;
      }
      public DepartmentIdCreate clickOK() {
    	  wait(3000);
    	  clickElement(locateElement("xpath", props.getProperty("DepartmentIdCreate.OK.Xpath")));
    	  return this;
      }
      
}
