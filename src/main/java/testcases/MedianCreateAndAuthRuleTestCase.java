package testcases;

import org.testng.annotations.Test;

import base.MedianSpecificMethods;
import pages.MedianDashboard;
import pages.MedianLoginAndLogout;

public class MedianCreateAndAuthRuleTestCase extends MedianSpecificMethods{
	@Test
	public void runMedianCreateRule() throws InterruptedException {
		MedianLoginAndLogout login = new MedianLoginAndLogout();
		MedianDashboard md= new MedianDashboard();
		login.enterMakerUsername().enterMakerPassword().clickSignInButton()
		.clickSystemInterface()
		.clickCreateRule()
		.clickNewButton()
		.enterRuleID()
		.enterRuleName()
		.selectSorceSystem()
		.selectDestinationSystem()
		.clickNextButton()
		.selectTag()
		.enterValidationMethod()
		.enterValidationDetails()
		.clickSave()
		.clickOK()
		.clickExit()
         ;
		md.clickUserName().clickLogout();
		
		MedianLoginAndLogout login1 = new MedianLoginAndLogout();
		login1.enterCheckerUsername()
		.enterCheckerPassword()
		.clickSignInButton()
		.clickSystemInterface()
		.clickCreateRule()
		.clickRuleId()
		.clickAuth()
		;
	}
	
	
	}
