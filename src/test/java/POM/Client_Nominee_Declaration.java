package POM;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Client_Nominee_Declaration 
{
	WebDriver ldriver;
	WebDriverWait wait;
	Select s;
	
	public Client_Nominee_Declaration(WebDriver rdriver)
	{
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
		wait = new WebDriverWait(rdriver, 90);
		
	}
	@FindBy (id="ctl00_PageBodyControls_ddlRelationship")
	@CacheLookup
	WebElement relationshipdropdown;
	
	@FindBy (xpath="//input[@id='ctl00_PageBodyControls_txtNomineeName']")
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
	
	@FindBy (id="ctl00_PageBodyControls_txtEmailId")
	@CacheLookup
	WebElement email;
	
	@FindBy (id="ctl00_PageBodyControls_txtselfremark")
	@CacheLookup
	WebElement remark;
	
	@FindBy (id="ctl00_PageBodyControls_btnSubmit")
	@CacheLookup
	WebElement savebutton;
	
	@FindBy (id="ctl00_PageBodyControls_btnReset")
	@CacheLookup
	WebElement reset;
	
	@FindBy (id="ctl00_PageBodyControls_chkbanckdetails")
	@CacheLookup
	WebElement bankDetail_CheckBOX;
	
	@FindBy (xpath="//b[text()='Your Data has been Saved Successfully.']")
	@CacheLookup
	WebElement succsess_message;
	
	
	
	@FindBy (id="ctl00_PageBodyControls_btnSave")
	@CacheLookup
	WebElement submitButton;
	
	public boolean   check_succses_message() throws Exception
	{
		Thread.sleep(3000);
	 return	succsess_message.isDisplayed();
		
	}
	public void  clickrRlationshipdropdown(String rltn)
	{ if(rltn.equalsIgnoreCase("Son")) {
		s=new Select(relationshipdropdown);
		s.selectByVisibleText("Son");;
		}
	 if(rltn.equalsIgnoreCase("Daughter")) {
			s=new Select(relationshipdropdown);
			s.selectByVisibleText("Daughter");;
			}
	 if(rltn.equalsIgnoreCase("Brother")) {
			s=new Select(relationshipdropdown);
			s.selectByVisibleText("Brother");;
			}



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
	
	
	public void  clickGenderdown()
	{
		s=new Select(gender);
		s.selectByIndex(1);
		
	}
	public void  clicksavebutton(WebDriver driver)
	{
		((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", savebutton);

		savebutton.click();
	}
	public void  send_Email(String name1) throws Exception
	{ Thread.sleep(3000);
	email.sendKeys(name1);
		
	}
	public void  click_gender_dropdown(String data)
	{ 
		s=new Select(gender);
		s.selectByVisibleText(data);;
		}
}

