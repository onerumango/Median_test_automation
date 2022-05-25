package testcases;

import org.testng.annotations.Test;

import base.MedianSpecificMethods;
import pages.MedianLogin;

public class ProcessCodeMappingTestcases extends MedianSpecificMethods{
	@Test
	public void runProcessCodeMappingTestcases() throws InterruptedException {
		MedianLogin login = new MedianLogin();
		login.enterMakerUsername().enterMakerPassword().clickSignInButton()
		.clickFileUploadMaintenanceLink().clickProcesscodemapping().clickNew().clickExtSysCodeDropdown().selectExtsysCode()
	.enterProcessCode().enterMaxUploadLimit().clickSave();
	}

}
