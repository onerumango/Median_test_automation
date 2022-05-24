package pages;

import base.MedianSpecificMethods;

public class MedianChangePassword extends MedianSpecificMethods{
	
	public MedianChangePassword clickChangePassword() {
		clickElement(locateElement("xpath", props.getProperty("MedianDashboard.changePassword.Xpath")));
		wait(1000);
		return this;
	}
	public MedianChangePassword enterOldPassword() {
		enterValue(locateElement("xpath", props.getProperty("MedianChangePassword.oldPassword.Xpath")), props.getProperty("oldPassword"));
		return this;
	}
	public MedianChangePassword enterNewPassword() {
		enterValue(locateElement("xpath", props.getProperty("MedianChangePassword.newPassword.Xpath")), props.getProperty("newPassword"));
		return this;
	}
	public MedianChangePassword enterConfirmPassword() {
		enterValue(locateElement("xpath", props.getProperty("MedianChangePassword.confirmPassword.Xpath")), props.getProperty("confirmPassword"));
		return this;
	}
	
	public MedianChangePassword clickSaveButton() {
		clickElement(locateElement("xpath", props.getProperty("MedianChangePassword.clickSaveButton.Xpath")));
		wait(1000);
		return this;
	}
	public MedianChangePassword clickOKButton() {
		clickElement(locateElement("xpath", props.getProperty("MedianChangePassword.clickOKButton.Xpath")));
		wait(1000);
		return this;
	}
	public MedianChangePassword clickExitButton() {
		clickElement(locateElement("xpath", props.getProperty("MedianChangePassword.clickExitButton.Xpath")));
		wait(1000);
		return this;
		}
	
	public MedianChangePassword clickLogout() {
		clickElement(locateElement("xpath", props.getProperty("MedianChangePassword.clickLogout.Xpath")));
		wait(1000);
		return this;		
	}
	
	
	
}
