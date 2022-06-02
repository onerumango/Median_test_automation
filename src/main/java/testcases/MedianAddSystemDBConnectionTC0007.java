package testcases;

import org.testng.annotations.Test;

import pages.MedianLoginAndLogout;

public class MedianAddSystemDBConnectionTC0007 {
	@Test
	public void runMedianLogin() throws InterruptedException {
		MedianLoginAndLogout login = new MedianLoginAndLogout();
		login.enterMakerUsername()
		.enterMakerPassword()
		.clickSignInButton()
		.clickSystemInterface()
		.clickAddSystem()
		.clickNewAddISOSystem()
		.enterCode()
		.enterName()
		.selectType()
		.selectMessageType()
		.enterExternalIP()
		.enterExternalPort()
		.enterExternalURI()
		.enterMedianIP()
		.enterMedianPort()
		.enterMedianURI()
		.clickNextSystemInformation()
		.selectMessageProtocol()
		.selectDataType()
		.clickNextMessageConfiguration()
		.selectHeader1()
		.selectFieldNo1()
		.selectDataType1()
		.enterDefaultValue1()
		.clickPlusButton()
		.selectHeader2()
		.selectFieldNo2()
		.selectDataType2()
		.enterDefaultValue2()
		.clickSaveServiceAndHeader()
		.clickOKServiceAndHeader()
		;

	}
}
