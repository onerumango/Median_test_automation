package pages;

import java.awt.AWTException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import base.MedianSpecificMethods;

public class MedianRuleTranslationXMLCreateAndAuth extends MedianSpecificMethods {
	
	public MedianRuleTranslationXMLCreateAndAuth clickNewButton() {
		wait(2000);
		clickElement(locateElement("xpath", props.getProperty("Median.RuleTranslation.NewButton.Xpath")));
		return this;
	}
	
	public MedianRuleTranslationXMLCreateAndAuth dropDownSourceSyetem() {
		wait(2000);
		clickElement(locateElement("xpath", props.getProperty("Median.RuleTranslation.dropDown.sourceSystem.Xpath")));
		wait(2000);
		enterValue(locateElement("xpath",props.getProperty("Median.RuleTranslation.dropDown.sourceSystem.Xpath")),props.getProperty("WritesourceSystemXML"));
		return this;
	}
	public MedianRuleTranslationXMLCreateAndAuth selectdropDownSourceSyetem() {
		wait(2000);
		clickElement(locateElement("xpath", props.getProperty("Median.RuleTranslation.dropDown.selectSourceSystem.Xpath")));
		return this;
	}
	
	
	
	public MedianRuleTranslationXMLCreateAndAuth fileUpload() throws AWTException {
		wait(5000);
		Actions action = new Actions(driver);
		WebElement chooseFile = locateElement("xpath",props.getProperty("Median.SystemInterface.RuleTranslation.Header&ServiceDetails.XMLFileUpload.Xpath"));
		action.moveToElement(chooseFile).click().perform();
		wait(5000);
		uploadFile("C:\\Users\\NPR11007\\Desktop\\Median\\Request.xml");
		wait(10000);
		return this;
	}
	
	public MedianRuleTranslationXMLCreateAndAuth selectTag() {
		wait(2000);
		clickElement(locateElement("xpath", props.getProperty("Median.RuleTranslation.Tag.Xpath")));
		wait(2000);
		clickElement(locateElement("xpath", props.getProperty("Median.RuleTranslation.selectTag.Xpath")));
		return this;
	}
	public MedianRuleTranslationXMLCreateAndAuth selectDataType() {
		wait(2000);
		clickElement(locateElement("xpath", props.getProperty("Median.RuleTranslation.dataType.Xpath")));
		wait(2000);
		clickElement(locateElement("xpath", props.getProperty("Median.RuleTranslation.selectdataType.Xpath")));
		return this;
	}
	public MedianRuleTranslationXMLCreateAndAuth clickPlusButton() {
		wait(2000);
		clickElement(locateElement("xpath", props.getProperty("Median.SystemInterface.RuleTranslation.Header&ServiceDetails.PlusButton.Xpath")));
	    return this;
	}
	public MedianRuleTranslationXMLCreateAndAuth selectTag2() {
		wait(2000);
		clickElement(locateElement("xpath", props.getProperty("Median.RuleTranslation.Tag2.Xpath")));
		wait(2000);
		clickElement(locateElement("xpath", props.getProperty("Median.RuleTranslation.selectTag2.Xpath")));
		return this;
	}
	public MedianRuleTranslationXMLCreateAndAuth selectDataType2() {
		wait(2000);
		clickElement(locateElement("xpath", props.getProperty("Median.RuleTranslation.dataType2.Xpath")));
		wait(2000);
		clickElement(locateElement("xpath", props.getProperty("Median.RuleTranslation.selectdataType2.Xpath")));
		return this;
	}
	public MedianRuleTranslationXMLCreateAndAuth clickSaveButton() {
		wait(2000);
		 jsExecutor(locateElement("xpath", props.getProperty("Median.RuleTranslation.SaveButton.Xpath")));
		wait(2000);
		clickElement(locateElement("xpath", props.getProperty("Median.RuleTranslation.SaveButton.Xpath")));
		return this;
	}
	public MedianRuleTranslationXMLCreateAndAuth clickOkPopup() {
		wait(2000);
		clickElement(locateElement("xpath", props.getProperty("Median.RuleTranslation.ok.xpath")));
		return this;
	}
	public MedianRuleTranslationXMLCreateAndAuth clickSystemCode() {
		wait(2000);
		clickElement(locateElement("xpath", props.getProperty("Median.AuthRuleTranslation.SelectSystemCode.Xpath")));
		return this;
		}
	public MedianRuleTranslationXMLCreateAndAuth clickAuth() {
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
