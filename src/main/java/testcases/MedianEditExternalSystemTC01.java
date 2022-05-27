package testcases;

import org.testng.annotations.Test;

import base.MedianSpecificMethods;
import pages.MedianLoginAndLogout;
import pages.MedianEditExternalSystem;

public class MedianEditExternalSystemTC01 extends MedianSpecificMethods {
	@Test
	public void runMedianLogin() throws InterruptedException {
		MedianLoginAndLogout login = new MedianLoginAndLogout();
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