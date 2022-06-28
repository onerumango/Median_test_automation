package testcases;

import org.testng.annotations.Test;

import base.MedianSpecificMethods;
import pages.MedianLoginAndLogout;

public class AccountBlockCustomerSearchTestCase extends MedianSpecificMethods{
	@Test
	public void runMedianLogin() throws InterruptedException {
		MedianLoginAndLogout login = new MedianLoginAndLogout();
		login.enterMakerUsername()
		.enterMakerPassword()
		.clickSignInButton()
		.selectAccountBlockCustomerSearch()
		.enterAccountNumber()
		.clickGetCustomer()
		.clickCustomerDetails()
		.clickTransactions()
		.closePopup()
		.clickExit()
		;
}
}
