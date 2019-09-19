package week4.day1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LeafTaps extends ProjectSpecificFunction {

	@DataProvider(name = "fetchData")
	public Object[][] sendData() {
		String[][] data = new String[2][3];
		data[0][0] = "new company name";
		data[0][1] = "vignesh";
		data[0][2] = "vicky";

		data[1][0] = "New company one";
		data[1][1] = "vicky";
		data[1][2] = "vignesh";
		return data;
	}

@Test(dataProvider="fetchData")
public void runCreatlead() {

	
		//CreateLead
		driver.findElementByLinkText("Create Lead").click();
		driver.findElementById("createLeadForm_companyName").sendKeys("CSS");

		WebElement firstName= driver.findElementById("createLeadForm_firstName");
		firstName.sendKeys("Deepa");
	//	String txt1 =driver.findElementById("createLeadForm_firstName").getText();
		
		driver.findElementById("createLeadForm_lastName").sendKeys("Ram");
		driver.findElementById("createLeadForm_firstNameLocal").sendKeys("dsf");
		driver.findElementById("createLeadForm_lastNameLocal").sendKeys("adf");
		driver.findElementById("createLeadForm_personalTitle").sendKeys("Mrs");
		driver.findElementById("createLeadForm_generalProfTitle").sendKeys("Ms");

		//dropdown
		Select selectobj1= new Select(driver.findElementById("createLeadForm_dataSourceId"));
		//selectobj1.selectByValue("LEAD_EMPLOYEE");
		selectobj1.selectByIndex(4);

		driver.findElementById("createLeadForm_annualRevenue").sendKeys("15,00,000");

		Select selectobj2= new Select(driver.findElementById("createLeadForm_currencyUomId"));
		//selectobj2.selectByIndex("INR");
		selectobj2.selectByIndex(25);

		Select selectobj3= new Select(driver.findElementById("createLeadForm_industryEnumId"));
		selectobj3.selectByIndex(3);


		Select selectobj4= new Select(driver.findElementById("createLeadForm_ownershipEnumId"));
		selectobj4.selectByIndex(5);

		driver.findElementById("createLeadForm_sicCode").sendKeys("233");
		driver.findElementById("createLeadForm_description").sendKeys("XXXXXXXXXXXXXXXXXXXXXXXXXXXx");
		driver.findElementById("createLeadForm_importantNote").sendKeys("WEGFDGERSYETHDGHYERGDFGERTYERg");
		driver.findElementById("createLeadForm_primaryPhoneCountryCode").sendKeys("44");
		driver.findElementById("createLeadForm_primaryPhoneAreaCode").sendKeys("233");	
		driver.findElementById("createLeadForm_primaryPhoneExtension").sendKeys("233433");	
		driver.findElementById("createLeadForm_departmentName").sendKeys("NGO");	
		driver.findElementById("createLeadForm_numberEmployees").sendKeys("233");	
		driver.findElementById("createLeadForm_tickerSymbol").sendKeys("##");
		driver.findElementById("createLeadForm_primaryPhoneAskForName").sendKeys("Cindy");
		driver.findElementById("createLeadForm_primaryWebUrl").sendKeys("www.abc.com");
		driver.findElementById("createLeadForm_generalToName").sendKeys("DD");
		driver.findElementById("createLeadForm_generalAddress1").sendKeys("No.15,New cross st");
		driver.findElementById("createLeadForm_generalAddress2").sendKeys("Oval");
		driver.findElementById("createLeadForm_generalCity").sendKeys("Oval");

		Select selectobj5= new Select(driver.findElementById("createLeadForm_generalCountryGeoId"));
		selectobj5.selectByIndex(5);


		driver.findElementById("createLeadForm_generalPostalCode").sendKeys("12345");
		driver.findElementById("createLeadForm_generalPostalCodeExt").sendKeys("5678");

		Select selectobj6= new Select(driver.findElementById("createLeadForm_marketingCampaignId"));
		selectobj6.selectByIndex(5);

		driver.findElementById("createLeadForm_primaryPhoneNumber").sendKeys("123456789");
		driver.findElementById("createLeadForm_primaryEmail").sendKeys("abc@gmail.com");


		driver.findElementByXPath("//input[@class='smallSubmit']").click();
		
		
		String str1= driver.findElementById("viewLead_firstName_sp").getText();
		
		if(str1.equals("Deepa"))
		{
			System.out.println("Lead Created");
		}
		else
			System.out.println("Test case failed");
	}

}
