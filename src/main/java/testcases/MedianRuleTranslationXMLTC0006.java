package testcases;

import org.testng.annotations.Test;

import pages.MedianLoginAndLogout;

public class MedianRuleTranslationXMLTC0006 {
	@Test
	public void runMedianRuleTranslation() throws InterruptedException {
		MedianLoginAndLogout login = new MedianLoginAndLogout();
		login.enterMakerUsername().enterMakerPassword().clickSignInButton().clickSystemInterface()
				.clickRuleTranslationXML().clickNewButton().dropDownSourceSyetem().clickFetchButton().clickSaveButton()
				.clickOkPopup();
	}

}
