package testcases;

import org.testng.annotations.Test;

import base.MedianSpecificMethods;
import pages.MedianLogin;

public class EmailManagementEdit extends MedianSpecificMethods{
	@Test
	public void runDepartmentidCreate() throws InterruptedException {
		MedianLogin login = new MedianLogin();
		login.enterMakerUsername().enterMakerPassword().clickSignInButton()
		.clickSystemparamMaintenanceLink().clickEmailManagement().selectRecord().clickEdit().editEmailid().clickSave();
	}

}
