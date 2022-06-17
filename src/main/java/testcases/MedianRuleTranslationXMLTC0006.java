package testcases;

import java.awt.AWTException;

import org.testng.annotations.Test;

import pages.MedianLoginAndLogout;

public class MedianRuleTranslationXMLTC0006 {
	@Test
	public void runMedianRuleTranslation() throws InterruptedException, AWTException {
		MedianLoginAndLogout login = new MedianLoginAndLogout();
		login.enterMakerUsername().enterMakerPassword().clickSignInButton()
		.clickSystemInterface()
	    .clickRuleTranslationXML()
	    .clickNewButton()
	    .dropDownSourceSyetem()
	    .fileUpload()
	    .selectTag()
	    .selectDataType()
	    
	    .clickSaveButton()
		.clickOkPopup();
	}

}
