package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Amazon {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://courses.letskodeit.com/practice");
		driver.manage().window().maximize();
		Thread.sleep(4000);
		
		JavascriptExecutor js1=(JavascriptExecutor) driver;
		for(int i=0;i<3;i++)
		{
			js1.executeScript("window.scrollBy(0, 300)");
			Thread.sleep(2000);
		}
		
		driver.switchTo().frame("courses-iframe");
		driver.findElement(By.xpath("@input[@id='search']")).sendKeys("software testing");
		
		
		
		
		


		
		
		





	}

}
