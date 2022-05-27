package testcases;

import org.testng.annotations.Test;

import base.MedianSpecificMethods;
import pages.MedianLoginAndLogout;

public class TemplateMappingAuth extends MedianSpecificMethods{
	@Test
	public void runTemplateMappingAuth() throws InterruptedException {
		MedianLoginAndLogout login = new MedianLoginAndLogout();
		login.enterMakerUsername().enterMakerPassword().clickSignInButton()
		.clickFileUploadMaintenanceLink().clickTemplatemapping().selectUnauthRecord().clickAuth().clickExit()
		.clickLogout();
	}

}
