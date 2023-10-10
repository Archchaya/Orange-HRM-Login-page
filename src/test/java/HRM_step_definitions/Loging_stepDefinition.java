package HRM_step_definitions;

import org.openqa.selenium.WebDriver;
import HRM_pageObjects.Loging_pageObject;
import io.cucumber.java.en.*;


public class Loging_stepDefinition {
	
	WebDriver driver= null;
	
	private Loging_pageObject loginPO = new Loging_pageObject(driver);

	@Given("user is on login page")
	public void user_is_on_login_page() {
	 
		loginPO.viewLloginPage();
	}

	@When("user enters username and password")
	public void user_enters_username_and_password() throws InterruptedException {
	    
		loginPO.setUsernamePassword();
	}

	@And("user clicks on login")
	public void user_clicks_on_login() {
	   
		loginPO.clickLogin();
	}

	@Then("user is navigated to the home page")
	public void user_is_navigated_to_the_home_page() throws InterruptedException {
		
		loginPO.viewHomePage();
	    
	}

}