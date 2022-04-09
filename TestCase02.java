package pom;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import config.Configuration;

public class TestCase02 {
	
	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException {
		
		//@BeforeClass
		System.setProperty("webdriver.chrome.driver", Configuration.driverPath);
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		//@AfterClaass
		//Driver.quit
		
		//@Before Method
		driver.get("https://www.facebook.com/signup");
		
		//@AfterMethod
		driver.navigate().refresh();
		
		
		
		Signup_POM ss = new Signup_POM(driver);
		Utility util = new Utility();
		
		//@Test
		ss.enterFirstName(util.readExcelData(1, 0));
		ss.enterLastName(util.readExcelData(1, 1));
		ss.enterEmail(util.readExcelData(1, 2));
		ss.enterNewPassword(util.readExcelData(1, 3));
		ss.clickOnRadio();
		ss.selectMonth(util.readExcelData(1, 4));
		
		Thread.sleep(5000);
		driver.navigate().refresh();
		
		
		//@Test
		ss.enterFirstName(util.readExcelData(2, 0));
		ss.enterLastName(util.readExcelData(2, 1));
		ss.enterEmail(util.readExcelData(2, 2));
		ss.enterNewPassword(util.readExcelData(2, 3));
		ss.clickOnRadio();
		ss.selectMonth(util.readExcelData(2, 4));
		
		Thread.sleep(5000);
		driver.navigate().refresh();
		
		Thread.sleep(3000);
		driver.navigate().refresh();
		
		//@Test
		ss.enterFirstName("Dinesh");
		ss.enterLastName("Test3");
		ss.enterEmail("dinesh@gamil.com");
		ss.enterNewPassword("1111111");
		ss.clickOnRadio();
		ss.selectMonth("Nov");
		
		Thread.sleep(3000);
		driver.navigate().refresh();
		//@Test
		ss.enterFirstName(" ");
		ss.enterLastName(" ");
		ss.enterEmail(" ");
		ss.enterNewPassword(" ");
		ss.clickOnRadio();
		ss.selectMonth("Dec");
		
		
	}

}
