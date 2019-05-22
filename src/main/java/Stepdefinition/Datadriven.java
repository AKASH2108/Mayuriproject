package Stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Datadriven {
	
	WebDriver driver;
	@Given ("^user is on login page$")
	public void user_is_on_login_page() {
		System.setProperty("webdriver.chrome.driver", "F:\\jbk work\\TestNgEx\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();

		driver.get("http://www.facebook.com");}
		
	
	@When ("^user enters \"([^\"]*)\" and \"([^\"]*)\" and <\"([^\"]*)\">$")
	public void user_enters_and_and(String firstname,String lastname,String mobileno) {
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys(firstname);
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys(lastname);
		driver.findElement(By.xpath("//input[@type='text' and @name='reg_email__']")).sendKeys(mobileno);
	}	
	@Then("^user close the browser$")
	public void user_close_the_browser() {
		driver.quit();
	}
	
	
	
	

}
