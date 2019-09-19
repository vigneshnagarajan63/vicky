package week5.day1;


import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class Tooltip {

	public static <WebElement> void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://testleaf.herokuapp.com/pages/Link.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//Approach 1
		List<org.openqa.selenium.WebElement> allLinks = driver.findElementsByTagName("a");
		for(int i=0; i<allLinks.size();i++) {
			String text = allLinks.get(i).getText();
			Thread.sleep(4000);
			if(driver.getTitle().contains("404")) {
				System.out.println("this link is broken-"+text);
				driver.navigate().back();
				allLinks=driver.findElementsByTagName("a");
			}


		}



	}

}
