package testcases;

import org.testng.annotations.Test;

import base.MedianSpecificMethods;
import pages.MedianLogin;
import pages.MedianAddNewExternalSystem;

public class MedianNewExternalSystemTC01 extends MedianSpecificMethods {
	@Test
	public void runMedianLogin() {
		MedianLogin login = new MedianLogin();
		login.enterMakerUsername()
		.enterMakerPassword()
		.clickSignInButton()
		.fileUploadMaintenance()
		.selectNew()
		.enterExternalSystemCode()
		.enterExternalSystemName()
		.selectDepartment()
		.clickSaveButton();
		
	}
}