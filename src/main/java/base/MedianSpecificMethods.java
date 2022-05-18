package base;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class MedianSpecificMethods extends MedianGenericWrapper{
	
	public static Properties props;

	@BeforeMethod
	public void launchApplication() throws IOException, InterruptedException {
		FileInputStream fis = new FileInputStream("./resources/median.properties");
		props = new Properties();
		props.load(fis);
		lanuchBrowser("chrome", props.getProperty("Median_URL"));
	}

	@AfterMethod
	public void closeBrowser() {

		driver.close();

	}

}
