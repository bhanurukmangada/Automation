package practice;

import org.openqa.selenium.By;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class KVBSC_agent {

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
		driver.findElement(By.xpath("//input[@name='birthdate']")).sendKeys("01/19/1991");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='policyNumberFilter']")).sendKeys("2103525909");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='btn btn-blue']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("heeerr");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys("KK");
		Thread.sleep(2000);
		WebElement ele2 = driver.findElement(By.xpath("//select[@name='gender']"));
		Select s1=new Select(ele2);
		s1.selectByValue("F");
		Thread.sleep(2000);
		s1.selectByVisibleText("Female");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='address1']")).sendKeys("KKvvvvvvvvvvvvv");
		
		Thread.sleep(2000);
		
		JavascriptExecutor js=(JavascriptExecutor) driver;
		for(int i=0;i<3;i++)
		{
			js.executeScript("window.scrollBy(0, 100)");
			Thread.sleep(2000);
		}
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='dob']")).sendKeys("01/19/1991");

		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='city']")).sendKeys("banglore");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='search']")).sendKeys("bhbhbh");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='zip']")).sendKeys("10001");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='patientNumber']")).sendKeys("10222");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='patientNumber']")).sendKeys("1234");
		Thread.sleep(2000);
		WebElement ele3 = driver.findElement(By.xpath("//select[@name='mobilePhoneCountryCode']"));
		Select s2=new Select(ele3);
		s2.selectByValue("100: IN");
		Thread.sleep(2000);
		s1.selectByVisibleText("India (+91)");
		Thread.sleep(2000);

		
		
		
		

		

		

		

		

		


		

		

		
		
		
		
		
		

		

		

		
		


		


		


		


		

		

		
		
		
		// TODO Auto-generated method stub

	}

}
