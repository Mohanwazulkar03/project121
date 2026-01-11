package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomaPage extends BasePage{
	
	
	public HomaPage(WebDriver driver) {
		
		super(driver);
		
	}

	
	@FindBy(xpath="")
	WebElement lnkMyAccount;
	
	@FindBy(xpath="//a[@class='btn btn-black navbar-btn']")
	WebElement lnkRegister;
	
	
	public void clickMyAccount() {
		
		lnkMyAccount.click();
	}
	
public void clickRegister() throws InterruptedException {
	Thread.sleep(10);
	lnkRegister.click();
	}

}
