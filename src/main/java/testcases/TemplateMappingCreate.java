package testcases;

import org.testng.annotations.Test;

import base.MedianSpecificMethods;
import pages.MedianLogin;

public class TemplateMappingCreate extends MedianSpecificMethods{
	@Test
	public void runTemplateMappingCreate() throws InterruptedException {
		MedianLogin login = new MedianLogin();
		login.enterMakerUsername().enterMakerPassword().clickSignInButton()
		.clickFileUploadMaintenanceLink().clickTemplatemapping().clickNew().clickExtsysDropdown().selectExternalSystem().clickProcesscodeDropdown()
		.selectProcessCode().enterDatastartingRow().enterCurrency().enterSheetNumber().enterName1().clickDatatypeDropdown1()
		.selectDatatype1().clickMandatory1().enterHeadername1().clickAddrow().enterName2().clickDatatypeDropdown2().selectDatatype2()
		.clickMandatory2().enterHeadername2().clickSave().clickExit().clickLogout();
}
}
