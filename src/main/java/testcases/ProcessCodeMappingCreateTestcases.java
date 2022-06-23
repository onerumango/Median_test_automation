package testcases;

import org.testng.annotations.Test;

import base.MedianSpecificMethods;
import pages.MedianLoginAndLogout;

public class ProcessCodeMappingCreateTestcases extends MedianSpecificMethods{
	@Test
	public void runProcessCodeMappingTestcases() throws InterruptedException {
		MedianLoginAndLogout login = new MedianLoginAndLogout();
		login.enterMakerUsername().enterMakerPassword().clickSignInButton()
		.clickFileUploadMaintenanceLink()
		.clickProcesscodemapping()
		.clickNew()
		.clickExtSysCodeDropdown()
		.selectExtsysCode()
	    .enterProcessCode()
	    .enterMaxUploadLimit()
	    .clickSave();
	}

}
