package testcases;

import org.testng.annotations.Test;

import base.MedianSpecificMethods;
import pages.MedianLoginAndLogout;

public class GlobalAccountTestcasesCreate extends MedianSpecificMethods{
	@Test
	public void runGlobalAccountTestcases() throws InterruptedException {
		MedianLoginAndLogout login = new MedianLoginAndLogout();
		login.enterMakerUsername().enterMakerPassword().clickSignInButton()
		.clickSystemparamMaintenanceLink()
		.clickGlobalAccountRestriction()
		.clickGLaccountNew()
		.enterGlCode()
		.enterGlDescription()
		.clickSave();
	}
	

}
