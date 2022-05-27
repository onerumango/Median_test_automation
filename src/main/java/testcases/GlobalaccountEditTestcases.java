package testcases;

import org.testng.annotations.Test;

import base.MedianSpecificMethods;
import pages.MedianLoginAndLogout;

public class GlobalaccountEditTestcases extends MedianSpecificMethods{
	@Test
	public void runGlobalaccountEdit() throws InterruptedException {
		MedianLoginAndLogout login = new MedianLoginAndLogout();
		login.enterMakerUsername().enterMakerPassword().clickSignInButton()
		.clickSystemparamMaintenanceLink()
		.clickGlobalAccountRestriction()
		.clickFirstRecord()
		.editGLcode()
		.clickGLCodeSave();
	}
		
		
		

}
