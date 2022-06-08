package pages;

import base.MedianSpecificMethods;

public class GlobalAccountCreate extends MedianSpecificMethods{
	public GlobalAccountCreate enterGlCode() {
		wait(3000);
		  enterValue(locateElement("xpath", props.getProperty("GlobalAccountCreate.GlCode.Xpath")), props.getProperty("GlCode"));
	  		return this;
	      }
	public GlobalAccountCreate enterGlDescription() {
		wait(3000);
		  enterValue(locateElement("xpath", props.getProperty("GlobalAccountCreate.GlDescription.Xpath")), props.getProperty("GlDescription"));
	  		return this;
	      }
	 public GlobalAccountCreate clickSave() {
		 wait(3000);
   	  clickElement(locateElement("xpath", props.getProperty("GlobalAccountCreate.Submit.Xpath")));
   	     wait(3000);
   	  return this;
     }
	}
	


