package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HR_MemberSearchData {
	WebDriver ldriver;
	WebDriverWait wait;
	public  HR_MemberSearchData(WebDriver rdriver)
	{
		 ldriver = rdriver;
			PageFactory.initElements(rdriver, this);
			wait = new WebDriverWait(rdriver, 90);
	}
	
	@FindBy (xpath="//input[@id='ctl00_PageBodyControls_txtSearchfor']")
	 @CacheLookup
	 WebElement searchFor;
	
	@FindBy (xpath="//input[@id='ctl00_PageBodyControls_rdbStatus_0']")
	 @CacheLookup
	 WebElement statusInActiveRadioButton;
	
	@FindBy (xpath="//input[@id='ctl00_PageBodyControls_rdbStatus_1']")
	 @CacheLookup
	 WebElement statusActiveRadioButton;
	
	@FindBy (xpath="//input[@id='ctl00_PageBodyControls_rdbStatus_2']")
	 @CacheLookup
	 WebElement statusALLRadioButton;
	
	@FindBy (xpath="//select[@id='ctl00_PageBodyControls_ddllist']")
	 @CacheLookup
	 WebElement searchForDropDown;
	
	@FindBy (xpath="//input[@id='ctl00_PageBodyControls_btnSearch']")
	 @CacheLookup
	 WebElement searchButton;
	
	public void selec_statusInActiveRadioButton() {
		statusInActiveRadioButton.click();
	}
	
	public void select_statusActiveRadioButton()
	{
		statusActiveRadioButton.click();
	}
	public void select_statusALLRadioButton()
	{
		statusALLRadioButton.click();
	}
	
	public void select_searchForDropDown(String buttonType)
	{
		Select s=new Select(searchForDropDown);
		s.selectByVisibleText(buttonType);
		
	}
	public void senddataSERCHFOR(String data)
	{
		searchFor.sendKeys(data);
	}
	public void clickSEARCHButton()
	{
		searchButton.click();
	}
	
}
