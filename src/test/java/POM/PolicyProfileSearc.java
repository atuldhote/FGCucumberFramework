package POM;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PolicyProfileSearc {
	WebDriver ldriver;
	WebDriverWait wait;
	
	public PolicyProfileSearc(WebDriver rdriver)
	{
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
		wait = new WebDriverWait(rdriver, 90);
		
	}
	@FindBy (id="ctl00_PageBodyControls_GrdSchemeMaster_ctl02_lnkBtnProfile")
	@CacheLookup
	WebElement profile;
	
	@FindBy (id="ctl00_PageBodyControls_GrdSchemeMaster_ctl02_imgHC")
	@CacheLookup
	WebElement healthCard;
	
	@FindBy (id="ctl00_PageBodyControls_GrdSchemeMaster_ctl02_lnkMemberCardSearch")
	@CacheLookup
	WebElement view;
	@FindBy (xpath="//table[@id='ctl00_PageBodyControls_GrdSchemeMaster']//tbody//tr[2]//td[2]")
	@CacheLookup
	WebElement clintcode ;
	
	@FindBy (xpath="//table[@id='ctl00_PageBodyControls_GrdSchemeMaster']//tbody//tr[2]//td[3]")
	@CacheLookup
	WebElement clintname ;
	
	@FindBy (xpath="//table[@id='ctl00_PageBodyControls_GrdSchemeMaster']//tbody//tr[2]//td[4]")
	@CacheLookup
	WebElement policy_Number ;
	
	public String check_policy_Number()
	{
		return policy_Number.getText();
	}
	public String check_ClientName()
	{
		return clintname.getText();
	}
	
	public String check_clintcode()
	{
		return clintcode.getText();
	}
	public void checkProfile()
	{
		//return profile.isDisplayed();
		profile.click();
	}
	public void checkhealthCard(WebDriver driver)
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", healthCard);

		//healthCard.click();
	}
	public void checkview(WebDriver driver)
	
	{
		//JavascriptExecutor js = (JavascriptExecutor) driver;
		//js.executeScript("arguments[0].click();", view);
	view.click();
	}
    public String  getclintcode()
	
	{  String code=clintcode.getText();
		return  code;
	}
    public String  getclintname()
	
   	{  String name=clintname.getText();
   		return  name;
   	}
    
    
   
}
