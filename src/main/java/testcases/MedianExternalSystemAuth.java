package testcases;



import org.testng.annotations.Test;

import base.MedianSpecificMethods;
import pages.MedianLoginAndLogout;
import pages.MedianAuthExternalSystem;

public class MedianExternalSystemAuth extends MedianSpecificMethods {
	@Test
	public void runMedianLogin() throws InterruptedException {
		MedianLoginAndLogout login = new MedianLoginAndLogout();
		login.enterCheckerUsername()
		.enterCheckerPassword()
		.clickSignInButton()
		.clickfileUploadMaintenance()
		.clickexternalSystem()
		.selectExternalAuth()
		.clickAuthButton();
	}
}
