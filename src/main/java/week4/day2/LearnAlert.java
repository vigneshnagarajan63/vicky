package week4.day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnAlert {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.get("http://testleaf.herokuapp.com/pages/Alert.html");
		
/*		driver.findElementByXPath("//button[text()='Alert Box']");
		
		Alert alert = driver.switchTo().alert();
		
		alert.accept();
		
driver.findElementByXPath("//button[text()='Confirm Box']").click();
		
		Alert alert1 = driver.switchTo().alert();
		
		alert1.dismiss();*/
		
driver.findElementByXPath("//button[text()='Line Breaks?']").click();
		
		Alert alert2 = driver.switchTo().alert();
		
		//alert2.sendKeys("testing");
		String text = alert2.getText();
		Thread.sleep(2000);
		//alert2.accept();
		System.out.println(text);

	}

}
