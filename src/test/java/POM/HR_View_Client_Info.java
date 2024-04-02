package POM;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HR_View_Client_Info {
	WebDriver ldriver;
	WebDriverWait wait;
	Actions act;
	public  HR_View_Client_Info(WebDriver rdriver)
	{   ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
		wait = new WebDriverWait(rdriver, 90);
	}
     
	@FindBy (id="ctl00_PageBodyControls_rbdsearch_0")
	  WebElement clientRadioButton;
	
	@FindBy (id="ctl00_PageBodyControls_rbdsearch_2")
	  WebElement employeeRadioButton;
	
	@FindBy (id="ctl00$PageBodyControls$txtemployeecode")
	  WebElement employee_Code;
	
	@FindBy (xpath="//input[@id='ctl00_PageBodyControls_txtemployeecode']")
	  WebElement brokerEmployee_Code;
	
	@FindBy (xpath="//input[@id='ctl00_PageBodyControls_txtempname']")
	  WebElement brokerEmployee_name;
	
	@FindBy (id="ctl00$PageBodyControls$txtempname")
	  WebElement employee_Name;
	
	@FindBy (xpath="//table[@id='ctl00_PageBodyControls_gridemployee']//tbody/tr[2]//td[2]")
	  WebElement employee_TableNameText;
	
	
	@FindBy (id="ctl00$PageBodyControls$txtCorporatename")
	  WebElement corporate_Name;
	
	@FindBy (id="ctl00_PageBodyControls_rbdsearch_1")
	  WebElement intermediatoryRadioButton;
	
	@FindBy (xpath="//input[@id='ctl00_PageBodyControls_txtIntermediaryCode']")
	  WebElement intermediatory_Code;
	
	@FindBy (xpath="//input[@id='ctl00_PageBodyControls_txtIntermediaryName']")
	  WebElement intermediatory_Name;
	
	@FindBy (xpath="//table[@id='ctl00_PageBodyControls_gridintermeditry']//tbody/tr[2]//td[1]")
	  WebElement intermediatery_TableNameText;
	
	@FindBy (id="ctl00_PageBodyControls_rbdsearch_3")
	  WebElement policyRadioButton;
	
	@FindBy (id="ctl00_PageBodyControls_txtClientCode")
	  WebElement clientCodeField;
	
	@FindBy (id="ctl00_PageBodyControls_txtClientName")
	  WebElement clientNameField;
	
	@FindBy (id="ctl00_PageBodyControls_btnSearch")
	  WebElement searchButton;
	
	@FindBy (xpath="//table[@id='ctl00_PageBodyControls_grid']//tbody//tr[2]//td[3]")
	  WebElement table_clientNo;
	
	@FindBy (id="ctl00_lnkLoginOut")
	  WebElement logoutbutton;
	
	@FindBy (id="ctl00_PageBodyControls_txtPolicyNo")
	  WebElement policyNofield;
	
	public void enterdata_policynofield(String data) {
		policyNofield.sendKeys(data);
	}
	public void click_logoutButton() {
		logoutbutton.click();
	}
	
	
	
	public String ActualTable_clientcode() throws Exception
	{ Thread.sleep(2000);
	String clientcode=	table_clientNo.getText();
	return clientcode;
	}
	public void click_SearchButton()
	{
		searchButton.click();;
	}
	
	public void enterdata_clientNameField(String data)
	{
		clientNameField.sendKeys(data);
	}
	
	
	public void enterdata_ClientCodeField(String data)
	{
		clientCodeField.sendKeys(data);
	}
	
	public void select_clientRadiobutton()
	{
		clientRadioButton.click();
	}
	public void select_EmployeeRadioButton()
	{
		employeeRadioButton.click();
	}
	
	 public void sendBrokerEmployee_Code(String data) {
		 brokerEmployee_Code.sendKeys(data);
	 }
	 
	 public void sendBrokerEmployee_name(String data) {
		 brokerEmployee_name.sendKeys(data);
	 }
	public void send_EmployeeCode(String data)
	{
		employee_Code.sendKeys(data);
	}
	
	public void send_EmployeeName(String data)
	{
		employee_Name.sendKeys(data);
	}
	
	public void send_CorporateName(String data)
	{
		corporate_Name.sendKeys(data);
	}
	
	public void select_policyRadioButton()
	{
		policyRadioButton.click();
	}
	
	public void select_IntermediatoryRadioButton()
	{
		intermediatoryRadioButton.click();
	}
	
	public void send_Intermediatory_Code(String data)
	{
		intermediatory_Code.sendKeys(data);
	}
	
	public void send_Intermediatory_name(String data)
	{
		intermediatory_Name.sendKeys(data);
	}
	
	public String result_employeeName()
	{
		return employee_TableNameText.getText();
	}
	
	public String result_intermediateryName() {
		return intermediatery_TableNameText.getText();
	}
}
