package testcases;

import org.testng.annotations.Test;

import base.MedianSpecificMethods;
import pages.MedianLoginAndLogout;

public class MedianChangePasswordTestCase extends MedianSpecificMethods{
	@Test
	public void runMedianLogin() throws InterruptedException {
		MedianLoginAndLogout login = new MedianLoginAndLogout();
		login
		.enterMakerUsername()
		.enterMakerPassword()
		.clickSignInButton()
		//.clickToastbutton()
		.clickUserName()
		.clickChangePassword()
		.enterOldPassword()
		.enterNewPassword()
		.enterConfirmPassword()
		.clickSaveButton()
		.clickOKButton()
		.clickExitButton();
}
}