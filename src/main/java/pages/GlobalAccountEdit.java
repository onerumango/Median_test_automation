package pages;

import base.MedianSpecificMethods;

public class GlobalAccountEdit extends MedianSpecificMethods{

	public GlobalAccountEdit editGLcode() {
		enterValue(locateElement("xpath", props.getProperty("GlobalAccountEdit.EditGlcode.Xpath")), props.getProperty("Glcode"));
  		return this;
      }
	public GlobalAccountEdit clickGLCodeSave() {
	   	  clickElement(locateElement("xpath", props.getProperty("GlobalAccountCreate.Save.Xpath")));
	   	  return this;
	     }
	}

