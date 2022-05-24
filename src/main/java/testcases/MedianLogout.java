package testcases;

import org.testng.annotations.Test;

import base.MedianSpecificMethods;
import pages.MedianLogin;

public class MedianLogout  extends MedianSpecificMethods{
	@Test
	public void runMedianLogin() throws InterruptedException {
		MedianLogin login = new MedianLogin();
		login
		.enterMakerUsername()
		.enterMakerPassword()
		.clickSignInButton()
		.clickUserName()
		.clickLogout();
		
	}

}
