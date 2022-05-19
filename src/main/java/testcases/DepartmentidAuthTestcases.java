package testcases;

import org.testng.annotations.Test;

import base.MedianSpecificMethods;
import pages.MedianLogin;

public class DepartmentidAuthTestcases extends MedianSpecificMethods{
	@Test
	public void runDepartmentidAuthTestcases() {
		MedianLogin login = new MedianLogin();
		login.enterMakerUsername().enterMakerPassword().clickSignInButton()
		.clickSystemparamMaintenanceLink()
		.clickDeptidscreen().clickUnauthrecord().clickAuth();
	}

}
