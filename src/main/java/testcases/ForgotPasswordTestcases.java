package testcases;

import org.testng.annotations.Test;

import base.MedianSpecificMethods;
import pages.MedianForgotPassword;
import pages.MedianLogin;


public class ForgotPasswordTestcases extends MedianSpecificMethods{
	@Test
	
	public void runMedianLogin() {
		MedianLogin login = new MedianLogin();
		login.clickForgotPassword().enterUserid()
         .clickGetOTP().enterNewPassword().enterConfirmPassword()
		.clickSave();
		
	
	}
}

