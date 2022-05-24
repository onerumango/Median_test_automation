package testcases;

import org.testng.annotations.Test;

import base.MedianSpecificMethods;
import pages.MedianLogin;

public class GlobalAccountTestcasesCreate extends MedianSpecificMethods{
	@Test
	public void runGlobalAccountTestcases() throws InterruptedException {
		MedianLogin login = new MedianLogin();
		login.enterMakerUsername().enterMakerPassword().clickSignInButton()
		.clickSystemparamMaintenanceLink()
		.clickGlobalAccountRestriction()
		.clickGLaccountNew()
		.enterGlCode()
		.enterGlDescription()
		.clickSave();
	}
	

}
