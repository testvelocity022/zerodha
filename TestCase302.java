package testng2;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Sample1 {
	@Test(groups="buy") 
	public void tc04() {
		Reporter.log("Test case 04 Exeuted",true);
		
	}
	
	@Test(groups="buy") 
	public void tc05() {
		Reporter.log("Test case 05 Exeuted",true);
		
	}
	
	@Test(groups="sell") 
	public void tc06() {
		Reporter.log("Test case 06 Exeuted",true);
		
	}

}
