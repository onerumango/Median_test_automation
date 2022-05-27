package pages;

import java.awt.AWTException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import base.MedianSpecificMethods;

public class MedianUploadExcel extends MedianSpecificMethods{
	
	
	public MedianUploadExcel selectExternalSystem() {
		clickElement(locateElement("xpath", props.getProperty("Median.FileUpload.UploadExcel.ExternalSystem.Dropdown.Xpath")));
		wait(1000);
		clickElement(locateElement("xpath", props.getProperty("Median.FileUpload.UploadExcel.ExternalSystem.Dropdown.May18.Xpath")));
		return this;
	}
	
	public MedianUploadExcel selectTransactionCode() {
		clickElement(locateElement("xpath", props.getProperty("Median.FileUpload.UploadExcel.TransactionCode.Dropdown.Xpath")));
		wait(1000);
		clickElement(locateElement("xpath", props.getProperty("Median.FileUpload.UploadExcel.TransactionCode.Dropdown.Option.Xpath")));
		wait(1000);
		return this;
	}
	
	/*public MedianUploadExcel enterFilename() {
		enterValue(locateElement("xpath", props.getProperty("Median.FileUpload.UploadExcel.Filename.Xpath")), props.getProperty("Filename"));
		return this;
	}
	*/
	public MedianUploadExcel clickFileUpload() throws AWTException {
		Actions action = new Actions(driver);
		WebElement chooseFile = locateElement("xpath",
				props.getProperty("Median.FileUpload.UploadExcel.FileUpload.Xpath"));
		action.moveToElement(chooseFile).click().perform();
		wait(2000);
		uploadFile("C:\\Users\\ADMIN\\Downloads.Median_File Upload.xlsx");
		wait(12000);
		return this;
	}
	   
	public MedianUploadExcel clickUploadData() {
		clickElement(locateElement("xpath", props.getProperty("Median.FileUpload.UploadExcel.UploadData.Xpath")));
		Alert alert = driver.switchTo().alert();
		alert.accept();
		return this;
	}
	
	public MedianUploadExcel enterRemarks() {
		enterValue(locateElement("xpath", props.getProperty("Median.FileUpload.UploadExcel.Remarks.Xpath")), props.getProperty("Remarks"));
		return this;
	}
	
	public MedianUploadExcel clickProcess() {
		clickElement(locateElement("xpath", props.getProperty("Median.FileUpload.UploadExcel.Process.Xpath")));
		Alert alert = driver.switchTo().alert();
		alert.accept();
		return this;
	}
	
	public MedianUploadExcel clickViewExcel() {
		clickElement(locateElement("xpath", props.getProperty("Median.FileUpload.UploadExcel.ViewExcel.Xpath")));
		return this;
	}
}
