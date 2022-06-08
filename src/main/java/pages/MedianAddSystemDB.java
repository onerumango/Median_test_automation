package pages;

import base.MedianSpecificMethods;


public class MedianAddSystemDB extends MedianSpecificMethods{
	
	public MedianAddSystemDB enterCode() {
		wait(2000);
		enterValue(locateElement("xpath", props.getProperty("Median.SystemInterface.AddSystem.SystemInformation.CodeISO.Xpath")), props.getProperty("CodeDB"));
		return this;
	}
	public MedianAddSystemDB enterName() {
		wait(2000);
		enterValue(locateElement("xpath", props.getProperty("Median.SystemInterface.AddSystem.SystemInformation.Name.Xpath")), props.getProperty("CodeName"));
		return this;
	}
	public MedianAddSystemDB selectType() {
		wait(2000);
		clickElement(locateElement("xpath", props.getProperty("Median.SystemInterface.AddSystem.SystemInformation.Type.Xpath")));
	    clickElement(locateElement("xpath", props.getProperty("Median.SystemInterface.AddSystem.SystemInformation.TypeSelect.Xpath")));
	  	  return this;
	 }
	public MedianAddSystemDB selectMessageType() {
		wait(2000);
		clickElement(locateElement("xpath", props.getProperty("Median.SystemInterface.AddSystem.SystemInformation.MessageType.Xpath")));
	  	clickElement(locateElement("xpath", props.getProperty("Median.SystemInterface.AddSystem.SystemInformation.MessageTypeSelect.Xpath")));
	  	  return this;
	    }
	public MedianAddSystemDB enterExternalIP() {
		wait(2000);
		enterValue(locateElement("xpath", props.getProperty("Median.SystemInterface.AddSystem.SystemInformation.ExternalIP.Xpath")), props.getProperty("AddSystem.SystemInformation.ExternalIP"));
		return this;
	}
	public MedianAddSystemDB enterExternalPort() {
		wait(2000);
		enterValue(locateElement("xpath", props.getProperty("Median.SystemInterface.AddSystem.SystemInformation.ExternalPort.Xpath")), props.getProperty("AddSystem.SystemInformation.ExternalPort"));
		return this;
	}
	public MedianAddSystemDB enterExternalURI() {
		wait(2000);
		enterValue(locateElement("xpath", props.getProperty("Median.SystemInterface.AddSystem.SystemInformation.ExternalURI.Xpath")), props.getProperty("AddSystem.SystemInformation.ExternalURI"));
		return this;
	}
	public MedianAddSystemDB enterMedianIP() {
		wait(2000);
		enterValue(locateElement("xpath", props.getProperty("Median.SystemInterface.AddSystem.SystemInformation.MedianIP.Xpath")), props.getProperty("AddSystem.SystemInformation.MedianIP"));
		return this;
	}
	public MedianAddSystemDB enterMedianPort() {
		wait(2000);
		enterValue(locateElement("xpath", props.getProperty("Median.SystemInterface.AddSystem.SystemInformation.MedianPort.Xpath")), props.getProperty("AddSystem.SystemInformation.MedianPort"));
		return this;
	}
	public MedianAddSystemDB enterMedianURI() {
		wait(2000);
		enterValue(locateElement("xpath", props.getProperty("Median.SystemInterface.AddSystem.SystemInformation.MedianURI.Xpath")), props.getProperty("AddSystem.SystemInformation.MedianURI"));
		return this;
	}
	
	public MedianAddSystemDB clickNextSystemInformation() {
		wait(2000);
		clickElement(locateElement("xpath", props.getProperty("Median.SystemInterface.AddSystem.SystemInformation.Next.Xpath")));
	  	 return this;
	    }
	public MedianAddSystemDB selectMessageProtocol() {
		wait(2000);
		clickElement(locateElement("xpath", props.getProperty("Median.SystemInterface.AddSystem.MessageConfiguration.ISOMessageProtocol.Xpath")));
	    clickElement(locateElement("xpath", props.getProperty("Median.SystemInterface.AddSystem.MessageConfiguration.MessageProtocolSelectDBConnection.Xpath")));
	  	  return this;
	}
	public MedianAddSystemDB enterDBUserName() {
		wait(2000);
		enterValue(locateElement("xpath", props.getProperty("Median.SystemInterface.AddSystem.MessageConfiguration.UserName.Xpath")), props.getProperty("DBUserName"));
		return this;
	}
	
	public MedianAddSystemDB enterDBPassword() {
		wait(2000);
		enterValue(locateElement("xpath", props.getProperty("Median.SystemInterface.AddSystem.MessageConfiguration.Password.Xpath")), props.getProperty("DBPassword"));
		return this;
	}
	
	public MedianAddSystemDB enterDBName() {
		wait(2000);
		enterValue(locateElement("xpath", props.getProperty("Median.SystemInterface.AddSystem.MessageConfiguration.DBName.Xpath")), props.getProperty("DBName"));
		return this;
	}
	
	public MedianAddSystemDB enterDBConnectingString() {
		wait(2000);
		enterValue(locateElement("xpath", props.getProperty("Median.SystemInterface.AddSystem.MessageConfiguration.ConnectingString.Xpath")), props.getProperty("ConnectingString"));
		return this;
	}
	
	public MedianAddSystemDB clickNextMessageConfiguration() {
		wait(2000);
		clickElement(locateElement("xpath", props.getProperty("Median.SystemInterface.AddSystem.MessageConfiguration.Next.Xpath")));
	  	 return this;
	    }
	
	public MedianAddSystemDB selectTable() {
		wait(2000);
		clickElement(locateElement("xpath", props.getProperty("Median.SystemInterface.AddSystem.AddSystem.Table.Xpath")));
		wait(2000);
	    clickElement(locateElement("xpath", props.getProperty("Median.SystemInterface.AddSystem.AddSystem.Table.AuditLog.Xpath")));
	  	return this;
	}
	
	public MedianAddSystemDB selectHeader1() {
		wait(2000);
		clickElement(locateElement("xpath", props.getProperty("Median.SystemInterface.AddSystem.AddSystem.DBHeader1.Xpath")));
	    clickElement(locateElement("xpath", props.getProperty("Median.SystemInterface.AddSystem.AddSystem.DBHeader.SelectService.Xpath")));
	  	  return this;
	}
	public MedianAddSystemDB selectColumnName1() {
		wait(2000);
		clickElement(locateElement("xpath", props.getProperty("Median.SystemInterface.AddSystem.AddSystem.DBHeader.ColumnName1.Xpath")));
	    clickElement(locateElement("xpath", props.getProperty("Median.SystemInterface.AddSystem.AddSystem.DBHeader.ColumnNameID.Xpath")));
	  	  return this;
	}
	/*public MedianAddSystemDB selectDataType1() {
		wait(2000);
		clickElement(locateElement("xpath", props.getProperty("Median.SystemInterface.AddSystem.Header&ServiceDetails.DataType1.Xpath")));
	    clickElement(locateElement("xpath", props.getProperty("Median.SystemInterface.AddSystem.Header&ServiceDetails.SelectDataType1.Xpath")));
	  	  return this;
	}
	public MedianAddSystemDB enterDefaultValue1() {
		wait(2000);
		enterValue(locateElement("xpath", props.getProperty("Median.SystemInterface.AddSystem.Header&ServiceDetails.ISODefaultValue1.Xpath")), props.getProperty("AddSystem.Header&ServiceDetails.ISODefaultValue1"));
		return this;
	}*/
	
	public MedianAddSystemDB clickPlusButton() {
		wait(2000);
		clickElement(locateElement("xpath", props.getProperty("Median.SystemInterface.AddSystem.AddSystem.DBHeader.PlusButton.Xpath")));
	    return this;
	}
	public MedianAddSystemDB selectHeader2() {
		wait(2000);
		clickElement(locateElement("xpath", props.getProperty("Median.SystemInterface.AddSystem.AddSystem.DBHeader2.Xpath")));
	    clickElement(locateElement("xpath", props.getProperty("Median.SystemInterface.AddSystem.AddSystem.DBHeader.SelectOperation.Xpath")));
	  	  return this;
	}
	public MedianAddSystemDB selectColumnName2() {
		wait(2000);
		clickElement(locateElement("xpath", props.getProperty("Median.SystemInterface.AddSystem.AddSystem.DBHeader.ColumnName2.Xpath")));
	    clickElement(locateElement("xpath", props.getProperty("Median.SystemInterface.AddSystem.AddSystem.DBHeader.ColumnNameVerifierID.Xpath")));
	  	  return this;
	}
	/*public MedianAddSystemDB selectDataType2() {
		wait(2000);
		clickElement(locateElement("xpath", props.getProperty("Median.SystemInterface.AddSystem.Header&ServiceDetails.DataType2.Xpath")));
	    clickElement(locateElement("xpath", props.getProperty("Median.SystemInterface.AddSystem.Header&ServiceDetails.SelectDataType2.Xpath")));
	  	  return this;
	}
	public MedianAddSystemDB enterDefaultValue2() {
		wait(2000);
		enterValue(locateElement("xpath", props.getProperty("Median.SystemInterface.AddSystem.Header&ServiceDetails.ISODefaultValue2.Xpath")), props.getProperty("AddSystem.Header&ServiceDetails.ISODefaultValue2"));
		return this;
	}*/
	public MedianAddSystemDB clickSave() {
		wait(2000);
		clickElement(locateElement("xpath", props.getProperty("Median.SystemInterface.AddSystem.AddSystem.DBHeader.Save.Xpath")));
	  	 return this;
	    }
	public MedianAddSystemDB clickOK() {
		wait(2000);
	  	clickElement(locateElement("xpath", props.getProperty("Median.SystemInterface.AddSystem.AddSystem.DBHeader.OK.Xpath")));
	  	wait(5000);
	  	return this;
	    }
	}
