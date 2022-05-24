package testcases;

import org.testng.annotations.Test;

import base.MedianSpecificMethods;
import pages.MedianLogin;

public class MedianChangePasswordTestCase extends MedianSpecificMethods{
	@Test
	public void runMedianLogin() throws InterruptedException {
		MedianLogin login = new MedianLogin();
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