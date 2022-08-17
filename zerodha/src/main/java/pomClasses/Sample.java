package pomClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Sample {
@FindBy(xpath="//input[@id='email']") private WebElement userName;
	
	@FindBy(xpath="//input[@id='pass']") private WebElement password;	
	
	@FindBy(xpath="//button[@type='submit']") private WebElement loginBtn;
	
	
	//intialization
	
	Sample(WebDriver driver){
		PageFactory.initElements(driver, this);		
	}
	
	
	//Usage /actions
	
	public void enterUserID(String user) {
		userName.sendKeys(user);
	}
		
	public void enterPassword(String pass) {
		password.sendKeys(pass);
	}
	
	public void clickOnLogin() {
		loginBtn.click();
	}
	
}



