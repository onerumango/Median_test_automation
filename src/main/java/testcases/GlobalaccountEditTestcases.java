package testcases;

import org.testng.annotations.Test;

import base.MedianSpecificMethods;
import pages.MedianLogin;

public class GlobalaccountEditTestcases extends MedianSpecificMethods{
	@Test
	public void runGlobalaccountEdit() {
		MedianLogin login = new MedianLogin();
		login.enterMakerUsername().enterMakerPassword().clickSignInButton()
		.clickSystemparamMaintenanceLink()
		.clickGlobalAccountRestriction()
		.clickFirstRecord()
		.editGLcode()
		.clickGLCodeSave();
	}
		
		
		

}
