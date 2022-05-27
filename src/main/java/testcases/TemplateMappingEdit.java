package testcases;

import org.testng.annotations.Test;

import base.MedianSpecificMethods;
import pages.MedianLoginAndLogout;

public class TemplateMappingEdit extends MedianSpecificMethods{
	@Test
	public void runTemplateMappingEdit() throws InterruptedException {
		MedianLoginAndLogout login = new MedianLoginAndLogout();
		login.enterMakerUsername().enterMakerPassword().clickSignInButton()
		.clickFileUploadMaintenanceLink().clickTemplatemapping().selectRecord().clickEdit().editName1().editHeadername1().editName2()
		.clickSave().clickExit().clickLogout();
	}

}
