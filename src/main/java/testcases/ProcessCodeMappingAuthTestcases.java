package testcases;

import org.testng.annotations.Test;

import base.MedianSpecificMethods;
import pages.MedianLoginAndLogout;

public class ProcessCodeMappingAuthTestcases extends MedianSpecificMethods{
	@Test
	public void runProcessCodeMappingAuth() throws InterruptedException {
		MedianLoginAndLogout login = new MedianLoginAndLogout();
		login.enterCheckerUsername().enterCheckerPassword().clickSignInButton()
		.clickFileUploadMaintenanceLink()
		.clickProcesscodemapping()
		.searchProcessCode()
		.selectRecordforAuth()
		.clickAuth();
	}
}
