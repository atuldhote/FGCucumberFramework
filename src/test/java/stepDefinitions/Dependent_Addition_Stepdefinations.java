package stepDefinitions;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import POM.ChangePassword;
import POM.DependentMaster;
import POM.HomePage;
import POM.NetworkServices;
import POM.UpdateMobileEmail;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import utils.TestContextSetup;

public class Dependent_Addition_Stepdefinations {

	TestContextSetup testContextSetup;
	WebDriver driver;
	HomePage homePage;
	DependentMaster dependentMasters;
	SoftAssert softAssert;
	
	public Dependent_Addition_Stepdefinations(TestContextSetup testContextSetup) throws Exception{
		this.testContextSetup=testContextSetup;
		dependentMasters	=testContextSetup.pageObjectManager.open_dependentMasters();
		homePage=testContextSetup.pageObjectManager.openHomePage();
		driver=testContextSetup.base.lounchBrowser();
		softAssert=new SoftAssert();
	}
	
	@When("TC_001_Verify Dependent Addition  sub module link is available and clickable")
	public void tc__verify_dependent_addition_sub_module_link_is_available_and_clickable() {
		homePage.clickMyPolicy_DependentAddition(driver);
	}
	@When("TC_002_Verify relationship dropdown  is available and clickable {string}")
	public void tc__verify_relationship_dropdown_is_available_and_clickable(String string) {
		dependentMasters.clickrRlationshipdropdown(string);
	}
	@When("TC_004_Verify Dependent name field  is available and clickable {string}")
	public void tc__verify_dependent_name_field_is_available_and_clickable( String string) throws Exception {
		dependentMasters.sendDependentName(string);
	}
	@When("TC_003_Verify  D.O.B field  is available and clickable{string}")
	public void tc__verify_d_o_b_field_is_available_and_clickable(String string) throws Exception {
		dependentMasters.sendDateofBirth(string);
	}
	@When("TC_005_Verify  age  field  is available and autofiilled after selecting D.O.B")
	public void tc__verify_age_field_is_available_and_autofiilled_after_selecting_d_o_b() {
	   
	}
	@When("TC_006_Verify Gender dropdown  is available and clickable {string}")
	public void tc__verify_gender_dropdown_is_available_and_clickable(String string) {
		dependentMasters.clickGenderdown();
	}
	@When("TC_007_Verify remark  field  is available and clickable{string}")
	public void tc__verify_remark_field_is_available_and_clickable(String string) {
		//dependentMasters.sendRemark(string);
	}

	@When("TC_008_Verify save button is visible and clickable")
	public void tc__verify_save_button_is_visible_and_clickable() throws Exception {
		dependentMasters.click_BDD_savebutton(driver);
		Thread.sleep(20000);
//		String name=scenario.getName();
	
	}
	@When("TC_009_Verify use can delete dependent")
	public void tc__verify_use_can_delete_dependent() throws Exception {
		//Thread.sleep(20000);
		dependentMasters.click_delete_button(driver);
		Alert alt=driver.switchTo().alert();
		alt.accept();
		Thread.sleep(6000);
		
	}
	

	
	

}
