package Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
@RunWith(Cucumber.class)
	@CucumberOptions(features="F:\\jbk work\\cucumbertest\\src\\main\\java\\Feature",
	glue= {"Stepdefinition"},
	format= {"pretty","html:test-output"},
	monochrome=true,
	dryRun=true)
	
	public class TestRunner{
	
	

}
