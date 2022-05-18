package testcases;

import org.testng.annotations.Test;

import base.MedianSpecificMethods;
import pages.MedianLogin;
import pages.MedianEditRole;

public class MedinEditRoleTC01 extends MedianSpecificMethods {
	@Test
	public void runMedianLogin() {
		MedianLogin login = new MedianLogin();
		login.enterCheckerUsername()
		.enterCheckerPassword()
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