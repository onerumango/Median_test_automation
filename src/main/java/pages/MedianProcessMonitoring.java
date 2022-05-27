package pages;
import base.MedianSpecificMethods;

public class MedianProcessMonitoring extends MedianSpecificMethods {

	public MedianProcessMonitoring verifyScreen() {
		if(locateElement("xpath", "Median.FileUpload.processMonitoring.Xpath").isDisplayed())
		{
			clickElement(locateElement("xpath", props.getProperty("Median.userTrigger.Xpath")));
			clickElement(locateElement("xpath", props.getProperty("Median.userTrigger.Logout.Xpath")));
		}
		return this;
	}
	
}
