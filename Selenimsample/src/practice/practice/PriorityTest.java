package practice.practice;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class PriorityTest {
  @Test(invocationCount=3,priority=1)
  public void test() {
	  Reporter.log("1", true);
	  
  }
  @Test
  public void test1() {
	  Reporter.log("2", true);
	  
  }
  
  
}
