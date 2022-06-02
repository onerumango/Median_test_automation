package testcases;

import org.testng.annotations.Test;
import base.MedianSpecificMethods;
import pages.MedianLoginAndLogout;
public class MedianRuleTranslationISOTC00003 extends MedianSpecificMethods {
	@Test
	public void runMedianRuleTranslation() throws InterruptedException {
		MedianLoginAndLogout login = new MedianLoginAndLogout();
		login.enterMakerUsername().enterMakerPassword().clickSignInButton().clickSystemInterface()
				.clickRuleTranslationISO().clickNewButton().dropDownSourceSyetem().clickFetchButton().clickSaveButton()
				.clickOkPopup();
	}
}
