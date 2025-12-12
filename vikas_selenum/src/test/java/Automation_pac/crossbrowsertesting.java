package Automation_pac;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class crossbrowsertesting {

	
		WebDriver driver;
		@Test
		@Parameters ("browser")
		public void Loginpage(String browsername)
		{
			if (browsername.equalsIgnoreCase("chrome"))
			{
				driver = new ChromeDriver();
			}
			else if (browsername.equalsIgnoreCase("edge"))
			{
			driver = new EdgeDriver();
		}
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demowebshop.tricentis.com/");
	driver.findElement(By.linkText("Log in")).click();
	driver.findElement(By.name("Email")).sendKeys("vikas@gmail.com");
	driver.findElement(By.name("Password")).sendKeys("vicky");
	driver.findElement(By.xpath("//input[@value='Log in']")).click();
	driver.quit();
	
	
	
}
}