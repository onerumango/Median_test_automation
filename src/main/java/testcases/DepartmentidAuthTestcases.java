package testcases;

import org.testng.annotations.Test;

import base.MedianSpecificMethods;
import pages.MedianLoginAndLogout;

public class DepartmentidAuthTestcases extends MedianSpecificMethods{
	@Test
	public void runDepartmentidAuthTestcases() throws InterruptedException {
		MedianLoginAndLogout login = new MedianLoginAndLogout();
		login.enterCheckerUsername().enterCheckerPassword().clickSignInButton()
		.clickSystemparamMaintenanceLink()
		.clickDeptidscreen().clickDepartmentIDAuth().clickAuth().clickYES();
	}

}
