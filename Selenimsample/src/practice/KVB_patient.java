package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class KVB_patient {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://doconlinebayern-telemedicine-certqa.womba.org/");
		Thread.sleep(2000);
		driver.findElement(By.name("username")).sendKeys("kvbpa@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.name("password")).sendKeys("Password123@");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='ladda-button btn btn-blue btn-blue-kvb']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='btn btn-blue']")).click();
		

		
		
		// TODO Auto-generated method stub

	}

}
