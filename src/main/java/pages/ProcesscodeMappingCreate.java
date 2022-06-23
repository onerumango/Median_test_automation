package pages;

import base.MedianSpecificMethods;

public class ProcesscodeMappingCreate extends MedianSpecificMethods{
	public ProcesscodeMappingCreate clickExtSysCodeDropdown() {
		wait(3000);
		clickElement(locateElement("xpath", props.getProperty("ProcesscodeMapping.Dropdown.Xpath")));
		return this;
	}
	public ProcesscodeMappingCreate selectExtsysCode() {
		wait(3000);
		clickElement(locateElement("xpath", props.getProperty("ProcesscodeMapping.ExtSysCode.Xpath")));
		return this;
	}

	public ProcesscodeMappingCreate enterProcessCode() {
		wait(3000);
		  enterValue(locateElement("xpath", props.getProperty("ProcesscodeMapping.ProcessCode.Xpath")), props.getProperty("ProcessCode"));
	  		return this;
	      }
	public ProcesscodeMappingCreate enterMaxUploadLimit() {
		wait(3000);
		  enterValue(locateElement("xpath", props.getProperty("ProcesscodeMapping.MaxUploadLimit.Xpath")), props.getProperty("MaximumUploadLimit"));
	  		return this;
	      }
	public ProcesscodeMappingCreate clickSave() {
		wait(3000);
		jsExecutor(locateElement("xpath", props.getProperty("ProcesscodeMapping.Save.Xpath")));
		clickElement(locateElement("xpath", props.getProperty("ProcesscodeMapping.Save.Xpath")));
		wait(3000);
		clickElement(locateElement("xpath", props.getProperty("ProcesscodeMapping.OK.Xpath")));
		
		return this;
	}
	
	}
	
	


