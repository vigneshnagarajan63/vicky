package week5.day1;


import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leafground.com/pages/Dropdown.html");
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		Thread.sleep(5000);
		WebElement drpDwn1 = driver.findElementByXPath("//*[@id=\"dropdown1\"]");
		Select sel=new Select(drpDwn1);
		sel.selectByIndex(2);
		//generics type webelements
		//no.of elements
		List<WebElement>listWebelm=sel.getOptions();
		int size = listWebelm.size();
		System.out.println("no.of Elem" +size);
		
		WebElement mulSel = driver.findElementByXPath("//*[@id=\"contentblock\"]/section/div[5]/select");
		Select mulySel=new Select(mulSel);
		mulySel.selectByIndex(2);
	}

}
