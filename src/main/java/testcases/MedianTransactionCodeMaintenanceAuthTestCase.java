package testcases;

import org.testng.annotations.Test;

import base.MedianSpecificMethods;
import pages.MedianLoginAndLogout;
import pages.MedianAddNewRole;

public class MedianTransactionCodeMaintenanceAuthTestCase extends MedianSpecificMethods {
	@Test
	public void runMedianLogin() throws InterruptedException {
		MedianLoginAndLogout login = new MedianLoginAndLogout();
		login.enterCheckerUsername()
		.enterCheckerPassword()
		.clickSignInButton()
		.selectAuthTransactioMaintenance()
		.SelectUserID()
		.clickAuth()
		.clickSave()
		.clickOk();
	}
}

