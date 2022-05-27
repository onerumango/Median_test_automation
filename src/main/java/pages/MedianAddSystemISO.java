package pages;

import base.MedianSpecificMethods;


public class MedianAddSystemISO extends MedianSpecificMethods{
	
	public MedianAddSystemISO enterCode() {
		wait(2000);
		enterValue(locateElement("xpath", props.getProperty("Median.SystemInterface.AddSystem.SystemInformation.CodeISO.Xpath")), props.getProperty("AddSystem.SystemInformation.CodeISO"));
		return this;
	}
	public MedianAddSystemISO enterName() {
		wait(2000);
		enterValue(locateElement("xpath", props.getProperty("Median.SystemInterface.AddSystem.SystemInformation.Name.Xpath")), props.getProperty("AddSystem.SystemInformation.Code"));
		return this;
	}
	public MedianAddSystemISO selectType() {
		wait(2000);
		clickElement(locateElement("xpath", props.getProperty("Median.SystemInterface.AddSystem.SystemInformation.Type.Xpath")));
	    clickElement(locateElement("xpath", props.getProperty("Median.SystemInterface.AddSystem.SystemInformation.TypeSelect.Xpath")));
	  	  return this;
	 }
	public MedianAddSystemISO selectMessageType() {
		wait(2000);
		clickElement(locateElement("xpath", props.getProperty("Median.SystemInterface.AddSystem.SystemInformation.MessageType.Xpath")));
	  	clickElement(locateElement("xpath", props.getProperty("Median.SystemInterface.AddSystem.SystemInformation.MessageTypeSelect.Xpath")));
	  	  return this;
	    }
	public MedianAddSystemISO enterExternalIP() {
		wait(2000);
		enterValue(locateElement("xpath", props.getProperty("Median.SystemInterface.AddSystem.SystemInformation.ExternalIP.Xpath")), props.getProperty("AddSystem.SystemInformation.ExternalIP"));
		return this;
	}
	public MedianAddSystemISO enterExternalPort() {
		wait(2000);
		enterValue(locateElement("xpath", props.getProperty("Median.SystemInterface.AddSystem.SystemInformation.ExternalPort.Xpath")), props.getProperty("AddSystem.SystemInformation.ExternalPort"));
		return this;
	}
	public MedianAddSystemISO enterMedianIP() {
		wait(2000);
		enterValue(locateElement("xpath", props.getProperty("Median.SystemInterface.AddSystem.SystemInformation.MedianIP.Xpath")), props.getProperty("AddSystem.SystemInformation.MedianIP"));
		return this;
	}
	public MedianAddSystemISO enterMedianPort() {
		wait(2000);
		enterValue(locateElement("xpath", props.getProperty("Median.SystemInterface.AddSystem.SystemInformation.ExternalPort.Xpath")), props.getProperty("AddSystem.SystemInformation.MedianPort"));
		return this;
	}
	public MedianAddSystemISO enterMedianURI() {
		wait(2000);
		enterValue(locateElement("xpath", props.getProperty("Median.SystemInterface.AddSystem.SystemInformation.MedianURI.Xpath")), props.getProperty("AddSystem.SystemInformation.MedianURI"));
		return this;
	}
	public MedianAddSystemISO enterExternalURI() {
		wait(2000);
		enterValue(locateElement("xpath", props.getProperty("Median.SystemInterface.AddSystem.SystemInformation.ExternalURI.Xpath")), props.getProperty("AddSystem.SystemInformation.ExternalURI"));
		return this;
	}
	public MedianAddSystemISO clickNextSystemInformation() {
		wait(2000);
		clickElement(locateElement("xpath", props.getProperty("Median.SystemInterface.AddSystem.SystemInformation.Next.Xpath")));
	  	 return this;
	    }
	public MedianAddSystemISO selectMessageProtocol() {
		wait(2000);
		clickElement(locateElement("xpath", props.getProperty("Median.SystemInterface.AddSystem.MessageConfiguration.ISOMessageProtocol.Xpath")));
	    clickElement(locateElement("xpath", props.getProperty("Median.SystemInterface.AddSystem.MessageConfiguration.ISOMessageProtocolSelectTCP/IP.Xpath")));
	  	  return this;
	}
	public MedianAddSystemISO selectDataType() {
		wait(2000);
		clickElement(locateElement("xpath", props.getProperty("Median.SystemInterface.AddSystem.MessageConfiguration.ISODataType.Xpath")));
	    clickElement(locateElement("xpath", props.getProperty("Median.SystemInterface.AddSystem.MessageConfiguration.ISODataTypeSelectISO.Xpath")));
	  	  return this;
	}
	public MedianAddSystemISO clickNextMessageConfiguration() {
		wait(2000);
		clickElement(locateElement("xpath", props.getProperty("Median.SystemInterface.AddSystem.MessageConfiguration.Next.Xpath")));
	  	 return this;
	    }
	public MedianAddSystemISO selectHeader1() {
		wait(2000);
		clickElement(locateElement("xpath", props.getProperty("Median.SystemInterface.AddSystem.Header&ServiceDetails.ISOHeader1.Xpath")));
	    clickElement(locateElement("xpath", props.getProperty("Median.SystemInterface.AddSystem.Header&ServiceDetails.ISOHeader1SelectService.Xpath")));
	  	  return this;
	}
	public MedianAddSystemISO selectFieldNo1() {
		wait(2000);
		clickElement(locateElement("xpath", props.getProperty("Median.SystemInterface.AddSystem.Header&ServiceDetails.ISOFieldNo1.Xpath")));
	    clickElement(locateElement("xpath", props.getProperty("Median.SystemInterface.AddSystem.Header&ServiceDetails.ISOFieldNo1Select.Xpath")));
	  	  return this;
	}
	public MedianAddSystemISO enterDefaultValue1() {
		wait(2000);
		enterValue(locateElement("xpath", props.getProperty("Median.SystemInterface.AddSystem.Header&ServiceDetails.ISODefaultValue1.Xpath")), props.getProperty("AddSystem.Header&ServiceDetails.ISODefaultValue1"));
		return this;
	}
	public MedianAddSystemISO clickPlusButton() {
		wait(2000);
		clickElement(locateElement("xpath", props.getProperty("Median.SystemInterface.AddSystem.Header&ServiceDetails.PlusButton.Xpath")));
	    return this;
	}
	public MedianAddSystemISO selectHeader2() {
		wait(2000);
		clickElement(locateElement("xpath", props.getProperty("Median.SystemInterface.AddSystem.Header&ServiceDetails.ISOHeader2.Xpath")));
	    clickElement(locateElement("xpath", props.getProperty("Median.SystemInterface.AddSystem.Header&ServiceDetails.ISOHeader2SelectOperation.Xpath")));
	  	  return this;
	}
	public MedianAddSystemISO selectFieldNo2() {
		wait(2000);
		clickElement(locateElement("xpath", props.getProperty("Median.SystemInterface.AddSystem.Header&ServiceDetails.ISOFieldNo2.Xpath")));
	    clickElement(locateElement("xpath", props.getProperty("Median.SystemInterface.AddSystem.Header&ServiceDetails.ISOFieldNo2Select.Xpath")));
	  	  return this;
	}
	public MedianAddSystemISO enterDefaultValue2() {
		wait(2000);
		enterValue(locateElement("xpath", props.getProperty("Median.SystemInterface.AddSystem.Header&ServiceDetails.ISODefaultValue2.Xpath=")), props.getProperty("AddSystem.Header&ServiceDetails.ISODefaultValue2"));
		return this;
	}
	public MedianAddSystemISO clickSaveServiceAndHeader() {
		wait(2000);
		clickElement(locateElement("xpath", props.getProperty("Median.SystemInterface.AddSystem.Header&ServiceDetails.Save.Xpath")));
	  	 return this;
	    }
	public MedianAddSystemISO clickOKServiceAndHeader() {
		wait(2000);
	  	clickElement(locateElement("xpath", props.getProperty("Median.SystemInterface.AddSystem.Header&ServiceDetails.OK.Xpath")));
	  	 return this;
	    }
	}
