package testcases;

import org.testng.annotations.Test;

import base.MedianSpecificMethods;
import pages.MedianLogin;

public class ProcessCodemappingEditTestcases extends MedianSpecificMethods{
	@Test
	public void runProcessCodemappingEdit() throws InterruptedException {
		MedianLogin login = new MedianLogin();
		login.enterMakerUsername().enterMakerPassword().clickSignInButton()
		.clickFileUploadMaintenanceLink().clickProcesscodemapping().selectRecord().enterProcessCode().enterMaxUploadLimit()
         .clickSave();
}
}
