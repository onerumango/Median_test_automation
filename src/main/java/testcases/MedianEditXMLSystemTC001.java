package testcases;

import org.testng.annotations.Test;

import base.MedianSpecificMethods;
import pages.MedianLoginAndLogout;

public class MedianEditXMLSystemTC001 extends MedianSpecificMethods{
	@Test
	public void runMedianLogin() throws InterruptedException {
		MedianLoginAndLogout login = new MedianLoginAndLogout();
		login.enterMakerUsername()
		.enterMakerPassword()
		.clickSignInButton()
		.clickSystemInterface()
		.clickAddSystem()
		.clickSystemCode()
		.clickEdit()
		.UpdateExternalURI()
		.clickNextSystemInformation()
		.clickNextMessageConfiguration()
		.clickSaveServiceAndHeader()
		.clickOKServiceAndHeader();
}
}