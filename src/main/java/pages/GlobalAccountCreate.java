package pages;

import base.MedianSpecificMethods;

public class GlobalAccountCreate extends MedianSpecificMethods{
	public GlobalAccountCreate enterGlCode() {
		  enterValue(locateElement("xpath", props.getProperty("GlobalAccountCreate.GlCode.Xpath")), props.getProperty("GlCode"));
	  		return this;
	      }
	public GlobalAccountCreate enterGlDescription() {
		  enterValue(locateElement("xpath", props.getProperty("GlobalAccountCreate.GlDescription.Xpath")), props.getProperty("GlDescription"));
	  		return this;
	      }
	 public GlobalAccountCreate clickDeptSubmit() {
   	  clickElement(locateElement("xpath", props.getProperty("GlobalAccountCreate.Submit.Xpath")));
   	  return this;
     }
	}
	


