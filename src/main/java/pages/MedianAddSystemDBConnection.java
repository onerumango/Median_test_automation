package pages;

import base.MedianSpecificMethods;

public class MedianAddSystemDBConnection extends MedianSpecificMethods {
	
	public MedianAddSystemDBConnection enterCode() {
		wait(2000);
		enterValue(locateElement("xpath", props.getProperty("Median.SystemInterface.AddSystem.SystemInformation.CodeISO.Xpath")), props.getProperty("AddSystem.SystemInformation.CodeISO"));
		return this;
	}
	public MedianAddSystemDBConnection enterName() {
		wait(2000);
		enterValue(locateElement("xpath", props.getProperty("Median.SystemInterface.AddSystem.SystemInformation.Name.Xpath")), props.getProperty("AddSystem.SystemInformation.Code"));
		return this;
	}
	public MedianAddSystemDBConnection selectType() {
		wait(2000);
		clickElement(locateElement("xpath", props.getProperty("Median.SystemInterface.AddSystem.SystemInformation.Type.Xpath")));
	    clickElement(locateElement("xpath", props.getProperty("Median.SystemInterface.AddSystem.SystemInformation.TypeSelect.Xpath")));
	  	  return this;
	 }
	public MedianAddSystemDBConnection selectMessageType() {
		wait(2000);
		clickElement(locateElement("xpath", props.getProperty("Median.SystemInterface.AddSystem.SystemInformation.MessageType.Xpath")));
	  	clickElement(locateElement("xpath", props.getProperty("Median.SystemInterface.AddSystem.SystemInformation.MessageTypeSelect.Xpath")));
	  	  return this;
	    }
	public MedianAddSystemDBConnection enterExternalIP() {
		wait(2000);
		enterValue(locateElement("xpath", props.getProperty("Median.SystemInterface.AddSystem.SystemInformation.ExternalIP.Xpath")), props.getProperty("AddSystem.SystemInformation.ExternalIP"));
		return this;
	}
	public MedianAddSystemDBConnection enterExternalPort() {
		wait(2000);
		enterValue(locateElement("xpath", props.getProperty("Median.SystemInterface.AddSystem.SystemInformation.ExternalPort.Xpath")), props.getProperty("AddSystem.SystemInformation.ExternalPort"));
		return this;
	}
	public MedianAddSystemDBConnection enterExternalURI() {
		wait(2000);
		enterValue(locateElement("xpath", props.getProperty("Median.SystemInterface.AddSystem.SystemInformation.ExternalURI.Xpath")), props.getProperty("AddSystem.SystemInformation.ExternalURI"));
		return this;
	}
	public MedianAddSystemDBConnection enterMedianIP() {
		wait(2000);
		enterValue(locateElement("xpath", props.getProperty("Median.SystemInterface.AddSystem.SystemInformation.MedianIP.Xpath")), props.getProperty("AddSystem.SystemInformation.MedianIP"));
		return this;
	}
	public MedianAddSystemDBConnection enterMedianPort() {
		wait(2000);
		enterValue(locateElement("xpath", props.getProperty("Median.SystemInterface.AddSystem.SystemInformation.MedianPort.Xpath")), props.getProperty("AddSystem.SystemInformation.MedianPort"));
		return this;
	}
	public MedianAddSystemDBConnection enterMedianURI() {
		wait(2000);
		enterValue(locateElement("xpath", props.getProperty("Median.SystemInterface.AddSystem.SystemInformation.MedianURI.Xpath")), props.getProperty("AddSystem.SystemInformation.MedianURI"));
		return this;
	}
	
	public MedianAddSystemDBConnection clickNextSystemInformation() {
		wait(2000);
		clickElement(locateElement("xpath", props.getProperty("Median.SystemInterface.AddSystem.SystemInformation.Next.Xpath")));
	  	 return this;
	    }
	public MedianAddSystemDBConnection selectMessageProtocol() {
		wait(2000);
		clickElement(locateElement("xpath", props.getProperty("Median.SystemInterface.AddSystem.MessageConfiguration.ISOMessageProtocol.Xpath")));
	    clickElement(locateElement("xpath", props.getProperty("Median.SystemInterface.AddSystem.MessageConfiguration.ISOMessageProtocolSelectTCP/IP.Xpath")));
	  	  return this;
	}
	public MedianAddSystemDBConnection selectDataType() {
		wait(2000);
		clickElement(locateElement("xpath", props.getProperty("Median.SystemInterface.AddSystem.MessageConfiguration.ISODataType.Xpath")));
	    clickElement(locateElement("xpath", props.getProperty("Median.SystemInterface.AddSystem.MessageConfiguration.ISODataTypeSelectISO.Xpath")));
	  	  return this;
	}
	public MedianAddSystemDBConnection clickNextMessageConfiguration() {
		wait(2000);
		clickElement(locateElement("xpath", props.getProperty("Median.SystemInterface.AddSystem.MessageConfiguration.Next.Xpath")));
	  	 return this;
	    }
	public MedianAddSystemDBConnection selectHeader1() {
		wait(2000);
		clickElement(locateElement("xpath", props.getProperty("Median.SystemInterface.AddSystem.Header&ServiceDetails.ISOHeader1.Xpath")));
	    clickElement(locateElement("xpath", props.getProperty("Median.SystemInterface.AddSystem.Header&ServiceDetails.ISOHeader1SelectService.Xpath")));
	  	  return this;
	}
	public MedianAddSystemDBConnection selectFieldNo1() {
		wait(2000);
		clickElement(locateElement("xpath", props.getProperty("Median.SystemInterface.AddSystem.Header&ServiceDetails.ISOFieldNo1.Xpath")));
	    clickElement(locateElement("xpath", props.getProperty("Median.SystemInterface.AddSystem.Header&ServiceDetails.ISOFieldNo1Select.Xpath")));
	  	  return this;
	}
	public MedianAddSystemDBConnection selectDataType1() {
		wait(2000);
		clickElement(locateElement("xpath", props.getProperty("Median.SystemInterface.AddSystem.Header&ServiceDetails.DataType1.Xpath")));
	    clickElement(locateElement("xpath", props.getProperty("Median.SystemInterface.AddSystem.Header&ServiceDetails.SelectDataType1.Xpath")));
	  	  return this;
	}
	public MedianAddSystemDBConnection enterDefaultValue1() {
		wait(2000);
		enterValue(locateElement("xpath", props.getProperty("Median.SystemInterface.AddSystem.Header&ServiceDetails.ISODefaultValue1.Xpath")), props.getProperty("AddSystem.Header&ServiceDetails.ISODefaultValue1"));
		return this;
	}
	public MedianAddSystemDBConnection clickPlusButton() {
		wait(2000);
		clickElement(locateElement("xpath", props.getProperty("Median.SystemInterface.AddSystem.Header&ServiceDetails.PlusButton.Xpath")));
	    return this;
	}
	public MedianAddSystemDBConnection selectHeader2() {
		wait(2000);
		clickElement(locateElement("xpath", props.getProperty("Median.SystemInterface.AddSystem.Header&ServiceDetails.ISOHeader2.Xpath")));
	    clickElement(locateElement("xpath", props.getProperty("Median.SystemInterface.AddSystem.Header&ServiceDetails.ISOHeader2SelectOperation.Xpath")));
	  	  return this;
	}
	public MedianAddSystemDBConnection selectFieldNo2() {
		wait(2000);
		clickElement(locateElement("xpath", props.getProperty("Median.SystemInterface.AddSystem.Header&ServiceDetails.ISOFieldNo2.Xpath")));
	    clickElement(locateElement("xpath", props.getProperty("Median.SystemInterface.AddSystem.Header&ServiceDetails.ISOFieldNo2Select.Xpath")));
	  	  return this;
	}
	public MedianAddSystemDBConnection selectDataType2() {
		wait(2000);
		clickElement(locateElement("xpath", props.getProperty("Median.SystemInterface.AddSystem.Header&ServiceDetails.DataType2.Xpath")));
	    clickElement(locateElement("xpath", props.getProperty("Median.SystemInterface.AddSystem.Header&ServiceDetails.SelectDataType2.Xpath")));
	  	  return this;
	}
	public MedianAddSystemDBConnection enterDefaultValue2() {
		wait(2000);
		enterValue(locateElement("xpath", props.getProperty("Median.SystemInterface.AddSystem.Header&ServiceDetails.ISODefaultValue2.Xpath")), props.getProperty("AddSystem.Header&ServiceDetails.ISODefaultValue2"));
		return this;
	}
	public MedianAddSystemDBConnection clickSaveServiceAndHeader() {
		wait(2000);
		clickElement(locateElement("xpath", props.getProperty("Median.SystemInterface.AddSystem.Header&ServiceDetails.Save.Xpath")));
	  	 return this;
	    }
	public MedianAddSystemDBConnection clickOKServiceAndHeader() {
		wait(2000);
	  	clickElement(locateElement("xpath", props.getProperty("Median.SystemInterface.AddSystem.Header&ServiceDetails.OK.Xpath")));
	  	wait(5000);
	  	return this;
	    }

}
