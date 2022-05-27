package pages;

import base.MedianSpecificMethods;

public class MedianTreasuryReference extends MedianSpecificMethods {
	public MedianTreasuryReference clickBatchNumber() {
		selectByIndex(locateElement("xpath", props.getProperty("Median.TreasuryReference.batchNo.dropDown.xpath")),1);
		wait(10000);
		return this;
	}
	public MedianTreasuryReference clickSaveButton() {
		clickElement(locateElement("xpath", props.getProperty("Median.TreasuryReference.save.xpath")));
		wait(7000);
		return this;
	}

	public MedianTreasuryReference clickOkButton() {
		clickElement(locateElement("xpath", props.getProperty("Median.TreasuryReference.ok.xpath")));
		wait(7000);
		return this;
	}
	public MedianTreasuryReference clickExitButton() {
		clickElement(locateElement("xpath", props.getProperty("Median.TreasuryReference.exit.xpath")));
		wait(7000);
		return this;
	}
}
