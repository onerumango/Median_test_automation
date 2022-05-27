package testcases;

import org.testng.annotations.Test;

import base.MedianSpecificMethods;
import pages.MedianLogin;

public class TemplateMappingAuth extends MedianSpecificMethods{
	@Test
	public void runTemplateMappingAuth() throws InterruptedException {
		MedianLogin login = new MedianLogin();
		login.enterMakerUsername().enterMakerPassword().clickSignInButton()
		.clickFileUploadMaintenanceLink().clickTemplatemapping().selectUnauthRecord().clickAuth().clickExit()
		.clickLogout();
	}

}
