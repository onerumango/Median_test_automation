package pages;

import base.MedianSpecificMethods;

public class MedianAuthorizeExcel extends MedianSpecificMethods{
	
	
	public MedianAuthorizeExcel clickexportExcel() {
		clickElement(locateElement("xpath", props.getProperty("Median.AuthorizeExcel.GetDetails.ExportExcel.Xpath")));
		wait(7000);
		return this;
	}
	
	public MedianAuthorizeExcel clickexportPdf() {
		clickElement(locateElement("xpath", props.getProperty("Median.AuthorizeExcel.GetDetails.ExportPDF.Xpath")));
		wait(7000);
		return this;
	}
	
	public MedianAuthorizeExcel clickApproveandProcess() {
		clickElement(locateElement("xpath", props.getProperty("Median.AuthorizeExcel.GetDetails.ApproveandProcess.Xpath")));
		wait(7000);
		clickElement(locateElement("xpath", props.getProperty("Median.AuthorizeExcel.GetDetails.ApproveandProcess.Yes.Xpath")));
		wait(7000);
		return this;
	}
	
	public MedianAuthorizeExcel clickReject() {
		clickElement(locateElement("xpath", props.getProperty("Median.AuthorizeExcel.GetDetails.Reject.Xpath")));
		wait(7000);
		return this;
	}
	
}
