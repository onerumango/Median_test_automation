package pages;

import base.MedianSpecificMethods;

public class MedianRuleTranslationISO extends MedianSpecificMethods {
	
	

	public MedianRuleTranslationISO clickNewButton() {
		wait(7000);
		clickElement(locateElement("xpath", props.getProperty("Median.RuleTranslation.NewButton.Xpath")));
		return this;
	}
	
	public MedianRuleTranslationISO dropDownSourceSyetem() {
		wait(5000);
		clickElement(locateElement("xpath", props.getProperty("Median.RuleTranslation.dropDown.sourceSystem.Xpath")));
		wait(3000);
		clickElement(locateElement("xpath", props.getProperty("Median.RuleTranslation.dropDown.sourceSystemISO.xpath")));
		return this;
	}
	
	public MedianRuleTranslationISO clickFetchButton() {
		wait(3000);
		clickElement(locateElement("xpath", props.getProperty("Median.RuleTranslation.fetch.xpath")));
		wait(3000);
		return this;
	}
	
	public MedianRuleTranslationISO clickSaveButton() {
		wait(3000);
		jsExecutor(locateElement("xpath", props.getProperty("Median.RuleTranslation.save.xpath")));
		wait(3000);
		clickElement(locateElement("xpath", props.getProperty("Median.RuleTranslation.save.xpath")));
		return this;
	}
	public MedianRuleTranslationISO clickOkPopup() {
		wait(7000);
		clickElement(locateElement("xpath", props.getProperty("Median.RuleTranslation.ok.xpath")));
		return this;
	}

	
}