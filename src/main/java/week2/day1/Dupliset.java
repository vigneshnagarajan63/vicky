package week2.day1;



import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Dupliset {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver", "./Driver/chromedriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(3000);
/*		//Hashset =random order,put value order then remove 
		Set<Integer> Values=new TreeSet<Integer>();
	
		System.out.println(Values.add(12));
		Values.add(32);
		System.out.println(Values.add(32));
		Values.add(11);
		Values.add(33);
		System.out.println(Values.add(12));
		
		for (Integer newValues : Values) {
			System.out.println(newValues);*/
			
		}
	}
	



