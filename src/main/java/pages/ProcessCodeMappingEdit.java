package pages;

import base.MedianSpecificMethods;

public class ProcessCodeMappingEdit extends MedianSpecificMethods{
	public ProcessCodeMappingEdit clickEdit() {
		wait(2000);
		jsExecutor(locateElement("xpath", props.getProperty("ProcessCodeMappingEdit.Edit.Xpath")));
		wait(1000);
		clickElement(locateElement("xpath", props.getProperty("ProcessCodeMappingEdit.Edit.Xpath")));
		return this;
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
		wait(1000);
		jsExecutor(locateElement("xpath", props.getProperty("ProcessCodeMappingEdit.Save.Xpath")));
		wait(1000);
		clickElement(locateElement("xpath", props.getProperty("ProcessCodeMappingEdit.Save.Xpath")));
		wait(1000);
		clickElement(locateElement("xpath", props.getProperty("ProcessCodeMappingEdit.OK.Xpath")));
		return this;
	}
	
	

}
