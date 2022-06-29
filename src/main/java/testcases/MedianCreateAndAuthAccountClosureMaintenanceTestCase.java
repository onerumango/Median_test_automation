package testcases;

import org.testng.annotations.Test;

import base.MedianSpecificMethods;
import pages.MedianDashboard;
import pages.MedianLoginAndLogout;

public class MedianCreateAndAuthAccountClosureMaintenanceTestCase extends MedianSpecificMethods{
	@Test
	public void runMedianLogin() throws InterruptedException {
		MedianLoginAndLogout login = new MedianLoginAndLogout();
		MedianDashboard md= new MedianDashboard();
		login.enterMakerUsername()
		.enterMakerPassword()
		.clickSignInButton()
		.selectAccountClosureMaintenance()
		.clickNew()
		.selectAccountType()
		.enterUDFDetails()
		.enterAccountingEntries()
		.clickSaveButton();
		
		md.clickUserName().clickLogout();
		
		MedianLoginAndLogout login1 = new MedianLoginAndLogout();
		login1.enterCheckerUsername()
		.enterCheckerPassword()
		.clickSignInButton()
		.selectAccountClosureMaintenance()
        .clickAccountType()
		.clickAuth()
		
;
}
}