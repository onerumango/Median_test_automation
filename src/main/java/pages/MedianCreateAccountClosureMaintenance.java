package pages;

import base.MedianSpecificMethods;

public class MedianCreateAccountClosureMaintenance extends MedianSpecificMethods{

	public MedianCreateAccountClosureMaintenance selectAccountType() {
		wait(2000);
		clickElement(locateElement("xpath", props.getProperty("Median.AccountClosureMaintenance.AccountType.XPath")));
		wait(2000);
		clickElement(locateElement("xpath", props.getProperty("Median.AccountClosureMaintenance.SelectAccountType.XPath")));
		return this;
    }
	
	public MedianCreateAccountClosureMaintenance enterUDFDetails() {
		wait(1000);
		enterValue(locateElement("xpath", props.getProperty("Median.AccountClosureMaintenance.FieldNo.XPath")), props.getProperty("FieldNo"));
		wait(1000);
		enterValue(locateElement("xpath", props.getProperty("Median.AccountClosureMaintenance.FieldName.XPath")), props.getProperty("FieldName"));
		wait(1000);
		enterValue(locateElement("xpath", props.getProperty("Median.AccountClosureMaintenance.FieldValue.XPath")), props.getProperty("FieldValue"));
		
		return this;
    }
	public MedianCreateAccountClosureMaintenance enterAccountingEntries() {
		wait(1000);
		clickElement(locateElement("xpath", props.getProperty("Median.AccountClosureMaintenance.Charges.XPath")));
		wait(1000);
		clickElement(locateElement("xpath", props.getProperty("Median.AccountClosureMaintenance.SelectCharges.XPath")));
		wait(1000);
		clickElement(locateElement("xpath", props.getProperty("Median.AccountClosureMaintenance.ChargeType.XPath")));
		wait(1000);
		clickElement(locateElement("xpath", props.getProperty("Median.AccountClosureMaintenance.SelectChargeType.XPath")));
		wait(1000);
		clickElement(locateElement("xpath", props.getProperty("Median.AccountClosureMaintenance.DebitCredit.XPath")));
		wait(1000);
		clickElement(locateElement("xpath", props.getProperty("Median.AccountClosureMaintenance.SelectDebitCreditType.XPath")));
		wait(1000);
		enterValue(locateElement("xpath", props.getProperty("Median.AccountClosureMaintenance.AccountField.XPath")), props.getProperty("AccountField"));
		wait(1000);
		enterValue(locateElement("xpath", props.getProperty("Median.AccountClosureMaintenance.BranchCodeField.XPath")), props.getProperty("BranchCodeField"));
		wait(1000);
		enterValue(locateElement("xpath", props.getProperty("Median.AccountClosureMaintenance.AmountTagField.XPath")), props.getProperty("AmountTagField"));
		wait(1000);
		enterValue(locateElement("xpath", props.getProperty("Median.AccountClosureMaintenance.TransCodeField.XPath")), props.getProperty("TransCodeField"));
		wait(1000);
		enterValue(locateElement("xpath", props.getProperty("Median.AccountClosureMaintenance.NarrationField.XPath")), props.getProperty("NarrationField"));
		wait(2000);
		clickElement(locateElement("xpath", props.getProperty("Median.AccountClosureMaintenance.ClickAddPair.XPath")));
		return this;

	}
	public MedianCreateAccountClosureMaintenance clickSaveButton() {
		wait(2000);
		jsExecutor(locateElement("xpath", props.getProperty("Median.AccountClosureMaintenance.ClickSaveButton.XPath")));
		wait(2000);
		clickElement(locateElement("xpath", props.getProperty("Median.AccountClosureMaintenance.ClickSaveButton.XPath")));
		wait(1000);
		clickElement(locateElement("xpath", props.getProperty("Median.AccountClosureMaintenance.ClickOKButton.XPath")));
		return this;
}
}
