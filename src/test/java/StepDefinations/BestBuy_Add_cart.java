package StepDefinations;

import java.awt.event.ActionEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import PageObjectModel.BestBuy;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class BestBuy_Add_cart {
	WebDriver driver;
	
	@Given("user is in Bestbuy HomePage")
	public void user_is_in_bestbuy_home_page() throws InterruptedException {
		
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.bestbuy.com/");
		Thread.sleep(5000);
	
	}

	@When("user click on a product")
	public void user_click_on_a_product() throws InterruptedException {
		BestBuy BB=new BestBuy(driver);
		Actions act=new Actions(driver);
		act.moveToElement(BB.ProductOne()).click().build().perform();
		//BB.ProductOne().click();
		Thread.sleep(5000);
	   
	}

	@And("user click add to cart")
	public void user_click_add_to_cart() throws InterruptedException {
		BestBuy BB=new BestBuy(driver);
	   BB.btnAddtoCart().click();
	   Thread.sleep(2000);
	   
	}

	@Then("validate product is added to cart")
	public void validate_product_is_added_to_cart() throws InterruptedException {
		BestBuy BB=new BestBuy(driver);
	    BB.btnCart().click();
	    Thread.sleep(10000);
	    driver.close();
	  
	}

}
