package POM;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DependentMaster_Parents {
	WebDriver ldriver;
	WebDriverWait wait;
	Select s;
	
	public DependentMaster_Parents(WebDriver rdriver)
	{
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
		wait = new WebDriverWait(rdriver, 90);
		
	}
	
	@FindBy (id="ctl00_PageBodyControls_ddlRelationship")
	@CacheLookup
	WebElement relationship;
	
	@FindBy (id="ctl00_PageBodyControls_txtDependentName")
	@CacheLookup
	WebElement dependentName;
	
	@FindBy (id="ctl00_PageBodyControls_txtDOB")
	@CacheLookup
	WebElement dateobBirth;
	
	@FindBy (xpath="(//img[@alt=\"Select date from calendar\"])[2]")
	@CacheLookup
	WebElement calender;
	@FindBy (xpath="popupSuperChangeYear1")
	@CacheLookup
	WebElement yeardropdown;
	
	@FindBy (id="popupSuperChangeYear1")
	@CacheLookup
	WebElement yearchangedropdown;
	@FindBy (id="")
	@CacheLookup
	WebElement yearPOPUPchangedropdown;
	
	@FindBy (id="ctl00_PageBodyControls_txtAge")
	@CacheLookup
	WebElement age;
	
	@FindBy (id="ctl00_PageBodyControls_ddlGender")
	@CacheLookup
	WebElement gender;
	
	@FindBy (id="ctl00_PageBodyControls_ddlParentSI")
	@CacheLookup
	WebElement suminsured;
	
	@FindBy (id="ctl00_PageBodyControls_txtTopupPremium")
	@CacheLookup
	WebElement parentpremium;
	
	@FindBy (xpath="//input[@id='ctl00_PageBodyControls_ParentGST']")
	@CacheLookup
	WebElement gst;
	
	@FindBy (id="ctl00_PageBodyControls_ParentTotal")
	@CacheLookup
	WebElement finalprimium;
	
	@FindBy (id="ctl00_PageBodyControls_txtselfremark")
	@CacheLookup
	WebElement remark;
	
	
	@FindBy (id="ctl00_PageBodyControls_btnSubmit")
	@CacheLookup
	WebElement submitbutton;
	
	@FindBy (id="ctl00_PageBodyControls_btnReset")
	@CacheLookup
	WebElement reset;
	 
	@FindBy (xpath="//select[@id='ctl00_PageBodyControls_DdlPremiumFor']")
	
	WebElement premium_for;
	
	@FindBy (id="ctl00_PageBodyControls_btnSubmit")
	
	WebElement save_Button;
	
	@FindBy (id="ctl00_PageBodyControls_DdlPremiumFor")
	
	WebElement GST;
	
@FindBy (id="ctl00_PageBodyControls_GrdDependentMaster_ctl02_btndelete")	
	WebElement delete_icon;

	public void select_PremiumForDropdown(String data) throws Exception {
		s=new Select(premium_for);
		Thread.sleep(4000);
		s.selectByVisibleText(data);
	}
	
	public void  clickrRlationshipdropdown(String rltn)
	{ try{if(rltn.equalsIgnoreCase("Father")) {
		s=new Select(relationship);
		s.selectByVisibleText("Father");
	}
	if(rltn.equalsIgnoreCase("Father-In-Law")) {
		s=new Select(relationship);
		s.selectByVisibleText("Father-In-Law");
	}
	if(rltn.equalsIgnoreCase("Mother")) {
		s=new Select(relationship);
		s.selectByVisibleText("Mother");
	}
	if(rltn.equalsIgnoreCase("Mother-In-Law")) {
		s=new Select(relationship);
		s.selectByVisibleText("Mother-In-Law");
	}
	}catch(Exception e) {
		System.out.println("Relation NOT match to drop down");
	}
	}
	public void  sendDependentName(String name) throws Exception
	{ Thread.sleep(4000);
	dependentName.sendKeys(name);
		
	}
	public void  sendDateofBirth(String date) throws Exception
	{  Thread.sleep(2000);
		dateobBirth.sendKeys(date);
	
		
	}
	public void  ClickCalenderDateofBirth() throws Exception
	{  Thread.sleep(2000);
		
	calender.click();
	if(yearchangedropdown.isDisplayed())
	{
		yearchangedropdown.click();
		Thread.sleep(2000);
		yeardropdown.click();
		Thread.sleep(2000);
	}else {
		
		System.out.println("yearchangedropdown not visible");
	}
		
	}
	public void  clickGenderdropdown(String rltn)
	{ try {
		if(rltn.equalsIgnoreCase("Father")||rltn.equalsIgnoreCase("Father-In-Law")) {
		s=new Select(gender);
		s.selectByVisibleText("Male");
		}
		if(rltn.equalsIgnoreCase("Mother")||rltn.equalsIgnoreCase("Mother-In-Law")) {
			s=new Select(gender);
			s.selectByVisibleText("Female");
			}
		}catch(Exception e)
	    {
			System.out.println("Gender NOT match to drop down");
		}
	
		
	}
	public void  clickSumeInsurd(String amount)
	{
		s=new Select(suminsured);
		s.selectByVisibleText(amount);;
		
	}
	
	public void click_saveButton(WebDriver driver) {
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", save_Button);
		//save_Button.click();
	}
	public void enter_remark(String data) {
		remark.sendKeys(data);
	}
	
	public String check_parent_premium() {
		return parentpremium.getAttribute("value");
	}
	
	public String check_Final_premium() {
	return	finalprimium.getAttribute("value");
	}
	
	public String check_GST() {
    return     gst.getAttribute("value");
	}
	
	public void click_delet_button(WebDriver driver) throws Exception {  
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", delete_icon);
		
	//delete_icon.click();
	}
	
	public boolean check_delet_button() {   
		return delete_icon.isDisplayed();
		}
}
