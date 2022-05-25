package testcases;



import org.testng.annotations.Test;

import base.MedianSpecificMethods;
import pages.MedianLogin;
import pages.MedianAuthRole;

public class MedianAuthTC01 extends MedianSpecificMethods {
	@Test
	public void runMedianLogin() throws InterruptedException {
		MedianLogin login = new MedianLogin();
		login.enterCheckerUsername()
		.enterCheckerPassword()
		.clickSignInButton()
		.selectSystemMaintenance()
		.selectrole()
		.selectRoleAuth()
		.clickAuthButton();
	}
}
