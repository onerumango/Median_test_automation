package testcases;

import org.testng.annotations.Test;

import base.MedianSpecificMethods;
import pages.MedianLogin;

public class UseraccountViewTransactions extends MedianSpecificMethods{
	@Test
	public void runViewUseraccountRestriction() throws InterruptedException {
		MedianLogin login = new MedianLogin();
		login.enterMakerUsername().enterMakerPassword().clickSignInButton()
		.clickSystemparamMaintenanceLink()
		.clickUseraccountRestriction().clickUseridDropdown().selectUserid().clickGetTransactions();
	}

}
