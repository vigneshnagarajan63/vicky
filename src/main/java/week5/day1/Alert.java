package week5.day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		ChromeDriver driver=new  ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leafground.com/pages/Alert.html");
		driver.manage().timeouts().implicitlyWait(13, TimeUnit.SECONDS);
		
		WebElement AlertbX = driver.findElementByXPath("//*[@id=\"contentblock\"]/section/div[1]/div/div/button");
		AlertbX.click();
		org.openqa.selenium.Alert alert = driver.switchTo().alert();
		alert.accept();
		
	}

}
