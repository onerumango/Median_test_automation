package pages;

import base.MedianSpecificMethods;

public class MedianRuleTranslation extends MedianSpecificMethods {
	
	

	public MedianRuleTranslation clickNewButton() {
		wait(7000);
		clickElement(locateElement("xpath", props.getProperty("Median.RuleTranslation.NewButton.Xpath")));
		return this;
	}
	
	public MedianRuleTranslation dropDownSourceSyetem() {
		clickElement(locateElement("xpath", props.getProperty("Median.RuleTranslation.dropDown.sourceSystem.Xpath")));
		wait(7000);
		clickElement(locateElement("xpath", props.getProperty("Median.RuleTranslation.dropDown.sourceSystem.AutomationCodeISO")));
		return this;
	}
	
	public MedianRuleTranslation clickFetchButton() {
		wait(7000);
		clickElement(locateElement("xpath", props.getProperty("Median.RuleTranslation.fetch.xpath")));
		wait(7000);
		return this;
	}
	
	public MedianRuleTranslation clickSaveButton() {
		wait(7000);
		clickElement(locateElement("xpath", props.getProperty("Median.RuleTranslation.NewButton.Xpath")));
		return this;
	}
	public MedianRuleTranslation clickOkPopup() {
		wait(7000);
		clickElement(locateElement("xpath", props.getProperty("Median.RuleTranslation.ok.xpath")));
		return this;
	}

	
}