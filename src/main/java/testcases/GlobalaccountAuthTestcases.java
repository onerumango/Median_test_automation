package testcases;

import org.testng.annotations.Test;

import base.MedianSpecificMethods;
import pages.MedianLogin;

public class GlobalaccountAuthTestcases extends MedianSpecificMethods{
	@Test
	public void runGlobalaccountAuth() throws InterruptedException {
		MedianLogin login = new MedianLogin();
		login.enterCheckerUsername().enterCheckerPassword().clickSignInButton()
		.clickSystemparamMaintenanceLink()
		.clickGlobalAccountRestriction().clickUnauthRecord().clickAuth();
	}

}
