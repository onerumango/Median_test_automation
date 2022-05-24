package testcases;

import org.testng.annotations.Test;

import base.MedianSpecificMethods;
import pages.MedianLogin;

public class DepartmentidAuthTestcases extends MedianSpecificMethods{
	@Test
	public void runDepartmentidAuthTestcases() throws InterruptedException {
		MedianLogin login = new MedianLogin();
		login.enterCheckerUsername().enterCheckerPassword().clickSignInButton()
		.clickSystemparamMaintenanceLink()
		.clickDeptidscreen().clickUnauthrecord().clickAuth();
	}

}
