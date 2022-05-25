package pages;

import base.MedianSpecificMethods;

public class MedianAuthorizeExcel extends MedianSpecificMethods{
	
	
	public MedianAuthorizeExcel clickexportExcel() {
		clickElement(locateElement("xpath", props.getProperty("Median.AuthorizeExcel.GetDetails.ExportExcel.Xpath")));
		return this;
	}
	
	public MedianAuthorizeExcel clickexportPdf() {
		clickElement(locateElement("xpath", props.getProperty("Median.AuthorizeExcel.GetDetails.ExportPDF.Xpath")));
		return this;
	}
	
	public MedianAuthorizeExcel clickApproveandProcess() {
		clickElement(locateElement("xpath", props.getProperty("Median.AuthorizeExcel.GetDetails.ApproveandProcess.Xpath")));
		return this;
	}
	
	public MedianAuthorizeExcel clickReject() {
		clickElement(locateElement("xpath", props.getProperty("Median.AuthorizeExcel.GetDetails.Reject.Xpath")));
		return this;
	}
	
}
