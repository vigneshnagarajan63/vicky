package week4.day1;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.chrome.ChromeDriver;

import com.mongodb.MapReduceCommand.OutputType;

public class WindowHandls {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe"); // Set the runtime enviromental //
		// path for the driver
		ChromeDriver driver = new ChromeDriver(); // To Launch the browser
		driver.get("http://testleaf.herokuapp.com/pages/Window.html"); // To Load the URL
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		/*String currentRef = driver.getWindowHandle();
		System.out.println(currentRef);*/
		
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		System.out.println("****************************************");
		driver.findElementById("home").click();
		
		//Code to handle windows
		Set<String> allWin = driver.getWindowHandles();
		List<String> listwin = new ArrayList<String>(allWin);
		driver.switchTo().window(listwin.get(1));
		

		
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		
		//Press printscreen key from the keyboard
		File copiedFile = driver.getScreenshotAs(OutputType.File);
		// Set Destination to store the image
		File file= new File("./snaps/img.png");
		//Paste the image and save it as a image
		FileUtils.copyFile(copiedFile, file);
	}

}
