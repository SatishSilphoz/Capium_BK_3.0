package com.Capium.stepDefinations;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.Reporter;

import com.Capium.Actions.CapiumLoginActions;
import com.Capium.Actions.Capium_Login_Actions;
import com.Capium.Utilies.HelperClass;
import com.aventstack.extentreports.Status;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CapiumLoginDef_file {
	
	Capium_Login_Actions loginpage=new Capium_Login_Actions();
	
	@Given("Launch the browser")
	public void launch_the_browser() {
		System.out.println("Chrome Browser launched Sucessfully");
		Reporter.log("Chrome Browser launched Sucessfully");
		
	}

	@Given("User need to enter the Application Url {string}")
	public void user_need_to_enter_the_application_url(String url) {
		HelperClass.openPage(url);
	}

	@When("User Enter username is {string} and Password is {string}")
	public void user_enter_username_is_and_password_is(String username, String password) {
		loginpage.EnterUsername(username);
		loginpage.EnterPassword(password);
	}

	@Then("User Click on login button")
	public void user_click_on_login_button() throws Exception {
		loginpage.ClickLoginbtn();
	}

	@Then("redirect to Bookkeeping module")
	public void redirect_to_bookkeeping_module() {
		loginpage.Navigate_to_bookkeeping_module();
	}
	@Then("Logout from application")
	public void logout_from_application() {
	  loginpage.Logout();
	    throw new io.cucumber.java.PendingException();
	}

}
