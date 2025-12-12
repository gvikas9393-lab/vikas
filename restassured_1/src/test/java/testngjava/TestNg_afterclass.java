package testngjava;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestNg_afterclass {

	WebDriver driver;
	
	@BeforeClass
	void openbrowser()
	{
		driver = new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
	}
	
	@AfterClass
	void closebrowser()
	{
		System.out.println(driver.manage().getCookies());
		driver.quit();
	}
	
	@Test (priority=1)
	void openrigester()
	{
		driver.findElement(By.linkText("Register")).click();
		
	}
	
	@Test(priority=2)
	void resgidterfilling()
	{
		driver.findElement(By.linkText("Register")).click();
         driver.findElement(By.id("gender-male")).click();
         driver.findElement(By.id("FirstName")).sendKeys("anitha");
         driver.findElement(By.id("LastName")).sendKeys("GR");
         driver.findElement(By.id("Email")).sendKeys("anithagr@gmail.com");
         driver.findElement(By.id("Password")).sendKeys("vikas93");
         driver.findElement(By.id("ConfirmPassword")).sendKeys("vikas93");
         driver.findElement(By.name("register-button")).click();
	}
}
