package week4.day2;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class LearnWindowHandle {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://www.irctc.co.in/nget/train-search");
		
		String mainWindow = driver.getTitle();
		
	//String parentHandle = driver.getWindowHandle();
		
		System.out.println(mainWindow);
		driver.findElementByLinkText("FLIGHTS").click();
		
		Set<String> windowHandles = driver.getWindowHandles();
		
		List<String> listHandles=new ArrayList<String>(windowHandles);
		//listHandles.addAll(windowHandles);
		
		String childHandle = listHandles.get(1);
		
		driver.switchTo().window(childHandle);
		
		String newTitle = driver.getTitle();
		System.out.println(newTitle);

	}

}
