package testcases;

import java.awt.AWTException;

import org.testng.annotations.Test;

import base.MedianSpecificMethods;
import pages.MedianLoginAndLogout;

public class MedianUploadExcelTC01 extends MedianSpecificMethods {
	@Test
	public void runMedianLogin() throws InterruptedException, AWTException {
		MedianLoginAndLogout login = new MedianLoginAndLogout();
		login.enterMakerUsername()
		.enterMakerPassword()
		.clickSignInButton()
		.selectFileUpload()
		.selectUploadExcel()
		.selectExternalSystem()
		.selectTransactionCode()
		.clickFileUpload()
		.clickUploadData()
		.enterRemarks()
		.clickProcess();
		
	}
}