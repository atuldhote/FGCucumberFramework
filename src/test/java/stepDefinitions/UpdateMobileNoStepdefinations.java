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

public class UpdateMobileNoStepdefinations {

	TestContextSetup testContextSetup;
	ChangePassword changePassword;
	HomePage homePage;
	UpdateMobileEmail updateMobileEmail;
	
	public UpdateMobileNoStepdefinations(TestContextSetup testContextSetup){
		this.testContextSetup=testContextSetup;
		changePassword=	testContextSetup.pageObjectManager.open_ChangePassword();
		homePage=testContextSetup.pageObjectManager.openHomePage();
		 updateMobileEmail=	testContextSetup.pageObjectManager.open_updateMobileEmail();
	}
	
	@Given("User on UpdateMobileEmail page")
	public void VerifyUpdateMobileNoEmailIDlink() throws Exception {
		WebDriver driver=	testContextSetup.base.lounchBrowser();
		homePage.clickUpdateMobileNoEmailId(driver);
		
	}

	@When("TC_001 Verify Mobile No button is clickable")
	public void VerifyMobileNobuttonclickable( ) throws Exception {
		updateMobileEmail.clickMobilenoradiobutton();
	}

	@And("TC_002 Verify NewMobile No field {string}")
	public void VerifyNewMobileNofield(String string) throws Exception {
		updateMobileEmail.sendnewMobileno(string);
		
	}

	@When("TC_003 Verify send OTP button")
	public void VerifysendOTPbutton( ) throws Exception {
		updateMobileEmail.Click_sendotp();
		
	}


	@When("TC_004 Verify enter OTP field {string}")
	public void VerifyenterOTPfield(String string ) throws Exception {
		updateMobileEmail.sendotp(string);

	}

	@When("TC_005 Verify Submit button")
	public void Verifysubmitbutton( ) throws Exception {
		updateMobileEmail.clicksubmitbutton();
	
		Thread.sleep(3000);
	}


	@Then("Successful update meassage is show")
	public void Sucssesful_message_show() throws Exception {
		boolean b=updateMobileEmail.checkupdatesuccessfulmassage();
	
	}

	
	

}
