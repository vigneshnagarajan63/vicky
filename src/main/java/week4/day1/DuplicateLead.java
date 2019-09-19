package week4.day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DuplicateLead extends ProjectSpecificFunction {

	@Test(enabled=true)
	public void DuplicatLead() throws InterruptedException {
		
		
		driver.findElementByLinkText("Leads").click();
		driver.findElementByLinkText("Find Leads").click();
		Thread.sleep(3000);
		driver.findElementByLinkText("Email").click();
		driver.findElementByName("emailAddress").sendKeys("abc@gmail.com");
		Thread.sleep(2000);
		driver.findElementByXPath("(//button[starts-with(@id,'ext-gen')])[6]").click();
		Thread.sleep(3000);
		String name = driver.findElementByXPath("(//a[@class='linktext'])[6]").getText();
		System.out.println("Name"+name);
		driver.findElementByXPath("(//a[@class='linktext'])[4]").click();
		driver.findElementByLinkText("Duplicate Lead").click();
		if(driver.getTitle().contains("Duplicate Lead | opentaps CRM"));
		{
			driver.findElementByXPath("//input[@class='smallSubmit']").click();
			String name2 = driver.findElementByXPath("//span[@id='viewLead_firstName_sp']").getText();
			System.out.println("Name2:"+name2);
			Thread.sleep(3000);
			if(name.contains(name2))
			{
				System.out.println("Both names are equal");
		
		
	}

}
	}
}
