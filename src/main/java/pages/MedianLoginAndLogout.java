package pages;

import base.MedianSpecificMethods;

public class MedianLoginAndLogout extends MedianSpecificMethods {

	public MedianLoginAndLogout enterMakerUsername() {
		enterValue(locateElement("xpath", props.getProperty("MedianLoginPage.userid.Xpath")),
				props.getProperty("MakerUserName"));
		return this;
	}

	public MedianLoginAndLogout enterMakerPassword() {
		enterValue(locateElement("xpath", props.getProperty("MedianLoginPage.Password.Xpath")),
				props.getProperty("MakerPassword"));
		return this;
	}

	public MedianLoginAndLogout enterCheckerUsername() {
		enterValue(locateElement("xpath", props.getProperty("MedianLoginPage.userid.Xpath")),
				props.getProperty("CheckerUserName"));
		return this;
	}

	public MedianLoginAndLogout enterCheckerPassword() {
		enterValue(locateElement("xpath", props.getProperty("MedianLoginPage.Password.Xpath")),
				props.getProperty("CheckerPassword"));
		return this;
	}

	public MedianDashboard clickSignInButton() throws InterruptedException {
		clickElement(locateElement("xpath", props.getProperty("MedianLoginPage.GetOTP.Xpath")));
		wait(20000);
		clickElement(locateElement("xpath", props.getProperty("MedianLoginPage.verify.Xpath")));
		webDriverWait("Median -DTB Bank");
		wait(3000);
		return new MedianDashboard();

	}

	public MedianForgotPassword clickForgotPassword() {
		clickElement(locateElement("xpath", props.getProperty("MedianLogin.Forgotpassword.Xpath")));
		return new MedianForgotPassword();
	}

	
}
