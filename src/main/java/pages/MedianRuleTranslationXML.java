package pages;

import base.MedianSpecificMethods;

public class MedianRuleTranslationXML extends MedianSpecificMethods {
	public MedianRuleTranslationXML clickNewButton() {
		wait(7000);
		clickElement(locateElement("xpath", props.getProperty("Median.RuleTranslation.NewButton.Xpath")));
		return this;
	}
	
	public MedianRuleTranslationXML dropDownSourceSyetem() {
		clickElement(locateElement("xpath", props.getProperty("Median.RuleTranslation.dropDown.sourceSystem.Xpath")));
		wait(7000);
		clickElement(locateElement("xpath", props.getProperty("Median.RuleTranslation.dropDown.sourceSystem.AutomationCodeISO")));
		return this;
	}
	
	public MedianRuleTranslationXML clickFetchButton() {
		wait(7000);
		clickElement(locateElement("xpath", props.getProperty("Median.RuleTranslation.fetch.xpath")));
		wait(7000);
		return this;
	}
	
	public MedianRuleTranslationXML clickSaveButton() {
		wait(7000);
		clickElement(locateElement("xpath", props.getProperty("Median.RuleTranslation.NewButton.Xpath")));
		return this;
	}
	public MedianRuleTranslationXML clickOkPopup() {
		wait(7000);
		clickElement(locateElement("xpath", props.getProperty("Median.RuleTranslation.ok.xpath")));
		return this;
	}

}
