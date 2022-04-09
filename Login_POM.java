package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Signup_POM {
	
	//Declaration
	@FindBy(xpath="//input[@name='firstname']")private WebElement fName;
	
	@FindBy(xpath="//input[@name='lastname']")private WebElement lName;

	@FindBy(xpath="//input[@name='reg_email__']")private WebElement email;
	
	@FindBy(xpath="//input[@name='reg_passwd__']")private WebElement newPass;	
	
	@FindBy(xpath="(//input[@type='radio'])[2]")private WebElement radioBtn;
	
	@FindBy(xpath="//select[@name='birthday_month']")private WebElement month;


	//Intilization
	
	public Signup_POM(WebDriver ddd){
		PageFactory.initElements(ddd, this);		
	}
	
	
	//Usage
	public void enterFirstName(String name) {
		fName.sendKeys(name);
	}
	
	public void enterLastName(String lastName) {
		lName.sendKeys(lastName);
	}
	
	public void enterEmail(String emailID) {
		email.sendKeys(emailID);
	}
	
	public void enterNewPassword(String pass) {
		newPass.sendKeys(pass);
	}
	
	public void clickOnRadio() {
		radioBtn.click();
	}
	
	public void selectMonth(String mon) {
		Select sel = new Select(month);
		sel.selectByVisibleText(mon);
		
	}
	
	
	public void verifyPage() {
		
		
		
	}
	

	
}
