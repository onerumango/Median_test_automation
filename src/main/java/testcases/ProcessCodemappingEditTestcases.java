package testcases;

import org.testng.annotations.Test;

import base.MedianSpecificMethods;
import pages.MedianLoginAndLogout;

public class ProcessCodemappingEditTestcases extends MedianSpecificMethods{
	@Test
	public void runProcessCodemappingEdit() throws InterruptedException {
		MedianLoginAndLogout login = new MedianLoginAndLogout();
		login.enterMakerUsername().enterMakerPassword().clickSignInButton()
		.clickFileUploadMaintenanceLink().clickProcesscodemapping().selectRecord().enterProcessCode().enterMaxUploadLimit()
         .clickSave();
}
}
