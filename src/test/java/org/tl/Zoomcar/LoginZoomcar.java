package org.tl.Zoomcar;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

public class LoginZoomcar {
	
public static ChromeDriver driver;
public String ExcelFileName;

@BeforeMethod
public void startApp() {

	System.setProperty("webdriver.chrome.driver.", "./Driver/chromedriver.exe");
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.zoomcar.com/chennai");
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
}
@AfterMethod
public void stopApp() {
	driver.close();
}
@DataProvider(name="fetchdata")
public object[][] dataCentre()
{
	return ReadExcel.readData(ExcelFileName);
	
}
}


