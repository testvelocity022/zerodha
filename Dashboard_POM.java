package testng2;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Sample {

	
	@Test (groups = "login")
	public void tc01() {
		Reporter.log("Test case 01 Exeuted",true);
		
	}
	
	@Test (groups="sell") 
	public void tc02() {
		Reporter.log("Test case 02 Exeuted",true);
		
	}
	
	@Test  (groups="buy") 
	public void tc03() {
		Reporter.log("Test case 03 Exeuted",true);
		
		
	}
}
