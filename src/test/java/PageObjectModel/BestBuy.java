package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BestBuy {
	private WebDriver driver;
	
	public BestBuy(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	

	@FindBy(xpath="//div[@class=\"nba-container v-bg-pure-white lv popular-picks\"]/ul/li[3]")
	WebElement ProductOne;
	public WebElement ProductOne() {
		return ProductOne;
	}
	
	
	@FindBy(xpath="//button[@data-button-state=\"ADD_TO_CART\"]")
	WebElement btnAddtoCart;
	public WebElement btnAddtoCart() {
		return btnAddtoCart;
	}
	
	@FindBy(xpath="//span[@class=\"cart-label\"]")
	WebElement btnCart;
	public WebElement btnCart() {
		return btnCart;
	}
	
	@FindBy(name="firstname")
	WebElement typeFirstName;
	
	public WebElement typeFirstName() {
		return typeFirstName;
	}

}
