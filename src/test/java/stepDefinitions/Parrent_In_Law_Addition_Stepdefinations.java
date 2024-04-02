package stepDefinitions;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;


import POM.ChangePassword;
import POM.Client_Parrent_In_Law_Addition;
import POM.DependentMaster;
import POM.DependentMaster_Parents;
import POM.HomePage;
import POM.NetworkServices;
import POM.UpdateMobileEmail;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import utils.TestContextSetup;

public class Parrent_In_Law_Addition_Stepdefinations {

	TestContextSetup testContextSetup;
	WebDriver driver;
	HomePage homePage;
	Client_Parrent_In_Law_Addition client_Parrent_In_Law_Addition;
	SoftAssert softAssert;
	
	public Parrent_In_Law_Addition_Stepdefinations(TestContextSetup testContextSetup) throws Exception{
		this.testContextSetup=testContextSetup;
		driver=testContextSetup.base.lounchBrowser();
		homePage=testContextSetup.pageObjectManager.openHomePage();
		 client_Parrent_In_Law_Addition=new Client_Parrent_In_Law_Addition(driver);
	//	dependentMaster_Parents	=testContextSetup.pageObjectManager.dependentMaster_Parents;
	
		softAssert=new SoftAssert();
	}
	
	@When("TC_001_Verify Parent In Law Addition  sub module link is available and clickable")
	public void tc__verify_parent_in_law_addition_sub_module_link_is_available_and_clickable() throws Exception {
		homePage.click_client_ParentIN_LAW_Addition(driver);
	}
	@When("TC_002_Verify Relationship dropdown  is available and clickable{string}")
	public void tc__verify_relationship_dropdown_is_available_and_clickable_father(String string) {
		client_Parrent_In_Law_Addition.clickrRlationshipdropdown(string);
	}
	@When("TC_003_Verify  DOBfield  is available and clickable{string}")
	public void tc__verify_do_bfield_is_available_and_clickable(String string) throws Exception {
		client_Parrent_In_Law_Addition.sendDateofBirth(string);
	}
	@When("TC_004_Verify DependentName field  is available and clickable{string}")
	public void tc__verify_dependent_name_field_is_available_and_clickable(String string) throws Exception {
		client_Parrent_In_Law_Addition.sendDependentName(string);
	}
	@When("TC_005_Verify  age  field  is available and autofilled after selecting DOB")
	public void tc__verify_age_field_is_available_and_autofilled_after_selecting_dob() {
		//client_Parrent_In_Law_Addition.
	}
	@When("TC_006_Verify gender dropdown  is available and clickable{string}")
	public void tc__verify_gender_dropdown_is_available_and_clickable_gender(String string) {
//	String gendre=	client_Parrent_In_Law_Addition.clickGenderdown();
	//softAssert.assertEquals(gendre, string);
	}
	@When("TC_007_Verify  SumInsured dropdown is available and clickable{string}")
	public void tc__verify_sum_insured_dropdown_is_available_and_clickable(String string) {
		client_Parrent_In_Law_Addition.select_Sum_Insured(string);
	}
	@When("TC_008_Verify Remark  field  is available and clickable {string}")
	public void tc__verify_remark_field_is_available_and_clickable(String string) {
	 
	}
	@When("TC_009_Verify Save button is visible and clickable")
	public void tc__verify_save_button_is_visible_and_clickable() throws Exception {
		client_Parrent_In_Law_Addition.clicksavebutton(driver);
		Thread.sleep(4000);
	}
	
	@When("TC_010_Verify calculate premium button is visible and clickable")
	public void tc_verify_save_button_is_visible_and_clickable() throws Exception {
		Thread.sleep(6000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,450)", "");
		
		Thread.sleep(2000);
		client_Parrent_In_Law_Addition.click_calculate_premium(driver);;
		Thread.sleep(6000);
	
	}
	
	
	@When("TC_011_Verify Premium field show correct value{string}")
	public void tc_verify_remark_field_is_available_and_clickable(String string) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,650)", "");
	String primium=	client_Parrent_In_Law_Addition.check_premium();
	softAssert.assertEquals(primium, string);
	softAssert.assertAll();
	}
	
	@When("TC_012_Verify GST field show correct value{string}")
	public void tc_verifyremark_field_is_available_and_clickable(String string) {
	String primium=	client_Parrent_In_Law_Addition.check_gst();
	softAssert.assertEquals(primium, string);
	softAssert.assertAll();
	}
	
	@When("TC_013_Verify TotalPremium field show correct value{string}")
	public void tc_verifyremarkfield_is_available_and_clickable(String string) {
	String primium=	client_Parrent_In_Law_Addition.check_total_premium();
	softAssert.assertEquals(primium, string);
	softAssert.assertAll();
	}
	
	@When("TC_014_Verify user can delete addeddependent parent detail")
	public void tc__verify_user_can_delete_addeddependent_parent_detail() throws Exception {
	 client_Parrent_In_Law_Addition.click_delete_button(driver);
	 Thread.sleep(6000);
	}
	

}
