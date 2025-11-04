package vikas_selenum;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class dropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver;
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		WebElement  ani = driver.findElement(By.xpath("//a[@class='ico-register']"));
		Actions act = new Actions (driver);
		act.moveToElement(ani).perform();
		driver.quit();
		
	}

}
