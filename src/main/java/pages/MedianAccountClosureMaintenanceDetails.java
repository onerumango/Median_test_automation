package pages;

import base.MedianSpecificMethods;

public class MedianAccountClosureMaintenanceDetails extends MedianSpecificMethods{
	public MedianAccountClosureMaintenanceDetails clickAuth() {
		wait(2000);
		jsExecutor(locateElement("xpath", props.getProperty("Median.AccountClosureMaintenance.ClickAuthButton.XPath")));
		wait(2000);
		clickElement(locateElement("xpath", props.getProperty("Median.AccountClosureMaintenance.ClickAuthButton.XPath")));
		wait(2000);
		clickElement(locateElement("xpath", props.getProperty("Median.AccountClosureMaintenance.ClickYesButton.XPath")));
		wait(2000);
		clickElement(locateElement("xpath", props.getProperty("Median.AccountClosureMaintenance.ClickOKButton.XPath")));
		return this;
	}

}
