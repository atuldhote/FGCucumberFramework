package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import POM.ChangePassword;
import POM.HomePage;
import POM.UpdateMobileEmail;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import utils.TestContextSetup;

public class UpdateBothMobileNoEmailIdStepdefinations2 {

	TestContextSetup testContextSetup;
	ChangePassword changePassword;
	HomePage homePage;
	UpdateMobileEmail updateMobileEmail;
	
	public UpdateBothMobileNoEmailIdStepdefinations2(TestContextSetup testContextSetup){
		this.testContextSetup=testContextSetup;
		changePassword=	testContextSetup.pageObjectManager.open_ChangePassword();
		homePage=testContextSetup.pageObjectManager.openHomePage();
		 updateMobileEmail=	testContextSetup.pageObjectManager.open_updateMobileEmail();
	}
	
	@When("TC_001_Verify Both radio button  is selected")
	public void tc__verify_both_radio_button_is_selected() throws Exception {
		updateMobileEmail.clicbothradiobutton();
	}
	@When("TC_002_Verify new Mobile Number  field is visible and  accept data {string}")
	public void tc__verify_new_mobile_number_field_is_visible_and_accept_data(String string) throws Exception {
		updateMobileEmail.sendnewMobileno(string);
	}
	@When("TC_003_Verify newEmail Id  field is visible and  accept data {string}")
	public void tc__verify_new_email_id_field_is_visible_and_accept_data( String string) throws Exception {
		updateMobileEmail.sendemailID(string);
	}
	@When("TC_004_Verify send OTP button is visible and clickable")
	public void tc__verify_send_otp_button_is_visible_and_clickable() throws Exception {
		updateMobileEmail.Click_sendotp();
	}
	@When("TC_005_Verify  Enter OTP field is available and clickable {string}")
	public void tc__verify_enter_otp_field_is_available_and_clickable(String string) throws Exception {
		updateMobileEmail.sendotp(string);
	}
	@When("TC_006_Verify  submit button should be visible and clickable")
	public void tc__verify_submit_button_should_be_visible_and_clickable() throws Exception {
		updateMobileEmail.clicksubmitbutton();
		
		
	}
	
	

}
