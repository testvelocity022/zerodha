package testClasses;

import org.testng.annotations.BeforeClass;

import project_Automation.BaseClass;
import project_Automation.POM_Data;
import project_Automation.UtilityClass;

public class TC200 {

	@test
	
	@BeforeClass
	public void OpenBrowser() {
		
		 base=new BaseClass();                 //Base calss object
			
		driver=base.driverInit();
		
		    utl=new UtilityClass();                        //Utility class object
		   
		    data=new POM_Data(driver);
		       
	}
	
	
	
}
