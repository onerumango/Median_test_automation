package testcases;

import org.testng.annotations.Test;

import base.MedianSpecificMethods;
import pages.MedianLoginAndLogout;
import pages.MedianAddNewRole;

public class MedianTransactioncodeMaintenanceCreateTestCase extends MedianSpecificMethods {
	@Test
	public void runMedianLogin() throws InterruptedException {
		MedianLoginAndLogout login = new MedianLoginAndLogout();
		login.enterMakerUsername()
		.enterMakerPassword()
		.clickSignInButton()
		.selectTransactioMaintenance()
		.selectUserID()
		.entertrncode()
		.entertrndesc()
		.clickSave()
		.clickOk();
	}
}

