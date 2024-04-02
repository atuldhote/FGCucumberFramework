package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {
	
	WebDriver ldriver;
	WebDriverWait wait;
	
	public LoginPage(WebDriver rdriver)
	{
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
		wait = new WebDriverWait(rdriver, 90);
		
	}
	@FindBy (xpath="//input[@id='RadioButtonList1_0']")
	@CacheLookup
	  WebElement groupbutton;
	@FindBy (xpath="//input[@id='RadioButtonList1_1']")
	@CacheLookup
	  WebElement Retailbutton;
	@FindBy (xpath="//input[@id='txtUserName']")
	@CacheLookup
	  WebElement txtUserName;
	
	@FindBy (xpath="//input[@id='txtPasswd']")
	@CacheLookup
	  WebElement txtPassWord;
	@FindBy (xpath="//input[@id='captchaText']")
	@CacheLookup
	  WebElement captcha;
	
	@FindBy(id="btnLogin")
	@CacheLookup
	WebElement btnLogin;
	
	@FindBy(id="txtOTP")
	@CacheLookup
	WebElement otp;
	
	@FindBy(id="verifyOTP")
	@CacheLookup
	WebElement verifyotp;
	
	@FindBy(id="btnPopup")
	@CacheLookup
	WebElement OKotp;
	
	
	@FindBy(id="lnkforgot")
	@CacheLookup
	WebElement forgotpassword;
	
	
	
	public void clickGroupraRadiobutton()
	{
		groupbutton.click();
	}
	
	public void setUserName(String uname)
	{
		txtUserName.sendKeys(uname);
	}
	
	public void setPassWord(String pwd)
	{
		
		txtPassWord.clear();
		txtPassWord.sendKeys(pwd);
	}
	
	public void entercaptcha() throws Exception
	{
		Thread.sleep(30000);
	}
	public void click_Login_Button()
	{
		btnLogin.click();
		//wait.until(ExpectedConditions.elementToBeClickable(btnLogin)).click();
	}
	public void sendotp()
	{ //if(otp.isDisplayed()==true) {
		
	
		otp.sendKeys("678123");
		System.out.println("Enter OTP");//}
	
	}
	public  void clickverifyotp()
	{//if(verifyotp.isDisplayed()==true) {
		verifyotp.click();}
	//}
	public  void clickOKpopup() throws Exception
	{
		
		
		OKotp.click();
		System.out.println("Click on OKotp");
	
	}
	public boolean checkotp_popup()
	{ //if(otp.isDisplayed()==true) {
	return	otp.isDisplayed();
	}
/*public void clickProfile()
	{
		wait.until(ExpectedConditions.elementToBeClickable(profileLink)).click();
	}*/
	
	/*public void clickLogOut()
	{
		wait.until(ExpectedConditions.elementToBeClickable(logoutlink)).click();
	}*/
	
}
