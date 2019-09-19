package Week3.Day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Facebook {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://accounts.google.com/servicelogin/signinchooser?hl=en-GB&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(3000);
		
		driver.findElementByXPath("//span[text()='Create account']").click();
		driver.findElementByXPath("//div[text()='To manage my business']").click();
/*
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(options);

		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(5000);
		driver.findElementById("email").sendKeys("8189896999");

		driver.findElementById("pass").sendKeys("vignesh@143");

		driver.findElementByXPath("//input[@value='Log In']").click();
		Thread.sleep(2000);
		driver.findElementByXPath("//input[@class='_1frb']").sendKeys("testleaf", Keys.ENTER);
		// driver.findElementByXPath("//button[@type='submit']//i[1]").click();
		//Thread.sleep(5000);
		if (driver.findElementByXPath("//a[text()='TestLeaf']").isDisplayed()) {
			
			String text = driver.findElementByXPath("//button[text()='Like']").getText();

			if (text.equals("Like")) {

				driver.findElementByXPath("//button[text()='Like']").click();
			} 
			else 
			{
				System.out.println("Already liked");
			}

			driver.findElementByXPath("//a[text()='TestLeaf']").click();}
		else 
		{
			System.out.println("link is not available");
		}
		String text = driver.findElementByXPath("//div[contains(text(),'people like this')]").getText();

		String num = text.replaceAll("\\D", "");
		System.out.println(num + " liked count");*/
	}
}
