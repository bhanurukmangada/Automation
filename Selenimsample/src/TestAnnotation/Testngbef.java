package TestAnnotation;

import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;


public class Testngbef {
	
	public WebDriver driver;
	@BeforeMethod
	public void openaapln()
	{
		System.setProperty("webdriver.gecko.driver","geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://localhost/login.do");
		
		
	}
	@AfterMethod
	public void closeapp()
	{
		driver.close();
	}
	
	

}
