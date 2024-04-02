package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SecondMedic {
	WebDriver ldriver;
	WebDriverWait wait;
	
	
	@FindBy(xpath="//img[@class='form-image']")
	@CacheLookup
	 WebElement logo;
	
	@FindBy(id="name")
	@CacheLookup
	 WebElement FullName;
	
	@FindBy(xpath="//input[@id='contact']")
	@CacheLookup
	 WebElement MobileNumber;
	
	@FindBy(xpath="//input[@id='email']")
	@CacheLookup
	 WebElement email;
	
	@FindBy(xpath="//select[@name='age']")
	@CacheLookup
	 WebElement SelectYourAge;
	
	@FindBy(id="city")
	@CacheLookup
	 WebElement pincode;
	
	@FindBy(xpath="//button[text()='Proceed']")
	@CacheLookup
	 WebElement ProcceedButton;
	
	public SecondMedic(WebDriver rdriver)
	 {
		 ldriver = rdriver;
			PageFactory.initElements(rdriver, this);
			wait = new WebDriverWait(rdriver, 90);
		 
	 }
	public boolean verifyLogo()
	{ boolean logodisplay=logo.isDisplayed();
		return logodisplay;
	}
	
	public void sendfullname(String fullname) 
	{
		FullName.sendKeys(fullname);
	}
	
	public void sendMobileNo(String MobileNo) 
	{
		MobileNumber.sendKeys(MobileNo);
	}
	
	public void sendEmail(String emailid) 
	{
		email.sendKeys(emailid);
	}
	public void selectage(WebElement SelectYourAge,int age) 
	{
		Select s=new Select(SelectYourAge);
		s.selectByIndex(age);
	}
	public void sendPincode(String pincodeno) 
	{
		pincode.sendKeys(pincodeno);
	
	}
	
	public void clickproccedbutton() 
	{
		ProcceedButton.click();
		
	}
	
}
