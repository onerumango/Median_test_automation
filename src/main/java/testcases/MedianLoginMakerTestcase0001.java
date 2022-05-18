package testcases;



import org.testng.annotations.Test;

import base.MedianSpecificMethods;
import pages.MedianLogin;

public class MedianLoginMakerTestcase0001 extends MedianSpecificMethods {
	@Test
	public void runMedianLogin() {
		MedianLogin login = new MedianLogin();
		login.enterUsername().enterPassword().clickSignInButton();
	}
}
