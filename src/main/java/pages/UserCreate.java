
package pages;

import base.MedianSpecificMethods;

public class UserCreate extends MedianSpecificMethods{
	
	
      public UserCreate enterUserId() {
    	  enterValue(locateElement("xpath", props.getProperty("Median.SystemMaintenance.Users.New.UserID.Xpath")), props.getProperty("User Id"));
  		return this;
      }
      public UserCreate enterUserName() {
    	  enterValue(locateElement("xpath", props.getProperty("Median.SystemMaintenance.Users.New.Username.Xpath")), props.getProperty("User Name"));
  		return this;
      }
      public UserCreate enterPassword() {
    	  enterValue(locateElement("xpath", props.getProperty("Median.SystemMaintenance.Users.New.Password.Xpath")), props.getProperty("Password"));
  		return this;
      }
      public UserCreate enterEmail() {
    	  enterValue(locateElement("xpath", props.getProperty("Median.SystemMaintenance.Users.New.Email.Xpath")), props.getProperty("email"));
  		return this;
      }
      
      public UserCreate enterMobile() {
    	  enterValue(locateElement("xpath", props.getProperty("Median.SystemMaintenance.Users.New.Mobile.Xpath")), props.getProperty("mobile"));
  		return this;
      }
      
      public UserCreate selectRolesForUSer() {
  		clickElement(locateElement("xpath", props.getProperty("Median.SystemMaintenance.Users.New.RolesForUser.Dropdown.Xpath")));
  		wait(1000);
  		clickElement(locateElement("xpath", props.getProperty("Median.SystemMaintenance.Users.New.RolesForUser.Dropdown.Demorole.Xpath")));
  		return this;
  	}
      
      public UserCreate selectDepartment() {
  		clickElement(locateElement("xpath", props.getProperty("Median.SystemMaintenance.Users.New.Department.Dropdown.Xpath")));
  		wait(1000);
  		clickElement(locateElement("xpath", props.getProperty("Median.SystemMaintenance.Users.New.Department.Dropdown.Option.Xpath")));
  		return this;
  	}
      
      public UserCreate clickSave() {
    	  clickElement(locateElement("xpath", props.getProperty("Median.SystemMaintenance.Users.New.Save.Xpath")));
    	  return this;
      }
      
      
}