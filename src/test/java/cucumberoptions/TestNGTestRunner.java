package cucumberoptions;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
@CucumberOptions(features="src/test/java/features",glue ="stepDefinitions"

,monochrome=true, tags ="@HR_Upload_Member_data",
plugin= {"html:target/cucumber.html","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
		"rerun:target/failed_scenarios.txt"} )
public class TestNGTestRunner extends AbstractTestNGCucumberTests{

}
