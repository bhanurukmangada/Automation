package TestAnnotation;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class AnnotationMethod {
	@BeforeClass
	 public void setup() {
		  System.out.println("\n this runs  before class");
	  }
	@AfterClass
	 public void cleanup() {
		  System.out.println("\n this runs after class");
	  }
	
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("\n Running test before method");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("\n Running test after method");

  }
  @Test
  public void testmethod1() {
	  System.out.println("\n Running test-> testmethod1");
  }
  @Test
  public void testmethod2() {
	  System.out.println("\n Running test-> testmethod2");
  }
  

}
