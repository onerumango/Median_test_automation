package pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;

import base.MedianSpecificMethods;

public class MedianAuthExternalSystem extends MedianSpecificMethods 
{
	
	
	public MedianAuthExternalSystem clickAuthButton() {
		wait(2000);
		clickElement(locateElement("xpath",props.getProperty("Median.FileUploadMaintenance.ExternalSystem.Auth.Xpath")));
		wait(5000);
		Alert alert = driver.switchTo().alert();
		alert.accept();
		return this;
	}
}