package testcases;

import org.testng.annotations.Test;

import base.MedianSpecificMethods;
import pages.MedianForgotPassword;
import pages.MedianLoginAndLogout;


public class ForgotPasswordTestcases extends MedianSpecificMethods{
	@Test
	
	public void runMedianLogin() {
		MedianLoginAndLogout login = new MedianLoginAndLogout();
		login.clickForgotPassword().enterUserid()
         .clickGetOTP().enterNewPassword().enterConfirmPassword()
		.clickSave();
		
	
	}
}

