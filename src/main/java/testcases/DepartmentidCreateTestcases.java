package testcases;

import org.testng.annotations.Test;

import base.MedianSpecificMethods;
import pages.MedianLoginAndLogout;

public class DepartmentidCreateTestcases extends MedianSpecificMethods{
	@Test
	public void runDepartmentidCreate() throws InterruptedException {
		MedianLoginAndLogout login = new MedianLoginAndLogout();
		login.enterMakerUsername().enterMakerPassword().clickSignInButton()
		.clickSystemparamMaintenanceLink()
		.clickDeptidscreen()
	     .clickNew()
	     .enterDeptId()
	     .enterDeptName()
	     .enterBatchNofrom()
	     .enterBatchNoto()
	     .clickSave()
	     .clickOK();
		
	}

}
