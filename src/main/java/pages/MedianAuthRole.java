package pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;

import base.MedianSpecificMethods;

public class MedianAuthRole extends MedianSpecificMethods 
{
	

	public MedianAuthRole clickAuthButton() {
		wait(2000);
		jsExecutor(locateElement("xpath", props.getProperty("Median.SystemMaintenance.Authenticate.Role.Xpath")));
		wait(2000);
		clickElement(locateElement("xpath",props.getProperty("Median.SystemMaintenance.Authenticate.Role.Xpath")));
		wait(5000);
		Alert alert = driver.switchTo().alert();
		alert.accept();
		return this;
	}
}