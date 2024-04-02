package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

//import base.BaseClass;

public class UpdateMobileEmail  {
	WebDriver ldriver;
	WebDriverWait wait;
	
	public UpdateMobileEmail(WebDriver rdriver)
	{
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
		wait = new WebDriverWait(rdriver, 90);
		
	}
	@FindBy (id="ctl00_PageBodyControls_rblUpdate_0")
	@CacheLookup
	WebElement mobilenobutton;
	
	@FindBy (id="ctl00_PageBodyControls_rblUpdate_1")
	@CacheLookup
	WebElement emailbutton;
	
	@FindBy (id="ctl00_PageBodyControls_rblUpdate_2")
	@CacheLookup
	WebElement bothbuton;
	
	@FindBy (id="ctl00_PageBodyControls_txtNewMobileNo")
	@CacheLookup
	WebElement newMobileno;
	
	@FindBy (id="ctl00_PageBodyControls_txtNewEmailId")
	@CacheLookup
	WebElement emailID;
	
	@FindBy (id="ctl00_PageBodyControls_txtOTP")
	@CacheLookup
	WebElement enterOTP;
	
	@FindBy (id="ctl00_PageBodyControls_btnOTP")
	@CacheLookup
	WebElement sendOTP;
	
	@FindBy (id="ctl00_PageBodyControls_btnChange")
	@CacheLookup
	WebElement submit;
	
	@FindBy (xpath="//b[text()='Records Updated Successfully']")
	@CacheLookup
	WebElement sucssesfullmassage;
	

	@FindBy (xpath="//span[text()='Enter Valid OTP']")
	@CacheLookup
	WebElement entervalidOTPmassage;
	
	public void clickMobilenoradiobutton() throws Exception
	{Thread.sleep(3000);
		mobilenobutton.click();
	}
	public void clickEmailradiobutton() throws Exception
	{Thread.sleep(3000);
		emailbutton.click();
	}
	public void clicbothradiobutton() throws Exception
	{ Thread.sleep(3000);
		bothbuton.click();
	}
	public void sendnewMobileno(String newmbno) throws Exception
	{Thread.sleep(2000);
		newMobileno.sendKeys(newmbno);
	}
	
	public void sendemailID(String eMAIL) throws Exception
	{ Thread.sleep(2000);
		emailID.sendKeys(eMAIL);
	}
	
	public void Click_sendotp() throws Exception
	{   sendOTP.click();
	 
	
	}
	
	public void sendotp(String otp) throws Exception
	{ 
	 Thread.sleep(2000);
		enterOTP.sendKeys(otp);
	}
	public void clicksubmitbutton()
	{
		submit.click();
	}
	public boolean checkupdatesuccessfulmassage() 
	{ boolean massage= sucssesfullmassage.isDisplayed();
	return massage;
	}
	public boolean checkenterValidOTPmassage() 
	{ boolean otpmassage= entervalidOTPmassage.isDisplayed();
	return otpmassage;
	}
}
