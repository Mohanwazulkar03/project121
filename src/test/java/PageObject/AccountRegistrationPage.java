package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountRegistrationPage extends BasePage{

	public AccountRegistrationPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
		
		
	}
	
	//locator
	
	//@FindBy(xpath="//input[@id='input-username']")
	//WebElement txtuname;
	
	@FindBy(xpath="//input[@id='input-firstname']")
	WebElement txtfname;
	
	@FindBy(xpath="//input[@id='input-lastname']")
	WebElement txtlname;
	
	@FindBy(xpath="//input[@id='input-email']")
	WebElement txtemail;
	
	@FindBy(xpath="//select[@id='input-country']")
	WebElement txtcntry;
	
	@FindBy(xpath="//input[@id='input-password']")
	WebElement txtpsw;
	
	@FindBy(xpath="//div[@class='bg-info']")
	WebElement captch;
	
	
	
	//public void userName(String uname) throws InterruptedException {
		//Thread.sleep(10);
		//txtuname.sendKeys(uname);
		
//	}
public void firstName(String fname) {
	txtfname.sendKeys(fname);
		
	}
public void lastName(String lname) {
	txtlname.sendKeys(lname);
	
}
public void email(String email) {
	txtemail.sendKeys(email);
	
}
public void country(String country) {
	txtcntry.sendKeys(country);
	
}
public void password(String psw) {
	txtpsw.sendKeys(psw);
	
}
public void selectImage() {
	captch.click();

}
}