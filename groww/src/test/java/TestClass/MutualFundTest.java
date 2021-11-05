package TestClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Base.BaseClass;
import groww.Login;
import groww.MutualFund;

public class MutualFundTest extends BaseClass{
	
	private WebDriver driver;
	Login loginpage;
	MutualFund mf;
	
	
	
	
	
	@BeforeTest
	@Parameters ("browser")
	public void launchBrowser(String browser) throws InterruptedException {
		if(browser.equalsIgnoreCase("Chrome"))
		{
			driver = openChromeBrowser();
		}
		
		if(browser.equalsIgnoreCase("firefox"))
		{
			driver = openFirefoxBrowser();
		}
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.get("https://groww.in/");
	}
	
	@BeforeClass
	public void createPOMobject()
	{
		loginpage = new Login(driver);
		mf = new MutualFund(driver);
	}
	
	@BeforeMethod
	public void loginToApplocation() throws InterruptedException
	{
		loginpage.LoginButton();
		
		loginpage.EmailId();
		
		loginpage.BContinue();
	
		loginpage.Password();
		
		loginpage.Submit();
		
		loginpage.PIN();
		
		
	}
	
	@Test
	public void verify()
	{
		mf.clickNifty();
	}
	
	@AfterMethod
	public void logoutApplication()
	{
		System.out.println("End");
	}
	
	@AfterClass
	public void clearPOMobject() throws InterruptedException
	{
		loginpage = null;
		
	}
	
	@AfterTest
	public void closeBrowser() throws InterruptedException
	{
		Thread.sleep(5000);
		driver.quit();
		driver = null;
		System.gc();
	}

}
