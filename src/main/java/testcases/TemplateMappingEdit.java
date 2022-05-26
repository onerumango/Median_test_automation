package testcases;

import org.testng.annotations.Test;

import base.MedianSpecificMethods;
import pages.MedianLogin;

public class TemplateMappingEdit extends MedianSpecificMethods{
	@Test
	public void runTemplateMappingEdit() throws InterruptedException {
		MedianLogin login = new MedianLogin();
		login.enterMakerUsername().enterMakerPassword().clickSignInButton()
		.clickFileUploadMaintenanceLink().clickTemplatemapping().selectRecord().clickEdit().editName1().editHeadername1().editName2()
		.clickSave().clickExit().clickLogout();
	}

}
