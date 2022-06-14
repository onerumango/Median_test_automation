package pages;

import base.MedianSpecificMethods;

public class Auditlogs extends MedianSpecificMethods{
	
      public Auditlogs selectform() {
    	  wait(1000);
    		clickElement(locateElement("xpath", props.getProperty("Median.SystemMaintenance.Auditlogs.form.Dropdown.Xpath")));
    		wait(1000);
    		clickElement(locateElement("xpath", props.getProperty("Median.SystemMaintenance.Auditlogs.form.Dropdown.Excel.Xpath")));
    		wait(1000);
    		clickElement(locateElement("xpath", props.getProperty("Median.SystemMaintenance.Auditlogs.form.DownloadButton.Xpath")));
    		wait(5000);
    		return this;
    	}
}
