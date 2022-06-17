package pages;

import java.awt.AWTException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import base.MedianSpecificMethods;

public class MedianRuleTranslationXML extends MedianSpecificMethods {
	
	public MedianRuleTranslationXML clickNewButton() {
		wait(2000);
		clickElement(locateElement("xpath", props.getProperty("Median.RuleTranslation.NewButton.Xpath")));
		return this;
	}
	
	public MedianRuleTranslationXML dropDownSourceSyetem() {
		wait(2000);
		clickElement(locateElement("xpath", props.getProperty("Median.RuleTranslation.dropDown.sourceSystem.Xpath")));
		wait(2000);
		clickElement(locateElement("xpath", props.getProperty("Median.RuleTranslation.dropDown.sourceSystemXML.xpath")));
		return this;
	}
	
	
	public MedianRuleTranslationXML fileUpload() throws AWTException {
		Actions action = new Actions(driver);
		WebElement chooseFile = locateElement("xpath",props.getProperty("Median.SystemInterface.RuleTranslation.Header&ServiceDetails.XMLFileUpload.Xpath"));
		action.moveToElement(chooseFile).click().perform();
		wait(2000);
		uploadFile("C:\\Users\\NPR11007\\Desktop\\Median\\Request.xml");
		wait(10000);
		return this;
	}
	public MedianRuleTranslationXML selectTag() {
		wait(2000);
		clickElement(locateElement("xpath", props.getProperty("Median.RuleTranslation.Tag.Xpath")));
		wait(2000);
		clickElement(locateElement("xpath", props.getProperty("Median.RuleTranslation.selectTag.Xpath")));
		return this;
	}
	public MedianRuleTranslationXML selectDataType() {
		wait(2000);
		clickElement(locateElement("xpath", props.getProperty("Median.RuleTranslation.dataType.Xpath")));
		wait(2000);
		clickElement(locateElement("xpath", props.getProperty("Median.RuleTranslation.selectdataType.Xpath")));
		return this;
	}
	public MedianRuleTranslationXML clickPlusButton() {
		wait(2000);
		clickElement(locateElement("xpath", props.getProperty("Median.SystemInterface.RuleTranslation.Header&ServiceDetails.PlusButton.Xpath")));
	    return this;
	}
	public MedianRuleTranslationXML selectTag2() {
		wait(2000);
		clickElement(locateElement("xpath", props.getProperty("Median.RuleTranslation.Tag2.Xpath")));
		wait(2000);
		clickElement(locateElement("xpath", props.getProperty("Median.RuleTranslation.selectTag2.Xpath")));
		return this;
	}
	public MedianRuleTranslationXML selectDataType2() {
		wait(2000);
		clickElement(locateElement("xpath", props.getProperty("Median.RuleTranslation.dataType2.Xpath")));
		wait(2000);
		clickElement(locateElement("xpath", props.getProperty("Median.RuleTranslation.selectdataType2.Xpath")));
		return this;
	}
	public MedianRuleTranslationXML clickSaveButton() {
		wait(2000);
		clickElement(locateElement("xpath", props.getProperty("Median.RuleTranslation.SaveButton.Xpath")));
		return this;
	}
	public MedianRuleTranslationXML clickOkPopup() {
		wait(2000);
		clickElement(locateElement("xpath", props.getProperty("Median.RuleTranslation.ok.xpath")));
		return this;
	}

}
