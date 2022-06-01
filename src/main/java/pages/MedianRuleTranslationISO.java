package pages;

import base.MedianSpecificMethods;

public class MedianRuleTranslationISO extends MedianSpecificMethods {
	
	

	public MedianRuleTranslationISO clickNewButton() {
		wait(7000);
		clickElement(locateElement("xpath", props.getProperty("Median.RuleTranslation.NewButton.Xpath")));
		return this;
	}
	
	public MedianRuleTranslationISO dropDownSourceSyetem() {
		clickElement(locateElement("xpath", props.getProperty("Median.RuleTranslation.dropDown.sourceSystem.Xpath")));
		wait(7000);
		clickElement(locateElement("xpath", props.getProperty("Median.RuleTranslation.dropDown.sourceSystem.AutomationCodeISO")));
		return this;
	}
	
	public MedianRuleTranslationISO clickFetchButton() {
		wait(7000);
		clickElement(locateElement("xpath", props.getProperty("Median.RuleTranslation.fetch.xpath")));
		wait(7000);
		return this;
	}
	
	public MedianRuleTranslationISO clickSaveButton() {
		wait(7000);
		clickElement(locateElement("xpath", props.getProperty("Median.RuleTranslation.NewButton.Xpath")));
		return this;
	}
	public MedianRuleTranslationISO clickOkPopup() {
		wait(7000);
		clickElement(locateElement("xpath", props.getProperty("Median.RuleTranslation.ok.xpath")));
		return this;
	}

	
}