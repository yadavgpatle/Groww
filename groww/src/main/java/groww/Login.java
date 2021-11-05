package groww;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {
	
	private WebDriver driver;
	
	@FindBy (xpath = "//span[text()='Login/Register']")
	private WebElement loginbutton;
	
	@FindBy (xpath = "//input[@id='login_email1']")
	private WebElement email;
	
	@FindBy (xpath = "//span[text()='Continue']")
	private WebElement Bcontinue;
	
	@FindBy (xpath = "//input[@id='login_password1']")
	private WebElement password;
	
	@FindBy (xpath = "//span[text()='Submit']")
	private WebElement submit;
	
	@FindBy (xpath = "(//input[@autocomplete='new-password'])[1]")
	private WebElement pin1;
	
	@FindBy (xpath = "(//input[@autocomplete='new-password'])[2]")
	private WebElement pin2;
	
	@FindBy (xpath = "(//input[@autocomplete='new-password'])[3]")
	private WebElement pin3;
	
	@FindBy (xpath = "(//input[@autocomplete='new-password'])[4]")
	private WebElement pin4;
	
	@FindBy (xpath = "")
	private WebElement drop;
	
	@FindBy (xpath = "")
	private WebElement logout;
	
	public Login(WebDriver driver) 
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
	
	public void LoginButton()
	{
		loginbutton.click();
		
	}	
	
	public void EmailId()
	{
		email.sendKeys("yadavpatle@gmail.com");
		
	}
	
	public void BContinue()
	{
		
		Bcontinue.click();
		
	}
	
	public void Password()
	{
		password.sendKeys("1velocity@");	
	}
	
	public void Submit()
	{
		submit.click();
	}
		
	
	public void PIN()
	{
		pin1.sendKeys("8");
		pin2.sendKeys("1");
		pin3.sendKeys("4");
		pin4.sendKeys("9");
	}
	
	
	public void Logout()
	{
		logout.click();
	}

}

