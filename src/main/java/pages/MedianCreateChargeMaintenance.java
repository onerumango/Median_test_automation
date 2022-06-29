package pages;

import base.MedianSpecificMethods;

public class MedianCreateChargeMaintenance extends MedianSpecificMethods{
	public MedianCreateChargeMaintenance enterCurrency() {
		wait(2000);
  	  enterValue(locateElement("xpath", props.getProperty("Median.AccountClosure.ChargeMaintenance.Currency.XPath")), props.getProperty("Currency"));
		return this;
    }
	public MedianCreateChargeMaintenance enterChargeAmount() {
		wait(2000);
  	  enterValue(locateElement("xpath", props.getProperty("Median.AccountClosure.ChargeMaintenance.ChargeAmount.XPath")), props.getProperty("ChargeAmount"));
		return this;
    }
	public MedianCreateChargeMaintenance enterChargePercentage() {
		wait(2000);
  	  enterValue(locateElement("xpath", props.getProperty("Median.AccountClosure.ChargeMaintenance.ChargePercentage.XPath")), props.getProperty("ChargePercentage"));
		return this;
    }

    public MedianCreateChargeMaintenance enterTaxAmount() {
	wait(2000);
	  enterValue(locateElement("xpath", props.getProperty("Median.AccountClosure.ChargeMaintenance.TaxAmount.XPath")), props.getProperty("TaxAmount"));
	return this;
}
    public MedianCreateChargeMaintenance enterTaxPercentage() {
	wait(2000);
	  enterValue(locateElement("xpath", props.getProperty("Median.AccountClosure.ChargeMaintenance.TaxPercentage.XPath")), props.getProperty("TaxPercentage"));
	return this;
}
    public MedianCreateChargeMaintenance clickSave() {
  	  wait(1000);
  	  jsExecutor(locateElement("xpath", props.getProperty("Median.AccountClosure.ChargeMaintenance.Save.XPath")));
  	  wait(2000);
  	  clickElement(locateElement("xpath", props.getProperty("Median.AccountClosure.ChargeMaintenance.Save.XPath")));
    	wait(1000);
    	clickElement(locateElement("xpath", props.getProperty("Median.AccountClosure.ChargeMaintenance.OK.XPath")));
  	  return this;
	

}
}
