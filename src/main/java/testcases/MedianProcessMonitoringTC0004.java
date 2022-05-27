package testcases;
import org.testng.annotations.Test;

import base.MedianSpecificMethods;
import pages.MedianLoginAndLogout;

public class MedianProcessMonitoringTC0004 extends MedianSpecificMethods {

	@Test
	public void runMedianProcessMonitoring() throws InterruptedException {
		MedianLoginAndLogout login = new MedianLoginAndLogout();
		login.enterMakerUsername()
		.enterMakerPassword()
		.clickSignInButton()
		.clickProcessMonitoring()
		.verifyScreen();
		
	}
}
