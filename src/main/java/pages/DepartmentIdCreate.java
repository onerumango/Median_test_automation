package pages;

import base.MedianSpecificMethods;

public class DepartmentIdCreate extends MedianSpecificMethods{
      public DepartmentIdCreate enterDeptId() {
    	  enterValue(locateElement("xpath", props.getProperty("DepartmentIdCreate.DepartmentId.Xpath")), props.getProperty("DepartmentId"));
  		return this;
      }
      public DepartmentIdCreate enterDeptName() {
    	  enterValue(locateElement("xpath", props.getProperty("DepartmentIdCreate.DepartmentName.Xpath")), props.getProperty("DepartmentName"));
  		return this;
      }
      public DepartmentIdCreate enterBatchNofrom() {
    	  enterValue(locateElement("xpath", props.getProperty("DepartmentIdCreate.BatchNofrom.Xpath")), props.getProperty("BatchNofrom"));
  		return this;
      }
      public DepartmentIdCreate enterBatchNoto() {
    	  enterValue(locateElement("xpath", props.getProperty("DepartmentIdCreate.BatchNoto.Xpath")), props.getProperty("BatchNoto"));
  		return this;
      }
      public DepartmentIdCreate clickDeptSubmit() {
    	  clickElement(locateElement("xpath", props.getProperty("DepartmentIdCreate.Submit.Xpath")));
    	  return this;
      }
      
      
}
