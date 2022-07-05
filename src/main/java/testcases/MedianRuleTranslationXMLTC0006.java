package testcases;

import java.awt.AWTException;

import org.testng.annotations.Test;

import base.MedianSpecificMethods;
import pages.MedianLoginAndLogout;

public class MedianRuleTranslationXMLTC0006 extends MedianSpecificMethods{
	@Test
	public void runMedianLogin() throws InterruptedException, AWTException {
		MedianLoginAndLogout login = new MedianLoginAndLogout();
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
	}

}
