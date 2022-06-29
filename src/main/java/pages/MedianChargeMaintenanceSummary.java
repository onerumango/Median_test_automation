package pages;

import base.MedianSpecificMethods;

public class MedianChargeMaintenanceSummary extends MedianSpecificMethods{
	public MedianCreateChargeMaintenance clickNew() {
		wait(3000);
		clickElement(locateElement("xpath", props.getProperty("Median.AccountClosure.ChargeMaintenance.clickNew.XPath")));
		return new MedianCreateChargeMaintenance();
	}
	public MedianAccountChargeDetails clickCurrency() {
		wait(3000);
		clickElement(locateElement("xpath", props.getProperty("Median.AccountClosure.ChargeMaintenance.clickCurrency.XPath")));
		return new MedianAccountChargeDetails();
	}

}
