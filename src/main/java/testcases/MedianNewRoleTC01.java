package testcases;

import org.testng.annotations.Test;

import base.MedianSpecificMethods;
import pages.MedianLogin;
import pages.MedianAddNewRole;

public class MedianNewRoleTC01 extends MedianSpecificMethods {
	@Test
	public void runMedianLogin() throws InterruptedException {
		MedianLogin login = new MedianLogin();
		login.enterMakerUsername()
		.enterMakerPassword()
		.clickSignInButton()
		.selectSystemMaintenance()
		.enterRoleName()
		.enterRoleDescription()
		.selectSystemMaintenance1()
		.selectSystemParamMaintenance()
		.selectSystemInterface()
		.selectFileUploadMaintenance()
		.selectFileupload()
		.selectAccountBlock()
		.selectAccountClosure()
		.clickSaveButton();
		
	}
}