package week4.day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnFrames {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.get("https://jqueryui.com/selectable/");
		
		WebElement element = driver.findElementByXPath("//iframe[@class='demo-frame']");
		
		driver.switchTo().frame(element);
		
		driver.findElementByXPath("//li[text()='Item 1']").click();
		//release this content of msg
		driver.switchTo().defaultContent();
		
		driver.findElementByLinkText("Draggable").click();
		
		driver.switchTo().parentFrame();

	}

}
