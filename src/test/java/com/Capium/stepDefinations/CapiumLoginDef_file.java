package com.Capium.stepDefinations;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.Reporter;

import com.Capium.Actions.CapiumLoginActions;
import com.Capium.Utilies.HelperClass;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CapiumLoginDef_file {
	
	CapiumLoginActions capium=new CapiumLoginActions();
	
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
		capium.setUserName(username);
		capium.SetPassword(password);
	}

	@Then("User Click on login button")
	public void user_click_on_login_button() {
		capium.ClickBtnLogin();
	}

	

	@Then("Validate C i.e Capium icon in Home Page")
	public void validate_c_i_e_capium_icon_in_home_page() {
		capium.verifyHomecIcon();
	  capium.C_icon();
	    
	}

	@Then("Validate Bookkeeping in Home Page")
	public void validate_bookkeeping_in_home_page() {
		capium.verifybk();
		capium.ClickonBookkeeping();
	   
	}

	@When("Validate DashBoard in Home Page")
	public void validate_dash_board_in_home_page() {
	   capium.verifydashboard();
	   capium.ClickOnDashboard();
	    
	}

	@When("Validate RefreshButton in VAT Summery which is at Right Side")
	public void validate_refresh_button_in_vat_summery_which_is_at_right_side() {
	   capium.clickOnRefreshbtn();
	   
	}

	@When("Validate Sidebar-toggler in VAT Summery which is at Right Side")
	public void validate_sidebar_toggler_in_vat_summery_which_is_at_right_side() throws InterruptedException {
	    capium.ClickOnMaximizebtn();
	    Thread.sleep(2000);
	    capium.ClickOnMaximizebtn();
	   
	}

	@When("Validate Returns in previous month which is in VAT Summery")
	public void validate_returns_in_previous_month_which_is_in_vat_summery() throws IOException {
	    capium.verifyVatsummary();
	    HelperClass.captureScreenshot("vatsummaryscreenshot");
	   
	}

	@When("Validate Monthly Submitted Returns  in VAT Summery")
	public void validate_monthly_submitted_returns_in_vat_summery() throws IOException {
	   capium.SelectRespectiveYearSubmission();
	   
	}

	@When("Validate Minimise in VAT Summery")
	public void validate_minimise_in_vat_summery() throws IOException {
	    capium.Minimisevatsummary();
	    HelperClass.captureScreenshot("Minimisedvatsummary");
	    
	}

	@When("Validate Add Client")
	public void validate_add_client() throws IOException {
	    capium.BkAddclient();
	    HelperClass.captureScreenshot("BkAddclientpage");
	  
	}

	@When("Validate Add Client Page")
	public void validate_add_client_page() throws IOException, InterruptedException {
		Thread.sleep(5000);
		capium.Clientnamebk();
		capium.BkAddclientSave();	
		System.out.println("client saved successfully");
	}
	@When("Validate All Clients")
	public void validate_all_clients() throws InterruptedException, IOException {
		System.out.println("validate all clients");
	}
	@When("Validate Client Type")
	public void validate_client_type() throws IOException, InterruptedException { 
		Thread.sleep(5000);
HelperClass.ClickDropdown(By.id("CboType"));

	HelperClass.selectFromDropdownAndObserveResults(By.id("CboType"));
	
		
	}

	@When("Validate Text search")
	public void validate_text_search() throws IOException, InterruptedException {
		HelperClass.refresh();
		capium.TextSearch();
		Thread.sleep(5000);
		capium.ClickonSearch();
		HelperClass.captureScreenshot("Searchclient");   
	}
	@When("Validate VAT Clients")
	public void validate_vat_clients() {
		capium.Clickonvatclients();
	}
	@When("Validate Month in VAT Clients")
	public void validate_month_in_vat_clients() throws IOException, InterruptedException {
		Thread.sleep(5000);
		HelperClass.ClickDropdown(By.id("CboMonth"));

		HelperClass.selectFromDropdownAndObserveResults(By.id("CboMonth"));  
		System.out.println("Verified");
	}
	@When("Validate VAT Status")
	public void validate_vat_status() throws IOException, InterruptedException {
		Thread.sleep(5000);
		//HelperClass.ClickDropdown(By.id("CboStatus"));

		//HelperClass.selectFromDropdownAndObserveResults(By.id("CboStatus"));  
		
		System.out.println("Verified");
	}

	@When("Validate Payment Status")
	public void validate_payment_status() throws IOException, InterruptedException {
		Thread.sleep(5000);
		//HelperClass.ClickDropdown(By.id("CboPayment"));

		//HelperClass.selectFromDropdownAndObserveResults(By.id("CboPayment"));  
		System.out.println("Verified");
	}
	@When("Validate Client List")
	public void validate_client_list() {
	  
	   HelperClass.pagenumberdropdown();
	  
	   capium.pagenumber2();
	}

	@When("Validate First and Previous button")
	public void validate_first_and_previous_button() {
		
		capium.previousbutton();
		capium.firstbutton();   
	}

	@When("Validate Next button")
	public void validate_next_button() {
		
		capium.nextbutton();
	}

	@When("Validate Last button")
	public void validate_last_button() {
		capium.lastbutton();
	}

	@When("Validate Scroll bar")
	public void validate_scroll_bar() {
		
	
		HelperClass.scrolling3();
	  
	}

}
