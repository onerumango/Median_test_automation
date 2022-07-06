package testcases;

import org.testng.annotations.Test;

import base.MedianSpecificMethods;
import pages.MedianLoginAndLogout;
import pages.MedianAddNewRole;

public class MedianRoleCreateTestCase extends MedianSpecificMethods {
	@Test
	public void runMedianLogin() throws InterruptedException {
		MedianLoginAndLogout login = new MedianLoginAndLogout();
		login.enterMakerUsername()
		.enterMakerPassword()
		.clickSignInButton()
		.selectSystemMaintenance()
		.selectrole()
		.selectNew()
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