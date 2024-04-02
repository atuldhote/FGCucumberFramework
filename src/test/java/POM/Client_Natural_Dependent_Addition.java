package POM;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Client_Natural_Dependent_Addition 
{
	WebDriver ldriver;
	WebDriverWait wait;
	Select s;
	
	public Client_Natural_Dependent_Addition(WebDriver rdriver)
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
	WebElement dependantName;
	
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
	@CacheLookup
	WebElement remark;
	
	@FindBy (id="ctl00_PageBodyControls_btnSubmit")
	@CacheLookup
	WebElement savebutton;
	
	@FindBy (id="ctl00_PageBodyControls_btnReset")
	@CacheLookup
	WebElement reset;
	
	@FindBy (id="ctl00_PageBodyControls_upldrFile1")
	@CacheLookup
	WebElement choosefile;
	
	@FindBy (id="ctl00_PageBodyControls_rdTopupPolicy_0")
	@CacheLookup
	WebElement radiobuttonYES;
	
	@FindBy (id="ctl00_PageBodyControls_rdTopupPolicy_1")
	@CacheLookup
	WebElement radiobuttonNO;
	
	@FindBy (id="ctl00_PageBodyControls_chkDisc")
	@CacheLookup
	WebElement checkbox;
	
	@FindBy (id="ctl00_PageBodyControls_btnSave")
	@CacheLookup
	WebElement submitButton;
	
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
			s.deselectByVisibleText("Brother");;
			}



	}
	public void  sendDependentName(String name) throws Exception
	{ Thread.sleep(3000);
		dependantName.sendKeys(name);
		
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
	{JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("arguments[0].click();", savebutton);
		//savebutton.click();
	}
	
}

