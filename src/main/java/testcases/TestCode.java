package testcases;
import org.openqa.selenium.By;  
import org.openqa.selenium.JavascriptExecutor;  
import org.openqa.selenium.WebDriver;  
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver; 

public class TestCode {

	public static void main(String[] args) throws InterruptedException {
		  System.setProperty("webdriver.gecko.driver", ".//drivers/geckodriver.exe");  
          
          // Instantiate a ChromeDriver class.     
     WebDriver driver=new FirefoxDriver();  
       
        // Launch Website  
     driver.navigate().to("http://icust.rumango.com/release/median-v2/#/session/login");  
       
      //Maximize the browser  
       driver.manage().window().maximize();  
       
       //Scroll down the webpage by 5000 pixels  
//     JavascriptExecutor js = (JavascriptExecutor)driver;  
//     js.executeScript("scrollBy(0, 5000)");   
       
      // Click on the Search button  
//     driver.findElement(By.linkText("Core Java")).click();     
		
       driver.findElement(By.xpath("//input[@id='exampleInputEmail1']")).sendKeys("QAZ");
       driver.findElement(By.xpath("//input[@id='pwdFld']")).sendKeys("Test@1234");
       driver.findElement(By.xpath("//body//app-root//div[3]")).click();
       Thread.sleep(15000);
       driver.findElement(By.xpath("//button[normalize-space()='Verify']")).click();
       Thread.sleep(15000);
       driver.findElement(By.xpath("//span[normalize-space()='System Maintenance']")).click();
       

	}

}
