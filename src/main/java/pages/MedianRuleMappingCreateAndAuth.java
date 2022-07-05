package pages;

import base.MedianSpecificMethods;

public class MedianRuleMappingCreateAndAuth extends MedianSpecificMethods{
	public MedianRuleMappingCreateAndAuth clickNewButton() {
		wait(7000);
		clickElement(locateElement("xpath", props.getProperty("Median.CreateRuleMapping.NewButton.Xpath")));
		return this;
	}
	public MedianRuleMappingCreateAndAuth selectSourceSystem() {
		wait(3000);
		clickElement(locateElement("xpath", props.getProperty("Median.CreateRuleMapping.SourceSystem.Xpath")));
		wait(3000);
		enterValue(locateElement("xpath",props.getProperty("Median.CreateRuleMapping.SourceSystem.Xpath")),props.getProperty("WriteSourceSystemInRuleMapping"));
		wait(2000);
		clickElement(locateElement("xpath", props.getProperty("Median.RuleMapping.selectSourceSystem.Xpath")));
		return this;
	}
	public MedianRuleMappingCreateAndAuth selectDestinationSystem() {
		wait(3000);
		clickElement(locateElement("xpath", props.getProperty("Median.CreateRuleMapping.DestinationSystem.Xpath")));
		wait(3000);
		enterValue(locateElement("xpath",props.getProperty("Median.CreateRuleMapping.DestinationSystem.Xpath")),props.getProperty("WriteDestinationSystemInRuleMapping"));
		wait(2000);
		clickElement(locateElement("xpath", props.getProperty("Median.RuleMapping.selectDestinationSystem.Xpath")));
		return this;
	}
	public MedianRuleMappingCreateAndAuth clickFetchButton() {
		wait(7000);
		clickElement(locateElement("xpath", props.getProperty("Median.CreateRuleMapping.FetchButton.Xpath")));
		return this;
	}
	
	public MedianRuleMappingCreateAndAuth selectDropdownSourceSystem() {
		wait(3000);
		clickElement(locateElement("xpath", props.getProperty("Median.CreateRuleMapping.DropdownSourceSystem.Xpath")));
		wait(3000);
		clickElement(locateElement("xpath", props.getProperty("Median.CreateRuleMapping.selectDropdownSourceSystem.Xpath")));
		return this;
	}
	public MedianRuleMappingCreateAndAuth selectDropdownDestinationSystem() {
		wait(3000);
		clickElement(locateElement("xpath", props.getProperty("Median.CreateRuleMapping.DropdownDestinationSystem.Xpath")));
		wait(3000);
		clickElement(locateElement("xpath", props.getProperty("Median.CreateRuleMapping.selectDropdownDestinationSystem.Xpath")));
		return this;
	}
	public MedianRuleMappingCreateAndAuth enterDefaultValue() {
		wait(2000);
		enterValue(locateElement("xpath", props.getProperty("Median.CreateRuleMapping.DefaultValue.Xpath")), props.getProperty("DefaultValue"));
		return this;
	}
	public MedianRuleMappingCreateAndAuth clickSaveButton() {
		wait(3000);
		jsExecutor(locateElement("xpath", props.getProperty("Median.CreateRuleMapping.SaveButton.Xpath")));
		wait(2000);
		clickElement(locateElement("xpath", props.getProperty("Median.CreateRuleMapping.SaveButton.Xpath")));
		wait(3000);
		clickElement(locateElement("xpath", props.getProperty("Median.CreateRuleMapping.OKButton.Xpath")));
		return this;
	}
	public MedianRuleMappingCreateAndAuth clickExitButton() {
		wait(3000);
		clickElement(locateElement("xpath", props.getProperty("Median.CreateRuleMapping.ExitButton.Xpath")));
		return this;
	}
	public MedianRuleMappingCreateAndAuth clickSourceSystem() {
		wait(3000);
		clickElement(locateElement("xpath", props.getProperty("Median.AuthRuleMapping.clickSourceSystem.Xpath")));
		return this;
	}
	public MedianRuleMappingCreateAndAuth clickAuth() {
		wait(2000);
		jsExecutor(locateElement("xpath", props.getProperty("Median.AuthRuleMapping.ClickAuth.Xpath")));
		wait(2000);
		clickElement(locateElement("xpath", props.getProperty("Median.AuthRuleMapping.ClickAuth.Xpath")));
		wait(3000);
		clickElement(locateElement("xpath", props.getProperty("Median.AuthRuleMapping.ClickYes.Xpath")));
		wait(3000);
		clickElement(locateElement("xpath", props.getProperty("Median.AuthRuleMapping.ClickOK.Xpath")));
		return this;
		}
}
