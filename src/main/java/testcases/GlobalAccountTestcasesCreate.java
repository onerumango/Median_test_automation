package testcases;

import org.testng.annotations.Test;

import base.MedianSpecificMethods;
import pages.MedianLogin;

public class GlobalAccountTestcasesCreate extends MedianSpecificMethods{
	@Test
	public void runGlobalAccountTestcases() {
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
