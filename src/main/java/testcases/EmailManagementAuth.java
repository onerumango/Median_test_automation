package testcases;

import org.testng.annotations.Test;

import base.MedianSpecificMethods;
import pages.MedianLoginAndLogout;

public class EmailManagementAuth extends MedianSpecificMethods{
	@Test
	public void runDepartmentidCreate() throws InterruptedException {
		MedianLoginAndLogout login = new MedianLoginAndLogout();
		login.enterCheckerUsername().enterCheckerPassword().clickSignInButton()
		.clickSystemparamMaintenanceLink().clickEmailManagement().selectUnauthRecord().clickAuth();
	}

}
