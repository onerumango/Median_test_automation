package testcases;

import org.testng.annotations.Test;

import base.MedianSpecificMethods;
import pages.MedianLogin;

public class EmailManagementCreate extends MedianSpecificMethods{
	@Test
	public void runDepartmentidCreate() {
		MedianLogin login = new MedianLogin();
		login.enterMakerUsername().enterMakerPassword().clickSignInButton()
		.clickSystemparamMaintenanceLink().clickEmailManagement().clickNew().clickDropdown()
		.selectOption().enterEmailid().clickSave();
	}

}
