package pages;

import base.MedianSpecificMethods;

public class ProcessCodeMappingEdit extends MedianSpecificMethods{
	public ProcesscodeMapping clickEdit() {
		clickElement(locateElement("xpath", props.getProperty("ProcessCodeMappingEdit.Edit.Xpath")));
		return new ProcesscodeMapping();
	}
	public ProcessCodeMappingEdit enterProcessCode() {
		  enterValue(locateElement("xpath", props.getProperty("ProcessCodeMappingEdit.ProcessCode.Xpath")), props.getProperty("ProcessCode"));
	  		return this;
	      }
	public ProcessCodeMappingEdit enterMaxUploadLimit() {
		  enterValue(locateElement("xpath", props.getProperty("ProcessCodeMappingEdit.MaxUploadLimit.Xpath")), props.getProperty("MaxUploadLimit"));
	  		return this;
	      }
	public ProcessCodeMappingEdit clickSave() {
		clickElement(locateElement("xpath", props.getProperty("ProcessCodeMappingEdit.Save.Xpath")));
		return this;
	}
	
	

}
