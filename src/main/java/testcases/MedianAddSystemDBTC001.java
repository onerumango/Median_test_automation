package testcases;

import org.testng.annotations.Test;

import base.MedianSpecificMethods;
import pages.MedianLoginAndLogout;

public class MedianAddSystemDBTC001 extends MedianSpecificMethods{
	@Test
	public void runMedianLogin() throws InterruptedException {
		MedianLoginAndLogout login = new MedianLoginAndLogout();
		login.enterMakerUsername()
		.enterMakerPassword()
		.clickSignInButton()
		.clickSystemInterface()
		.clickAddSystem()
		.clickNewAddDB()
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
		.enterDBUserName()
		.enterDBPassword()
		.enterDBName()
		.enterDBConnectingString()
		.clickNextMessageConfiguration()
		.selectTable()
		.selectHeader1()
		.selectColumnName1()
		.clickPlusButton()
		.selectHeader2()
		.selectColumnName2()
		.clickSave()
		.clickOK();
}
}