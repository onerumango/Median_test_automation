package pages;

import base.MedianSpecificMethods;

public class TemplateMappingCreate extends MedianSpecificMethods{
	public TemplateMappingCreate clickExtsysDropdown() {
		clickElement(locateElement("xpath", props.getProperty("TemplateMappingCreate.Dropdown.Xpath")));
		return this;
	}
	public TemplateMappingCreate selectExternalSystem() {
		clickElement(locateElement("xpath", props.getProperty("TemplateMappingCreate.ExternalSystem.Xpath")));
		return this;
	}
	public TemplateMappingCreate clickProcesscodeDropdown() {
		clickElement(locateElement("xpath", props.getProperty("TemplateMappingCreate.PCDropdown.Xpath")));
		return this;
	}
	public TemplateMappingCreate selectProcessCode() {
		clickElement(locateElement("xpath", props.getProperty("TemplateMappingCreate.ProcessCode.Xpath")));
		return this;
	}
	public TemplateMappingCreate enterDatastartingRow() {
  	  enterValue(locateElement("xpath", props.getProperty("TemplateMappingCreate.DataStartingrow.Xpath")), props.getProperty("DataStartingrow"));
		return this;
    }
	public TemplateMappingCreate enterCurrency() {
	  	  enterValue(locateElement("xpath", props.getProperty("TemplateMappingCreate.Currency.Xpath")), props.getProperty("Currency"));
			return this;
	    }
	public TemplateMappingCreate enterSheetNumber() {
	  	  enterValue(locateElement("xpath", props.getProperty("TemplateMappingCreate.SheetNumber.Xpath")), props.getProperty("SheetNumber"));
			return this;
	    }
	public TemplateMappingCreate enterName1() {
	  	  enterValue(locateElement("xpath", props.getProperty("TemplateMappingCreate.Name1.Xpath")), props.getProperty("Name1"));
			return this;
	    }
	public TemplateMappingCreate clickDatatypeDropdown1() {
		clickElement(locateElement("xpath", props.getProperty("TemplateMappingCreate.DTDropdown1.Xpath")));
		return this;
	}
	public TemplateMappingCreate selectDatatype1() {
		clickElement(locateElement("xpath", props.getProperty("TemplateMappingCreate.Datatype1.Xpath")));
		return this;
	}
	public TemplateMappingCreate clickMandatory1() {
		clickElement(locateElement("xpath", props.getProperty("TemplateMappingCreate.Mandatory1.Xpath")));
		return this;
	}
	public TemplateMappingCreate enterHeadername1() {
	  	  enterValue(locateElement("xpath", props.getProperty("TemplateMappingCreate.Headername1.Xpath")), props.getProperty("Headername1"));
			return this;
	    }
	public TemplateMappingCreate enterMappingcolumn1() {
	  	  enterValue(locateElement("xpath", props.getProperty("TemplateMappingCreate.Mappingcolumn1.Xpath")), props.getProperty("Mappingcolumn1"));
			return this;
	    }
	public TemplateMappingCreate clickAddrow() {
		clickElement(locateElement("xpath", props.getProperty("TemplateMappingCreate.Addrow.Xpath")));
		return this;
	}
	public TemplateMappingCreate enterName2() {
	  	  enterValue(locateElement("xpath", props.getProperty("TemplateMappingCreate.Name2.Xpath")), props.getProperty("Name2"));
			return this;
	    }
	public TemplateMappingCreate clickDatatypeDropdown2() {
		clickElement(locateElement("xpath", props.getProperty("TemplateMappingCreate.DTDropdown2.Xpath")));
		return this;
	}
	public TemplateMappingCreate selectDatatype2() {
		clickElement(locateElement("xpath", props.getProperty("TemplateMappingCreate.Datatype2.Xpath")));
		return this;
	}
	public TemplateMappingCreate clickMandatory2() {
		clickElement(locateElement("xpath", props.getProperty("TemplateMappingCreate.Mandatory2.Xpath")));
		return this;
	}
	public TemplateMappingCreate enterHeadername2() {
	  	  enterValue(locateElement("xpath", props.getProperty("TemplateMappingCreate.Headername2.Xpath")), props.getProperty("Headername2"));
			return this;
	    }
	public TemplateMappingCreate enterMappingcolumn2() {
	  	  enterValue(locateElement("xpath", props.getProperty("TemplateMappingCreate.Mappingcolumn2.Xpath")), props.getProperty("Mappingcolumn2"));
			return this;
	    }
	public TemplateMappingCreate clickSave() {
		clickElement(locateElement("xpath", props.getProperty("TemplateMappingCreate.Save.Xpath")));
		return this;
	}
	public TemplateMappingCreate clickExit() {
		clickElement(locateElement("xpath", props.getProperty("TemplateMappingCreate.Exit.Xpath")));
		return this;
	}
	
	}
