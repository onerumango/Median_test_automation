package testcases;

import org.testng.annotations.Test;

import base.MedianSpecificMethods;
import pages.MedianDashboard;
import pages.MedianLoginAndLogout;

public class MedianRuleMappingCreateAndAuthTestCase extends MedianSpecificMethods{
	@Test
	public void runMedianRuleTranslation() throws InterruptedException {
		MedianLoginAndLogout login = new MedianLoginAndLogout();
		MedianDashboard md= new MedianDashboard();
		login.enterMakerUsername().enterMakerPassword().clickSignInButton()
		.clickSystemInterface()
		.clickRuleMapping()
		.clickNewButton()
		.selectSourceSystem()
		.selectDestinationSystem()
		.clickFetchButton()
		.selectDropdownSourceSystem()
		.selectDropdownDestinationSystem()
		.enterDefaultValue()
		.clickSaveButton()
		.clickExitButton();
		
		md.clickUserName().clickLogout();
		
		MedianLoginAndLogout login1 = new MedianLoginAndLogout();
		login1.enterCheckerUsername()
		.enterCheckerPassword()
		.clickSignInButton()
		.clickSystemInterface()
		.clickRuleMapping()
		.clickSourceSystem()
		.clickAuth()
		;
}
}
