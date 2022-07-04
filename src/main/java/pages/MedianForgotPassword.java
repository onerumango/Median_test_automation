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
		wait(3000);
		  enterValue(locateElement("xpath", props.getProperty("MedianForgotPassword.Newpassword.Xpath")), props.getProperty("Newpassword"));
	 return this;
			}
	public MedianForgotPassword enterConfirmPassword() {
		wait(3000);
		  enterValue(locateElement("xpath", props.getProperty("MedianForgotPassword.Confirmpassword.Xpath")), props.getProperty("Confirmpassword"));
	 return this;
			}
	public MedianForgotPassword clickSave() {
		wait(3000);
		clickElement(locateElement("xpath", props.getProperty("MedianForgotPassword.Save.Xpath")));
		return new MedianForgotPassword();
	}
	
	}
