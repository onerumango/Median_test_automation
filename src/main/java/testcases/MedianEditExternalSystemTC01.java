package testcases;

import org.testng.annotations.Test;

import base.MedianSpecificMethods;
import pages.MedianLogin;
import pages.MedianEditExternalSystem;

public class MedianEditExternalSystemTC01 extends MedianSpecificMethods {
	@Test
	public void runMedianLogin() throws InterruptedException {
		MedianLogin login = new MedianLogin();
		login.enterMakerUsername()
		.enterMakerPassword()
		.clickSignInButton()
		.clickfileUploadMaintenance()
		.clickexternalSystem()
		.selectEdit()
		.enterExternalSystemCode()
		.enterExternalSystemName()
		.selectDepartment()
		.clickSaveButton();
		
	}
}