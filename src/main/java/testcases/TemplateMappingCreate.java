package testcases;

import org.testng.annotations.Test;

import base.MedianSpecificMethods;
import pages.MedianLoginAndLogout;

public class TemplateMappingCreate extends MedianSpecificMethods{
	@Test
	public void runTemplateMappingCreate() throws InterruptedException {
		MedianLoginAndLogout login = new MedianLoginAndLogout();
		login.enterMakerUsername().enterMakerPassword().clickSignInButton()
		.clickFileUploadMaintenanceLink()
		.clickTemplatemapping()
		.clickNew()
		.clickExtsysDropdown()
		.selectExternalSystem()	
	     .enterDatastartingRow()
		.enterCurrency()
		.enterSheetNumber()
		.selectIsHeaderPresent()
		.enterBranchCode()
		.clickMandatory1()
		.selectDatatype1()
		
		.enterHeadername1()
		.enterMappingcolumn1()
		.clickAddrow()
		
		.fillCcyCdDetails()
		.clickAddrow()
		.fillAmountDetails()
		.clickAddrow()
		.fillAccountDetails()
		.clickAddrow()
		.fillAccountBranchDetails()
		.clickAddrow()
		.fillDrCrDetails()
		.clickAddrow()
		.fillLcyEquivalentDetails()
		.clickAddrow()
		.fillExchRateDetails()
		.clickAddrow()
		.fillValueDateDetails()
		.clickAddrow()
		.fillFinCycleDetails()
		.clickAddrow()
		.fillPeriodCodeDetails()
		.clickAddrow()
		.fillAddlTextDetails()
		
		//.clickSave()
		.clickExit()
		.clickLogout();
}
}
