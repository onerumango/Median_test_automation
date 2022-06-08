package testcases;

import org.testng.annotations.Test;

import base.MedianSpecificMethods;
import pages.MedianLoginAndLogout;

public class MedianEditDBSystemTC001 extends MedianSpecificMethods{
	@Test
	public void runMedianLogin() throws InterruptedException {
		MedianLoginAndLogout login = new MedianLoginAndLogout();
		login.enterMakerUsername()
		.enterMakerPassword()
		.clickSignInButton()
		.clickSystemInterface()
		.clickAddSystem()
		.clickID()
		.clickEdit()
		.enterCode()
		.clickNext1()
		.clickNext2()
		.clickSave()
		.clickOK();
}
}