package testcases;

import org.testng.annotations.Test;
import base.MedianSpecificMethods;
import pages.MedianLogin;
import pages.MedianLogout;
public class MedianRuleTranslationTC00003 extends MedianSpecificMethods {
	@Test
	public void runMedianRuleTranslation() {
		MedianLogin login = new MedianLogin();
		login.enterMakerUsername().enterMakerPassword().clickSignInButton().clickSystemInterface()
				.clickRuleTranslation().clickNewButton().dropDownSourceSyetem().clickFetchButton().clickSaveButton()
				.clickOkPopup().clickLogout();
	}
}
