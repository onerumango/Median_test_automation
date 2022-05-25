package pages;

import base.MedianSpecificMethods;

public class ProcesscodeMapping extends MedianSpecificMethods{
	public ProcesscodeMapping clickExtSysCodeDropdown() {
		clickElement(locateElement("xpath", props.getProperty("ProcesscodeMapping.Dropdown.Xpath")));
		return this;
	}
	public ProcesscodeMapping selectExtsysCode() {
		clickElement(locateElement("xpath", props.getProperty("ProcesscodeMapping.ExtSysCode.Xpath")));
		return this;
	}
	public ProcesscodeMapping enterExtSysName() {
		  enterValue(locateElement("xpath", props.getProperty("ProcesscodeMapping.ExtSysName.Xpath")), props.getProperty("ExtSysName"));
	  		return this;
	      }
	public ProcesscodeMapping enterProcessCode() {
		  enterValue(locateElement("xpath", props.getProperty("ProcesscodeMapping.ProcessCode.Xpath")), props.getProperty("ProcessCode"));
	  		return this;
	      }
	public ProcesscodeMapping enterMaxUploadLimit() {
		  enterValue(locateElement("xpath", props.getProperty("ProcesscodeMapping.MaxUploadLimit.Xpath")), props.getProperty("MaxUploadLimit"));
	  		return this;
	      }
	public ProcesscodeMapping clickSave() {
		clickElement(locateElement("xpath", props.getProperty("ProcesscodeMapping.Save.Xpath")));
		return this;
	}
	
	}
	
	


