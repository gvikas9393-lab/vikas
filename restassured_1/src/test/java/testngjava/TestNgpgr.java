package testngjava;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNgpgr {
	
	WebDriver driver;
	@BeforeMethod
	void openbrowser()
	{
		driver = new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
	}
	
	@AfterMethod
	void closebroswe()
	{
		driver.quit();
	}
	
	@Test
	void openpage()
	{
     driver.findElement(By.linkText("Log in")).click();
     driver.findElement(By.name("Email")).sendKeys("g.vikas@gmail.com");
     driver.findElement(By.name("Password")).sendKeys("anitha");
     driver.findElement(By.xpath("//input[@class='button-1 login-button']")).click();
	}
	
	@Test
	void registerpage()
	{
		driver.findElement(By.linkText("Register")).click();
	}

}
