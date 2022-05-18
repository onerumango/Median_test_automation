package testcases;

import org.testng.annotations.Test;

import base.MedianSpecificMethods;
import pages.MedianLogin;

public class MedianLoginCheckerTestcase0002 extends MedianSpecificMethods {
	@Test
	public void runMedianLogin() {
		MedianLogin login = new MedianLogin();
		login.enterCheckerUsername().enterCheckerPassword().clickSignInButton();
	}
}