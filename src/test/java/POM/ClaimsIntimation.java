package POM;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ClaimsIntimation {
	WebDriver ldriver;
	WebDriverWait wait;
	
	public ClaimsIntimation(WebDriver rdriver)
	{
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
		wait = new WebDriverWait(rdriver, 90);
		
	}
	@FindBy (xpath="//table[@id='ctl00_PageBodyControls_grdsearchprofile']//tbody//tr//td")
	@CacheLookup
	List <WebElement> clickIntimationTabledeatail;
	
	@FindBy (id="ctl00_PageBodyControls_grdsearchprofile_ctl02_lnkBtnGenerateLink1")
	@CacheLookup
	WebElement clickIntimation;
	
	@FindBy (xpath="//div[@class='responsive-accordion-panel accordian-panel grn_accordian_inner']//table[1]//tbody//tr[2]")
	@CacheLookup
	List <WebElement> mberInformationnTabledeatail;
	
	@FindBy (id="ctl00_PageBodyControls_imgsearch")
	@CacheLookup
	WebElement hospitalNamesearchbox;
	
	@FindBy (xpath="//input[@id='txtSearchText']")
	@CacheLookup
	WebElement popupsearchbox;
	
	@FindBy (xpath="//input[@id='cmdSubmit']")
	@CacheLookup
	WebElement popupsearchbutton;
	
	@FindBy (xpath="//table[@id='grdNSPSearch']//tbody//tr[2]//td[8]")
	@CacheLookup
	WebElement popupGObutton;
	
	@FindBy (id="ctl00_PageBodyControls_txtIntimationdate")
	@CacheLookup
	WebElement intimationdate;
	
	@FindBy (xpath="//input[@id='ctl00_PageBodyControls_txtContactDetails']")
	@CacheLookup
	WebElement mobileno;
	
	@FindBy (id="ctl00_PageBodyControls_txtEmailDetails")
	@CacheLookup
	WebElement email;
	
	@FindBy (xpath="//textarea[@id='ctl00_PageBodyControls_txtDiagonosis']")
	@CacheLookup
	WebElement diagnostic;
	
	@FindBy (xpath="//span[@id='ctl00_PageBodyControls_PopCalendar1_Control']")
	@CacheLookup
	WebElement dateofadmission;
	
	@FindBy (xpath="//span[@id='popupSuperSpanYear0']")
	@CacheLookup
	WebElement yearofadmission;
	
	@FindBy (id="ctl00_PageBodyControls_PopCalendar5_Control")
	@CacheLookup
	WebElement dateofdischargeCalendesearchIMG;
	
	@FindBy (id="ctl00_PageBodyControls_txtdod")
	@CacheLookup
	WebElement dateofdischarge;
	
	@FindBy (id="ctl00_PageBodyControls_txtAmount")
	@CacheLookup
	WebElement claimamount;
	
	@FindBy (id="ctl00_PageBodyControls_lblAccountHolderName")
	@CacheLookup
	WebElement accountholdername;
	
	@FindBy (xpath="//img[@alt='Search Bank Name/Code']")
	@CacheLookup
	WebElement bankname;
	

	@FindBy (xpath="//input[@id='TxtSearchFor']")
	@CacheLookup
	WebElement banknamePOPUPsearchbox;
	
	@FindBy (id="BtnSearch")
	@CacheLookup
	WebElement banknamePOPUPSEARCHgobutton;
	
	@FindBy (xpath="//table[@id='GridView1']//tbody//tr[2]//td[4]")
	@CacheLookup
	WebElement banknamePOPUPSELECTgobutton;
	
	@FindBy (xpath="//img[@alt='Search Branch Name/Code']")
	@CacheLookup
	WebElement branchnamesearchimage;
	
	
	@FindBy (xpath="//input[@id='TxtSearchFor']")
	@CacheLookup
	WebElement branchnamePOPUPsearchbox;
	
	@FindBy (xpath="//input[@id='BtnSearch']")
	@CacheLookup
	WebElement branchnamePOPUPsearchGObutton;
	
	@FindBy (xpath="//img[@alt='Select BankBranch']")
	@CacheLookup
	WebElement branchnamePOPUPGObutton;
	
	@FindBy (id="ctl00_PageBodyControls_txtIfscCode")
	@CacheLookup
	WebElement ifcscode;
	
	@FindBy (id="ctl00_PageBodyControls_txtMICode")
	@CacheLookup
	WebElement micrcode;
	
	@FindBy (id="ctl00_PageBodyControls_txtActountNo")
	@CacheLookup
	WebElement accountno;
	
	@FindBy (id="ctl00_PageBodyControls_txtReActountNo")
	@CacheLookup
	WebElement reenteraccountno;
	
	@FindBy (id="ctl00_PageBodyControls_rdbAccountType_0")
	@CacheLookup
	WebElement savingacount;
	
	@FindBy (id="ctl00_PageBodyControls_rdbAccountType_1")
	@CacheLookup
	WebElement currentacount;
	
	@FindBy (xpath="//input[@id='ctl00_PageBodyControls_btnSave']")
	@CacheLookup
	WebElement submitbutton;
	
	@FindBy (id="ctl00_PageBodyControls_PopCalendar1_Control")
	@CacheLookup
	WebElement  calender;
	
	@FindBy (id="popupSuperSpanYear0")
	@CacheLookup
	WebElement  calenderyear;
	
	@FindBy (xpath="//div[@id='popupSuperContent0']//table//tr[3]//td[4]")
	@CacheLookup
	WebElement  calender_DAY;
	
	
	@FindAll({@FindBy(xpath="//td[@id='popupSuperYear0']//ancestor :: table")})
	@CacheLookup
	List <WebElement > calenderallyeardropdown;
	
	@FindBy (xpath="//td[@id='popupSuperYear0']//ancestor :: table")
	@CacheLookup
	WebElement  calenderallyeardropdown2;
	
	@FindBy (id="popupSuperYear0")
	@CacheLookup
	WebElement  requiredyear;
	
	@FindBy (id="popupSuperUpYear")
	@CacheLookup
	WebElement  dropdownarrowchangeyear;
	
	@FindBy (id="popupSuperChangeMonth0")
	@CacheLookup
	WebElement  dropdownarrowchangeMonth;
	
	@FindBy (xpath="//b[contains(text(),'Claim No.')]")
	@CacheLookup
	WebElement  pop_up_claimNo;
	
	@FindBy (xpath="//input[@id='btnYes']")
	@CacheLookup
	WebElement  pop_up_paperless_YES_Button;
	
	@FindBy (xpath="//input[@id='btnNo']")
	@CacheLookup
	WebElement  pop_up_paperless_NO_Button;
	
	@FindBy (xpath="//input[@id='ctl00_PageBodyControls_txtDoa']")
	@CacheLookup
	WebElement  manual_dateofAdmission;
	@FindBy (xpath="//input[@id='ctl00_PageBodyControls_txtdod']")
	@CacheLookup
	WebElement  manual_dateofDischarge;
	public void enter_DateofDischarge(String data) {
		manual_dateofDischarge.sendKeys(data);
	}
	public void enter_DateofAdmission(String data) {
		manual_dateofAdmission.sendKeys(data);
	}
	
	public String get_poup_claimNo() {
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//b[contains(text(),'Claim No.')]")));
		return pop_up_claimNo.getText();
	}
	
	public void click_poup_YES() {
		pop_up_paperless_YES_Button.click();
	}
	
	public boolean click_poup_No() {
	boolean b=	pop_up_paperless_NO_Button.isDisplayed();
	return b;
	}
	public void clickclickIntimation()
	{   if(clickIntimation.isDisplayed()==true)
	{
		clickIntimation.click();}
	else {
		System.out.println("clickIntimation element is not display");
	}
	}
	public void selecthospitalname(String name,WebDriver driver) throws Exception
	{Thread.sleep(4000);
	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("arguments[0].click();", hospitalNamesearchbox);

	Thread.sleep(2000);
	driver.switchTo().frame(0);
	popupsearchbox.sendKeys(name);
	popupsearchbutton.click();
	popupGObutton.click();
	driver.switchTo().defaultContent();
	}
	public void enterMobileNo(String mobileNo) throws Exception
	{ Thread.sleep(2000);
	//JavascriptExecutor js = (JavascriptExecutor) driver;
	//js.executeScript("arguments[0].click();", mobileno);
		mobileno.sendKeys(mobileNo);
	}
	
	public  void  HR_enterMailID(String data) throws Exception
	{     email.clear();
	      Thread.sleep(3000);
		  email.sendKeys(data);
		
	}
	
	public  String  checkemailfield()
	{
		 return email.getAttribute("value");
	}
	
	
	public void enterDignosis(String diagnosi) throws Exception
	{Thread.sleep(3000);
		diagnostic.sendKeys(diagnosi);
	}
	public void enterClaimAmount(String amount) throws Exception
	{
	claimamount.sendKeys(amount);
	}
	public String checkaccounthodername() 
	{
		String name=accountholdername.getText();
		return name;
	}
	public void enterAccountNumber(String acountno) 
	{
		accountno.sendKeys(acountno);
	}
	public void RenterAccountNumber(String acountno) 
	{
		reenteraccountno.sendKeys(acountno);
	}
	 public void printTableClaimdeataiL()
	 {
          for(int i=1;i<clickIntimationTabledeatail.size();i++)
          {
        	  WebElement element=clickIntimationTabledeatail.get(i);
          String text=	  element.getText();
          System.out.println(text);
          System.out.print(" ");
          
          }
	 }
	 public void printmberInformationnTabledeatail(WebDriver driver)
	 {    
		// String txt= driver.findElement(By.xpath("(//div[@class='responsive-accordion-panel accordian-panel grn_accordian_inner']//table)[1]//tbody//tr[2]")).getText();
//		 String txt= driver.findElement(By.xpath("(//div[@class='responsive-accordion-panel accordian-panel grn_accordian_inner']//table)[1]//tbody//tr[2]//td[1]")).getText();
//		 System.out.println(txt);   
//		 String txt2= driver.findElement(By.xpath("(//div[@class='responsive-accordion-panel accordian-panel grn_accordian_inner']//table)[1]//tbody//tr[2]//td[2]")).getText();
//		 System.out.println(txt2);  
//		 String txt3= driver.findElement(By.xpath("(//div[@class='responsive-accordion-panel accordian-panel grn_accordian_inner']//table)[1]//tbody//tr[2]//td[3]")).getText();
//		 System.out.println(txt3); 
//		 String txt4= driver.findElement(By.xpath("(//div[@class='responsive-accordion-panel accordian-panel grn_accordian_inner']//table)[1]//tbody//tr[2]//td[5]")).getText();
//		 System.out.println(txt4);
	 for(int i=2;i<9;i++)
          {
        	 for(int j=1;j<=4;j++)
             {
         WebElement e=  	driver.findElement(By.xpath("(//div[@class='responsive-accordion-panel accordian-panel grn_accordian_inner']//table)[1]//tbody//tr["+i+"]//td["+j+"]"));
         String text=       e.getText();
         System.out.print(text+" ");
         if(j==2) {
        	 System.out.print("      ");
         }
             }
          System.out.println();
          }
	 }
	public void selectDateofadmission(WebDriver driver,String years) throws Exception 
	{Thread.sleep(2000);
	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("arguments[0].click();", dateofadmission);
	//	dateofadmission.click();
		Thread.sleep(2000);
		calenderyear.click();
		Thread.sleep(2000);
	//	driver.findElement(By.xpath("(//td[normalize-space(text()='2018')])[8]")).click();
   for(WebElement allyear:calenderallyeardropdown) {
  	String yr=	allyear.getText();
//		System.out.println(yr);
     	if(yr.contains("2022")) {
//			System.out.println("=======================================AAAAAAAAAAAAAAAAAAAAAAAA");
			allyear.findElement(By.id("popupSuperYear4")).click();
		//		allyear.click();
		
			}
			
		}
   
//		}
		/*for(int i=2;i<calenderallyeardropdown.size();i++) {
		WebElement element=calenderallyeardropdown.get(i);
		String year=element.getText();
		System.out.println(year);
		if (year.contains("2022"))
		{
			element.click();
			break;
		}
		else {
			dropdownarrowchangeyear.click();
		}
		}*/
	Thread.sleep(2000);
	dropdownarrowchangeMonth.click();
	  List<WebElement> month = driver.findElements(By.xpath("//td[contains(@id,'popupSuperMonth')]"));
	  
	  for(WebElement e : month){
		  String date = e.getText(); 
		  if(date.contains(" January ")){
			  
			  e.click();
			  break;
		  }
		  
      WebElement day=	  driver.findElement(By.xpath("//div[@id='popupSuperContent0']//table//tr[3]//td[2]"));
      day.click();
	
}
	}
		
		/*	while(true)
		{
		String yr=calenderallyeardropdown2.getText();
		if(yr.equalsIgnoreCase("2022"))
		{
			requiredyear.click();
			break;
		}
		}*/
//	}
	public void selectDAYofDischarge(WebDriver driver) throws Exception {
		
		
		  JavascriptExecutor js = (JavascriptExecutor) driver;
		  js.executeScript("arguments[0].click();", dateofdischargeCalendesearchIMG);
		  Thread.sleep(2000);
     dropdownarrowchangeMonth.click();
     List<WebElement> month
		  = driver.findElements(By.xpath("//td[contains(@id,'popupSuperMonth')]"));
		  
		  for(WebElement e : month){ String date = e.getText();
		  if(date.contains(" January ")){ e.click(); break; } }
		 
		
        String day=driver.findElement(By.xpath("//div[@id='popupSuperContent0']//table//tr[3]//td[4]")).getText();
        
       }
	 public void selectBankName(WebDriver driver,String banknamek) throws Exception {
		 JavascriptExecutor js = (JavascriptExecutor) driver;
		  js.executeScript("arguments[0].click();", bankname);
		// bankname.click();
		 driver.switchTo().frame(1);
		 banknamePOPUPsearchbox.sendKeys(banknamek);
		 banknamePOPUPSEARCHgobutton.click();
		 Thread.sleep(4000);
		 banknamePOPUPSELECTgobutton.click();
		 driver.switchTo().defaultContent();
	 }
	 public void selectBranchName(WebDriver driver,String branch) throws Exception {
		 JavascriptExecutor js = (JavascriptExecutor) driver;
		  js.executeScript("arguments[0].click();", branchnamesearchimage);
		// bankname.click();
		 driver.switchTo().frame(1);
		 Thread.sleep(4000);
		 branchnamePOPUPsearchbox.sendKeys(branch);
		 branchnamePOPUPsearchGObutton.click();
		 driver.manage().window().maximize();
		 Thread.sleep(4000);
		 branchnamePOPUPGObutton.click();
		 driver.switchTo().defaultContent();
	 }
	 public  void  sendIFSCcode(String data)
		{
			ifcscode.clear();
			ifcscode.sendKeys(data);
		}
		public  void  sendMICRcode(String data)
		{
			micrcode.clear();
			micrcode.sendKeys(data);
		}
		 public  void  selectcurrentaccountTyperadiobutton()
			{
			 currentacount.click();
			}
			public  void  selectSavingaccountTyperadioButton()
			{
				
				savingacount.click();
			}
			public  void  checkSubmitButtonisDisplay(WebDriver driver) throws Exception
			{ 
				  JavascriptExecutor js = (JavascriptExecutor) driver;
				  js.executeScript("arguments[0].click();", submitbutton);
				
				
				Thread.sleep(3000);
			//submitbutton.click();
			}
			
			public  void   select_Calender_Day(WebDriver driver)
			{
				JavascriptExecutor js = (JavascriptExecutor) driver;
				  js.executeScript("arguments[0].click();", calender_DAY);
				//calender_DAY.click();
				//return calender_DAY.getText();
			}
     }
