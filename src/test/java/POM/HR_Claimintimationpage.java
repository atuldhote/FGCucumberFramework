package POM;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HR_Claimintimationpage
{ 
	WebDriver ldriver;
	WebDriverWait wait;
	public  HR_Claimintimationpage(WebDriver rdriver)
	{
		 ldriver = rdriver;
			PageFactory.initElements(rdriver, this);
			wait = new WebDriverWait(rdriver, 90);
	}
	
	@FindBy (xpath="//select[@id='ctl00_PageBodyControls_ddllist']")
	 @CacheLookup
	 WebElement searchCriteria;
	
	@FindBy (xpath="//input[@id='ctl00_PageBodyControls_txtSearchfor']")
	 @CacheLookup
	 WebElement searchFOR;
	
	@FindBy (xpath="//input[@id='ctl00_PageBodyControls_btnSearch']")
	 @CacheLookup
	 WebElement searchButton;
	
	@FindBy (id="//ctl00_PageBodyControls_tbnRefresh")
	 @CacheLookup
	 WebElement refreshButton;
	
	@FindBy (xpath="//select[@id='ctl00_PageBodyControls_ddlPolicyNo']")
	 @CacheLookup
	 WebElement policyNodropdown;
	
	@FindBy (xpath="//select[@id='ctl00_PageBodyControls_ddllist']")
	 @CacheLookup
	 WebElement claimTrack_searchCriteriadropdown;
	
	@FindBy (xpath="//input[@id='ctl00_PageBodyControls_txtSearchfor']")
	 @CacheLookup
	 WebElement claimTrack_searchFOR;

	@FindBy (xpath="//input[@id='ctl00_PageBodyControls_btnSearch']")
	 @CacheLookup
	 WebElement claimRequest_searchButton;
	
	@FindBy (xpath="//table[@id='ctl00_PageBodyControls_grdsearchprofile']//tbody//tr[2]//td[7]//div")
	 @CacheLookup
	 WebElement claimRequest_clickhereforIntimation;
	
	public void selectCriteriadropdown(String criteria) throws Exception {

		Select s= new Select(searchCriteria);
		s.selectByVisibleText(criteria);
	}
	public void enterdatainsearchFORbox(String data) {
		searchFOR.sendKeys(data);
	}
	public void clicksearchButton() {
		searchButton.click();
	}
	public void clickrefreshButton() {
		refreshButton.click();
	}
	
	public void click_clickhereforIntimationLink() {
		claimRequest_clickhereforIntimation.click();
	}
	public void selectPolicyNodropdown(String policyno) throws Exception {
    Thread.sleep(2000);
		Select s= new Select(policyNodropdown);
		s.selectByVisibleText(policyno);
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
}
