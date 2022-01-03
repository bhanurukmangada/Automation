package practice;

import org.testng.annotations.Test;







public class Testng {

	@Test (enabled=false)
		public void test1(){
		Reporter.log("1",true);
		
				
		}
	@Test
	public void test2()
	{
		Reporter.log("2", true);
	}

}
