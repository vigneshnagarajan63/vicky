package Week3.Day2;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

//import org.openqa.selenium.Alert;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnAlert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_prompt");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_win_open");
		driver.switchTo().frame("iframeResult");
		driver.findElementByXPath("//button[text()='Try it']").click();
		Set<String> allwin = driver.getWindowHandles();
		List<String>  listwin =new ArrayList<String>();
		listwin.addAll(allwin);
		driver.switchTo().window(listwin.get(1));
		System.out.println(driver.getTitle());

		driver.switchTo().window(listwin.get(0));
		driver.close();
		
		
/*		WebElement fr1 = driver.findElementByXPath("//iframe[@id='iframeResult']");
		driver.switchTo().frame(fr1);		
		driver.findElementByXPath("//button[text()='Try it']").click();
		Alert alert = driver.switchTo().alert();
		alert.sendKeys("helooooooooooooo");
		alert.accept();
		String text=driver.findElementByXPath("//p[@id='demo']").getText();
		boolean compare=text.contains("helooooooooooooo");
		{
		System.out.println(compare);*/
			
		}
		
	}


