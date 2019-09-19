package Week3.Day2;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Snapshot {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.findElementById("email").sendKeys("vigneshnagarajan63@gmail.com");
		File email = driver.findElementById("email").getScreenshotAs(OutputType.FILE);
		File target=new File("./snaps/email.png");
		FileUtils.copyFile(email, target);  	
		
		
		
		
		
				/*driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_prompt");
				driver.switchTo().frame("iframeResult");
				driver.findElementByXPath
				("//button[text()='Try it']").click();
				Alert alert = driver.switchTo().alert();
				alert.sendKeys("vicky");
				alert.accept();
				String S = driver.findElementById("demo").getText();
				if (S.contains("vicky"))
				{
					System.out.println("Text is Present"); 
					
				}
				
				driver.close();
			}*/

		
		
		
		//class room session
	/*	driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_win_open");
		System.out.println(driver.getTitle());
		driver.switchTo().frame("iframeResult");
		driver.findElementByXPath("//button[text()='Try it']").click();
		System.out.println(driver.getTitle());
		Thread.sleep(5000);
		Set<String> allWin=driver.getWindowHandles();
		List<String> listWin=new ArrayList<String>(allWin);
		driver.switchTo().window(listWin.get(0));
		driver.close();
		*/
		
		
	}
}

