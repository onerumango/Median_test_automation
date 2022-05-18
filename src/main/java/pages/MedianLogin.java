package pages;

import base.MedianSpecificMethods;

public class MedianLogin extends MedianSpecificMethods {



		public MedianLogin enterUsername() {
			enterValue(locateElement("xpath", props.getProperty("MedianLoginPage.userid.Xpath")), props.getProperty("MakerUserName"));
			return this;
		}
		
		public MedianLogin enterPassword() {
			enterValue(locateElement("xpath", props.getProperty("MedianLoginPage.Password.Xpath")), props.getProperty("MakerPassword"));
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

}
