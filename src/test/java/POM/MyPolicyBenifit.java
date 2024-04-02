package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MyPolicyBenifit 
{
	WebDriver ldriver;
	WebDriverWait wait;
	
	public MyPolicyBenifit(WebDriver rdriver)
	{
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
		wait = new WebDriverWait(rdriver, 90);
		
	}
	@FindBy (xpath="//table[@id='ctl00_PageBodyControls_GrdpolicyMaster']//tbody//tr[2]//td[2]")
	@CacheLookup
	WebElement policy_no;

	public String check_policyNo() throws Exception
	{
		Thread.sleep(2000);
	String r=	policy_no.getText();
	return r;
	}
}
