package pages;

import base.MedianSpecificMethods;

public class MedianRuleTranslationDBCreateAndAuth extends MedianSpecificMethods {
	
	

	public MedianRuleTranslationDBCreateAndAuth clickNewButton() {
		wait(7000);
		clickElement(locateElement("xpath", props.getProperty("Median.RuleTranslation.NewButton.Xpath")));
		return this;
	}
	
	public MedianRuleTranslationDBCreateAndAuth clickSoruceSystemDropdown() {	
	       clickElement(locateElement("xpath",props.getProperty("Median.RuleTranslation.SourceSystem.Dropdown.Xpath"))); 
	       wait(3000);		  
		   enterValue(locateElement("xpath",props.getProperty("Median.RuleTranslation.SourceSystem.Dropdown.input.Xpath")),props.getProperty("Sourcesystem"));
		 return this;
		}
	
	public MedianRuleTranslationDBCreateAndAuth selectSourceSystem() {
		wait(1000);
		clickElement(locateElement("xpath", props.getProperty("Median.RuleTranslation.SelectSourceSystem.Xpath")));
		return this;
	}
	/*public MedianRuleTranslationDBCreateAndAuth dropDownSourceSyetem() {
		wait(5000);
		clickElement(locateElement("xpath", props.getProperty("Median.RuleTranslation.dropDown.sourceSystem.Xpath")));
		wait(3000);
		clickElement(locateElement("xpath", props.getProperty("Median.RuleTranslation.dropDown.sourceSystemISO.xpath")));
		return this;
	}*/
	
	public MedianRuleTranslationDBCreateAndAuth clickFetchButton() {
		wait(3000);
		clickElement(locateElement("xpath", props.getProperty("Median.RuleTranslation.SourceSystem.Fetch.Xpath")));
		wait(3000);
		return this;
	}
	
	public MedianRuleTranslationDBCreateAndAuth clickSaveButton() {
		wait(3000);
		jsExecutor(locateElement("xpath", props.getProperty("Median.RuleTranslation.SourceSystem.Save.Xpath")));
		wait(3000);
		clickElement(locateElement("xpath", props.getProperty("Median.RuleTranslation.SourceSystem.Save.Xpath")));
		return this;
	}
	public MedianRuleTranslationDBCreateAndAuth clickOkPopup() {
		wait(7000);
		clickElement(locateElement("xpath", props.getProperty("Median.RuleTranslation.SourceSystem.OK.Xpath")));
		return this;
	}
	public MedianRuleTranslationDBCreateAndAuth clickExit() {
		wait(2000);
		clickElement(locateElement("xpath", props.getProperty("Median.CreateRuleTranslation.ExitButton.Xpath")));
		return this;
		}
	public MedianRuleTranslationDBCreateAndAuth clickSystemCode() {
		wait(2000);
		clickElement(locateElement("xpath", props.getProperty("Median.AuthRuleTranslation.SelectSystemCode.Xpath")));
		return this;
		}
	public MedianRuleTranslationDBCreateAndAuth clickAuth() {
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