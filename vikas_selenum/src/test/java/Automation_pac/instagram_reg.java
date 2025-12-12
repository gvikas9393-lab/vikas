package Automation_pac;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class instagram_reg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    
		/*WebDriver driver;
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.instagram.com/");
		driver.findElement(By.xpath("//span[@class='x193iq5w xeuugli x1fj9vlw x13faqbe x1vvkbs xt0psk2 x1i0vuye xvs91rp x1s688f x1iiplp5 x10wh9bi xpm28yp x8viiok x1o7cslx']")).click();
		driver.findElement(By.name("emailOrPhone")).sendKeys("anitha143@gmail.com");
		driver.findElement(By.name("password")).sendKeys("vikas143");
		driver.findElement(By.name("fullName")).sendKeys("anitha GR");
		driver.findElement(By.name("username")).sendKeys("vicky ani");
		driver.findElement(By.xpath("//div[@class='html-div xexx8yu xyri2b x18d9i69 x1c1uobl x9f619 xjbqb8w x78zum5 x15mokao x1ga7v0g x16uus16 xbiv7yw x1xmf6yo x1e56ztr x11hdunq x11gldyt x1n2onr6 x1plvlek xryxfnj x1c4vz4f x2lah0s xdt5ytf xqjyukv x1qjc9v5 x1oa3qoh x1nhvcw1']")).click();
	    System.out.println("inta account register succefully");
	    */
		
		WebDriver driver;
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.flipkart.com/");
	   JavascriptExecutor js =  (JavascriptExecutor)driver;
	   //js.executeScript("window.scrollBy.(0,400)","");

      js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
       driver.quit();
	   
	}

}
