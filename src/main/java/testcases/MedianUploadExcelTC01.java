package testcases;

import java.awt.AWTException;

import org.testng.annotations.Test;

import base.MedianSpecificMethods;
import pages.MedianLogin;

public class MedianUploadExcelTC01 extends MedianSpecificMethods {
	@Test
	public void runMedianLogin() throws InterruptedException, AWTException {
		MedianLogin login = new MedianLogin();
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