package TestNGPack;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class FirstTestNGClass {
  
	@Test
  public void method1()
  {
	  Reporter.log("method1",true);
  }
	
	@Test
	  public void method2()
	  {
		int i=0;
		int c=8/i;
		Reporter.log("method2");
	  }
	
	@Test
	  public void method3()
	  {
		  Reporter.log("method3");
	  }
	
	@Test
	  public void method4()
	  {
		  Reporter.log("method4");
	  }
  
 
}
