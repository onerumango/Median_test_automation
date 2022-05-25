package pages;

import base.MedianSpecificMethods;

public class FileUploadSummary extends MedianSpecificMethods{
	
	
	public MedianAuthorizeExcel clickgetDetails() {
		clickElement(locateElement("xpath", props.getProperty("Median.AuthorizeExcel.GetDetails.Xpath")));
		return new MedianAuthorizeExcel();
	}
	
}
