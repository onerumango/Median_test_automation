package pages;

import base.MedianSpecificMethods;

public class MedianAccountClosureMaintenanceSummary extends MedianSpecificMethods{
	public MedianCreateAccountClosureMaintenance clickNew() {
		wait(3000);
		clickElement(locateElement("xpath", props.getProperty("Median.AccountClosureMaintenance.clickNew.XPath")));
		return new MedianCreateAccountClosureMaintenance();
	}
	public MedianAccountClosureMaintenanceDetails clickAccountType() {
		wait(3000);
		clickElement(locateElement("xpath", props.getProperty("Median.AccountClosureMaintenance.ClickAccountType.XPath")));
		return new MedianAccountClosureMaintenanceDetails();
	}

}
