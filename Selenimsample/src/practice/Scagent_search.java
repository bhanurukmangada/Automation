package practice;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Scagent_search {

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
		WebElement ele = driver.findElement(By.xpath("//div[@id='nav']"));
		Actions act=new Actions(driver);
		act.moveToElement(ele).perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[.='Patient Search and Registration']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='firstNameFilter']")).sendKeys("heer");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='lastNameFilter']")).sendKeys("potter");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='birthdate']")).sendKeys("");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='policyNumberFilter']")).sendKeys("103525909");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='btn btn-blue']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[.='Clear Search']")).click();


	

	}

}
