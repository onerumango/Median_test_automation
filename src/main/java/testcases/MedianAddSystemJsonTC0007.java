package testcases;

import java.awt.AWTException;

import org.testng.annotations.Test;

import base.MedianSpecificMethods;
import pages.MedianLoginAndLogout;

public class MedianAddSystemJsonTC0007 extends MedianSpecificMethods{

	@Test
	public void runMedianLogin() throws InterruptedException, AWTException {
		MedianLoginAndLogout login = new MedianLoginAndLogout();
		login.enterMakerUsername()
		.enterMakerPassword()
		.clickSignInButton()
		.clickSystemInterface()
		.clickAddSystem()
		.clickNewAddJSONSystem()
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
		.clickPlusButton()
		.headerService()
		.keyValueService()
		.dataTypeNumeric()
		.defaultValueService()
		.encriptionTypeBase64()
		.headerOperation()
		.keyValueOperation()
		.dataTypeAlphaNumeric()
		.defaultValueOperation()
		.encriptionTypeSha256()
		.clickSave()
		.clickOk()		
		;
}

}
