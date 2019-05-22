package Stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class FacebookTest {
WebDriver driver;
	@Given("^user is on login page$")
	public void user_is_on_login_page() {
		
		System.setProperty("webdriver.chrome.driver", "F:\\jbk work\\TestNgEx\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();

		driver.get("http://www.facebook.com");}
		@When("^user enters username and password$")
		public void loginDetails() {
			WebElement ele=driver.findElement(By.xpath("//input[@id='email']"));
		ele.clear();
		ele.sendKeys("9890986713");
		WebElement ele1=driver.findElement(By.xpath("//input[@id='pass']"));
		ele1.clear();
		ele1.sendKeys("ayat21");
		}
		@Then("^user click on submit$")
		public void user_click_on_submit() {
			driver.findElement(By.xpath("//input[@type='submit']")).click();
	}@Then("^facebook home page$" )
	public void facebbok_home_page() {
		String title=driver.getTitle();
		Assert.assertEquals(title,"Ayat Ayat");
	
}
	
	
	
	
	
	
	
	
	
	
}
