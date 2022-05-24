package testcases;

import org.testng.annotations.Test;

import base.MedianSpecificMethods;
import pages.MedianLogin;

public class DepartmentidEditTestcases extends MedianSpecificMethods{
	@Test
	public void runDepartmentidEditTestcases() throws InterruptedException {
		MedianLogin login = new MedianLogin();
		login.enterMakerUsername().enterMakerPassword().clickSignInButton()
		.clickSystemparamMaintenanceLink()
		.clickDeptidscreen()
		.clickFirstrecord()
		.clickEdit() .editDeptid().clickSubmit();
	}
		
		
}
