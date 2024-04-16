package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class rysefuellocator {
	
public WebDriver driver;
	
	public rysefuellocator(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath="//img[@alt=\"Account\"]")
	WebElement accountbtn;
	public WebElement accountbtn() {
		return accountbtn;
	}
	
	@FindBy(xpath="//input[@id=\"customer_email\"]")
	WebElement email;
	public WebElement email() {
		return email;
	}
	
	@FindBy(xpath="//input[@id=\"customer_password\"]")
	WebElement Password;
	public WebElement Password() {
		return Password;
	}
	
	
	
	@FindBy(xpath="//a[@class=\"go-fuel w-inline-block\"]/h3[1]")
	WebElement FirstProduct;
	public WebElement FirstProduct() {
		return FirstProduct;
	}

//	@FindBy(id="toggle-label")
//	WebElement logbtn;
//	public WebElement logbtn() {
//		return logbtn;
//	}
	
	
	@FindBy(xpath="//input[@value=\"Login\"]")
	WebElement loginbtn;
	public WebElement loginbtn() {
		return loginbtn;
		
	}
	
	
	@FindBy(xpath="//a[@aria-label=\"Instagram\"]")
	WebElement Insta;
	public WebElement Insta() {
		return Insta;
		
	}
	
	@FindBy(xpath="//a[text()='Log in']")
	WebElement LoginInsta;
	public WebElement LoginInsta() {
		return LoginInsta;
		
	}
	
//	@FindBy(xpath="//h1[@class=\"font-heading font-bold text-xl my-6 uppercase\"]")
//	WebElement HomePageHeader;
//	public WebElement HomePageHeader() {
//		return HomePageHeader;
		
//	}
	
//	@FindBy(xpath="//div[@class=\"text-error text-xs mt-1\"]")
//	WebElement error;
//	public WebElement error() {
//		return error;
//	}

}