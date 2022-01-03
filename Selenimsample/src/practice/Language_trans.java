package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Language_trans {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://doconlinebayern-telemedicine-certqa.womba.org/");
		Thread.sleep(2000);
		
		driver.findElement(By.name("username")).sendKeys("kvbsc@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.name("password")).sendKeys("Password123@");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='ladda-button btn btn-blue btn-blue-kvb']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='btn btn-blue']")).click();
		Thread.sleep(2000);
		WebElement ele = driver.findElement(By.xpath("//a[@id='languageDropdown']"));
		Actions act= new Actions(driver);
		act.moveToElement(ele).perform();
		driver.findElement(By.xpath("//a[.='United States (English)']")).click();
		
		
		// TODO Auto-generated method stub

	}

}
