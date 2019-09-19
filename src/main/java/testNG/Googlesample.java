package testNG;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Googlesample {
	ChromeDriver driver;
	long startTime;
	long endTime;
	long totaltime;
	@BeforeSuite
	public void launchBrowser() {
		
		startTime = System.currentTimeMillis();
		System.setProperty("webdriver.chrome.driver",
				"./Driver/chromedriver.exe");
		driver = new ChromeDriver();
	}
	@Test
	public void openGoogle() {
		
		driver.get("https://www.google.com/");
		
}		
	@Test
	public void openBing() {
		
		driver.get("https://www.bing.com/");
		
}
	@Test
	public void openYahoo() {
		
		driver.get("https://www.yahoo.com/");
		
	
}
	@AfterSuite
	public void closedBrowser() {
		driver.quit();
		endTime = System.currentTimeMillis();
		totaltime=endTime-startTime;
		System.out.println("total time taken"+totaltime);
	}
}
