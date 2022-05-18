package testcases;

import org.testng.annotations.Test;

import base.MedianSpecificMethods;
import pages.MedianLogin;

public class DepartmentidCreateTestcases extends MedianSpecificMethods{
	@Test
	public void runDepartmentidCreate() {
		MedianLogin login = new MedianLogin();
		login.enterMakerUsername().enterMakerPassword().clickSignInButton()
		.clickSystemparamMaintenanceLink()
		.clickDeptidscreen()
		
	     .clickNew()
	     .enterDeptId()
	     .enterDeptName()
	     .enterBatchNofrom()
	     .enterBatchNoto()
	     .clickDeptSubmit();
		
	}

}
