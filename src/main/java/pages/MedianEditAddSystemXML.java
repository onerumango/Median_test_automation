package pages;

import base.MedianSpecificMethods;


public class MedianEditAddSystemXML extends MedianSpecificMethods{
	
	public MedianEditAddSystemXML clickEdit() {
		wait(2000);
		 jsExecutor(locateElement("xpath", props.getProperty("Median.EditSystemXML.SystemInformation.Edit.Xpath")));
		 wait(2000);
		clickElement(locateElement("xpath", props.getProperty("Median.EditSystemXML.SystemInformation.Edit.Xpath")));
	  	 return this;
	    }
	public MedianEditAddSystemXML clickAuth() {
		wait(2000);
		 jsExecutor(locateElement("xpath", props.getProperty("Median.EditSystemXML.SystemInformation.Auth.Xpath")));
		 wait(2000);
		clickElement(locateElement("xpath", props.getProperty("Median.EditSystemXML.SystemInformation.Auth.Xpath")));
	  	 return this;
	    }
	
	public MedianEditAddSystemXML clickYes() {
		 wait(2000);
		clickElement(locateElement("xpath", props.getProperty("Median.EditSystemXML.SystemInformation.YES.Xpath")));
	  	 return this;
	    }
	public MedianEditAddSystemXML clickOK() {
		 wait(2000);
		clickElement(locateElement("xpath", props.getProperty("Median.EditSystemXML.SystemInformation.OK.Xpath")));
	  	 return this;
	    }
	
	public MedianEditAddSystemXML UpdateExternalURI() {
		wait(2000);
		clearElement(locateElement("xpath", props.getProperty("Median.EditSystemXML.SystemInformation.ClearExternalURI.Xpath")));
		wait(2000);
		enterValue(locateElement("xpath", props.getProperty("Median.EditSystemXML.SystemInformation.ClearExternalURI.Xpath")), props.getProperty("NewURI"));
		return this;
	}
	
	public MedianEditAddSystemXML clickNextSystemInformation() {
		wait(2000);
		clickElement(locateElement("xpath", props.getProperty("Median.SystemInterface.AddSystem.SystemInformation.Next.Xpath")));
	  	 return this;
	    }
	public MedianEditAddSystemXML clickNextMessageConfiguration() {
		wait(2000);
		clickElement(locateElement("xpath", props.getProperty("Median.SystemInterface.AddSystem.MessageConfiguration.Next.Xpath")));
		wait(2000); 
		return this;
	    }
	
	public MedianEditAddSystemXML clickSaveServiceAndHeader() {
		wait(2000);
		clickElement(locateElement("xpath", props.getProperty("Median.SystemInterface.AddSystem.Header&ServiceDetails.Save.Xpath")));
	  	 return this;
	    }
	public MedianEditAddSystemXML clickOKServiceAndHeader() {
		wait(2000);
	  	clickElement(locateElement("xpath", props.getProperty("Median.SystemInterface.AddSystem.Header&ServiceDetails.OK.Xpath")));
	  	wait(5000);
	  	return this;
	    }
	
}