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

public class UpdateEmailNoStepdefinations {

	TestContextSetup testContextSetup;
	ChangePassword changePassword;
	HomePage homePage;
	UpdateMobileEmail updateMobileEmail;
	
	public UpdateEmailNoStepdefinations(TestContextSetup testContextSetup){
		this.testContextSetup=testContextSetup;
		changePassword=	testContextSetup.pageObjectManager.open_ChangePassword();
		homePage=testContextSetup.pageObjectManager.openHomePage();
		 updateMobileEmail=	testContextSetup.pageObjectManager.open_updateMobileEmail();
	}
	
	@When("TC_001_Verify  Emailradio button  is selected")
	public void Verify_EmaiLradio_button() throws Exception {
		
	updateMobileEmail.clickEmailradiobutton();
	}


	@When("TC_002_Verify newEmail Id  field is available and accept  valid data{string}")
	public void Verify_NewEmai_ID_field(String string) throws Exception {
	updateMobileEmail.sendemailID(string);


	}

	@When("TC_003_Verify send OTP button is visible and clickable")
	public void VerifyMobileNo_buttonclickable( ) throws Exception {
	updateMobileEmail.Click_sendotp();
	}

	@When("TC_004_Verify  Enter OTP  field is available and clickable {string}")
	public void VerifyenterOTP_field(String string ) throws Exception {
	updateMobileEmail.sendotp(string);

	}
	@When("TC_005_Verify  submit button should be visible and clickable")
	public void VerifysendOTP_button( ) throws Exception {

	updateMobileEmail.clicksubmitbutton();
	
	}

	
	

}
