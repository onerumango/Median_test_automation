package pages;

import base.MedianSpecificMethods;

public class MedianCreateAndAuthRule extends MedianSpecificMethods{
	public MedianCreateAndAuthRule clickNewButton() {
		wait(2000);
		clickElement(locateElement("xpath", props.getProperty("Median.CreateRule.NewButton.Xpath")));
		return this;
	}
	public MedianCreateAndAuthRule enterRuleID() {
		wait(2000);
		enterValue(locateElement("xpath", props.getProperty("Median.CreateRule.RuleID.Xpath")), props.getProperty("RuleID"));
		return this;
	}
	public MedianCreateAndAuthRule enterRuleName() {
		wait(2000);
		enterValue(locateElement("xpath", props.getProperty("Median.CreateRule.RuleName.Xpath")), props.getProperty("RuleName"));
		return this;
	}
	public MedianCreateAndAuthRule selectSorceSystem() {
		wait(2000);
		clickElement(locateElement("xpath", props.getProperty("Median.CreateRule.SourceSystem.Xpath")));
		wait(2000);
		enterValue(locateElement("xpath",props.getProperty("Median.CreateRule.SourceSystem.Xpath")),props.getProperty("WriteSourceSystemInCreateRule"));
		wait(2000);
		clickElement(locateElement("xpath", props.getProperty("Median.CreateRule.selectSourceSystem.Xpath")));
	  	  return this;
	 }
	public MedianCreateAndAuthRule selectDestinationSystem() {
		wait(2000);
		clickElement(locateElement("xpath", props.getProperty("Median.CreateRule.DestinationSystem.Xpath")));
		wait(2000);
		enterValue(locateElement("xpath",props.getProperty("Median.CreateRule.DestinationSystem.Xpath")),props.getProperty("WriteDestinationSystemInCreateRule"));
		wait(2000);
		clickElement(locateElement("xpath", props.getProperty("Median.CreateRule.selectDestinationSystem.Xpath")));
	  	  return this;
	 }
	public MedianCreateAndAuthRule clickNextButton() {
		wait(2000);
		  jsExecutor(locateElement("xpath", props.getProperty("Median.CreateRule.NextButton.Xpath")));
		  wait(2000);
		clickElement(locateElement("xpath", props.getProperty("Median.CreateRule.NextButton.Xpath")));
		return this;
	}
	public MedianCreateAndAuthRule selectTag() {
		wait(2000);
		clickElement(locateElement("xpath", props.getProperty("Median.CreateRule.Tag.Xpath")));
		wait(2000);
	    clickElement(locateElement("xpath", props.getProperty("Median.CreateRule.SelectTag.Xpath")));
	  	  return this;
	 }
	public MedianCreateAndAuthRule enterValidationMethod() {
		wait(2000);
		enterValue(locateElement("xpath", props.getProperty("Median.CreateRule.ValidationMethod.Xpath")), props.getProperty("ValidationMethod"));
		return this;
	}
	public MedianCreateAndAuthRule enterValidationDetails() {
		wait(2000);
		enterValue(locateElement("xpath", props.getProperty("Median.CreateRule.ValidationDetails.Xpath")), props.getProperty("ValidationDetails"));
		return this;
	}
	public MedianCreateAndAuthRule clickSave() {
		wait(2000);
		clickElement(locateElement("xpath", props.getProperty("Median.CreateRule.SaveButton.Xpath")));
		return this;
		}
	public MedianCreateAndAuthRule clickOK() {
		wait(2000);
		clickElement(locateElement("xpath", props.getProperty("Median.CreateRule.OKButton.Xpath")));
		return this;
		}
	public MedianCreateAndAuthRule clickExit() {
		wait(2000);
		clickElement(locateElement("xpath", props.getProperty("Median.CreateRule.ExitButton.Xpath")));
		return this;
		}
	public MedianCreateAndAuthRule clickRuleId() {
		wait(2000);
		clickElement(locateElement("xpath", props.getProperty("Median.AuthRule.SelectRuleID.Xpath")));
		return this;
		}
	public MedianCreateAndAuthRule clickAuth() {
		wait(2000);
		jsExecutor(locateElement("xpath", props.getProperty("Median.AuthRule.ClickAuth.Xpath")));
		wait(2000);
		clickElement(locateElement("xpath", props.getProperty("Median.AuthRule.ClickAuth.Xpath")));
		wait(3000);
		clickElement(locateElement("xpath", props.getProperty("Median.AuthRule.ClickYes.Xpath")));
		wait(3000);
		clickElement(locateElement("xpath", props.getProperty("Median.AuthRule.ClickOK.Xpath")));
		return this;
		}
	
}
