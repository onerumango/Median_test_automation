package testcases;

import org.testng.annotations.Test;

import base.MedianSpecificMethods;
import pages.MedianLoginAndLogout;

public class EmailManagementEdit extends MedianSpecificMethods{
	@Test
	public void runDepartmentidCreate() throws InterruptedException {
		MedianLoginAndLogout login = new MedianLoginAndLogout();
		login.enterMakerUsername().enterMakerPassword().clickSignInButton()
		.clickSystemparamMaintenanceLink().clickEmailManagement().selectRecord().clickEdit().editEmailid().clickSave();
	}

}
