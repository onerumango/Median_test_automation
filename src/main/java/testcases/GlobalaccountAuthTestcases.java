package testcases;

import org.testng.annotations.Test;

import base.MedianSpecificMethods;
import pages.MedianLogin;

public class GlobalaccountAuthTestcases extends MedianSpecificMethods{
	@Test
	public void runGlobalaccountAuth() {
		MedianLogin login = new MedianLogin();
		login.enterMakerUsername().enterMakerPassword().clickSignInButton()
		.clickSystemparamMaintenanceLink()
		.clickGlobalAccountRestriction().clickUnauthRecord().clickAuth();
	}

}
