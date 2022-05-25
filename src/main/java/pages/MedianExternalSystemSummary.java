package pages;

import base.MedianSpecificMethods;

public class MedianExternalSystemSummary extends MedianSpecificMethods{
	public MedianAddNewExternalSystem selectNew() {
		clickElement(locateElement("xpath", props.getProperty("Median.FileUploadMaintenance.ExternalSystem.New.Xpath")));
		wait(5000);
		return new MedianAddNewExternalSystem();
	}
	
	public MedianEditExternalSystem selectEdit() {
		clickElement(locateElement("xpath", props.getProperty("Median.FileUploadMaintenance.ExternalSystem.Edit.Xpath")));
		wait(5000);
		return new MedianEditExternalSystem();
	}
	public MedianAuthExternalSystem selectExternalAuth() {
		clickElement(locateElement("xpath", props.getProperty("Median.SystemMaintenance.RoleName.Xpath")));
		wait(5000);
		return new MedianAuthExternalSystem();
	
	}
}
