package pages;

import base.MedianSpecificMethods;

public class MedianRuleTranslationISOCreateAndAuth extends MedianSpecificMethods {
	
	

	public MedianRuleTranslationISOCreateAndAuth clickNewButton() {
		wait(7000);
		clickElement(locateElement("xpath", props.getProperty("Median.RuleTranslation.NewButton.Xpath")));
		return this;
	}
	
	public MedianRuleTranslationISOCreateAndAuth dropDownSourceSyetem() {
		wait(2000);
		clickElement(locateElement("xpath", props.getProperty("Median.RuleTranslation.dropDown.sourceSystem.Xpath")));
		wait(2000);
		enterValue(locateElement("xpath",props.getProperty("Median.RuleTranslation.dropDown.sourceSystem.Xpath")),props.getProperty("WritesourceSystemISO"));
		return this;
	}
	public MedianRuleTranslationISOCreateAndAuth selectdropDownSourceSyetem() {
		wait(2000);
		clickElement(locateElement("xpath", props.getProperty("Median.RuleTranslation.dropDown.selectSourceSystem.Xpath")));
		return this;
	}
	
	
	public MedianRuleTranslationISOCreateAndAuth clickFetchButton() {
		wait(3000);
		clickElement(locateElement("xpath", props.getProperty("Median.RuleTranslation.fetch.xpath")));
		wait(3000);
		return this;
	}
	
	public MedianRuleTranslationISOCreateAndAuth clickSaveButton() {
		wait(3000);
		jsExecutor(locateElement("xpath", props.getProperty("Median.RuleTranslation.save.xpath")));
		wait(3000);
		clickElement(locateElement("xpath", props.getProperty("Median.RuleTranslation.save.xpath")));
		return this;
	}
	public MedianRuleTranslationISOCreateAndAuth clickOkPopup() {
		wait(7000);
		clickElement(locateElement("xpath", props.getProperty("Median.RuleTranslation.ok.xpath")));
		return this;
	}
	public MedianRuleTranslationISOCreateAndAuth clickExit() {
		wait(2000);
		clickElement(locateElement("xpath", props.getProperty("Median.CreateRuleTranslation.ExitButton.Xpath")));
		return this;
		}
	public MedianRuleTranslationISOCreateAndAuth clickSystemCode() {
		wait(2000);
		clickElement(locateElement("xpath", props.getProperty("Median.AuthRuleTranslation.SelectSystemCode.Xpath")));
		return this;
		}
	public MedianRuleTranslationISOCreateAndAuth clickAuth() {
		wait(2000);
		jsExecutor(locateElement("xpath", props.getProperty("Median.AuthRuleTranslation.ClickAuth.Xpath")));
		wait(2000);
		clickElement(locateElement("xpath", props.getProperty("Median.AuthRuleTranslation.ClickAuth.Xpath")));
		wait(3000);
		clickElement(locateElement("xpath", props.getProperty("Median.AuthRuleTranslation.ClickYes.Xpath")));
		wait(3000);
		clickElement(locateElement("xpath", props.getProperty("Median.AuthRuleTranslation.ClickOK.Xpath")));
		return this;
		}
	
}