package pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;

import base.MedianSpecificMethods;

public class MedianAuthExternalSystem extends MedianSpecificMethods 
{
	
	
	public MedianAuthExternalSystem clickAuthButton() {
		wait(2000);
		clickElement(locateElement("xpath",props.getProperty("Median.FileUploadMaintenance.ExternalSystem.Auth.Xpath")));
		wait(2000);
		clickElement(locateElement("xpath",props.getProperty("Median.FileUploadMaintenance.ExternalSystem.YES.Xpath")));
		wait(2000);
		clickElement(locateElement("xpath",props.getProperty("Median.FileUploadMaintenance.ExternalSystem.OK.Xpath")));
		return this;
	}
}