package groww;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MutualFund {
	
private WebDriver driver;
	
	@FindBy (xpath = "(//div[@class='ic23Div valign-wrapper onMount-appear-done onMount-enter-done'])[1]")
	private WebElement Nifty;
	
	@FindBy (xpath = "//input[@id='login_email1']")
	private WebElement email;
	
	public MutualFund(WebDriver driver) 
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
	
	public void clickNifty()
	{
		
		Nifty.click();
		
		
	}	

}
