package stepDefinitions;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import POM.ChangePassword;
import POM.ClaimsIntimation;
import POM.HR_Claimintimationpage;
import POM.HR_Claims_ClaimStatus;
import POM.HR_View_Client_Info;
import POM.HomePage;
import POM.Link_ViewDetails;
import POM.NEFT;
import POM.NetworkServices;
import POM.UpdateMobileEmail;
import POM.UploadpolicyBenifit;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import utils.TestContextSetup;

public class Broker_View_Manage_Password_Stepdefinations {

	TestContextSetup testContextSetup;
	HomePage homePage;
	WebDriver driver;
	HR_View_Client_Info hR_View_Client_Info;
	SoftAssert softAssert;
	
	public Broker_View_Manage_Password_Stepdefinations(TestContextSetup testContextSetup) throws Exception{
		this.testContextSetup=testContextSetup;
		
		homePage=testContextSetup.pageObjectManager.openHomePage();
		driver =testContextSetup.base.lounchBrowser();
		
		hR_View_Client_Info=new HR_View_Client_Info(driver);
		softAssert=new SoftAssert();
	}
	@When("TC_008_Verify Intermediary button is visible and clickable")
	public void tc__verify_intermediary_button_is_visible_and_clickable() {
		hR_View_Client_Info.select_IntermediatoryRadioButton(); 
	}
	@When("TC_009_Verify Intermediarycode field is visible and clickable{string}")
	public void tc__verify_intermediarycode_field_is_visible_and_clickable(String string) {
		hR_View_Client_Info.send_Intermediatory_Code(string);
	}
	@When("TC_010_Verify Intermediaryname field is visible and clickable{string}")
	public void tc__verify_intermediaryname_field_is_visible_and_clickable(String string) {
		hR_View_Client_Info.send_Intermediatory_name(string);
	}

	@Then("Intermediarycode and Intermediaryname show on page{string},{string}")
	public void tcverify_search_button_is_visible_and_clickable(String s1,String s2) throws Exception {
		String actualintermediateryName= hR_View_Client_Info.result_intermediateryName();
		softAssert.assertEquals(actualintermediateryName, s2);
		softAssert.assertAll();
	}
	@When("TC_011_Verify Employee button is visible and clickable")
	public void tc_verify_intermediary_button_is_visible_and_clickable() {
		hR_View_Client_Info.select_EmployeeRadioButton();
	}
	@When("TC_012_Verify Employeecode field is visible and clickable{string}")
	public void tc_verify_intermediarycode_field_is_visible_and_clickable(String string) {
		hR_View_Client_Info.sendBrokerEmployee_Code(string);
	}
	
	@When("TC_013_Verify Employeename field is visible and clickable{string}")
	public void tc_verify_intermediaryname_field_is_visible_and_clickable(String string) {
		hR_View_Client_Info.sendBrokerEmployee_name(string);
	}

	@Then("Employeecode and Employeename show on page{string},{string}")
	public void tcverifysearch_button_is_visible_and_clickable(String s1,String s2) throws Exception {
		String actualintermediateryName= hR_View_Client_Info.result_employeeName();
		softAssert.assertEquals(actualintermediateryName, s2);
		softAssert.assertAll();
		
	}
	
	}


	



