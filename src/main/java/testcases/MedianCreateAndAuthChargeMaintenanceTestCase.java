package testcases;

import org.testng.annotations.Test;

import base.MedianSpecificMethods;
import pages.MedianDashboard;
import pages.MedianLoginAndLogout;

public class MedianCreateAndAuthChargeMaintenanceTestCase extends MedianSpecificMethods{
	@Test
	public void runMedianLogin() throws InterruptedException {
		MedianLoginAndLogout login = new MedianLoginAndLogout();
		MedianDashboard md= new MedianDashboard();
		login.enterMakerUsername()
		.enterMakerPassword()
		.clickSignInButton()
		.selectChargeMaintenance()
		.clickNew()
		.enterCurrency()
		.enterChargeAmount()
		.enterChargePercentage()
		.enterTaxAmount()
		.enterTaxPercentage()
		.clickSave()		
		;
		md.clickUserName().clickLogout();
		
		MedianLoginAndLogout login1 = new MedianLoginAndLogout();
		login1.enterCheckerUsername()
		.enterCheckerPassword()
		.clickSignInButton()
		.selectChargeMaintenance()
		.clickCurrency()
		.clickAuth()
		
		
		;
}
}
