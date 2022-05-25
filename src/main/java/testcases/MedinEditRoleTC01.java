package testcases;

import org.testng.annotations.Test;

import base.MedianSpecificMethods;
import pages.MedianLogin;
import pages.MedianEditRole;

public class MedinEditRoleTC01 extends MedianSpecificMethods {
	@Test
	public void runMedianLogin() throws InterruptedException {
		MedianLogin login = new MedianLogin();
		login.enterMakerUsername()
		.enterMakerPassword()
		.clickSignInButton()
		.selectSystemMaintenance()
		.selectrole()
		.selectEdit()
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