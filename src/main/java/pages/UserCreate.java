
package pages;

import base.MedianSpecificMethods;

public class UserCreate extends MedianSpecificMethods{
	
	
      public UserCreate enterUserId() {
    	  enterValue(locateElement("xpath", props.getProperty("Median.SystemMaintenance.Users.New.UserID.Xpath")), props.getProperty("UserID"));
  		return this;
      }
      public UserCreate enterUserName() {
    	  enterValue(locateElement("xpath", props.getProperty("Median.SystemMaintenance.Users.New.Username.Xpath")), props.getProperty("UserName"));
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
    	wait(2000);
    	jsExecutor(locateElement("xpath", props.getProperty("Median.SystemMaintenance.Users.New.Save.Xpath")));
    	wait(1000);
  		clickElement(locateElement("xpath", props.getProperty("Median.SystemMaintenance.Users.New.RolesForUser.Dropdown.Xpath")));
  		wait(2000);
  		enterValue(locateElement("xpath", props.getProperty("Median.SystemMaintenance.Users.New.RolesForUser.DropdownSearch.Xpath")), props.getProperty("DropdownSearch"));
  		wait(2000);
  		clickElement(locateElement("xpath", props.getProperty("Median.SystemMaintenance.Users.New.RolesForUser.Dropdown.SelectRole.Xpath")));
  		return this;
  	}
      
      public UserCreate selectDepartment() {
    	  wait(1000);
    	  jsExecutor(locateElement("xpath", props.getProperty("Median.SystemMaintenance.Users.New.Department.Dropdown.Xpath")));
    	wait(1000);
  		clickElement(locateElement("xpath", props.getProperty("Median.SystemMaintenance.Users.New.Department.Dropdown.Xpath")));
  		wait(1000);
  		clickElement(locateElement("xpath", props.getProperty("Median.SystemMaintenance.Users.New.Department.Dropdown.Option.Xpath")));
  		return this;
  	}
      
      public UserCreate clickSave() {
    	  wait(1000);
    	  jsExecutor(locateElement("xpath", props.getProperty("Median.SystemMaintenance.Users.New.Save.Xpath")));
    	  wait(5000);
    	  clickElement(locateElement("xpath", props.getProperty("Median.SystemMaintenance.Users.New.Save.Xpath")));
    	  return this;
      }
      
      
}