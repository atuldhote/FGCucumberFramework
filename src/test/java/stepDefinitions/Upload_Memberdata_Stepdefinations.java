package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import POM.ChangePassword;
import POM.ClaimsIntimation;
import POM.HR_Claimintimationpage;
import POM.HR_Upolad_Member;
import POM.HR_View_Client_Info;
import POM.HomePage;
import POM.NEFT;
import POM.NetworkServices;
import POM.UpdateMobileEmail;
import POM.UploadpolicyBenifit;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import utils.TestContextSetup;

public class Upload_Memberdata_Stepdefinations {

	TestContextSetup testContextSetup;
	HomePage homePage;
	WebDriver driver;
	HR_Upolad_Member hR_Upolad_Member;
	SoftAssert softAssert;
	
	public Upload_Memberdata_Stepdefinations(TestContextSetup testContextSetup) throws Exception{
		this.testContextSetup=testContextSetup;
		
		homePage=testContextSetup.pageObjectManager.openHomePage();
		
		driver =testContextSetup.base.lounchBrowser();
		hR_Upolad_Member=new HR_Upolad_Member(driver);
		softAssert=new SoftAssert();
	}
	
	@When("Verify the Upload Member Data sub module link is available and open")
	public void verify_the_upload_member_data_sub_module_link_is_available_and_open() throws Exception {
		homePage.click_HR_Upload_Memberdata(driver);
	}
	@When("Verify Transiction Type drop down is visible and clickable{string}")
	public void verify_transiction_type_drop_down_is_visible_and_clickable(String string) throws Exception {
		Thread.sleep(6000);
		hR_Upolad_Member.selectTransictionDropdown(string);
	}
	@When("Verify policy Number drop down is visible and clickable{string}")
	public void verify_policy_number_drop_down_is_visible_and_clickable(String string) {
		hR_Upolad_Member.selectPolicyNumberDropdown(string);
	}
	@When("Verify Corporate Name field is available{string}")
	public void verify_corporate_name_field_is_available_and_clickable(String string) {
		
	}
	@When("Verify Corporate HR Email ID field  is available and clickable{string}")
	public void verify_corporate_hr_email_id_field_is_available_and_clickable(String string) {
		hR_Upolad_Member.sendHREmai_ID(string);
	}
	@When("Verify FG Email ID field  is available and clickable{string}")
	public void verify_fg_email_id_field_is_available_and_clickable(String string) {
		hR_Upolad_Member.sendFG_Emai_ID(string);
	}
	@When("Verify Go to Dashbord button  is visible and clickable")
	public void verify_go_to_dashbord_button_is_visible_and_clickable() {
	 
	}
	@When("Verify Go back  button  is visible and clickable")
	public void verify_go_back_button_is_visible_and_clickable() {
	   
	}
	


	
	

}
