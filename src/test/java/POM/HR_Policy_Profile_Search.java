package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HR_Policy_Profile_Search {
	WebDriver ldriver;
	WebDriverWait wait;
	public  HR_Policy_Profile_Search(WebDriver rdriver)
	{
		 ldriver = rdriver;
			PageFactory.initElements(rdriver, this);
			wait = new WebDriverWait(rdriver, 90);
	}
	
	@FindBy (xpath="//input[@id='ctl00_PageBodyControls_txtSearchfor']")
	 @CacheLookup
	 WebElement searchFor;
	
	@FindBy (xpath="//select[@id='ctl00_PageBodyControls_ddllist']")
	 @CacheLookup
	 WebElement searchCriteriaDropDown;
	
	@FindBy (xpath="//input[@id='ctl00_PageBodyControls_btnSearch']")
	 @CacheLookup
	 WebElement searchButton;
	
	@FindBy (xpath="//table[@id='ctl00_PageBodyControls_GrdSchemeMaster']//tbody//tr[2]/td[4]")
	 @CacheLookup
	 WebElement policyNo_From_Table;
	
	@FindBy (xpath="//span[@id='ctl00_lbl_UserWelcome']//b")
	 @CacheLookup
	 WebElement welcomeuser;
	
	@FindBy (xpath="//table[@id='ctl00_PageBodyControls_GrdSchemeMaster']//tbody//tr[2]//td[7]//a")
	 @CacheLookup
	 WebElement profilelink;
	
	@FindBy (xpath="//table[@id='ctl00_PageBodyControls_GrdSchemeMaster']//tbody//tr[2]//td[9]//a")
	 @CacheLookup
	 WebElement memberDetailviewlink;
	
	public String getwelcomeusertext()
	{
		return welcomeuser.getText();
	}
	
	
	public void senddata_SearchForfield(String data)
	{
		searchFor.sendKeys(data);
	}
	
	public void select_SelectCriteriaDropdown(String data)
	{
		Select s=new Select (searchCriteriaDropDown);
		s.selectByVisibleText(data);
	}
	public void clickonSearchButton()
	{
		searchButton.click();;
	}
	
	public String policyNofromTable( ) throws Exception
	{Thread.sleep(3000);
	 String policyno=	policyNo_From_Table.getText();
	 return policyno;
	}
	
	public void clickonprofilelink()
	{
		profilelink.click();;
	}
	public void clickonMemberDetaillink()
	{
		memberDetailviewlink.click();;
	}
}
