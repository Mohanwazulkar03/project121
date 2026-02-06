package testCases;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import PageObject.AccountRegistrationPage;
import PageObject.HomaPage;

public class TC001_Accountregistration {
	public WebDriver driver;
	
	@BeforeClass
	public void setup() {
		driver =new ChromeDriver();
		driver.get("https://www.opencart.com/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
	}
@AfterClass
	public void tearDown() {
		
		driver.quit();
		
	}
	@Test
	public void registration() throws InterruptedException {
		
		HomaPage hm=new HomaPage(driver);
		hm.clickRegister();
		
		AccountRegistrationPage arp=new AccountRegistrationPage(driver);
		Thread.sleep(10);
		//arp.userName("Mohan@778");
		arp.firstName("mohan77868");
		arp.lastName("Test");
		arp.email("mohan@Test.com");
		arp.country("India");
		arp.password("@345676668");
		
	}
}
