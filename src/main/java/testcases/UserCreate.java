package testcases;

import org.testng.annotations.Test;

import base.MedianSpecificMethods;
import pages.MedianLoginAndLogout;
import pages.MedianAddNewRole;

public class UserCreate extends MedianSpecificMethods {
	@Test
	public void runMedianLogin() throws InterruptedException {
		MedianLoginAndLogout login = new MedianLoginAndLogout();
		login.enterMakerUsername()
		.enterMakerPassword()
		.clickSignInButton()
		.selectSystemMaintenance1()
		.enterUserId()
		.enterUserName()
		.enterPassword()
		.enterEmail()
		.enterMobile()
		.selectRolesForUSer()
		.selectDepartment()
		.clickSave();
	}
}