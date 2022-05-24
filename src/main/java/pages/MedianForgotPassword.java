package pages;

import base.MedianSpecificMethods;

public class MedianForgotPassword extends MedianSpecificMethods{
	public MedianForgotPassword enterUserid() {
		  enterValue(locateElement("xpath", props.getProperty("MedianForgotPassword.Userid.Xpath")), props.getProperty("Userid"));
	return this;
			}
	public MedianForgotPassword clickGetOTP() {
		clickElement(locateElement("xpath", props.getProperty("MedianForgotPassword.GetOTP.Xpath")));
		wait(20000);
		return this;
	}
	public MedianForgotPassword enterNewPassword() {
		  enterValue(locateElement("xpath", props.getProperty("MedianForgotPassword.Newpassword.Xpath")), props.getProperty("Newpassword"));
	 return this;
			}
	public MedianForgotPassword enterConfirmPassword() {
		  enterValue(locateElement("xpath", props.getProperty("MedianForgotPassword.Confirmpassword.Xpath")), props.getProperty("Confirmpassword"));
	 return this;
			}
	public MedianForgotPassword clickSave() {
		clickElement(locateElement("xpath", props.getProperty("MedianForgotPassword.Save.Xpath")));
		return new MedianForgotPassword();
	}
	
	}
