package pages;

import base.MedianSpecificMethods;

public class UseraccountRestrictionCreate extends MedianSpecificMethods{
	
public UseraccountRestrictionCreate clickUseridDropdown() {
	wait(2000);
	clickElement(locateElement("xpath", props.getProperty("UseraccountRestrictionCreate.UseridDropdown.Xpath")));
	return this;
}
public UseraccountRestrictionCreate selectUserid() {
	wait(2000);
	clickElement(locateElement("xpath", props.getProperty("UseraccountRestrictionCreate.Userid.Xpath")));
	return this;
}
public UseraccountRestrictionCreate enterUserGlCode() {
	wait(2000);
	  enterValue(locateElement("xpath", props.getProperty("GlobalAccountCreate.UserGlCode.Xpath")), props.getProperty("UserGlCode"));
		return this;
    }
public UseraccountRestrictionCreate enterUserGlcodeDescription() {
	wait(2000);
	  enterValue(locateElement("xpath", props.getProperty("GlobalAccountCreate.UserGlCodeDescription.Xpath")), props.getProperty("UserGlCodeDescription"));
		return this;
  }
public UseraccountRestrictionCreate clickSave() {
	wait(2000);
	clickElement(locateElement("xpath", props.getProperty("UseraccountRestrictionCreate.Save.Xpath")));
	wait(2000);
	return this;
}
}


