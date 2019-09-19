package week4.day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class ProjectSpecificFunction {
	public ChromeDriver driver;
	@Parameters({"url","username","password"})
	@BeforeMethod
	public void logIn(String url,String username,String Password)
	{
	System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
	ChromeOptions options = new ChromeOptions();
	options.addArguments("--disable-notifications");
	driver  = new ChromeDriver(options);
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.get("http://leaftaps.com/opentaps");
	driver.manage().window().maximize();

	WebElement eleUsername = driver.findElementById("username");
	eleUsername.sendKeys("DemoSalesManager");

	driver.findElementById("password").sendKeys("crmsfa");
	driver.findElementByClassName("decorativeSubmit").click();
	driver.findElementByLinkText("CRM/SFA").click();
	
	
	}
	@AfterMethod
	public void StopUp() throws InterruptedException {
		Thread.sleep(2000);
	driver.close();
}
}



