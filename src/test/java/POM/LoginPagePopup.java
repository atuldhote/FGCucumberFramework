package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPagePopup {
	WebDriver ldriver;
	WebDriverWait wait;
	
	public LoginPagePopup(WebDriver rdriver)
	{
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
		wait = new WebDriverWait(rdriver, 90);
		
	}
	
	@FindBy(id="btnYes")
	@CacheLookup
	WebElement  popuplogin;
	
	public void clickpopuplogin()
	{ if (popuplogin.isDisplayed())
	{
		popuplogin.click();
	}
	}
	
	public boolean check_popuplogin()
	{ return popuplogin.isDisplayed();
	
	}
}
