package testcases;

import java.awt.AWTException;

import org.testng.annotations.Test;

import base.MedianSpecificMethods;
import pages.MedianLoginAndLogout;

public class MedianAddSystemXMLTestCase extends MedianSpecificMethods{

	@Test
	public void runMedianLogin() throws InterruptedException, AWTException {
		MedianLoginAndLogout login = new MedianLoginAndLogout();
		login.enterMakerUsername()
		.enterMakerPassword()
		.clickSignInButton()
		.clickSystemInterface()
		.clickAddSystem()
		.clickNewAddXMLSystem()
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
		.uploadXMLFile()
		.clickOKButtonXMLFile()
		.selectHeader1()
		.selectTag1()
		.selectDataType1()
		.clickPlusButton()
		.selectHeader2()
		.selectTag2()
		.selectDataType2()
		.clickSaveServiceAndHeader()
		.clickOKServiceAndHeader();
}

}
