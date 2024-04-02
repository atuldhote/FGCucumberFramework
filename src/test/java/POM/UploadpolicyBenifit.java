package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class UploadpolicyBenifit {
	WebDriver ldriver;
	WebDriverWait wait;
	
	 
	 @FindBy (xpath="//table[@id='ctl00_PageBodyControls_GrdpolicyMaster']//tbody//tr[2]//td[2]")
	 @CacheLookup
	 WebElement policyno;
	 
	 public UploadpolicyBenifit(WebDriver rdriver)
	 {
		 ldriver = rdriver;
			PageFactory.initElements(rdriver, this);
			wait = new WebDriverWait(rdriver, 90);
		 
	 }
	 
	
	 public String getpolicyno()
	 {
		 String pno=policyno.getText();
		 return pno;
	 }
	
}
