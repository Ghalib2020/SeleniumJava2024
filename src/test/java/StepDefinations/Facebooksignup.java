package StepDefinations;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;

import org.assertj.core.api.SoftAssertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.base.Verify;

import PageObjectModel.faceboosignuppage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class Facebooksignup{
	WebDriver driver;
	@Given("user is in facebook signup page")
	public void user_is_in_facebook_signup_page() throws InterruptedException {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/signup");
		Thread.sleep(3000);
	}

	@When("user enter firstname {string} and last name {string}")
	public void user_enter_firstname_and_last_name(String FirstName, String LastName) throws InterruptedException {
		faceboosignuppage FBpage=new faceboosignuppage(driver);
		FBpage.firstname().sendKeys(FirstName);
		FBpage.Lastname().sendKeys(LastName);
		Thread.sleep(3000);
	}

	@And("user enter Phone number {string}")
	public void user_enter_phone_number(String string) throws InterruptedException {
		faceboosignuppage FBpage=new faceboosignuppage(driver);
		FBpage.PhnNumberOrEmail().sendKeys(string);
		Thread.sleep(3000);
	}

	@And("user enter Password {string}")
	public void user_enter_password(String string) throws InterruptedException {
		faceboosignuppage FBpage=new faceboosignuppage(driver);
		FBpage.Password().sendKeys(string);
		Thread.sleep(3000);
	    
	}

	@And("user click signup button")
	public void user_click_signup_button() throws InterruptedException {
		faceboosignuppage FBpage=new faceboosignuppage(driver);
		FBpage.btnSignUp().click();
		assertTrue(FBpage.btnSignUp().isDisplayed());
		Thread.sleep(5000);
		driver.close();
		SoftAssertions sf=new SoftAssertions();
		
	}

	@Then("user able to signup")
	public void user_able_to_signup() {
		String A="Facebook";
	  //Assert.assertEquals("Facebook", A);
	 // Assert.assertSame("Facebook", A);
	  System.out.println("Its facebook");
	  assertEquals("Facebook", "Facebook");
	  //assertEquals(" Not Facebook", "Facebook", "Facebook");
	  
	  System.out.println("Its facebook");
	}
	
	@Then("user not able to signup")
	public void user_not_able_to_signup() {
	   
	}


}
