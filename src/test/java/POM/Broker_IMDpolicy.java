package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Broker_IMDpolicy 
{

	WebDriver ldriver;
	WebDriverWait wait;
	
	public Broker_IMDpolicy(WebDriver rdriver)
	{
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
		wait = new WebDriverWait(rdriver, 90);
		
	}
	@FindBy (id="ctl00_PageBodyControls_txtSearchfor")
	@CacheLookup
	WebElement searchFor;
	
	@FindBy (id="ctl00_PageBodyControls_ddllist")
	@CacheLookup
	WebElement searchForCriteriaDropdown;
	
	@FindBy (id="ctl00_PageBodyControls_ddllist")
	@CacheLookup
	WebElement searchButton;
	
	@FindBy (id="ctl00_PageBodyControls_GrdSchemeMaster_ctl02_lnkBtnProfile")
	@CacheLookup
	WebElement profilelink;
	
	
	@FindBy (id="ctl00_PageBodyControls_GrdSchemeMaster_ctl02_imgHC")
	@CacheLookup
	WebElement healthcardlink;
	
	public void senddataSerchforfield(String data) {
		searchFor.sendKeys(data);
	}
	
	public void selectSerchCriteriadropdown(String data) {
		searchForCriteriaDropdown.sendKeys(data);
		Select s=new Select(searchForCriteriaDropdown);
		s.selectByVisibleText(data);
	}
	
	public void clickSerchButton() {
		searchButton.click();
	}
	
	public void clickProfileLink() {
		profilelink.click();
	}
	
	public void clickHealthCardLink() {
		healthcardlink.click();
	}
	
}
