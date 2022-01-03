package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class KVB_project {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://doconlinebayern-telemedicine-certqa.womba.org/");
		Thread.sleep(2000);
		
		driver.findElement(By.name("username")).sendKeys("kvbda@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.name("password")).sendKeys("Password123@");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='ladda-button btn btn-blue btn-blue-kvb']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='btn btn-blue']")).click();
		Thread.sleep(2000);
		WebElement ele = driver.findElement(By.xpath("//a[@id='navbarDropdownMenuLink']"));
		Actions act=new Actions(driver);
		act.moveToElement(ele).perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@id='profile']")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("firstName")).sendKeys("bhanu");
		Thread.sleep(2000);
		driver.findElement(By.name("lastName")).sendKeys("KR");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='dob']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='dob']")).sendKeys("12/06/2021");
		Thread.sleep(2000);

		WebElement ele2 = driver.findElement(By.name("sex"));
		Select s2=new Select(ele2);
		s2.selectByValue("F");
		Thread.sleep(2000);
		s2.selectByVisibleText("Female");
		Thread.sleep(2000);

		
		driver.findElement(By.xpath("//input[@name='dob']")).click();
		
		
		
		
		
		
		

		
		
		

		

		
		
		
		
		
		
		
		

		

		
		
		

		

		
		
		// TODO Auto-generated method stub

	}

}
