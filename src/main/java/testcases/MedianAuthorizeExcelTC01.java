package testcases;



import org.testng.annotations.Test;

import base.MedianSpecificMethods;
import pages.MedianLoginAndLogout;
import pages.MedianAuthRole;

public class MedianAuthorizeExcelTC01 extends MedianSpecificMethods {
	@Test
	public void runMedianLogin() throws InterruptedException {
		MedianLoginAndLogout login = new MedianLoginAndLogout();
		login.enterCheckerUsername()
		.enterCheckerPassword()
		.clickSignInButton()
		.selectFileUpload()
		.selectAuthorizeExcel()
		.clickgetDetails()
		.clickApproveandProcess();
	}
}
