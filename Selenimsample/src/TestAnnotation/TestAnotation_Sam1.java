package TestAnnotation;



import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class TestAnotation_Sam1 {
	  public WebDriver driver;

  
  
  
  
  @BeforeMethod
  public void beforeMethod() {
	  System.setProperty("webdriver.gecko.driver","geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		
  }

  @AfterMethod
  public void afterMethod() {
	  driver.close();
  }

}
