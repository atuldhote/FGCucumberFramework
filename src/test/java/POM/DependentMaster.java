package POM;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class DependentMaster 
{
	WebDriver ldriver;
	WebDriverWait wait;
	Select s;
	
	public DependentMaster(WebDriver rdriver)
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
	
	@FindBy (id="ctl00_PageBodyControls_GrdDependentMaster_ctl04_btndelete")
	@CacheLookup
	WebElement delete_Button;
	
	@FindBy (id="ctl00_PageBodyControls_GrdDependentMaster_ctl04_btnEdit")
	@CacheLookup
	WebElement edit_Button;
	
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
	
	public void  click_delete_button(WebDriver driver) throws Exception
	{ JavascriptExecutor js = (JavascriptExecutor)driver;
	  js.executeScript("arguments[0].click();", delete_Button);
		//delete_Button.click();
	}
	public void  click_edit_button(WebDriver driver) throws Exception
	{JavascriptExecutor js = (JavascriptExecutor)driver;
	  js.executeScript("arguments[0].click();", edit_Button);
		
	}
	public void  sendDependentName(String name) throws Exception
	{ Thread.sleep(3000);
	dependantName.click();
	dependantName.clear();
		dependantName.sendKeys(name);
		
	}
	public void  sendDateofBirth(String date) throws Exception
	{  Thread.sleep(6000);
	//dateobBirth.clear();
		dateobBirth.sendKeys(date);
		
	}
	public void  sendRemark(String remak)
	{remark.clear();
		remark.sendKeys(remak);
		
	}
	
	
	public void  clickGenderdown()
	{
		s=new Select(gender);
		s.selectByIndex(1);
		
	}
	public void  clicksavebutton()
	{
		 
	}
	public void  click_BDD_savebutton(WebDriver driver)
	{
		  JavascriptExecutor js = (JavascriptExecutor)driver;
		  js.executeScript("arguments[0].click();", savebutton);
	//	savebutton.click();
	}
	
	public void check_Table_dependent_detail(WebDriver driver,String relation,String dependentname,String gender) {
	List <WebElement>l=	driver.findElements(By.xpath("//table[@id='ctl00_PageBodyControls_GrdDependentMaster']//tr"));
int row_count=	l.size();
List <WebElement>l2=	driver.findElements(By.xpath("//table[@id='ctl00_PageBodyControls_GrdDependentMaster']//tr[2]//td"));
     int coloumn_count=    l2.size();
     for(int i=2;i<row_count;i++)
     {
    	 for(int j=1;j<coloumn_count;j++)
         {
    		WebElement wl= driver.findElement(By.xpath("//table[@id='ctl00_PageBodyControls_GrdDependentMaster']//tr["+i+"]//td["+j+"]"));
    		String text=wl.getText();
       boolean relatn = false;
       if(text.contains(relation)){
    	   relatn=true;
       }
     
       boolean dep_name = false;
       if(text.contains(dependentname)){
    	   dep_name=true; 
       }
     
    	boolean gendr = false;
    	if(text.contains(gender)) {
    		gendr=true;
    	};
    	
    	if(relatn==true & dep_name==true & gendr==true) {
    		Assert.assertTrue(true);
    	}
    	else {
    		Assert.assertTrue(false);
    	}
         }
    	 
     }
	}
}

