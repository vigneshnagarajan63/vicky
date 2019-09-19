package week4.day1;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Zoomcar {

	public static void main(String[] args) throws InterruptedException {
		//To launch the chrome browser
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
				ChromeDriver driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				
				// Get the current date
				Date date = new Date();
				//Get only the date (and not month, year, time etc)
				DateFormat sdf = new SimpleDateFormat("dd");				
				// Get today's date
				String today = sdf.format(date);
				// Convert to integer and add 1 to it
				int tomorrow = Integer.parseInt(today)+1;
				// Print tomorrow's date
				System.out.println(tomorrow);
				
				
				
				
				
				/*//To get tomorrow date
				Date date1 = new Date();
				DateFormat sdf1 = new SimpleDateFormat("dd");
				String today1 = sdf1.format(date1);
				int tomorrow1 = Integer.parseInt(today1)+1;
				System.out.println(tomorrow1);*/
				
				//To login to ZoomCar
				driver.get("https://www.zoomcar.com/chennai/");
				driver.findElementByLinkText("Start your wonderful journey").click();
				driver.findElementByXPath("//div[@class='component-popular-locations']//div[3]").click();
				driver.findElementByXPath("//button[@class='proceed']").click();
				//driver.findElementByXPath("//div[@class='days']/div[2]/div[1]").click();
				driver.findElementByXPath("//div[contains(text(), '"+tomorrow+"')]").click();
				driver.findElementByXPath("//div[@class='actions']/button").click();
				//driver.findElementByXPath("//div[@class='days']/div[2]/div[1]").click();
				driver.findElementByXPath("//div[@class='actions']/button").click();
			//	driver.findElementByXPath("//div[@class='item active-input']").click();
				
				Thread.sleep(3000);
				 List<Integer> maxPrice= new ArrayList<Integer>();
				 
				List<WebElement> carPrice = driver.findElements(By.xpath("//div[@class='price']"));
				System.out.println(carPrice.size());
		        for (WebElement sortPrice : carPrice) {
		        	
					 maxPrice.add(Integer.parseInt(sortPrice.getText().replaceAll("[^0-9]+", "").trim()));
				}
		        Integer max = Collections.max(maxPrice);
		        System.out.println("MAX Price"+max);
		        for(int i=1;i<=carPrice.size();i++) {
		        	String text = driver.findElement(By.xpath("(//div[@class='price'])["+i+"]")).getText().replaceAll("[^0-9]+", "").trim();
		        	System.out.println(text.trim());
		        	if(Integer.parseInt(text)==max) {
		        		System.out.println("((//div[@class='price'])["+i+"]/preceding::h3)["+i+"]");
		        		String carName = driver.findElementByXPath("((//div[@class='price'])["+i+"]/preceding::h3)["+i+"]").getText();
		        		System.out.println("CAR NAME"+carName);
		        		driver.findElementByXPath("(((((//div[@class='price'])["+i+"])/preceding::h3)["+i+"])/following::button)[1]").click();
		        		Thread.sleep(2000);
		        		break;
		        	}
		        }
	}
}
