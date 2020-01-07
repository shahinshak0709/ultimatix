package com.temp1;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ultimatix1 {
	static WebDriver driver;
	

	@Given("launch the browser")
	public void launch_the_browser() {
		
	    System.out.println("1");
	}

	@Given("load browser")
	public void load_browser() {
		System.out.println("1");
	}

	@When("enter valid user name and password")
	public void enter_valid_user_name_and_password() {
		System.out.println("1");
	}

	@Then("Click the login button")
	public void click_the_login_button() {
		System.out.println("1");
	}

	@Then("validate whether application loged in")
	public void validate_whether_application_loged_in() {
		System.out.println("1");
	}

}
