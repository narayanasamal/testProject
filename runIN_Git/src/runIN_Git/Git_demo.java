package runIN_Git;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Git_demo {

	public static void main(String[] args) throws Exception {
		  System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chrome\\chromedriver.exe");
		   // ChromeOptions options=new ChromeOptions();
		    // options.addArguments("window-size=1300,900");
		     //DesiredCapabilities capabilites=DesiredCapabilities.chrome();
		    // capabilites.setCapabilsity(ChromeOptions.CAPABILITY, options);
		     
		     WebDriver driver=new ChromeDriver();
		     //WebDriver driver=new ChromeDriver();
		     
		     driver.manage().window().maximize();
		     
		     driver.get("https://paasqa.azurewebsites.net");
		     
		     
		     driver.findElement(By.xpath("//input[@type='email']")).sendKeys("satya.narayana.samal@ufinance.com");
		     Thread.sleep(2000);
		     driver.findElement(By.xpath(" //input[@type='submit']")).click();
		     
		     Thread.sleep(2000);
		     
		                                                                                                  
		     driver.findElement(By.xpath("//input[@name='passwd']")).sendKeys("satya@123");
		     Thread.sleep(2000);
		     driver.findElement(By.xpath("//input[@type='submit']")).click();
		     
		     Thread.sleep(2000);
		     
		     driver.findElement(By.xpath("//input[@type='submit']")).click();
		     
		     Thread.sleep(2000);

	}

}
