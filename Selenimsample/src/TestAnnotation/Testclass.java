package TestAnnotation;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Testclass extends TestAnotation_Sam1 {

  @Test
  public void testmethod() throws InterruptedException  {
	  
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("bhanu");
	  
	  
  }
}
