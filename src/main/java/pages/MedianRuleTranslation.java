package pages;

import base.MedianSpecificMethods;

public class MedianRuleTranslation extends MedianSpecificMethods {
	
	public MedianRuleTranslation clickRuleTranslation() {
		clickElement(locateElement("xpath", props.getProperty("Median.RuleTranslation.Xpath")));
		wait(7000);
		return this;
	}

	public MedianRuleTranslation clickNewButton() {
		wait(7000);
		clickElement(locateElement("xpath", props.getProperty("Median.RuleTranslation.NewButton.Xpath")));
		return this;
	}
	


	
}
