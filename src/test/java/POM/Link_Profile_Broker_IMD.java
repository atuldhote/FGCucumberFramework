package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Link_Profile_Broker_IMD {

	WebDriver ldriver;
	WebDriverWait wait;
	Actions act;
	public  Link_Profile_Broker_IMD(WebDriver rdriver)
	{   ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
		wait = new WebDriverWait(rdriver, 90);
	}
     
	@FindBy (xpath="//div[@id='PanClientInformation']//tbody//tr[1]//td[2]")
	  WebElement client_Name;
	
	@FindBy (xpath="//div[@id='PanClientInformation']//tbody//tr[1]//td[4]")
	  WebElement Claim_code;
	
	@FindBy (xpath="//div[@id='PanClientInformation']//tbody//tr[11]//td[4]")
	  WebElement email;
	
	@FindBy (xpath="//div[@id='PanClientInformation']//tbody//tr[12]//td[4]")
	  WebElement mobile_no;
	
	@FindBy (xpath="")
	  WebElement date_of_Admission;
	
	@FindBy (xpath="")
	  WebElement date_of_Discharge;
	
	public String check_client_Name() 
	{
	return 	client_Name.getText();
	}
	
	public String check_Claim_code() 
	{
	return 	Claim_code.getText();
	}
	
	public String check_email() 
	{
	return 	email.getText();
	}
	
	public String check_mobile_no() 
	{
	return 	mobile_no.getText();
	}
	
	public String check_date_of_Admission() 
	{
	return 	date_of_Admission.getText();
	}
}
