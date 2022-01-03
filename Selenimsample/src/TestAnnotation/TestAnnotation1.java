package TestAnnotation;





import org.testng.annotations.Test;



import TestNG.TestNGsample;

public class TestAnnotation1 {
  @Test
  public void testmethod1() {
	  TestNGsample obj=new TestNGsample();
	  int result = obj.sumNumber(1, 2);
	  System.out.println("Running test-> testmethod1");
  }
  @Test
  public void testmethod2() {
	  System.out.println("Running test-> testmethod2");
  }
  @Test
  public void testmethod3() {
	  System.out.println("Running test-> testmethod3");
  }
}
