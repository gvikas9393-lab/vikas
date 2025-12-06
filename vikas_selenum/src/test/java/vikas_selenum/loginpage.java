package vikas_selenum;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class loginpage {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver;
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(5000);
		driver.findElement(By.linkText("Log in")).click();
		Thread.sleep(5000);
		driver.findElement(By.name("Email")).sendKeys("vikas@gmail.com");
		driver.findElement(By.name("Password")).sendKeys("vicky");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		Thread.sleep(5000);
		driver.quit();
	}

}
