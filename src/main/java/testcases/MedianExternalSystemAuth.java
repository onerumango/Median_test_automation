package testcases;



import org.testng.annotations.Test;

import base.MedianSpecificMethods;
import pages.MedianLogin;
import pages.MedianAuthExternalSystem;

public class MedianExternalSystemAuth extends MedianSpecificMethods {
	@Test
	public void runMedianLogin() {
		MedianLogin login = new MedianLogin();
		login.enterCheckerUsername()
		.enterCheckerPassword()
		.clickSignInButton()
		.fileUploadMaintenance()
		.selectExternalAuth()
		.clickAuthButton();
	}
}
