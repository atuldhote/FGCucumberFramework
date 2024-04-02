package stepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.SoftAssert;

import POM.Dashbord;
import POM.HomePage;
import POM.LoginPage;
import POM.LoginPagePopup;
import POM.PageObjectManager;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import utils.TestContextSetup;

public class DashboardStepDefination  {
 WebElement changePassword_link;
  
 WebDriver driver;
 TestContextSetup testContextSetup;
 HomePage homePage;
 public LoginPage  loginPage;
 PageObjectManager pageObjectManager;
 SoftAssert softassert;
 LoginPagePopup loginPagePopup;
Dashbord dashboard;
 
 public DashboardStepDefination(TestContextSetup testContextSetup) {
	 this.testContextSetup=testContextSetup;
	 loginPage=testContextSetup.pageObjectManager.openLoginPage();
	 loginPagePopup=  testContextSetup.pageObjectManager.openLoginPagePopup();
	 dashboard= testContextSetup.pageObjectManager.openDashbord();
	 softassert=new SoftAssert();
 }
@Given("user on Login page")
public void user_on_login_page() throws Exception {
  
	String currentutl=testContextSetup.base.lounchBrowser().getCurrentUrl();
	System.out.println("============================================"+currentutl);
boolean b= 	currentutl.contains("hbfguatportal");
softassert.assertEquals(b, true);
softassert.assertAll();
}


@When("TC_001 Verify userNamefield {string}")
public void Verifyr_username_field(String username) {

	
loginPage.setUserName(username);
}

@When("TC_002 Verify passwordfield {string}")
public void Verifyr_username_fieldd(String password) 
{
	loginPage.setPassWord(password);
}
@When("TC_003 Verify Group radiobutton is clickable")
public void click_on_Group_Radio_button() throws Exception
{
	loginPage.clickGroupraRadiobutton();
}


@When("TC_004 Verify Loginbutton is clickable")
public void click_on_login_button() throws InterruptedException {

	Thread.sleep(20000);
	loginPage.click_Login_Button();

	try {
		boolean b=loginPage.checkotp_popup();
	 if(b==true) {
		 loginPage.sendotp();
		 loginPage.clickverifyotp();
		 loginPage.clickOKpopup();
	 }
		}catch(Exception e) {
			System.out.println("");
		}
		try {
	 boolean c=loginPagePopup.check_popuplogin();
	     if(c==true)
	     {
	    	 loginPagePopup.clickpopuplogin();
	     }
		} catch(Exception e) {
			
		}
}

@Then("user on DashBoardpage")
public void user_go_to_home_page() throws Exception {
	/*
	 * try { boolean b=loginPage.checkotp_popup(); if(b==true) {
	 * loginPage.sendotp(); loginPage.clickverifyotp(); loginPage.clickOKpopup(); }
	 * }catch(Exception e) { System.out.println(""); } try { boolean
	 * c=loginPagePopup.check_popuplogin(); if(c==true) {
	 * loginPagePopup.clickpopuplogin(); } } catch(Exception e) {
	 * 
	 * }
	 */
     String currentutl=testContextSetup.base.lounchBrowser().getCurrentUrl();
 	
     boolean d= 	currentutl.contains("DashBoard1");
     softassert.assertEquals(d, true);
     softassert.assertAll();
}
@When("TC_005 Verify Client Name on MyPolicy Table {string}")
public void verify_client_name_on_my_policy_table(String expected_ClientName) {
	String actual_ClientName=dashboard.getclintnmae();
	softassert.assertEquals(actual_ClientName, expected_ClientName);
	softassert.assertAll();
   System.out.println(actual_ClientName);
}
@When("TC_006 Verify Policy No on MyPolicy Table {string}")
public void verify_policy_no_on_my_policy_table(String expected_policy_Number) {
String 	actual_PolicyNo=dashboard.getpolicyno();
softassert.assertEquals(actual_PolicyNo, expected_policy_Number);
softassert.assertAll();
	 System.out.println(actual_PolicyNo);
}
@When("TC_007 Verify Profile link avaialbe on MyPolicy Table is clickable")
public void verify_profile_link_avaialbe_on_my_policy_table_is_clickable() {
	dashboard.clickProfilelink();

}

@Then("user on Homepage")
public void user_go_to_Homepage() throws Exception {
	Thread.sleep(3000);
	String currentutl=testContextSetup.base.lounchBrowser().getCurrentUrl();
   
   System.out.println(currentutl);
 boolean b=  currentutl.contains("HomePage");
 //softAssert=new SoftAssert();
 softassert.assertEquals(b, true);
 softassert.assertAll();

}

}
