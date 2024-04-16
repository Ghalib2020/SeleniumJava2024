package StepDefinations;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PageObjectModel.rysefuellocator;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class alertTab {
	WebDriver driver;
	@Given("user is in rysefuel website")
	public void user_is_in_rysefuel_website() throws InterruptedException, AWTException {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		
//		driver.get("https://rysesupps.com/collections/ryse-fuel-energy-drink");
//		Thread.sleep(3000);
		
//		Robot rb=new Robot();
//		rb.keyPress(KeyEvent.VK_CONTROL);
		rysefuellocator RF = new rysefuellocator(driver);
//		RF.FirstProduct().click();
//		rb.keyPress(KeyEvent.VK_CONTROL);
		
		// Handling alerts in  a website
		//to accept an alart
//		driver.switchTo().alert().accept();
//		
//		//dismiss a alert
//		driver.switchTo().alert().dismiss();
//		
//		//to type anything in alert
//		driver.switchTo().alert().sendKeys("ABCD");
		
		
		
		
		//handle tab
		driver.get("https://www.capitalone.com/");
		Thread.sleep(3000);
		
		
		RF.Insta().click();
		Thread.sleep(3000);
		//RF.LoginInsta().click();
		
		//How many tabs are open in current time
		ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());
		//0=capital=now in citi
		//1=inta
		//move control from main tab to next tab
		driver.switchTo().window(tabs.get(1));
		RF.LoginInsta().click();
		
		driver.switchTo().window(tabs.get(0));
		RF.Insta().click();
		Thread.sleep(3000);
		
//		ArrayList<String> tabs1 = new ArrayList<String> (driver.getWindowHandles());
//		
//		driver.switchTo().window(tabs1.get(2));
//		RF.LoginInsta().click();
//		//0=citbank
//		//1=insta
//		Thread.sleep(5000);
//		driver.quit();
		
	   
	
	
	
	
	}

	
	   



}
