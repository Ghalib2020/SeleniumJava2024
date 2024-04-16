package StepDefinations;

public class waitsConcept {

	//Why we use waits
	//Most of the web applications are developed using Ajax and Javascript. 
	//When a page is loaded by the browser the elements which we want to interact with may load at different time intervals.
	
	/*waits are mainly two types
	 * 1.implicit=The Implicit Wait in Selenium is used to tell the web driver to wait for a certain amount 
	 * of time before it throws a “No Such Element Exception”. 
	 * 
	 * 2.Explicit=The Explicit Wait in Selenium is used to tell the Web Driver to wait for certain conditions
	 *  (Expected Conditions) or maximum time exceeded before throwing “ElementNotVisibleException” exception.
	 *  explitly wait (log in button visible, 20)
	 *  WebDriverWait wait = new WebDriverWait(driver,20);
	 *  wait.condition(webelement.ispresent))
	 *  wait.until(x=5);
	 *  alertIsPresent()
elementSelectionStateToBe()
elementToBeClickable()
elementToBeSelected()
frameToBeAvaliableAndSwitchToIt()
invisibilityOfTheElementLocated()
invisibilityOfElementWithText()
presenceOfAllElementsLocatedBy()
presenceOfElementLocated()
textToBePresentInElement()
textToBePresentInElementLocated()
textToBePresentInElementValue()
titleIs()
titleContains()
visibilityOf()
visibilityOfAllElements()
visibilityOfAllElementsLocatedBy()
visibilityOfElementLocated()
	 * 
	 * 
	 * Difference Between Implicit Wait Vs Explicit Wait
Following is the main difference between implicit wait and explicit wait in Selenium:

Implicit Wait	Explicit Wait
Implicit Wait time is applied to all the elements in the script	Explicit Wait time is applied only to those elements which are intended by us
In Implicit Wait, we need not specify “ExpectedConditions” on the element to be located	In Explicit Wait, we need to specify “ExpectedConditions” on the element to be located
It is recommended to use when the elements are located with the time frame specified in Selenium implicit wait	It is recommended to use when the elements are taking long time to load and also for verifying the property of the element 
like(visibilityOfElementLocated, elementToBeClickable,elementToBeSelected)
	*/
	

}
