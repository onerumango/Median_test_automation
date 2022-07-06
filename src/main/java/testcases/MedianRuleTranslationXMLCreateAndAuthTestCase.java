package testcases;

import java.awt.AWTException;

import org.testng.annotations.Test;

import base.MedianSpecificMethods;
import pages.MedianDashboard;
import pages.MedianLoginAndLogout;

public class MedianRuleTranslationXMLCreateAndAuthTestCase extends MedianSpecificMethods{
	@Test
	public void runMedianLogin() throws InterruptedException, AWTException {
		MedianLoginAndLogout login = new MedianLoginAndLogout();
		MedianDashboard md= new MedianDashboard();
		login.enterMakerUsername()
		.enterMakerPassword()
		.clickSignInButton()
		.clickSystemInterface()
	    .clickRuleTranslationXML()
	    .clickNewButton()
	    .dropDownSourceSyetem()
	    .selectdropDownSourceSyetem()
	    .fileUpload()
	    .selectTag()
	    .selectDataType()
	    .clickPlusButton()
	    .selectTag2()
	    .selectDataType2()
	    .clickSaveButton()
		.clickOkPopup();
		
md.clickUserName().clickLogout();
		
		MedianLoginAndLogout login1 = new MedianLoginAndLogout();
		login1.enterCheckerUsername()
		.enterCheckerPassword()
		.clickSignInButton()
		.clickSystemInterface()
		.clickRuleTranslationXML()
		.clickSystemCode()
		.clickAuth()
		;
	}

}
