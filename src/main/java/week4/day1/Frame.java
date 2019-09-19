package week4.day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("http://testleaf.herokuapp.com/pages/frame.html"); // To Load the URL
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.switchTo().frame
		(driver.findElementByXPath("(//div[@id='wrapframe']/iframe)[1]"));
		driver.findElement(By.id("Click")).click();
		driver.switchTo().defaultContent();
//		driver.switchTo().frame(10);

	}

}
