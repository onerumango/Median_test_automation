package testcases;

import org.testng.annotations.Test;

import base.MedianSpecificMethods;
import pages.MedianLoginAndLogout;

public class GlobalaccountAuthTestcases extends MedianSpecificMethods{
	@Test
	public void runGlobalaccountAuth() throws InterruptedException {
		MedianLoginAndLogout login = new MedianLoginAndLogout();
		login.enterCheckerUsername().enterCheckerPassword().clickSignInButton()
		.clickSystemparamMaintenanceLink()
		.clickGlobalAccountRestriction().clickUnauthRecord().clickAuth();
	}

}
