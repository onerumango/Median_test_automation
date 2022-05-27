package testcases;

import org.testng.annotations.Test;

import base.MedianSpecificMethods;
import pages.MedianLoginAndLogout;

public class MedianAddSystemISOTestCase extends MedianSpecificMethods{
	@Test
	public void runMedianLogin() throws InterruptedException {
		MedianLoginAndLogout login = new MedianLoginAndLogout();
		login.enterMakerUsername()
		.enterMakerPassword()
		.clickSignInButton()
		.clickSystemInterface()
		.clickAddSystem()
		.clickNewAddSystem()
		.enterCode()
		.enterName()
		.selectType()
		.selectMessageType()
		.enterExternalIP()
		.enterExternalPort()
		.enterMedianIP()
		.enterMedianPort()
		.enterMedianURI()
		.enterExternalURI()
		.clickNextSystemInformation()
		.selectMessageProtocol()
		.selectDataType()
		.clickNextMessageConfiguration()
		.selectHeader1()
		.selectFieldNo1()
		.enterDefaultValue1()
		.clickPlusButton()
		.selectHeader2()
		.selectFieldNo2()
		.enterDefaultValue2()
		.clickSaveServiceAndHeader()
		.clickOKServiceAndHeader()

		
		;
}
}