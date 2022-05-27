package testcases;

import org.testng.annotations.Test;

import base.MedianSpecificMethods;
import pages.MedianLoginAndLogout;

public class UseraccountViewTransactions extends MedianSpecificMethods{
	@Test
	public void runViewUseraccountRestriction() throws InterruptedException {
		MedianLoginAndLogout login = new MedianLoginAndLogout();
		login.enterMakerUsername().enterMakerPassword().clickSignInButton()
		.clickSystemparamMaintenanceLink()
		.clickUseraccountRestriction().clickUseridDropdown().selectUserid().clickGetTransactions();
	}

}
