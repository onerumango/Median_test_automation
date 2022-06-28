package pages;

import base.MedianSpecificMethods;

public class MedianCreateAccountClosureMaintenance extends MedianSpecificMethods{

	public MedianCreateAccountClosureMaintenance selectAccountType() {
		wait(3000);
		clickElement(locateElement("xpath", props.getProperty("Median.AccountClosureMaintenance.AccountType.XPath")));
		wait(2000);
		clickElement(locateElement("xpath", props.getProperty("Median.AccountClosureMaintenance.SelectAccountType.XPath")));
		return this;
    }
	
	public MedianCreateAccountClosureMaintenance enterUDFDetails() {
		wait(2000);
		enterValue(locateElement("xpath", props.getProperty("Median.AccountClosureMaintenance.FieldNo.XPath")), props.getProperty("FieldNo"));
		wait(2000);
		enterValue(locateElement("xpath", props.getProperty("Median.AccountClosureMaintenance.FieldName.XPath")), props.getProperty("FieldName"));
		wait(2000);
		enterValue(locateElement("xpath", props.getProperty("Median.AccountClosureMaintenance.FieldValue.XPath")), props.getProperty("FieldValue"));
		wait(2000);
		
		return this;
    }
	
}
