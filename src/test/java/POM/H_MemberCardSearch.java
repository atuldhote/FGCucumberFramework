package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class H_MemberCardSearch {

	WebDriver ldriver;
	WebDriverWait wait;
	public  H_MemberCardSearch(WebDriver rdriver)
	{
		 ldriver = rdriver;
			PageFactory.initElements(rdriver, this);
			wait = new WebDriverWait(rdriver, 90);
	}
	
	@FindBy (id="ctl00_PageBodyControls_GrdSchemeMaster_ctl02_lnkBtnProfile")
	 @CacheLookup
	 WebElement Profile;
	
	@FindBy (id="ctl00_PageBodyControls_GrdSchemeMaster_ctl02_lnkbtnHealthcard")
	 @CacheLookup
	 WebElement healthCard;
	
	@FindBy (id="ctl00_PageBodyControls_GrdSchemeMaster_ctl02_lnkbtn")
	 @CacheLookup
	 WebElement viewCertificate;
	
	
	public void clickProfilelink() {
		Profile.click();	
	}
	
	public void clickhealthCardlink() {
		healthCard.click();	
	}
	
	public void clickViewCertificatelink() {
		viewCertificate.click();	
	}
	
	
	
}
