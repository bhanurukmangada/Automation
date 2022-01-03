package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Sampleiframe {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://omayo.blogspot.com/");
		driver.manage().window().maximize();
		driver.switchTo().frame("navbar-iframe");
		Thread.sleep(2000);
		driver.findElement(By.id("b-more")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[contains(.,'Share with Facebook')]")).click();
		
		
		// TODO Auto-generated method stub

	}

}
