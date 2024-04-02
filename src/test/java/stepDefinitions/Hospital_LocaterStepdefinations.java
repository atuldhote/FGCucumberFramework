package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import POM.ChangePassword;
import POM.HomePage;
import POM.NetworkServices;
import POM.UpdateMobileEmail;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import utils.TestContextSetup;

public class Hospital_LocaterStepdefinations {

	TestContextSetup testContextSetup;
	NetworkServices networkServices;
	HomePage homePage;
	UpdateMobileEmail updateMobileEmail;
	SoftAssert softAssert;
	
	public Hospital_LocaterStepdefinations(TestContextSetup testContextSetup){
		this.testContextSetup=testContextSetup;
		networkServices=	testContextSetup.pageObjectManager.open_NetworkServices();
		homePage=testContextSetup.pageObjectManager.openHomePage();
		softAssert=new SoftAssert();
	}
	
	@When("TC_001_Verify  Hospital Locator link is visible and clickable")
	public void tc__verify_hospital_locator_link_is_visible_and_clickable() throws Exception {
		homePage.clickHospitalLocator();
	}
	@When("TC_002_Verify  search Hospital field is available on Network servicepage and clickable {string}")
	public void tc__verify_search_hospital_field_is_available_on_network_servicepage_and_clickable(String hospitalname) {
		networkServices.senddatasearchHospitalfield(hospitalname);
	}
	@When("TC_003_Verify  search button is visible and clickable")
	public void tc__verify_search_button_is_visible_and_clickable() {
		networkServices.clicksearchButton();
	}
	@Then("Hospital datail is available as searching {string}")
	public void hospital_datail_is_available_as_searching(String exp_data) throws Exception {
		Thread.sleep(5000);
	String actual_cityname=	networkServices.checkResultCityname();
	System.out.println("==========================================================================="+actual_cityname);
	boolean b=actual_cityname.contains(exp_data);
	softAssert.assertEquals(actual_cityname, exp_data);
	softAssert.assertAll();
	
	}
	

	
	

}
