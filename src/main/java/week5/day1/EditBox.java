package week5.day1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EditBox {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leafground.com/pages/Edit.html");
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		driver.findElementById("email").sendKeys("vigneshsoftester@gmail.com");
		driver.findElementByXPath("//*[@id=\"contentblock\"]/section/div[2]/div/div/input").sendKeys("text");
		
		WebElement findAttri = driver.findElementByName("username");
		String attribute=findAttri.getAttribute("value");
		System.out.println(attribute);
		
		WebElement Clearbox = driver.findElementByXPath("//*[@id=\"contentblock\"]/section/div[4]/div/div/input");
		boolean enabled = Clearbox.isEnabled();
		System.out.println(enabled);
		Clearbox.clear();
	
		WebElement disBox = driver.findElementByXPath("//*[@id=\"contentblock\"]/section/div[5]/div/div/input");
		boolean enabledD = disBox.isEnabled();
		System.out.println(enabledD);
	}
	
}
