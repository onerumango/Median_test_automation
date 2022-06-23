package pages;

import base.MedianSpecificMethods;

public class MedianExternalSystemSummary extends MedianSpecificMethods{
	public MedianAddNewExternalSystem selectNew() {
		wait(3000);
		clickElement(locateElement("xpath", props.getProperty("Median.FileUploadMaintenance.ExternalSystem.New.Xpath")));
		return new MedianAddNewExternalSystem();
	}
	
	public MedianEditExternalSystem selectEdit() {
		wait(3000);
		clickElement(locateElement("xpath", props.getProperty("Median.FileUploadMaintenance.ExternalSystem.Edit.clickExternalSystemCode.Xpath")));
		wait(3000);
		clickElement(locateElement("xpath", props.getProperty("Median.FileUploadMaintenance.ExternalSystem.Edit.Xpath")));
		return new MedianEditExternalSystem();
	}
	public MedianAuthExternalSystem selectExternalSystem() {
		wait(3000);
		clickElement(locateElement("xpath", props.getProperty("Median.FileUploadMaintenance.ExternalSystem.Edit.clickExternalSystemCode.Xpath")));
		return new MedianAuthExternalSystem();
	
	}
}
