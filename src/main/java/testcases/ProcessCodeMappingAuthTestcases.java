package testcases;

import org.testng.annotations.Test;

import base.MedianSpecificMethods;
import pages.MedianLogin;

public class ProcessCodeMappingAuthTestcases extends MedianSpecificMethods{
	@Test
	public void runProcessCodeMappingAuth() throws InterruptedException {
		MedianLogin login = new MedianLogin();
		login.enterMakerUsername().enterMakerPassword().clickSignInButton()
		.clickFileUploadMaintenanceLink().clickProcesscodemapping().selectUnauthRecord().clickAuth();
	}
}
