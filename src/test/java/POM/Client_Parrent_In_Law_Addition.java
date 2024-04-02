package POM;


import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Client_Parrent_In_Law_Addition 
{
	WebDriver ldriver;
	WebDriverWait wait;
	Select s;
	
	public Client_Parrent_In_Law_Addition(WebDriver rdriver)
	{
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
		wait = new WebDriverWait(rdriver, 90);
		
	}
	@FindBy (id="ctl00_PageBodyControls_ddlRelationship")
	@CacheLookup
	WebElement relationshipdropdown;
	
	@FindBy (xpath="//input[@id='ctl00_PageBodyControls_txtDependentName']")
	@CacheLookup
	WebElement name;
	
	@FindBy (id="ctl00_PageBodyControls_txtDOB")
	@CacheLookup
	WebElement dateobBirth;
	
	@FindBy (id="ctl00_PageBodyControls_txtAge")
	@CacheLookup
	WebElement age;
	
	@FindBy (id="ctl00_PageBodyControls_ddlGender")
	@CacheLookup
	WebElement gender;
	
	@FindBy (id="ctl00_PageBodyControls_txtselfremark")

	WebElement remark;
	
	@FindBy (id="ctl00_PageBodyControls_btnSubmit")
	
	WebElement savebutton;
	
	@FindBy (id="ctl00_PageBodyControls_btnReset")
	
	WebElement reset;
	
	@FindBy (id="ctl00_PageBodyControls_ddlParentSI")
	
	WebElement suminsured;
	
	
	@FindBy (id="ctl00_PageBodyControls_GrdDependentMaster_ctl02_btndelete")
	@CacheLookup
	WebElement delete;
	
	
	
	@FindBy (id="ctl00_PageBodyControls_btnSave")
	
	WebElement submitButton;
	
	@FindBy (id="ctl00_PageBodyControls_btn_calculatepremium")
	WebElement calculate_premium;
	
	@FindBy (id="ctl00_PageBodyControls_txtPremium")
	WebElement premium;
	
	@FindBy (id="ctl00_PageBodyControls_txtGST")
	WebElement gst;
	
	@FindBy (id="ctl00_PageBodyControls_txttotlPremium")
	WebElement total_premium;
	
	public String check_total_premium() {
	return 	total_premium.getAttribute("value");
	}
	public String check_gst() {
	 return 	gst.getAttribute("value");
	}
	
	public String check_premium() {
	return	premium.getAttribute("value");
	}
	
	public void click_calculate_premium(WebDriver driver) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", calculate_premium);
	//	calculate_premium.click();
	}
	
	public void click_delete_button(WebDriver driver) {
		if(delete.isDisplayed()) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].click();", delete);
			Alert alt=	driver.switchTo().alert();
			alt.accept();
		}
	}
	
	public void  clickrRlationshipdropdown(String rltn)
	{ 
	
			s=new Select(relationshipdropdown);
			s.selectByVisibleText(rltn);;
			}
	public void  sendDependentName(String name1) throws Exception
	{ Thread.sleep(3000);
	name.sendKeys(name1);
		
	}
	public void  sendDateofBirth(String date) throws Exception
	{  Thread.sleep(2000);
		dateobBirth.sendKeys(date);
		
	}
	public void  sendRemark(String remak)
	{
		remark.sendKeys(remak);
		
	}
	
	
	public String  clickGenderdown()
	{
		return gender.getText();
		
		
	}
	public void  clicksavebutton(WebDriver driver) throws Exception
	{   
	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("arguments[0].click();", savebutton);
		//savebutton.click();
	
	
	}
	
	public void select_Sum_Insured(String data)
	{
		s=new Select(suminsured);
		s.selectByVisibleText(data);
	}
	
}

