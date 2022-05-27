package testcases;

import org.testng.annotations.Test;

import base.MedianSpecificMethods;
import pages.MedianLoginAndLogout;

public class DepartmentidEditTestcases extends MedianSpecificMethods{
	@Test
	public void runDepartmentidEditTestcases() throws InterruptedException {
		MedianLoginAndLogout login = new MedianLoginAndLogout();
		login.enterMakerUsername().enterMakerPassword().clickSignInButton()
		.clickSystemparamMaintenanceLink()
		.clickDeptidscreen()
		.clickFirstrecord()
		.clickEdit() .editDeptid().clickSubmit();
	}
		
		
}
