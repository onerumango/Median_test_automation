package pages;

import base.MedianSpecificMethods;

public class MedianAddSystemJSON extends MedianSpecificMethods {

	public MedianAddSystemJSON enterCode() {
		wait(2000);
		enterValue(
				locateElement("xpath",
						props.getProperty("Median.SystemInterface.AddSystem.SystemInformation.CodeJSON.Xpath")),
				props.getProperty("CodeJSON"));
		return this;
	}

	public MedianAddSystemJSON enterName() {
		wait(2000);
		enterValue(
				locateElement("xpath",
						props.getProperty("Median.SystemInterface.AddSystem.SystemInformation.Name.Xpath")),
				props.getProperty("CodeName"));
		return this;
	}

	public MedianAddSystemJSON selectType() {
		wait(2000);
		clickElement(locateElement("xpath",
				props.getProperty("Median.SystemInterface.AddSystem.SystemInformation.Type.Xpath")));
		clickElement(locateElement("xpath",
				props.getProperty("Median.SystemInterface.AddSystem.SystemInformation.TypeSelect.Xpath")));
		return this;
	}

	public MedianAddSystemJSON selectMessageType() {
		wait(2000);
		clickElement(locateElement("xpath",
				props.getProperty("Median.SystemInterface.AddSystem.SystemInformation.MessageType.Xpath")));
		clickElement(locateElement("xpath",
				props.getProperty("Median.SystemInterface.AddSystem.SystemInformation.MessageTypeSelect.Xpath")));
		return this;
	}

	public MedianAddSystemJSON enterExternalIP() {
		wait(2000);
		enterValue(
				locateElement("xpath",
						props.getProperty("Median.SystemInterface.AddSystem.SystemInformation.ExternalIP.Xpath")),
				props.getProperty("AddSystem.SystemInformation.ExternalIP"));
		return this;
	}

	public MedianAddSystemJSON enterExternalPort() {
		wait(2000);
		enterValue(
				locateElement("xpath",
						props.getProperty("Median.SystemInterface.AddSystem.SystemInformation.ExternalPort.Xpath")),
				props.getProperty("AddSystem.SystemInformation.ExternalPort"));
		return this;
	}

	public MedianAddSystemJSON enterExternalURI() {
		wait(2000);
		enterValue(
				locateElement("xpath",
						props.getProperty("Median.SystemInterface.AddSystem.SystemInformation.ExternalURI.Xpath")),
				props.getProperty("AddSystem.SystemInformation.ExternalURI"));
		return this;
	}

	public MedianAddSystemJSON enterMedianIP() {
		wait(2000);
		enterValue(
				locateElement("xpath",
						props.getProperty("Median.SystemInterface.AddSystem.SystemInformation.MedianIP.Xpath")),
				props.getProperty("AddSystem.SystemInformation.MedianIP"));
		return this;
	}

	public MedianAddSystemJSON enterMedianPort() {
		wait(2000);
		enterValue(
				locateElement("xpath",
						props.getProperty("Median.SystemInterface.AddSystem.SystemInformation.MedianPort.Xpath")),
				props.getProperty("AddSystem.SystemInformation.MedianPort"));
		return this;
	}

	public MedianAddSystemJSON enterMedianURI() {
		wait(2000);
		enterValue(
				locateElement("xpath",
						props.getProperty("Median.SystemInterface.AddSystem.SystemInformation.MedianURI.Xpath")),
				props.getProperty("AddSystem.SystemInformation.MedianURI"));
		return this;
	}

	public MedianAddSystemJSON clickNextSystemInformation() {
		wait(2000);
		clickElement(locateElement("xpath",
				props.getProperty("Median.SystemInterface.AddSystem.SystemInformation.Next.Xpath")));
		return this;
	}

	public MedianAddSystemJSON selectMessageProtocol() {
		wait(2000);
		clickElement(locateElement("xpath", props.getProperty("Median.SystemInterface.AddSystem.MessageConfiguration.JSONMessageProtocol.Xpath")));
	    clickElement(locateElement("xpath", props.getProperty("Median.SystemInterface.AddSystem.MessageConfiguration.JSONMessageProtocolSelectHTTPS.Xpath")));
	  	  return this;
	}
	public MedianAddSystemJSON selectDataType() {
		wait(2000);
		clickElement(locateElement("xpath", props.getProperty("Median.SystemInterface.AddSystem.MessageConfiguration.JSONDataType.Xpath")));
	    clickElement(locateElement("xpath", props.getProperty("Median.SystemInterface.AddSystem.MessageConfiguration.JSONDataTypeSelectXML.Xpath")));
	  	  return this;
	}
	public MedianAddSystemJSON clickNextMessageConfiguration() {
		wait(2000);
		clickElement(locateElement("xpath", props.getProperty("Median.SystemInterface.AddSystem.MessageConfiguration.Next.Xpath")));
		wait(2000); 
		return this;
	    }

	

	public MedianAddSystemJSON headerService() {
		clickElement(locateElement("xpath",
				props.getProperty("Median.SystemInterface.AddSystem.Header&ServiceDetails.JSONHeader1.Xpath")));
		wait(2000);
		clickElement(locateElement("xpath",
				props.getProperty("Median.SystemInterface.AddSystem.Header&ServiceDetails.JSONHeader1SelectService.Xpath")));
		wait(2000);
		return this;
	}

	public MedianAddSystemJSON keyValueService() {
		wait(2000);
		enterValue(
				locateElement("xpath",
						props.getProperty("Median.SystemInterface.AddSystem.Header&ServiceDetails.Key1.Xpath")),
				props.getProperty("KeyValueService"));
		return this;
	}

	public MedianAddSystemJSON dataTypeNumeric() {
		selectByIndex(locateElement("xpath",
				props.getProperty("Median.SystemInterface.AddSystem.Header&ServiceDetails.DataTypeNumeric.Xpath")), 0);
		wait(10000);
		return this;
	}

	public MedianAddSystemJSON defaultValueService() {
		wait(2000);
		enterValue(
				locateElement("xpath",
						props.getProperty(
								"Median.SystemInterface.AddSystem.Header&ServiceDetails.DefaultValueService.Xpath")),
				props.getProperty("DafaultValueService"));
		return this;
	}

	public MedianAddSystemJSON encriptionTypeBase64() {
		selectByIndex(
				locateElement("xpath",
						props.getProperty(
								"Median.SystemInterface.AddSystem.Header&ServiceDetails.EncriptionTypeBase64.Xpath")),
				1);
		wait(10000);
		return this;
	}
	public MedianAddSystemJSON clickPlusButton() {
		wait(2000);
		clickElement(locateElement("xpath",
				props.getProperty("Median.SystemInterface.AddSystem.HeaderandServiceDetails.plusButton.Xpath")));
		return this;
	}

	public MedianAddSystemJSON headerOperation() {
		selectByIndex(locateElement("xpath",
				props.getProperty("Median.SystemInterface.AddSystem.Header&ServiceDetails.HeaderOperation.Xpath")), 1);
		wait(10000);
		return this;
	}

	public MedianAddSystemJSON keyValueOperation() {
		wait(2000);
		enterValue(
				locateElement("xpath",
						props.getProperty("Median.SystemInterface.AddSystem.Header&ServiceDetails.Key2.Xpath")),
				props.getProperty("KeyValueOperation"));
		return this;
	}

	public MedianAddSystemJSON dataTypeAlphaNumeric() {
		selectByIndex(
				locateElement("xpath",
						props.getProperty(
								"Median.SystemInterface.AddSystem.Header&ServiceDetails.DataTypeAlphaNumeric.Xpath")),
				1);
		wait(10000);
		return this;
	}

	public MedianAddSystemJSON defaultValueOperation() {
		wait(2000);
		enterValue(
				locateElement("xpath",
						props.getProperty(
								"Median.SystemInterface.AddSystem.Header&ServiceDetails.DefaultValueOperation.Xpath")),
				props.getProperty("DafaultValueOperation"));
		return this;
	}

	public MedianAddSystemJSON encriptionTypeSha256() {
		selectByIndex(
				locateElement("xpath",
						props.getProperty(
								"Median.SystemInterface.AddSystem.Header&ServiceDetails.EncriptionTypeSha256.Xpath")),
				2);
		wait(10000);
		return this;
	}

	public MedianAddSystemJSON clickSave() {
		wait(2000);
		clickElement(locateElement("xpath",
				props.getProperty("Median.SystemInterface.AddSystem.Header&ServiceDetails.Save.Xpath")));
		return this;
	}

	public MedianAddSystemJSON clickOk() {
		wait(2000);
		clickElement(locateElement("xpath",
				props.getProperty("Median.SystemInterface.AddSystem.Header&ServiceDetails.OK.Xpath")));
		return this;
	}
}
