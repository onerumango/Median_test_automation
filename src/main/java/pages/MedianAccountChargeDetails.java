package pages;

import base.MedianSpecificMethods;

public class MedianAccountChargeDetails extends MedianSpecificMethods{

	public MedianAccountChargeDetails clickAuth() {
		wait(2000);
		jsExecutor(locateElement("xpath", props.getProperty("Median.AccountClosure.ChargeMaintenance.ClickAuthButton.XPath")));
		wait(2000);
		clickElement(locateElement("xpath", props.getProperty("Median.AccountClosure.ChargeMaintenance.ClickAuthButton.XPath")));
		wait(2000);
		clickElement(locateElement("xpath", props.getProperty("Median.AccountClosure.ChargeMaintenance.ClickYesButton.XPath")));
		wait(2000);
		clickElement(locateElement("xpath", props.getProperty("Median.AccountClosure.ChargeMaintenance.ClickOKButton.XPath")));
		return this;
	}
}
