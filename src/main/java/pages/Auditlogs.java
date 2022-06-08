package pages;

import base.MedianSpecificMethods;

public class Auditlogs extends MedianSpecificMethods{
	
      public Auditlogs selectform() {
    		clickElement(locateElement("xpath", props.getProperty("Median.SystemMaintenance.Auditlogs.form.Dropdown.Xpath")));
    		wait(1000);
    		clickElement(locateElement("xpath", props.getProperty("Median.SystemMaintenance.Auditlogs.form.Dropdown.Pdf.Xpath")));
    		return this;
    	}
}
