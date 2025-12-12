package testcase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import base.BaseTest;
import utilites.ReadXLSData;

public class Withframework extends BaseTest{

	
	
	ExtentReports extent = new ExtentReports();
	ExtentSparkReporter spark = new ExtentSparkReporter("Test1.html");

	
	
	
	
	@Test(dataProviderClass=ReadXLSData.class,dataProvider="bvtdata")
	public static void LoginTest(String username, String password) throws InterruptedException
	{
	
	
    driver.findElement(By.linkText("Log in")).click(); //locators - properties
    driver.findElement(By.xpath("//input[@id=\"Email\"]")).sendKeys(username);
    driver.findElement(By.xpath("//input[@id=\"Password\"]")).sendKeys(password);
    driver.findElement(By.xpath("//input[@value=\"Log in\"]")).click();
    Thread.sleep(5000);
    
	}
    
	/*
  @DataProvider(name="testdata")
  public Object[][] data()
  {
	  return new Object[][]
			  {
		  {"abc@gmaeel.com","123456"},
		  {"abc@gmrrrl.com","123456"},
		  {"abc@gmarrpl.com","123455"},
		  {"abc@gmaueul.com","123458"},
		  {"abc@gmauuel.com","123457"}
			  };
  }
	
*/
}
