package POM;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {
	WebDriver ldriver;
	WebDriverWait wait;
	Actions act;
	public  HomePage(WebDriver rdriver)
	{   ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
		wait = new WebDriverWait(rdriver, 90);
	}
     @FindAll ( value = { @FindBy(xpath="//li[contains(@class,'lnk')]") })
      List <WebElement> wedgeelement;
	
	@FindBy (id="ctl00_lnkLoginOut")
	@CacheLookup
	  WebElement logout;
	
	
	@FindBy (xpath="//a[text()='My Policy ►']")
	@CacheLookup
	  WebElement mypolicy;
	
	@FindBy (xpath="//a[text()='Claims ►']")
	@CacheLookup
	  WebElement claims;
	
	@FindBy (xpath="//a[text()='Hospital Locator ►']")
	@CacheLookup
	  WebElement HospitalLocator;
	
	@FindBy (xpath="//a[text()='Downloads ►']")
	@CacheLookup
	  WebElement Download;
	
			@FindBy (xpath="(//div[@class='subNav'])[4]")
			@CacheLookup
			  WebElement Downloadalllink;
	@FindBy (xpath="//a[text()='Change Password ►']")
	@CacheLookup
	  WebElement ChangePassword;
	
	@FindBy (xpath="//a[text()='Pocket Clinic ►']")
	@CacheLookup
	  WebElement Pocketclinic;
	
	@FindBy (xpath="//a[text()='Back To DashBoard ►']")
	@CacheLookup
	  WebElement BacktoDashboard;
	
	@FindBy (xpath="//b[contains(text(),'Welcome')]")
	 @CacheLookup
	 WebElement lblUserWelcome;
	
	@FindBy (xpath="//span[text()='To View Policy Details']")
	 @CacheLookup
	 WebElement ToviewPolicyDetais;
	
	@FindBy (xpath="//span[text()='Dependent Addition']")
	 @CacheLookup
	 WebElement dependentAddition;
	
	@FindBy (xpath="//li[@id='ctl00_IMD_POLICY']")
	 @CacheLookup
	 WebElement broker_Mypolicy_IMD;
	
	@FindBy (xpath="//span[text()='Dependent Parent Addition']")
	 @CacheLookup
	 WebElement dependentParentAddition;
	
	@FindBy (xpath="(//span[text()='My Policy Benefit'])[1]")
	 @CacheLookup
	 WebElement MyPolicyBenefit;
	
	@FindBy (xpath="//span[text()='Claim Request']")
	 @CacheLookup
	 WebElement ClaimRequest;
	
	@FindBy (xpath="//span[text()='Track Claim']")
	 @CacheLookup
	 WebElement TrackClaim;
	
	@FindBy (xpath="//span[text()='Hospital Locator']")
	 @CacheLookup
	 WebElement HospitalLocatorlink;
	
	@FindBy (xpath="//span[text()='Cashless Claim Process']")
	 @CacheLookup
	 WebElement CashlessClaimProcess;
	
	@FindBy (xpath="//span[text()='Paperless claim processing user manual']")
	 @CacheLookup
	 WebElement Paperlessclaimprocessingusermanual;
	
	@FindBy (xpath="//span[text()='Reimbursement Claim Process']")
	 @CacheLookup
	 WebElement ReimbursementClaimProcess;
	
	@FindBy (xpath="//span[text()='Claim Steps']")
	 @CacheLookup
	 WebElement ClaimSteps;
	
	@FindBy (xpath="//span[text()='Document Check List']")
	 @CacheLookup
	 WebElement DocumentCheckList;
	
	@FindBy (xpath="//span[text()='Non Payable Items']")
	 @CacheLookup
	 WebElement NonPayableItems;
	
	@FindBy (xpath="//span[text()='FGH Health Claim Form']")
	 @CacheLookup
	 WebElement FGHHealthClaimForm;
	
	@FindBy (xpath="//span[text()='FGH Preauthorization Form']")
	 @CacheLookup
	 WebElement FGHPreauthorizationForm;
	
	@FindBy (xpath="//span[text()=\"Do's & Don'ts\"]")
	 @CacheLookup
	 WebElement DoDont;
	
	@FindBy (xpath="//span[text()='For Changing Password']")
	 @CacheLookup
	 WebElement ForChangingPassword;
	
	@FindBy (xpath="//span[text()='Update Mobile No/Email Id']")
	 @CacheLookup
	 WebElement UpdateMobileNoEmailId;
	
	@FindBy (xpath="//li[@id='ctl00_Li2']")
	 @CacheLookup
	 WebElement memberCOISearch;
	
	@FindBy (xpath="//span[text()='Member Login Details']")
	 @CacheLookup
	 WebElement memberLoginDetail;
	
	@FindBy (xpath="//li[@id='ctl00_Li3']")
	 @CacheLookup
	 WebElement view_manage_password;
	
	@FindBy (xpath="//span[text()='Upload Member Data'][1]")
	 @CacheLookup
	 WebElement uploadmemberdata;
	
	@FindBy (xpath="//li[@id='ctl00_Li10']")
	 @CacheLookup
	 WebElement HR_mypolicyBenifit;
	
	@FindBy (xpath="//span[text()='Natural Dependent Addition']")
	 @CacheLookup
	 WebElement Client_Natural_Dependent_Addition;
	
	@FindBy (xpath="//span[text()='Parent / Parent in Law addition']")
	 @CacheLookup
	 WebElement client_Parent_in_law;
	
	@FindBy (xpath="//span[text()='NEFT Details']")
	 @CacheLookup
	 WebElement client_NEFT;
	
	@FindBy (xpath="//span[text()='Nominee Declaration']")
	 @CacheLookup
	 WebElement client_NomineeDeclaration;
	
	public void click_Client_client_NomineeDeclaration(WebDriver driver) throws Exception {
		act=new Actions(driver);
		Thread.sleep(2000);
		act.moveToElement(mypolicy).perform();
		Thread.sleep(4000);
		act.moveToElement(client_NomineeDeclaration).click().build().perform();
	}
	
	public void click_Client_Natural_Dependent_Addition(WebDriver driver) {
		act=new Actions(driver);
		act.moveToElement(mypolicy).perform();
		act.moveToElement(Client_Natural_Dependent_Addition).click().build().perform();
	}
	
	public void click_client_NEFT(WebDriver driver) throws Exception {
		act=new Actions(driver);
		act.moveToElement(mypolicy).perform();
		Thread.sleep(4000);
		act.moveToElement(client_NEFT).click().build().perform();
	}
	
	public void click_client_ParentIN_LAW_Addition(WebDriver driver) throws Exception {
		act=new Actions(driver);
		act.moveToElement(mypolicy).perform();
		Thread.sleep(4000);
		act.moveToElement(client_Parent_in_law).click().build().perform();
	}
	
	public void click_HR_mypolicyBenifit(WebDriver driver) throws Exception {
		act=new Actions(driver);
		act.moveToElement(mypolicy).perform();
		Thread.sleep(4000);
		act.moveToElement(HR_mypolicyBenifit).click().build().perform();
	}
	
	public void click_HR_Upload_Memberdata(WebDriver driver) throws Exception {
		act=new Actions(driver);
		act.moveToElement(mypolicy).perform();
		Thread.sleep(3000);
		act.moveToElement(uploadmemberdata).click().build().perform();
	}
	
	public void click_HR_View_Manage_Password(WebDriver driver) throws Exception {
		act=new Actions(driver);
		act.moveToElement(mypolicy).perform();
		Thread.sleep(4000);
		act.moveToElement(view_manage_password).click().build().perform();
	}
	
	
	
	
	public void clickHR_memberLoginDetail(WebDriver driver) {
		act=new Actions(driver);
		act.moveToElement(mypolicy).perform();
		act.moveToElement(memberLoginDetail).click().build().perform();
	}
	
	public void checkallwedgelink()
	{ int sz=wedgeelement.size();
	for(int i=0;i<sz;i++)
	{ WebElement wedgelink= wedgeelement.get(i);
	 String linktext= wedgelink.getText().replace("?", " ");
	 System.out.println(linktext);
	}
	
		
	}
	public void clickMyPolicy_toseepolicyDeatail(WebDriver rdriver)
	{
		act=new Actions(rdriver);
		act.moveToElement(mypolicy).perform();
		act.moveToElement(ToviewPolicyDetais).click().build().perform();
	}
	
	public void clickMyPolicy_DependentAddition(WebDriver rdriver)
	{
		act=new Actions(rdriver);
		act.moveToElement(mypolicy).perform();
		act.moveToElement(dependentAddition).click().build().perform();
	}
	public void clickMyPolicy_Dependent_Parent_Addition(WebDriver rdriver)
	{
		act=new Actions(rdriver);
		act.moveToElement(mypolicy).perform();
		act.moveToElement(dependentParentAddition).click().build().perform();
	}
	public void clickMyPolicy_MyPolicyBenefit(WebDriver rdriver)
	{
		act=new Actions(rdriver);
		act.moveToElement(mypolicy).perform();
		act.moveToElement(MyPolicyBenefit).click().build().perform();
		
	}
	public void clickClaims_ClaimRequest(WebDriver rdriver) throws Exception
	{
		act=new Actions(rdriver);
		act.moveToElement(claims).perform();
		Thread.sleep(3000);
		act.moveToElement(ClaimRequest).click().build().perform();
		
	}
	public void clickClaims_Track_Claim(WebDriver rdriver) throws Exception
	{
		act=new Actions(rdriver);
		act.moveToElement(claims).perform();
		Thread.sleep(2000);
		act.moveToElement(TrackClaim).click().build().perform();
		
	}
	public void clickChangePassword(WebDriver rdriver)
	{
		
		ChangePassword.click();
	}
	
	public void clickUpdateMobileNoEmailId(WebDriver rdriver) throws Exception
	{  
		act=new Actions(rdriver);
		act.moveToElement(ChangePassword).perform();
		Thread.sleep(5000);
		act.moveToElement(UpdateMobileNoEmailId).click().build().perform();
		
	}
	public void clickBackToDashBoard()
	{
		
		BacktoDashboard.click();
	}
	public void clicklogoutoption()
	{
		
		logout.click();
	}
	public String clicDownloadlink(WebDriver rdriver) throws Exception
	{
		act=new Actions(rdriver);
		Thread.sleep(3000);
		act.moveToElement(Download).click().build().perform();
		Thread.sleep(3000);
		String linktext=Downloadalllink.getText();
		return linktext;
	}
	public void clickHospitalLocator() throws Exception
	{ Thread.sleep(4000);
		HospitalLocator.click();
		
	}
	public void clickPocketClinik() throws Exception
	{ Thread.sleep(3000);
	Pocketclinic.click();
		
	}
	public void clickOnMemberCOISearch()
	{
		memberCOISearch.click();
	}
	public String check_WelcomeUser()
	{
		
	return lblUserWelcome.getText();
	}
	
	public void clickMyPolicy_IMD(WebDriver driver) {
	//	broker_Mypolicy_IMD
		act=new Actions(driver);
		act.moveToElement(mypolicy).perform();
		act.moveToElement(broker_Mypolicy_IMD).click().build().perform();
	}
	public void dummy_MYPolicy_MouseAction(WebDriver driver) throws Exception
	{ 
//	WebElement lmypolicy=	driver.findElement(By.xpath("//a[text()='My Policy ►']"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
	       js.executeScript("window.scrollBy(0,-350)", "");
		act=new Actions(driver);
		Thread.sleep(4000);
		act.moveToElement(mypolicy).perform();
		//act.moveToElement(MyPolicyBenefit).click().build().perform();
		
	}
	public   void dummy_ToviewPolicyDetais(WebDriver driver) throws Exception {
		JavascriptExecutor js = (JavascriptExecutor) driver;
	       js.executeScript("window.scrollBy(0,-350)", "");
		act=new Actions(driver);
		Thread.sleep(3000);
		act.moveToElement(mypolicy).click().build().perform();
		Thread.sleep(2000);
	//	return ToviewPolicyDetais.isDisplayed();
	}
	public boolean  dummy_MyPolicyBenefit(WebDriver driver) throws Exception {
		
		Thread.sleep(4000);
		return MyPolicyBenefit.isDisplayed();
	}
	
	public boolean  dummy_MyPolicyParent_in_law(WebDriver driver) throws Exception {
		
		Thread.sleep(4000);
		return client_Parent_in_law.isDisplayed();
	}
	
	public boolean  dummy_MyPolicy_DependentAdditionw(WebDriver driver) throws Exception {
		
		Thread.sleep(4000);
		return dependentAddition.isDisplayed();
	}
	
	public boolean  dummy_MyPolicy_Dependent_Parrent_Addition_Test(WebDriver driver) throws Exception {
		act=new Actions(driver);
		act.moveToElement(mypolicy).perform();
		Thread.sleep(4000);
		return dependentParentAddition.isDisplayed();
		
	}
	public boolean dummy_HR_View_Manage_Password(WebDriver driver) throws Exception {
		
		Thread.sleep(4000);
		//act.moveToElement(view_manage_password).click().build().perform();
		return view_manage_password.isDisplayed();
	}
}
