package testNG;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Login {
	String[][] data= null;
	
		
	@DataProvider(name="loginData")
	public String[][] loginDataProvider() throws IOException {	
		data=getExcelData();
		return data;
	}
	public String[][] getExcelData() throws IOException {
	
		HSSFWorkbook wbook=new HSSFWorkbook(".\Data\Book1.xls");
		HSSFSheet sheet=wbook.getSheetAt(0);
		int rowNum = sheet.getLastRowNum();
		int cellNum=sheet.getRow(0).getLastCellNum();
		String[][] data=new String[rowNum][cellNum];
		for (int i=1;i<=rowNum;i++)
		{
			HSSFRow row= sheet.getRow(i);
			for(int j=0;j<cellNum;j++) {
				HSSFCell cell=row.getCell(j);
				data[i-1][j]=cell.getStringCellValue();
			}
		}
		wbook.close();
	}
public void HSSFWorkbook() {
		// TODO Auto-generated method stub
		
	}
@Test(dataProvider="loginData")

public void loginwithBothCorrect(String username,String password) {
	System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://leaftaps.com/opentaps/");
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.findElementById("username").sendKeys(username);
	driver.findElementById("password").sendKeys(password);
	driver.findElementByClassName("decorativeSubmit").click();
	driver.quit();
}
}
