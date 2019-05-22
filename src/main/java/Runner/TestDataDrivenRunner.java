package Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
@RunWith(Cucumber.class)
	@CucumberOptions(features="F:\\jbk work\\cucumbertest\\src\\main\\java\\Feature\\datadriven.feature",
	glue= {"F:\\jbk work\\cucumbertest\\src\\main\\java\\Stepdefinition\\Datadriven.java"},
	format= {"pretty","html:test-outputdatadriven"},
	monochrome=true,
	dryRun=false)
	
	
public class TestDataDrivenRunner {

}
