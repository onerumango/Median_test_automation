package pages;

import base.MedianSpecificMethods;

public class MedianDashboard extends MedianSpecificMethods{

	public MedianAddNewRole selectSystemMaintenance() {
			clickElement(locateElement("xpath", props.getProperty("Median.SystemMaintenance.Dropdown.Xpath")));
			wait(7000);
			clickElement(locateElement("xpath", props.getProperty("Median.SystemMaintenance.Dropdown.Role.Xpath")));
			wait(7000);
			return new MedianAddNewRole();
	}
//For Handle Toast Button	
//	public MedianChangePassword clickToastbutton() {
//		clickElement(locateElement("xpath", props.getProperty("MedianDashboard.clickToastbutton.Xpath")));
//		wait(1000);
//        return new MedianChangePassword();
//        }
	
//	public MedianLogout clickChangePassword() {
//		clickElement(locateElement("xpath", props.getProperty("MedainDashboard.changePassword.Xpath")));
//		wait(1000);
//		return new MedianLogout();
//	}
	
	public MedianChangePassword clickUserName() throws InterruptedException {
		Thread.sleep(4000);
		clickElement(locateElement("xpath", props.getProperty("MedianDashboard.username.Xpath")));
		wait(2000);
        return new MedianChangePassword();
	}
	public MedianChangePassword clickLogout() {
		clickElement(locateElement("xpath", props.getProperty("MedianDashboard.Logout.Xpath")));
	//	wait(1000);
        return new MedianChangePassword();
	}

	
}      
