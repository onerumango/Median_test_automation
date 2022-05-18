package testcases;



import base.MedianSpecificMethods;
import pages.MedianLogin;

public class MedianLoginMakerTestcase0001 extends MedianSpecificMethods {
	
	public void runMedianLogin() {
		MedianLogin login = new MedianLogin();
		login.enterUsername().enterPassword().clickSignInButton();
	}
}
