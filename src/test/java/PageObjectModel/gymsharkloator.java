package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class gymsharkloator {
	
	public WebDriver driver;
	
	public gymsharkloator(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath="//a[@title=\"account\"]/i[1]")
	WebElement accountbtn;
	public WebElement accountbtn() {
		return accountbtn;
	}
	
	@FindBy(id="login-email")
	WebElement email;
	public WebElement email() {
		return email;
	}
	
	@FindBy(id="current-password")
	WebElement Password;
	public WebElement Password() {
		return Password;
	}
	
	@FindBy(id="btn-login")
	WebElement loginbtn;
	public WebElement loginbtn() {
		return loginbtn;
		
	}
	
	@FindBy(xpath="//h1[@class=\"page-title_title__voXOX\"]")
	WebElement HomePageHeader;
	public WebElement HomePageHeader() {
		return HomePageHeader;
		
	}
	
	@FindBy(xpath="//article[@data-locator-id=\"address-mainAddress-read\"]")
	WebElement AddressBook;
	public WebElement AddressBook() {
		return AddressBook;
		
	}
	
	@FindBy(xpath="//a[@data-locator-id=\"address-returnAnItem-select\"]")
	WebElement btnReturn;
	public WebElement btnReturn() {
		return btnReturn;
		
	}
	
	@FindBy(xpath="//*[@id=\"dismissbutton2header1\"]")
	WebElement btnClose;
	public WebElement btnClose() {
		return btnClose;
		
	}
	
	

}
