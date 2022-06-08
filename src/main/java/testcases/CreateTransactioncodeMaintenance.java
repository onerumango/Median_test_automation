package testcases;

import org.testng.annotations.Test;

import base.MedianSpecificMethods;
import pages.MedianLoginAndLogout;
import pages.MedianAddNewRole;

public class CreateTransactioncodeMaintenance extends MedianSpecificMethods {
	@Test
	public void runMedianLogin() throws InterruptedException {
		MedianLoginAndLogout login = new MedianLoginAndLogout();
		login.enterMakerUsername()
		.enterMakerPassword()
		.clickSignInButton()
		.selectTransactioMaintenance()
		.selectDefault()
		.entertrncode()
		.entertrndesc()
		.clickSave()
		.clickOk();
	}
}

