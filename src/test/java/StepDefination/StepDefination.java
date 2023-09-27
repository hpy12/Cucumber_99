package StepDefination;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefination {
	@Given("user on login page")
	public void user_on_login_page() {
		
		System.out.println("loginpage");
	}
	
	@When("enter valid user name and password")
	public void enter_valid_user_name_and_password() {
		System.out.println("pass");
	}
	@Then("user on home page")
	public void user_on_home_page() {
		System.out.println("homepage");
	}




}
