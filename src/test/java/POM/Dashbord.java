package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class Dashbord {
	WebDriver ldriver;
	WebDriverWait wait;
	
		@FindBy (xpath="//b[contains(text(),'Welcome')]")
		 @CacheLookup
		 WebElement lblUserWelcome;
		
		@FindBy(id="lnkLoginOut")
		@CacheLookup
		WebElement logout;
		 
	 @FindBy (id="GrdSchemeMaster_ctl02_lnkProfile")
	 @CacheLookup
	 WebElement profillink;
	 
	 @FindBy (xpath="(//td[@align='left']//span)[1]")
	 @CacheLookup
	 WebElement clintname;
	 
	 @FindBy (xpath="(//td[@align='left']//span)[2]")
	 @CacheLookup
	 WebElement policytype;
	 
	 @FindBy (xpath="(//td[@align='left']//span)[3]")
	 @CacheLookup
	 WebElement policyno;
	 
	 public Dashbord(WebDriver rdriver)
	 {
		 ldriver = rdriver;
			PageFactory.initElements(rdriver, this);
			wait = new WebDriverWait(rdriver, 90);
		 
	 }
	 
	 public boolean verifylblUserWelcome()
	 {
		boolean lbl= lblUserWelcome.isDisplayed();
		return lbl;
		
	 }
	 public boolean logoutoptionvisible()
	 {
		boolean lgot= logout.isDisplayed();
		return lgot;
	 }
	 
	 public void clickProfilelink()
	 {
		 profillink.click();
	 }
	 public String getclintnmae()
	 {
		 String name=clintname.getText();
		 return name;
	 }
	 public String getpolicytype()
	 {
		 String type=policytype.getText();
		 return type;
	 }
	 public String getpolicyno()
	 {
		 String pno=policyno.getText();
		 return pno;
	 }
	 public void clicklogoutlink()
	 {
		 logout.click();;
		
	 }
}
