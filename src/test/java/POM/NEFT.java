package POM;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class NEFT {
	WebDriver ldriver;
	WebDriverWait wait;
	
	public NEFT(WebDriver rdriver)
	{
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
		wait = new WebDriverWait(rdriver, 90);
		
	}
	@FindBy (xpath="//input[@id='ctl00_PageBodyControls_txtIfscCode']")
	@CacheLookup
	WebElement IFSCcode;
	
	@FindBy (id="ctl00_PageBodyControls_lblAccountHolderName")
	
	WebElement account_holder_name;
	
	@FindBy (id="ctl00_PageBodyControls_txtMICode")
	@CacheLookup
	WebElement MICR;
	
	@FindBy (id="ctl00_PageBodyControls_txtBankName")
	@CacheLookup
	WebElement bankname;
	
	@FindBy (id="ctl00_PageBodyControls_txtBankBranchName")
	@CacheLookup
	WebElement branchname;
	
	@FindBy (xpath="//input[@id='ctl00_PageBodyControls_txtActountNo']")
	@CacheLookup
	WebElement accountNumber;
	
	
	@FindBy (xpath="//input[@id='ctl00_PageBodyControls_txtReActountNo']")
	@CacheLookup
	WebElement reEnteraccountNumber;
	
	@FindBy (id="ctl00_PageBodyControls_rdbAccountType_0")
	@CacheLookup
	WebElement savingradiobutton;
	
	@FindBy (id="ctl00_PageBodyControls_rdbAccountType_1")
	@CacheLookup
	WebElement currentradiobutton;
	
	
	
	@FindBy (xpath="//input[contains(@id,'chkDisc')]")
	@CacheLookup
	WebElement checkbox;
	
	@FindBy (xpath="//input[@id='ctl00_PageBodyControls_btnSave']")
	@CacheLookup
	WebElement savebutton;
	
	@FindBy (xpath="//span[text()='NEFT Details Updated Successfully']")
	@CacheLookup
	WebElement NEFT_succes_Massage;
	//================================================================================================
	@FindBy (xpath="//table[@id='ctl00_PageBodyControls_GrdpolicyNEFT']//tr[2]//td[2]")
	WebElement table_account_No;
	
	@FindBy (xpath="//table[@id='ctl00_PageBodyControls_GrdpolicyNEFT']//tr[2]//td[3]")
	WebElement table_Bank_Name;
	
	@FindBy (xpath="//table[@id='ctl00_PageBodyControls_GrdpolicyNEFT']//tr[2]//td[5]")
	WebElement table_Account_Type;
	
	
	
	public void sendIFSCcode(String oldpass) throws Exception
      {  
		IFSCcode.sendKeys(oldpass);
		Thread.sleep(7000);
	  }
	public void sendaccountNumber(String newpass)
    {
		accountNumber.sendKeys(newpass);
	  }
	public void send_reEnteraccountNumber(String confpass)
    {
		reEnteraccountNumber.sendKeys(confpass);
	}
	public void clicksavingradiobuttonbutton()
    {
			savingradiobutton.click();		
	}
	
	public void clickcurrentradiobuttonbutton()
    {
		currentradiobutton.click();	
	}
	public void click_checkbox() throws Exception
    {    Thread.sleep(4000);
		checkbox.click();
		
	}
	public void click_save_button(WebDriver driver) throws Exception
    {    Thread.sleep(4000);
    JavascriptExecutor executor = (JavascriptExecutor)driver;
    executor.executeScript("arguments[0].click();", savebutton);
  //  savebutton.click();
		
	}
	
	public String check_MICR_code() throws Exception
    {   
     return   MICR.getAttribute("value");
		
	}
	
	public String check_bankname() throws Exception
    {   
     return   bankname.getAttribute("value");
		
	}
	public String check_branch_name() throws Exception
    {   
     return   branchname.getAttribute("value");
		
	}
	
	public void check_branch_adrees() throws Exception
    {   
     
		
	}
	public boolean nEFT_Success_Message() throws Exception
    {   
	return 	NEFT_succes_Massage.isDisplayed();
		
	}
	public String table_account_No() throws Exception
    {   
	return 	table_account_No.getText();
		
	}
	
	public String table_Bank_Name() throws Exception
    {   
	return 	table_Bank_Name.getText();
	}
	
	public String table_Account_Type() throws Exception
    {   
	return 	table_Account_Type.getText();
		
	}
	public String check_account_HolderName() {
		return account_holder_name.getText();
	}
}
