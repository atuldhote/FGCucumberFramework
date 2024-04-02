package stepDefinitions;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import POM.ChangePassword;
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

public class Dependent_Parrent_Addition_Stepdefinations {

	TestContextSetup testContextSetup;
	WebDriver driver;
	HomePage homePage;
	DependentMaster_Parents dependentMaster_Parents;
	SoftAssert softAssert;
	
	public Dependent_Parrent_Addition_Stepdefinations(TestContextSetup testContextSetup) throws Exception{
		this.testContextSetup=testContextSetup;
		driver=testContextSetup.base.lounchBrowser();
		homePage=testContextSetup.pageObjectManager.openHomePage();
	//	dependentMaster_Parents	=testContextSetup.pageObjectManager.dependentMaster_Parents;
		dependentMaster_Parents=new DependentMaster_Parents(driver);
		softAssert=new SoftAssert();
	}
	
	@When("TC_001_Verify Dependent  parent Addition  sub module link is available and clickable")
	public void tc__verify_dependent_parrent_addition_sub_module_link_is_available_and_clickable() {
		homePage.clickMyPolicy_Dependent_Parent_Addition(driver);
	}

	@When("TC_002_Verify relationship dropdown  is available and clickable{string}")
	public void tc_verify_relationship_dropdown_is_available_and_clickable(String string) throws InterruptedException {
		Thread.sleep(4000);
	String url=	driver.getCurrentUrl();
	//System.out.println("=============================================================="+url);
	dependentMaster_Parents.clickrRlationshipdropdown(string);
	}

	@When("TC_003_Verify  DOB  field  is available and clickable{string}")
	public void tc_verify_d_o_b_field_is_available_and_clickable(String dob) throws Exception {
		dependentMaster_Parents.sendDateofBirth(dob);
	}
	@When("TC_004_Verify Dependent Name field  is available and clickable{string}")
	public void tc_verify_Dependent_Name_field_is_available_and_clickable(String nam) throws Exception {
		dependentMaster_Parents.sendDependentName(nam);
	}

	@When("TC_005_Verify  age  field  is available and autofiilled after selecting DOB")
	public void tc_verify_Age_field_is_available_and_clickable() {
		
	}

	@When("TC_006_Verify Gender dropdown  is available and clickable{string}")
	public void tc_verify_Gender_dropdowndropdown_is_available_and_clickable(String string) {
		dependentMaster_Parents.clickGenderdropdown(string);
	}
	@When("TC_007_Verify  Sum Insured dropdown is available and clickable{string}")
	public void tc__verify_Sum_Insured_dropdown_is_visible_and_clickable(String string) {
		dependentMaster_Parents.clickSumeInsurd(string);
	}

	@When("TC_008_Verify premium for dropdown is visible and clickable{string}")
	public void tc__verify_premium_fordropdown_is_visible_and_clickable(String string) throws Exception {
		dependentMaster_Parents.select_PremiumForDropdown(string);
	}
	@When("TC_009_Verify  G.S.T field  is visible  and show data after selecting premium for dropdown{string}")
	public void tc__verify_g_s_t_field_is_visible_and_show_data_after_selecting_premium_for_dropdown(String string) throws Exception {
		Thread.sleep(2000);
		String actual_gst=	dependentMaster_Parents.check_GST();
		Thread.sleep(2000);
		System.out.println("==="+actual_gst);
		softAssert.assertEquals(actual_gst, string);
		softAssert.assertAll();
	}
	@When("TC_010_Verify  parent premium Field is visible and auto show data after selecting premium for  dropdown{string}")
	public void tc__verify_parent_premium_field_is_visible_and_auto_show_data_after_selecting_premium_for_dropdown(String string) throws Exception {
		Thread.sleep(2000);
		String actual_parent_premium=dependentMaster_Parents.check_parent_premium();
		Thread.sleep(2000);
		System.out.println("==="+actual_parent_premium);
		softAssert.assertEquals(actual_parent_premium, string);
		softAssert.assertAll();
	}
	@When("TC_011_Verify  final premium Field is visible and auto show data after selecting premium for  dropdown{string}")
	public void tc__verify_final_premium_field_is_visible_and_auto_show_data_after_selecting_premium_for_dropdown(String string) throws Exception {
		Thread.sleep(2000);
		String actual_final_premium=	dependentMaster_Parents.check_Final_premium();
		Thread.sleep(2000);
		System.out.println("==="+actual_final_premium);
		softAssert.assertEquals(actual_final_premium, string);
		softAssert.assertAll();
	}
	@When("TC_012_Verify remark  field  is available and clickable {string}")
	public void tc_verify_remark_field_is_available_and_clickable(String string) {
		dependentMaster_Parents.enter_remark(string);
	}
	@When("TC_013_Verify save button is visible and clickable")
	public void tc_verify_save_button_is_visible_and_clickable() throws Exception {
		dependentMaster_Parents.click_saveButton(driver);
		Thread.sleep(6000);
		
	}

	@When("TC_014_Verify user can delete added dependent parent detail")
	public void Verify_user_can_delete_added_dependent_parent_detail() throws Exception {
		
		dependentMaster_Parents.click_delet_button(driver);
		
		Alert alt=driver.switchTo().alert();
		alt.accept();
		Thread.sleep(6000);
		
	}
	
	

}
