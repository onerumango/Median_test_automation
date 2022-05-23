package pages;

import base.MedianSpecificMethods;

public class MedianLogin extends MedianSpecificMethods {



		public MedianLogin enterMakerUsername() {
			enterValue(locateElement("xpath", props.getProperty("MedianLoginPage.userid.Xpath")), props.getProperty("MakerUserName"));
			return this;
		}
		
		public MedianLogin enterMakerPassword() {
			enterValue(locateElement("xpath", props.getProperty("MedianLoginPage.Password.Xpath")), props.getProperty("MakerPassword"));
			return this;
		}
		
		
		
		public MedianLogin enterCheckerUsername() {
			enterValue(locateElement("xpath", props.getProperty("MedianLoginPage.userid.Xpath")), props.getProperty("CheckerUserName"));
			return this;
		}
		
		public MedianLogin enterCheckerPassword() {
			enterValue(locateElement("xpath", props.getProperty("MedianLoginPage.Password.Xpath")), props.getProperty("CheckerPassword"));
			return this;
		}
		
		public MedianDashboard clickSignInButton() {
			clickElement(locateElement("xpath", props.getProperty("MedianLoginPage.GetOTP.Xpath")));
			/*
			 * wait(2000); clickElement(locateElement("xpath",
			 * props.getProperty("IcustLoginPage.SignInButton.Xpath")));
			 */
			wait(20000);
			clickElement(locateElement("xpath", props.getProperty("MedianLoginPage.verify.Xpath")));
			webDriverWait("Rumango");
			wait(15000);
			return new MedianDashboard();
		}
		public MedianForgotPassword clickForgotPassword() {
			clickElement(locateElement("xpath", props.getProperty("MedianLogin.Forgotpassword.Xpath")));
			return new MedianForgotPassword();
		}
		

}
