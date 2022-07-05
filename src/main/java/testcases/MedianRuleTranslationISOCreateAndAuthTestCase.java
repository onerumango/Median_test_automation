package testcases;

import org.testng.annotations.Test;
import base.MedianSpecificMethods;
import pages.MedianDashboard;
import pages.MedianLoginAndLogout;
public class MedianRuleTranslationISOCreateAndAuthTestCase extends MedianSpecificMethods {
	@Test
	public void runMedianRuleTranslation() throws InterruptedException {
		MedianLoginAndLogout login = new MedianLoginAndLogout();
		MedianDashboard md= new MedianDashboard();
		login.enterMakerUsername().enterMakerPassword().clickSignInButton()
		.clickSystemInterface()
		.clickRuleTranslationISO()
		.clickNewButton()
		.dropDownSourceSyetem()
		.selectdropDownSourceSyetem()
		.clickFetchButton()
		.clickSaveButton()
		.clickOkPopup()
		.clickExit()
		;
		
       md.clickUserName().clickLogout();
		
		MedianLoginAndLogout login1 = new MedianLoginAndLogout();
		login1.enterCheckerUsername()
		.enterCheckerPassword()
		.clickSignInButton()
		.clickSystemInterface()
		.clickRuleTranslationISO()
		.clickSystemCode()
		.clickAuth()
		;
	}
}
