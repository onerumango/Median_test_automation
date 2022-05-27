package testcases;

import org.testng.annotations.Test;

import base.MedianSpecificMethods;
import pages.MedianLoginAndLogout;

public class UseraccountRestrictionCreateTestcases extends MedianSpecificMethods{
	@Test
	public void runUseraccountRestriction() throws InterruptedException {
		MedianLoginAndLogout login = new MedianLoginAndLogout();
		login.enterMakerUsername().enterMakerPassword().clickSignInButton()
		.clickSystemparamMaintenanceLink()
		.clickUseraccountRestriction()
		.clickNew().clickUseridDropdown().selectUserid().enterUserGlCode().enterUserGlcodeDescription()
		.clickSave();
	}

}
