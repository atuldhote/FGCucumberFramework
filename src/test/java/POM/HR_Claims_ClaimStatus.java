package POM;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HR_Claims_ClaimStatus
{ 
	WebDriver ldriver;
	WebDriverWait wait;
	public  HR_Claims_ClaimStatus(WebDriver rdriver)
	{
		 ldriver = rdriver;
			PageFactory.initElements(rdriver, this);
			wait = new WebDriverWait(rdriver, 90);
	}
	
	
	
	
	
	@FindBy (xpath="//input[@id='ctl00_PageBodyControls_btnSearch']")
	 @CacheLookup
	 WebElement searchButton;
	
	@FindBy (id="//ctl00_PageBodyControls_tbnRefresh")
	 @CacheLookup
	 WebElement refreshButton;
	
		@FindBy (xpath="//select[@id='ctl00_PageBodyControls_ddllist']")
	 @CacheLookup
	 WebElement claimTrack_searchCriteriadropdown;
	
	@FindBy (xpath="//input[@id='ctl00_PageBodyControls_txtSearchfor']")
	 @CacheLookup
	 WebElement claimTrack_searchFOR;

	@FindBy (xpath="//input[@id='ctl00_PageBodyControls_btnSearch']")
	 @CacheLookup
	 WebElement claimRequest_searchButton;
	
	@FindBy (xpath="//table[@id='ctl00_PageBodyControls_grdIntimationDetail']//tbody//tr//td[3]/b[1]")
	 @CacheLookup
	 WebElement claimRequest_Table_policyNo;
	
	@FindBy (xpath="//a[@id='ctl00_PageBodyControls_grdIntimationDetail_ctl02_lnkClaimViewDetail']")
	 @CacheLookup
	 WebElement claimRequest_Table_ViewDetails;
	
	@FindBy (xpath="//a[@id='ctl00_PageBodyControls_grdIntimationDetail_ctl02_lnkClaimDetails']")
	 @CacheLookup
	 WebElement claimRequest_Table_View_OnlinClaimProgress;
	            
	@FindBy (id="ctl00_PageBodyControls_grdIntimationDetail_ctl02_lnkbtn")
	 @CacheLookup
	 WebElement claimRequest_Table_View_Claim_Letter;
	
	public void claimTrack_selectCriteriadropdown(String criteria) throws Exception {

		Select s= new Select(claimTrack_searchCriteriadropdown);
		s.selectByVisibleText(criteria);
	}
	public void claimTrack_enterdatainsearchFORbox(String data) throws Exception {
		claimTrack_searchFOR.clear();
		Thread.sleep(2000);
		claimTrack_searchFOR.sendKeys(data);
	}
	public void claimTrack_clicksearchButton() {
		searchButton.click();
	}
	public void claimTrack_clickrefreshButton() {
		refreshButton.click();
	}

	
	public void printClaimRequestTableDetail(WebDriver driver) throws Exception 
	{   List columnsize=  driver.findElements(By.xpath("//table[@id='ctl00_PageBodyControls_grdsearchprofile']//tbody//tr[1]//th"));
		 for(int i=1;i<columnsize.size();i++)
		 {
			WebElement e =  driver.findElement(By.xpath("//table[@id='ctl00_PageBodyControls_grdsearchprofile']//tbody//tr[1]//th["+i+"]"));
                  System.out.print(e.getText()+"                       ");
                  Thread.sleep(2000);
		 }
		 System.out.println();
		  List rowsize=  driver.findElements(By.xpath("//table[@id='ctl00_PageBodyControls_grdsearchprofile']//tbody//tr"));
		
		 for(int j=2;j<=rowsize.size();j++){
		 {
		 for(int i=1;i<columnsize.size();i++)
		 {
			WebElement e =  driver.findElement(By.xpath("//table[@id='ctl00_PageBodyControls_grdsearchprofile']//tbody//tr["+j+"]//td["+i+"]"));
                  System.out.print(e.getText()+"                         ");
		 }
		 System.out.println();
		 }
		 }
	}
	public void select_claimTrack_Criteriadropdown(String criteria) throws Exception {

		Select s= new Select(claimTrack_searchCriteriadropdown);
		s.selectByVisibleText(criteria);
	}
	public String claimTrack_Table_policyNo_Text() {
		String policyNo_Text=claimRequest_Table_policyNo.getText();
		return policyNo_Text;
	}
	
	public void click_ClaimRequest_Table_ALL_ViewDetails(WebDriver driver,int i) throws Exception {
		Thread.sleep(5000);
		WebElement e=driver.findElement(By.xpath("//table[@id='ctl00_PageBodyControls_grdIntimationDetail']//tbody/tr[1]//td["+i+"]"));
		
		e.click();
		Thread.sleep(7000);
	}
	public void click_ClaimRequest_Table_ViewDetails(WebDriver driver) throws InterruptedException {
		Thread.sleep(9000);
		//JavascriptExecutor js = (JavascriptExecutor) driver;
		//js.executeScript("arguments[0].scrollIntoView();", claimRequest_Table_ViewDetails);
		
		driver.navigate().refresh();
		WebElement element = driver.findElement(By.xpath("//a[@id='ctl00_PageBodyControls_grdIntimationDetail_ctl02_lnkClaimViewDetail']"));
		element.click();
		//claimRequest_Table_ViewDetails.click();
	}
	
	public void click_claimRequest_Table_View_OnlinClaimProgress() throws Exception {
		Thread.sleep(5000);
		claimRequest_Table_View_OnlinClaimProgress.click();
	}
	public void click_claimRequest_Table_View_Claim_Letter(WebDriver driver) throws Exception {
		Thread.sleep(5000);
	
		 driver.navigate().refresh();
			WebElement element = driver.findElement(By.id("ctl00_PageBodyControls_grdIntimationDetail_ctl02_lnkbtn"));
			element.click();
	
			Thread.sleep(5000);
	}
	
	public 	boolean check_ViewDetail_View_link() {
	return	claimRequest_Table_ViewDetails.isDisplayed();
	}
	public 	boolean check_ViewClaimLetter_View_link()
	{
		return	claimRequest_Table_View_Claim_Letter.isDisplayed();
	}
	public 	boolean check_online_Claim_Progress_View_link()
	{
		return	claimRequest_Table_View_Claim_Letter.isDisplayed();
	}
}
