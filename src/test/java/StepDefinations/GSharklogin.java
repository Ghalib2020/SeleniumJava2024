package StepDefinations;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

import PageObjectModel.gymsharkloator;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GSharklogin {
	
	WebDriver driver;
	@Given("user is in gymshark website")
	public void user_is_in_gymshark_website() throws InterruptedException {
		//syntex for implicit wait
		
		
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		//long time=10;
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	//	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); This implicitly method is depricated
		
		driver.get("https://www.gymshark.com/");
		Thread.sleep(6000);
	
	}
	
	@When("user click the account button")
	public void user_click_the_account_button() throws InterruptedException, AWTException {
//		long time = 10;
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(time));
		Robot rb=new Robot();
		rb.keyPress(KeyEvent.VK_ESCAPE);
		rb.keyRelease(KeyEvent.VK_ESCAPE);
	

		
		gymsharkloator GS =new gymsharkloator(driver);
//		GS.btnClose().click();
		Thread.sleep(4000);
		GS.accountbtn().click();
	
		
	}
	
	
	@When("user enter valid email {string}")
	public void user_enter_valid_email(String string) throws InterruptedException {
		gymsharkloator GS =new gymsharkloator(driver);
		GS.email().sendKeys(string);
	//	Thread.sleep(4000);
	   	}
	
	@When("user enter valid password {string}")
	public void user_enter_valid_password(String string) throws InterruptedException {
		gymsharkloator GS =new gymsharkloator(driver);
		//assertEquals("Enter password", GS.Password().getAttribute("placeholder"));
	   GS.Password().sendKeys(string);
	//   Thread.sleep(2000);
	}
	@When("user click the login button")
	public void user_click_the_login_button() throws InterruptedException {
		gymsharkloator GS =new gymsharkloator(driver);
	   GS.loginbtn().click();
	//   Thread.sleep(5000);
	  
	 
	}

	@Then("user will be able to log in")
	public void user_will_be_able_to_log_in() {
		gymsharkloator GS =new gymsharkloator(driver);
		String Expected="YOUR GYMSHARK ACCOUNT";
		String Actual=GS.HomePageHeader().getText();
		
		assertEquals(Actual,Expected);//if failed, execution will aborted
		System.out.println("First assertion passed");
		//assertNotequal
		
		assertEquals("message","ADDRESS BOOK",GS.AddressBook().getText());
		System.out.println("Second assertion passed");
		assertTrue(GS.btnReturn().isEnabled());
		System.out.println("Third assertion passed");
		//assertFalse
		//assertNull
		
		driver.close();
		
		
		
	}
	
	@Then("user will be able to log in soft assertion")
	public void user_will_be_able_to_log_in_soft_assertion() {
		//to use soft assertion we need to create an Object of SoftAssert class
		
		gymsharkloator GS =new gymsharkloator(driver);
//		String Expected="YOUR GYMSHARK ACCOUNT";
//		String Actual=GS.HomePageHeader().getText();
		// assertion (Actulal, Expected);
		
		SoftAssert sft=new SoftAssert();
		sft.assertEquals( GS.HomePageHeader().getText(),"YOUR GYMSHARK ACCOUNT","The Header match with expected header");
		System.out.println("First assertion passed");
		
		//                       ADDRESSBOOK
		sft.assertEquals(GS.AddressBook().getText(),"ADDRESS BOOK");
		System.out.println("Second assertion passed");
		
		sft.assertTrue(GS.btnReturn().isEnabled());
		System.out.println("Third assertion passed");
		driver.close();
		sft.assertAll();
		

	   
	}


	




}
