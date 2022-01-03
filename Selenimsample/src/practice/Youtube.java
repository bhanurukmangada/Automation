package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Youtube {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.youtube.com/");
		driver.manage().window().maximize();
		JavascriptExecutor js7=(JavascriptExecutor) driver;
		for(int i=0;i<3;i++)
		{
			js7.executeScript("window.scrollBy(0, -600)");
			Thread.sleep(2000);
		}
		
		driver.findElement(By.xpath("//div[@id='channel-info']")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='search']")).sendKeys("slenium webdriver");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@id='search-icon-legacy']")).click();
		
		
		
		// TODO Auto-generated method stub

	}

}
