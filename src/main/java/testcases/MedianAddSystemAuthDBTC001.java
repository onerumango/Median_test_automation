package testcases;

import org.testng.annotations.Test;

import base.MedianSpecificMethods;
import pages.MedianLoginAndLogout;

public class MedianAddSystemAuthDBTC001 extends MedianSpecificMethods{
	@Test
	public void runMedianLogin() throws InterruptedException {
		MedianLoginAndLogout login = new MedianLoginAndLogout();
		login.enterCheckerUsername()
		.enterCheckerPassword()
		.clickSignInButton()
		.clickSystemInterface()
		.clickAddSystem()
		.clickID1()
		.clickAuth()
		.clickYes()
		.clickOK();
}
}