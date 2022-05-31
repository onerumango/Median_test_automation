package pages;

import java.awt.AWTException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import base.MedianSpecificMethods;

public class MedianAddSystemXML extends MedianSpecificMethods{
	public MedianAddSystemXML enterCode() {
		wait(2000);
		enterValue(locateElement("xpath", props.getProperty("Median.SystemInterface.AddSystem.SystemInformation.CodeXML.Xpath")), props.getProperty("AddSystem.SystemInformation.CodeXML"));
		return this;
	}
	public MedianAddSystemXML enterName() {
		wait(2000);
		enterValue(locateElement("xpath", props.getProperty("Median.SystemInterface.AddSystem.SystemInformation.Name.Xpath")), props.getProperty("AddSystem.SystemInformation.Code"));
		return this;
	}
	public MedianAddSystemXML selectType() {
		wait(2000);
		clickElement(locateElement("xpath", props.getProperty("Median.SystemInterface.AddSystem.SystemInformation.Type.Xpath")));
	    clickElement(locateElement("xpath", props.getProperty("Median.SystemInterface.AddSystem.SystemInformation.TypeSelect.Xpath")));
	  	  return this;
	 }
	public MedianAddSystemXML selectMessageType() {
		wait(2000);
		clickElement(locateElement("xpath", props.getProperty("Median.SystemInterface.AddSystem.SystemInformation.MessageType.Xpath")));
	  	clickElement(locateElement("xpath", props.getProperty("Median.SystemInterface.AddSystem.SystemInformation.MessageTypeSelect.Xpath")));
	  	  return this;
	    }
	public MedianAddSystemXML enterExternalIP() {
		wait(2000);
		enterValue(locateElement("xpath", props.getProperty("Median.SystemInterface.AddSystem.SystemInformation.ExternalIP.Xpath")), props.getProperty("AddSystem.SystemInformation.ExternalIP"));
		return this;
	}
	public MedianAddSystemXML enterExternalPort() {
		wait(2000);
		enterValue(locateElement("xpath", props.getProperty("Median.SystemInterface.AddSystem.SystemInformation.ExternalPort.Xpath")), props.getProperty("AddSystem.SystemInformation.ExternalPort"));
		return this;
	}
	public MedianAddSystemXML enterExternalURI() {
		wait(2000);
		enterValue(locateElement("xpath", props.getProperty("Median.SystemInterface.AddSystem.SystemInformation.ExternalURI.Xpath")), props.getProperty("AddSystem.SystemInformation.ExternalURI"));
		return this;
	}
	public MedianAddSystemXML enterMedianIP() {
		wait(2000);
		enterValue(locateElement("xpath", props.getProperty("Median.SystemInterface.AddSystem.SystemInformation.MedianIP.Xpath")), props.getProperty("AddSystem.SystemInformation.MedianIP"));
		return this;
	}
	public MedianAddSystemXML enterMedianPort() {
		wait(2000);
		enterValue(locateElement("xpath", props.getProperty("Median.SystemInterface.AddSystem.SystemInformation.MedianPort.Xpath")), props.getProperty("AddSystem.SystemInformation.MedianPort"));
		return this;
	}
	public MedianAddSystemXML enterMedianURI() {
		wait(2000);
		enterValue(locateElement("xpath", props.getProperty("Median.SystemInterface.AddSystem.SystemInformation.MedianURI.Xpath")), props.getProperty("AddSystem.SystemInformation.MedianURI"));
		return this;
	}
	
	public MedianAddSystemXML clickNextSystemInformation() {
		wait(2000);
		clickElement(locateElement("xpath", props.getProperty("Median.SystemInterface.AddSystem.SystemInformation.Next.Xpath")));
	  	 return this;
	    }
	public MedianAddSystemXML selectMessageProtocol() {
		wait(2000);
		clickElement(locateElement("xpath", props.getProperty("Median.SystemInterface.AddSystem.MessageConfiguration.XMLMessageProtocol.Xpath")));
	    clickElement(locateElement("xpath", props.getProperty("Median.SystemInterface.AddSystem.MessageConfiguration.XMLMessageProtocolSelectHTTPS.Xpath")));
	  	  return this;
	}
	public MedianAddSystemXML selectDataType() {
		wait(2000);
		clickElement(locateElement("xpath", props.getProperty("Median.SystemInterface.AddSystem.MessageConfiguration.XMLDataType.Xpath")));
	    clickElement(locateElement("xpath", props.getProperty("Median.SystemInterface.AddSystem.MessageConfiguration.XMLDataTypeSelectXML.Xpath")));
	  	  return this;
	}
	public MedianAddSystemXML clickNextMessageConfiguration() {
		wait(2000);
		clickElement(locateElement("xpath", props.getProperty("Median.SystemInterface.AddSystem.MessageConfiguration.Next.Xpath")));
		wait(2000); 
		return this;
	    }
	
	public MedianAddSystemXML uploadXMLFile() throws AWTException {
		Actions action = new Actions(driver);
		WebElement chooseFile = locateElement("xpath",props.getProperty("Median.SystemInterface.AddSystem.Header&ServiceDetails.XMLFileUpload.Xpath"));
		action.moveToElement(chooseFile).click().perform();
		wait(2000);
		uploadFile("C:\\Users\\NPR11007\\Desktop\\Median\\Request.xml");
		wait(10000);
		return this;
	}
	public MedianAddSystemXML clickOKButtonXMLFile() {
		wait(2000);
		clickElement(locateElement("xpath", props.getProperty("Median.SystemInterface.AddSystem.Header&ServiceDetails.XMLFileUpload.OKButton.Xpath")));
		wait(2000); 
		return this;
	    }
	public MedianAddSystemXML selectHeader1() {
		wait(2000);
		clickElement(locateElement("xpath", props.getProperty("Median.SystemInterface.AddSystem.Header&ServiceDetails.XMLHeader1.Xpath")));
	    clickElement(locateElement("xpath", props.getProperty("Median.SystemInterface.AddSystem.Header&ServiceDetails.XMLHeader1SelectService.Xpath")));
	  	  return this;
	}
	public MedianAddSystemXML selectTag1() {
		wait(2000);
		clickElement(locateElement("xpath", props.getProperty("Median.SystemInterface.AddSystem.Header&ServiceDetails.XMLTag1.Xpath")));
	    clickElement(locateElement("xpath", props.getProperty("Median.SystemInterface.AddSystem.Header&ServiceDetails.XMLTag1Select.Xpath")));
	  	  return this;
	}
	public MedianAddSystemXML selectDataType1() {
		wait(2000);
		clickElement(locateElement("xpath", props.getProperty("Median.SystemInterface.AddSystem.Header&ServiceDetails.XMLDataType1.Xpath")));
	    clickElement(locateElement("xpath", props.getProperty("Median.SystemInterface.AddSystem.Header&ServiceDetails.XMLSelectDataType1.Xpath")));
	  	  return this;
	}
	
	public MedianAddSystemXML clickPlusButton() {
		wait(2000);
		clickElement(locateElement("xpath", props.getProperty("Median.SystemInterface.AddSystem.Header&ServiceDetails.PlusButton.Xpath")));
	    return this;
	}
	public MedianAddSystemXML selectHeader2() {
		wait(2000);
		clickElement(locateElement("xpath", props.getProperty("Median.SystemInterface.AddSystem.Header&ServiceDetails.XMLHeader2.Xpath")));
	    clickElement(locateElement("xpath", props.getProperty("Median.SystemInterface.AddSystem.Header&ServiceDetails.XMLHeader2SelectOperation.Xpath")));
	  	  return this;
	}
	public MedianAddSystemXML selectTag2() {
		wait(2000);
		clickElement(locateElement("xpath", props.getProperty("Median.SystemInterface.AddSystem.Header&ServiceDetails.XMLTag2.Xpath")));
	    clickElement(locateElement("xpath", props.getProperty("Median.SystemInterface.AddSystem.Header&ServiceDetails.XMLTag2Select.Xpath")));
	  	  return this;
	}
	public MedianAddSystemXML selectDataType2() {
		wait(2000);
		clickElement(locateElement("xpath", props.getProperty("Median.SystemInterface.AddSystem.Header&ServiceDetails.XMLDataType2.Xpath")));
	    clickElement(locateElement("xpath", props.getProperty("Median.SystemInterface.AddSystem.Header&ServiceDetails.XMLSelectDataType2.Xpath")));
	  	  return this;
	}
	
	public MedianAddSystemXML clickSaveServiceAndHeader() {
		wait(2000);
		clickElement(locateElement("xpath", props.getProperty("Median.SystemInterface.AddSystem.Header&ServiceDetails.Save.Xpath")));
	  	 return this;
	    }
	public MedianAddSystemXML clickOKServiceAndHeader() {
		wait(2000);
	  	clickElement(locateElement("xpath", props.getProperty("Median.SystemInterface.AddSystem.Header&ServiceDetails.OK.Xpath")));
	  	wait(5000);
	  	return this;
	    }
	
	  
}
