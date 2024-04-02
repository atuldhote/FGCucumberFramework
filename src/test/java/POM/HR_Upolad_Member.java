package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HR_Upolad_Member
{
	WebDriver ldriver;
	WebDriverWait wait;
	public  HR_Upolad_Member(WebDriver rdriver)
	{
		 ldriver = rdriver;
			PageFactory.initElements(rdriver, this);
			wait = new WebDriverWait(rdriver, 90);
	}
	
	@FindBy (id="ctl00_PageBodyControls_ddlTransactionType")
	 @CacheLookup
	 WebElement transictionTypedropdown;
	
	@FindBy (id="ctl00_PageBodyControls_ddlPolicyNumber")
	 @CacheLookup
	 WebElement policyNumberTypedropdown;
	
	@FindBy (id="ctl00_PageBodyControls_txtcropname")
	 @CacheLookup
	 WebElement corporatename;
	
	@FindBy (id="ctl00_PageBodyControls_txtHREmailId")
	 @CacheLookup
	 WebElement corporatenameHR_EmaiID;
	
	@FindBy (id="ctl00_PageBodyControls_txtSPOCEmailId")
	 @CacheLookup
	 WebElement FG_EmaiID;
	
	@FindBy (id="ctl00_PageBodyControls_btnSubmit")
	 @CacheLookup
	 WebElement saveButton;
	
	@FindBy (id="ctl00_PageBodyControls_btnGotoDashboard")
	 @CacheLookup
	 WebElement gotoDashbord;
	
	@FindBy (id="ctl00_PageBodyControls_btnBack")
	 @CacheLookup
	 WebElement gotBack;
	
	@FindBy (xpath="//input[@id='ctl00_PageBodyControls_upldrFile12']")
	 @CacheLookup
	 WebElement uploadfile;
	
	@FindBy (xpath="//span[text()='File uploaded successfully.']")
	 WebElement succesfull_message;
	
	public String check_succesfull_message() {
		return succesfull_message.getText();
	}
	public void selectTransictionDropdown(String data) {
		Select s=new Select(transictionTypedropdown);
		transictionTypedropdown.click();
		s.selectByVisibleText(data);
	}
	public void selectPolicyNumberDropdown(String data) {
		Select s=new Select(policyNumberTypedropdown);
		s.selectByVisibleText(data);
	}
	
	public void sendCorporateName(String data) {
		corporatename.sendKeys(data);
	}
	
	public void sendHREmai_ID(String data) {
		corporatenameHR_EmaiID.sendKeys(data);
	}
	public void sendFG_Emai_ID(String data) {
		FG_EmaiID.sendKeys(data);
	}
	
	public void click_SaveButton() {
		saveButton.click();
	}
	
	public void click_GotoDashbord_ID() {
		gotoDashbord.click();
	}
	
	public void click_GotBack() {
		gotBack.click();
	}
	
	public void uploadfile(String data) {
		uploadfile.sendKeys(data);
	}
	
}
