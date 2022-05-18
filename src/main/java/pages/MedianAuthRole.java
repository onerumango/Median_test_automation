package pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;

import base.MedianSpecificMethods;

public class MedianAuthRole extends MedianSpecificMethods 
{
	public MedianAuthRole selectSystemMaintenance() {
		clickElement(locateElement("xpath", props.getProperty("Median.SystemMaintenance.Dropdown.Xpath")));
		wait(7000);
		clickElement(locateElement("xpath", props.getProperty("Median.SystemMaintenance.Dropdown.Role.Xpath")));
		wait(7000);
		clickElement(locateElement("xpath", props.getProperty("Median.SystemMaintenance.Dropdown.Role.New.Xpath")));
		wait(5000);
		return this;
	}
	
	public MedianAuthRole clickAuthButton() {
		wait(2000);
		clickElement(locateElement("xpath",props.getProperty("Median.SystemMaintenance.Authenticate.Role.Xpath")));
		wait(5000);
		Alert alert = driver.switchTo().alert();
		alert.accept();
		return this;
	}
}