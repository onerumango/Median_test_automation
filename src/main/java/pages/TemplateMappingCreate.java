package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import base.MedianSpecificMethods;

public class TemplateMappingCreate extends MedianSpecificMethods{
	public TemplateMappingCreate clickExtsysDropdown() {	
       clickElement(locateElement("xpath",props.getProperty("TemplateMappingCreate.ExternalSystem.Xpath"))); 
       wait(3000);		  
	   enterValue(locateElement("xpath",props.getProperty("TemplateMappingCreate.ExternalSystem.Xpath")),props.getProperty("WriteExternalSystem"));
	 return this;
	}
	public TemplateMappingCreate selectExternalSystem() {
		wait(1000);
		clickElement(locateElement("xpath", props.getProperty("TemplateMappingCreate.SelectExternalSystem.Xpath")));
		return this;
	}	
	public TemplateMappingCreate enterDatastartingRow() {
		wait(1000);
  	  enterValue(locateElement("xpath", props.getProperty("TemplateMappingCreate.DataStartingrow.Xpath")), props.getProperty("DataStartingrow"));
		return this;
    }
	public TemplateMappingCreate enterCurrency() {
		wait(1000);
	  	  enterValue(locateElement("xpath", props.getProperty("TemplateMappingCreate.Currency.Xpath")), props.getProperty("Currency"));
			return this;
	    }
	public TemplateMappingCreate enterSheetNumber() {
		wait(1000);
	  	  enterValue(locateElement("xpath", props.getProperty("TemplateMappingCreate.SheetNumber.Xpath")), props.getProperty("SheetNumber"));
			return this;
	    }
	public TemplateMappingCreate selectIsHeaderPresent() {
		wait(1000);
		clickElement(locateElement("xpath", props.getProperty("TemplateMappingCreate.IsHeaderPresent.Xpath")));
		return this;
	}
	public TemplateMappingCreate enterBranchCode() {
		wait(1000);
	  	  enterValue(locateElement("xpath", props.getProperty("TemplateMappingCreate.branchCode.Xpath")), props.getProperty("branchCode"));
			return this;
	    }
	public TemplateMappingCreate selectDatatype1() {
		
		  wait(1000); 
		  clickElement(locateElement("xpath",props.getProperty("TemplateMappingCreate.DTDropdown1.Xpath"))); 
		  wait(1000);
		  clickElement(locateElement("xpath",props.getProperty("TemplateMappingCreate.Datatype1.Xpath")));
		return this;
	}
	
	public TemplateMappingCreate clickMandatory1() {
		wait(5000);
		/*
		 * Actions action = new Actions(driver); WebElement mandatory=
		 * locateElement("xpath",
		 * props.getProperty("TemplateMappingCreate.Mandatory1.Xpath"));
		 * action.moveToElement(mandatory).click().build().perform();
		 */
		String cssPath = "div.checkboxdiv div.checkStyle label";
		((JavascriptExecutor)driver).executeScript("document.querySelector(arguments[0],':before').click();",cssPath);
		
		return this;
	}
	
	public TemplateMappingCreate enterHeadername1() {
		wait(1000);
	  	  enterValue(locateElement("xpath", props.getProperty("TemplateMappingCreate.Headername1.Xpath")), props.getProperty("branchCodeHeadername"));
			return this;
	    }
	public TemplateMappingCreate enterMappingcolumn1() {
		wait(1000);
	  	  enterValue(locateElement("xpath", props.getProperty("TemplateMappingCreate.Mappingcolumn1.Xpath")), props.getProperty("branchCodeMappingcolumn"));
			return this;
	    }
	public TemplateMappingCreate clickAddrow() {
		wait(1000);
		jsExecutor(locateElement("xpath", props.getProperty("TemplateMappingCreate.Addrow.Xpath")));
		wait(1000);
		clickElement(locateElement("xpath", props.getProperty("TemplateMappingCreate.Addrow.Xpath")));
		return this;
	}
	
	
	public TemplateMappingCreate fillCcyCdDetails() {
		
		enterValue(locateElement("xpath", props.getProperty("TemplateMappingCreate.ccyCd.Xpath")), props.getProperty("ccyCd"));
		wait(1000);
		clickElement(locateElement("xpath", props.getProperty("TemplateMappingCreate.ccyCdDTDropdown.Xpath")));
		wait(1000);
		clickElement(locateElement("xpath", props.getProperty("TemplateMappingCreate.ccyCdDatatype.Xpath")));
		wait(1000);
		/*
		 * String cssPath = "div.checkboxdiv div.checkStyle label";
		 * ((JavascriptExecutor)driver).executeScript(
		 * "document.querySelector(arguments[0],':after').click();",cssPath);
		 */
		
		enterValue(locateElement("xpath", props.getProperty("TemplateMappingCreate.ccyCdHeaderName.Xpath")), props.getProperty("ccyCdHeaderName"));
		wait(1000);
		enterValue(locateElement("xpath", props.getProperty("TemplateMappingCreate.ccyCdMappingcolumn.Xpath")), props.getProperty("ccyCdMappingcolumn"));
			return this;
	    }
	
	public TemplateMappingCreate fillAmountDetails() {
		
		enterValue(locateElement("xpath", props.getProperty("TemplateMappingCreate.amount.Xpath")), props.getProperty("amount"));
		wait(1000);
		clickElement(locateElement("xpath", props.getProperty("TemplateMappingCreate.amountDTDropdown.Xpath")));
		wait(1000);
		clickElement(locateElement("xpath", props.getProperty("TemplateMappingCreate.amountDatatype.Xpath")));
		wait(1000);
		enterValue(locateElement("xpath", props.getProperty("TemplateMappingCreate.amountHeaderName.Xpath")), props.getProperty("amountHeaderName"));
		wait(1000);
		enterValue(locateElement("xpath", props.getProperty("TemplateMappingCreate.amountMappingcolumn.Xpath")), props.getProperty("amountMappingcolumn"));
			return this;
	    }
	
	public TemplateMappingCreate fillAccountDetails() {
		
		enterValue(locateElement("xpath", props.getProperty("TemplateMappingCreate.account.Xpath")), props.getProperty("account"));
		wait(1000);
		clickElement(locateElement("xpath", props.getProperty("TemplateMappingCreate.accountDTDropdown.Xpath")));
		wait(1000);
		clickElement(locateElement("xpath", props.getProperty("TemplateMappingCreate.accountDatatype.Xpath")));
		wait(1000);
		enterValue(locateElement("xpath", props.getProperty("TemplateMappingCreate.accountHeaderName.Xpath")), props.getProperty("accountHeaderName"));
		wait(1000);
		enterValue(locateElement("xpath", props.getProperty("TemplateMappingCreate.accountMappingcolumn.Xpath")), props.getProperty("accountMappingcolumn"));
			return this;
	    }
	
	public TemplateMappingCreate fillAccountBranchDetails() {
		
		enterValue(locateElement("xpath", props.getProperty("TemplateMappingCreate.accountBranch.Xpath")), props.getProperty("accountBranch"));
		wait(1000);
		clickElement(locateElement("xpath", props.getProperty("TemplateMappingCreate.accountBranchDTDropdown.Xpath")));
		wait(1000);
		clickElement(locateElement("xpath", props.getProperty("TemplateMappingCreate.accountBranchDatatype.Xpath")));
		wait(1000);
		enterValue(locateElement("xpath", props.getProperty("TemplateMappingCreate.accountBranchHeaderName.Xpath")), props.getProperty("accountBranchHeaderName"));
		wait(1000);
		enterValue(locateElement("xpath", props.getProperty("TemplateMappingCreate.accountBranchMappingcolumn.Xpath")), props.getProperty("accountBranchMappingcolumn"));
			return this;
	    }
	public TemplateMappingCreate fillDrCrDetails() {
		
		enterValue(locateElement("xpath", props.getProperty("TemplateMappingCreate.drCr.Xpath")), props.getProperty("drCr"));
		wait(1000);
		clickElement(locateElement("xpath", props.getProperty("TemplateMappingCreate.drCrDTDropdown.Xpath")));
		wait(1000);
		clickElement(locateElement("xpath", props.getProperty("TemplateMappingCreate.drCrDatatype.Xpath")));
		wait(1000);
		enterValue(locateElement("xpath", props.getProperty("TemplateMappingCreate.drCrHeaderName.Xpath")), props.getProperty("drCrHeaderName"));
		wait(1000);
		enterValue(locateElement("xpath", props.getProperty("TemplateMappingCreate.drCrMappingcolumn.Xpath")), props.getProperty("drCrMappingcolumn"));
			return this;
	    }
	
	public TemplateMappingCreate fillLcyEquivalentDetails() {
		wait(1000);
		enterValue(locateElement("xpath", props.getProperty("TemplateMappingCreate.lcyEquivalent.Xpath")), props.getProperty("lcyEquivalent"));
		wait(1000);
		clickElement(locateElement("xpath", props.getProperty("TemplateMappingCreate.lcyEquivalentDTDropdown.Xpath")));
		wait(1000);
		clickElement(locateElement("xpath", props.getProperty("TemplateMappingCreate.lcyEquivalentDatatype.Xpath")));
		wait(1000);
		enterValue(locateElement("xpath", props.getProperty("TemplateMappingCreate.lcyEquivalentHeaderName.Xpath")), props.getProperty("lcyEquivalentHeaderName"));
		wait(1000);
		enterValue(locateElement("xpath", props.getProperty("TemplateMappingCreate.lcyEquivalentMappingcolumn.Xpath")), props.getProperty("lcyEquivalentMappingcolumn"));
			return this;
	    }
	public TemplateMappingCreate fillExchRateDetails() {
		
		enterValue(locateElement("xpath", props.getProperty("TemplateMappingCreate.exchRate.Xpath")), props.getProperty("exchRate"));
		wait(1000);
		clickElement(locateElement("xpath", props.getProperty("TemplateMappingCreate.exchRateDTDropdown.Xpath")));
		wait(1000);
		clickElement(locateElement("xpath", props.getProperty("TemplateMappingCreate.exchRateDatatype.Xpath")));
		wait(1000);
		enterValue(locateElement("xpath", props.getProperty("TemplateMappingCreate.exchRateHeaderName.Xpath")), props.getProperty("exchRateHeaderName"));
		wait(1000);
		enterValue(locateElement("xpath", props.getProperty("TemplateMappingCreate.exchRateMappingcolumn.Xpath")), props.getProperty("exchRateMappingcolumn"));
			return this;
	    }
	public TemplateMappingCreate fillValueDateDetails() {
		
		enterValue(locateElement("xpath", props.getProperty("TemplateMappingCreate.valueDate.Xpath")), props.getProperty("valueDate"));
		wait(1000);
		clickElement(locateElement("xpath", props.getProperty("TemplateMappingCreate.valueDateDTDropdown.Xpath")));
		wait(1000);
		clickElement(locateElement("xpath", props.getProperty("TemplateMappingCreate.valueDateDatatype.Xpath")));
		wait(1000);
		enterValue(locateElement("xpath", props.getProperty("TemplateMappingCreate.valueDateHeaderName.Xpath")), props.getProperty("valueDateHeaderName"));
		wait(1000);
		enterValue(locateElement("xpath", props.getProperty("TemplateMappingCreate.Date.Xpath")), props.getProperty("Date"));
		wait(1000);
		enterValue(locateElement("xpath", props.getProperty("TemplateMappingCreate.valueDateMappingcolumn.Xpath")), props.getProperty("valueDateMappingcolumn"));
			return this;
	    }
	public TemplateMappingCreate fillFinCycleDetails() {
		wait(1000);
		enterValue(locateElement("xpath", props.getProperty("TemplateMappingCreate.finCycle.Xpath")), props.getProperty("finCycle"));
		wait(1000);
		clickElement(locateElement("xpath", props.getProperty("TemplateMappingCreate.finCycleDTDropdown.Xpath")));
		wait(1000);
		clickElement(locateElement("xpath", props.getProperty("TemplateMappingCreate.finCycleDatatype.Xpath")));
		wait(1000);
		enterValue(locateElement("xpath", props.getProperty("TemplateMappingCreate.finCycleHeaderName.Xpath")), props.getProperty("finCycleHeaderName"));
		wait(1000);
		enterValue(locateElement("xpath", props.getProperty("TemplateMappingCreate.finCycleMappingcolumn.Xpath")), props.getProperty("finCycleMappingcolumn"));
			return this;
	    }
	
	public TemplateMappingCreate fillPeriodCodeDetails() {
		
		enterValue(locateElement("xpath", props.getProperty("TemplateMappingCreate.periodCode.Xpath")), props.getProperty("periodCode"));
		wait(1000);
		clickElement(locateElement("xpath", props.getProperty("TemplateMappingCreate.periodCodeDTDropdown.Xpath")));
		wait(1000);
		clickElement(locateElement("xpath", props.getProperty("TemplateMappingCreate.periodCodeDatatype.Xpath")));
		wait(1000);
		enterValue(locateElement("xpath", props.getProperty("TemplateMappingCreate.periodCodeHeaderName.Xpath")), props.getProperty("periodCodeHeaderName"));
		wait(1000);
		enterValue(locateElement("xpath", props.getProperty("TemplateMappingCreate.periodCodeMappingcolumn.Xpath")), props.getProperty("periodCodeMappingcolumn"));
			return this;
	    }
	
	public TemplateMappingCreate fillAddlTextDetails() {
		
		enterValue(locateElement("xpath", props.getProperty("TemplateMappingCreate.addlText.Xpath")), props.getProperty("addlText"));
		wait(1000);
		clickElement(locateElement("xpath", props.getProperty("TemplateMappingCreate.addlTextDTDropdown.Xpath")));
		wait(1000);
		clickElement(locateElement("xpath", props.getProperty("TemplateMappingCreate.addlTextDatatype.Xpath")));
		wait(1000);
		enterValue(locateElement("xpath", props.getProperty("TemplateMappingCreate.addlTextHeaderName.Xpath")), props.getProperty("addlTextHeaderName"));
		wait(1000);
		enterValue(locateElement("xpath", props.getProperty("TemplateMappingCreate.addlTextMappingcolumn.Xpath")), props.getProperty("addlTextMappingcolumn"));
			return this;
	    }
	
	
	public TemplateMappingCreate clickSave() {
		
		jsExecutor(locateElement("xpath", props.getProperty("TemplateMappingCreate.Save.Xpath")));
		wait(1000);
		clickElement(locateElement("xpath", props.getProperty("TemplateMappingCreate.Save.Xpath")));
		wait(1000);
		clickElement(locateElement("xpath", props.getProperty("TemplateMappingCreate.OK.Xpath")));
		return this;
	}
	public MedianDashboard clickExit() {
		clickElement(locateElement("xpath", props.getProperty("TemplateMappingCreate.Exit.Xpath")));
		return new MedianDashboard();
	}
	
	}
