package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Link_ViewDetails {

	WebDriver ldriver;
	WebDriverWait wait;
	Actions act;
	public  Link_ViewDetails(WebDriver rdriver)
	{   ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
		wait = new WebDriverWait(rdriver, 90);
	}
     
	@FindBy (xpath="//table[@id='grdClaimInfo']//tbody//tr[2]//td[2]")
	  WebElement patient_Name;
	
	@FindBy (xpath="//table[@id='grdClaimInfo']//tbody//tr[2]//td[3]")
	  WebElement Claim_Amount;
	
	@FindBy (xpath="//table[@id='grdClaimInfo']//tbody//tr[2]//td[4]")
	  WebElement diagnosis;
	
	@FindBy (xpath="//table[@id='grdClaimInfo']//tbody//tr[2]//td[5]")
	  WebElement hospital_name;
	
	@FindBy (xpath="//table[@id='grdClaimInfo']//tbody//tr[2]//td[6]")
	  WebElement date_of_Admission;
	
	@FindBy (xpath="//table[@id='grdClaimInfo']//tbody//tr[2]//td[7]")
	  WebElement date_of_Discharge;
	
	public String check_patient_Name() 
	{
	return 	patient_Name.getText();
	}
	
	public String check_Claim_Amount() 
	{
	return 	Claim_Amount.getText();
	}
	
	public String check_diagnosis() 
	{
	return 	diagnosis.getText();
	}
	
	public String check_hospital_name() 
	{
	return 	hospital_name.getText();
	}
	
	public String check_date_of_Admission() 
	{
	return 	date_of_Admission.getText();
	}
}
