package testcases;
import org.testng.annotations.Test;

import base.MedianSpecificMethods;
import pages.MedianLoginAndLogout;
public class MedianTreasuryReferenceTC0005 extends MedianSpecificMethods {

	@Test
	public void runMedianProcessMonitoring() throws InterruptedException {
		MedianLoginAndLogout login = new MedianLoginAndLogout();
		login.enterMakerUsername()
		.enterMakerPassword()
		.clickSignInButton()
		.clickTreasuryReference()
		.clickBatchNumber()
		.clickSaveButton()
		.clickOkButton()
		.clickExitButton();
	}
}
