package testcases;



import org.testng.annotations.Test;

import base.MedianSpecificMethods;
import pages.MedianLoginAndLogout;
import pages.MedianAuthRole;

public class MedianRoleAuthTestCase extends MedianSpecificMethods {
	@Test
	public void runMedianLogin() throws InterruptedException {
		MedianLoginAndLogout login = new MedianLoginAndLogout();
		login.enterCheckerUsername()
		.enterCheckerPassword()
		.clickSignInButton()
		.selectSystemMaintenance()
		.selectrole()
		.selectRoleAuth()
		.clickAuthButton();
	}
}
