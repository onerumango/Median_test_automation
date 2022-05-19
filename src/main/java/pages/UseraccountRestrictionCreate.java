package pages;

import base.MedianSpecificMethods;

public class UseraccountRestrictionCreate extends MedianSpecificMethods{
	
public UseraccountRestrictionCreate clickUseridDropdown() {
	clickElement(locateElement("xpath", props.getProperty("UseraccountRestrictionCreate.UseridDropdown.Xpath")));
	return this;
}
public UseraccountRestrictionCreate selectUserid() {
	clickElement(locateElement("xpath", props.getProperty("UseraccountRestrictionCreate.Userid.Xpath")));
	return this;
}
public UseraccountRestrictionCreate enterUserGlCode() {
	  enterValue(locateElement("xpath", props.getProperty("GlobalAccountCreate.UserGlCode.Xpath")), props.getProperty("UserGlCode"));
		return this;
    }
public UseraccountRestrictionCreate enterUserGlcodeDescription() {
	  enterValue(locateElement("xpath", props.getProperty("GlobalAccountCreate.UserGlCodeDescription.Xpath")), props.getProperty("UserGlCodeDescription"));
		return this;
  }
public UseraccountRestrictionCreate clickSave() {
	clickElement(locateElement("xpath", props.getProperty("UseraccountRestrictionCreate.Save.Xpath")));
	return this;
}
}


