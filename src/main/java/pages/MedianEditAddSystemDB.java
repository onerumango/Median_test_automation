package pages;

import base.MedianSpecificMethods;


public class MedianEditAddSystemDB extends MedianSpecificMethods{
	
	public MedianEditAddSystemDB clickEdit() {
		wait(2000);
		clickElement(locateElement("xpath", props.getProperty("Median.SystemInterface.AddSystem.SystemInformation.Edit.Xpath")));
	  	 return this;
	    }
	
	public MedianEditAddSystemDB enterCode() {
		wait(2000);
		enterValue(locateElement("xpath", props.getProperty("Median.SystemInterface.AddSystem.SystemInformation.EditCode.Xpath")), props.getProperty("EditCodeDB"));
		return this;
	}
	
	public MedianEditAddSystemDB clickNext1() {
		wait(2000);
		clickElement(locateElement("xpath", props.getProperty("Median.SystemInterface.AddSystem.SystemInformation.Edit.Next.Xpath")));
	  	 return this;
	    }
	public MedianEditAddSystemDB clickNext2() {
		wait(2000);
		clickElement(locateElement("xpath", props.getProperty("Median.SystemInterface.AddSystem.SystemInformation.Edit.Next.Xpath")));
	  	 return this;
	    }
	
	public MedianEditAddSystemDB clickSave() {
		wait(2000);
		clickElement(locateElement("xpath", props.getProperty("Median.SystemInterface.AddSystem.SystemInformation.Edit.Save.Xpath")));
	  	 return this;
	    }
	public MedianEditAddSystemDB clickOK() {
		wait(2000);
	  	clickElement(locateElement("xpath", props.getProperty("Median.SystemInterface.AddSystem.SystemInformation.Edit.OK.Xpath")));
	  	wait(5000);
	  	return this;
	    }
}