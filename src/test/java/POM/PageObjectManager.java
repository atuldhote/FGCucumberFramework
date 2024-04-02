package POM;

import org.openqa.selenium.WebDriver;

import POM.Dashbord;
import POM.HomePage;
import POM.LoginPage;
import POM.LoginPagePopup;
import POM.ChangePassword;
import POM.UpdateMobileEmail;
import POM.ClaimsIntimation;
import POM.HR_Claims_ClaimStatus;
import POM.Link_ViewDetails;
import POM.NetworkServices;
import POM.NetworkServices;
import POM.DependentMaster;
import POM.DependentMaster_Parents;
public class PageObjectManager {

	public WebDriver driver;
	public LoginPage loginPage;
	public HomePage homePage;
	public Dashbord dashboard;
	public LoginPagePopup LoginPagePopup;
	public ChangePassword changepassword;
	public UpdateMobileEmail updateMobileEmail;
	public ClaimsIntimation claimsIntimation;
	public HR_Claims_ClaimStatus hR_Claims_ClaimStatus;
	public Link_ViewDetails link_ViewDetails;
	public NetworkServices networkServices;
	public DependentMaster dependentMasters;
	public DependentMaster_Parents dependentMaster_Parents;
	
	public PageObjectManager(WebDriver driver) {
		this.driver=driver;
	}
	
	public  LoginPage openLoginPage() {
		loginPage=new LoginPage(driver);
		return loginPage;
	}
	
	public HomePage openHomePage() {
		homePage=new HomePage(driver);
		return homePage;
	}
	
	public Dashbord  openDashbord() {
		dashboard=new Dashbord(driver);
		return dashboard;
	}
	public LoginPagePopup openLoginPagePopup() 
	{
		LoginPagePopup	loginPagePopup=new LoginPagePopup(driver);
		return loginPagePopup;
	}
	
	public ChangePassword open_ChangePassword() 
	{  return  changepassword=new ChangePassword(driver);
		
	}
	public UpdateMobileEmail open_updateMobileEmail() 
	{  return  updateMobileEmail=new UpdateMobileEmail(driver);
		
	}
	
	public ClaimsIntimation open_ClaimsIntimation()
	{
		return claimsIntimation=new ClaimsIntimation(driver);
	}
	public HR_Claims_ClaimStatus open_hR_Claims_ClaimStatus() {
		return hR_Claims_ClaimStatus=new HR_Claims_ClaimStatus(driver);
	}
	public Link_ViewDetails open_link_ViewDetails() {
		return link_ViewDetails=new Link_ViewDetails(driver);
	}
	public NetworkServices open_NetworkServices() {
		 return networkServices=new NetworkServices(driver);
	}
	
	public DependentMaster open_dependentMasters() {
		 return dependentMasters=new DependentMaster(driver);
	}
	
	public DependentMaster_Parents open_dependentMaster_Parents() {
		return dependentMaster_Parents=new DependentMaster_Parents(driver);
			}
}
