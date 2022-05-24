package testcases;

import org.testng.annotations.Test;

import base.MedianSpecificMethods;
import pages.MedianLogin;

public class UseraccountRestrictionCreateTestcases extends MedianSpecificMethods{
	@Test
	public void runUseraccountRestriction() throws InterruptedException {
		MedianLogin login = new MedianLogin();
		login.enterMakerUsername().enterMakerPassword().clickSignInButton()
		.clickSystemparamMaintenanceLink()
		.clickUseraccountRestriction()
		.clickNew().clickUseridDropdown().selectUserid().enterUserGlCode().enterUserGlcodeDescription()
		.clickSave();
	}

}
