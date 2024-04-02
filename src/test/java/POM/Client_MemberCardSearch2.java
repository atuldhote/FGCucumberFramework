package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Client_MemberCardSearch2 {

	WebDriver ldriver;
	WebDriverWait wait;
	public  Client_MemberCardSearch2(WebDriver rdriver)
	{
		 ldriver = rdriver;
			PageFactory.initElements(rdriver, this);
			wait = new WebDriverWait(rdriver, 90);
	}
	
	@FindBy (id="ctl00_PageBodyControls_lblPolicyNo")
	 @CacheLookup
	 WebElement policy_no;
	
	
	
	
	
	public String check_policy_No() {
		return policy_no.getText()	;
	}
	
	
	
	
	
}
