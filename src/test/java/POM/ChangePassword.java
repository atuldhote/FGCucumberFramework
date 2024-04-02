package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ChangePassword {
	WebDriver ldriver;
	WebDriverWait wait;
	
	public ChangePassword(WebDriver rdriver)
	{
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
		wait = new WebDriverWait(rdriver, 90);
		
	}
	@FindBy (xpath="//b[contains(text(),'FGH1108748 ')]")
	@CacheLookup
	WebElement welcomeuser;
	
	@FindBy (id="ctl00_PageBodyControls_txtOldPWD")
	@CacheLookup
	WebElement oldpassword;
	
	@FindBy (id="ctl00_PageBodyControls_txtNewPWD")
	@CacheLookup
	WebElement newpassword;
	
	@FindBy (id="ctl00_PageBodyControls_txtConfirmPWD")
	@CacheLookup
	WebElement confpassword;
	
	@FindBy (id="ctl00_PageBodyControls_btnChangePWD")
	@CacheLookup
	WebElement submit;
	
	@FindBy (xpath="(//span[@id='ctl00_PageBodyControls_lbl_Message']//span//b)[1]")
	@CacheLookup
	WebElement passwordupdateresponcemassage;
	
	public void sendoldpassword(String oldpass)
      {
		oldpassword.sendKeys(oldpass);
	  }
	public void sendNewpassword(String newpass)
    {
		newpassword.sendKeys(newpass);
	  }
	public void sendConfpassword(String confpass)
    {
		confpassword.sendKeys(confpass);
	}
	public void clicksubmitbutton()
    {
		if(submit.isDisplayed()==true) {
			submit.click();
		}
			
	}
	public String getpasswordupdateresponcemassage()
    {
		
	return 	passwordupdateresponcemassage.getText();	
	}
}
