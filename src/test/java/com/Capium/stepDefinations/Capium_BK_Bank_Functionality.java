package com.Capium.stepDefinations;

import java.awt.AWTException;

import com.Capium.Actions.Capium_Bank_Actions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Capium_BK_Bank_Functionality {
	
	Capium_Bank_Actions bankactions=new Capium_Bank_Actions();
	
	@Given("SearchClientAndSelect")
	public void search_client_and_select() throws InterruptedException {
		Thread.sleep(3000);
	    bankactions.SearchClient();
	   
	}
	
	@Given("Validate bank page")
	public void validate_bank_page() {
	    bankactions.Bankverified();
	   
	}

	@Then("Open bank page")
	public void open_bank_page() {
	    bankactions.ClickonDashboard();
	    
	}

	@When("Validate the dashboard page")
	public void validate_the_dashboard_page() {
	    bankactions.Verifybankdashboard();
	   
	}

	@When("Validate Add bank")
	public void validate_add_bank() {
	   bankactions.validatebankadding();
	 
	}

	@When("Verify and Open bank which we added")
	public void verify_and_open_bank_which_we_added() throws InterruptedException {
	  bankactions.validatecreatedbank();
	    
	}

	@Then("Validate Manual import functionality")
	public void validate_manual_import_functionality() throws InterruptedException, AWTException {
		bankactions.validatebankimportfunctionality();
	   
	}

	@Then("Validate bank import funtionality")
	public void validate_bank_import_funtionality() {
	   
	}

	@Then("Validate Quick entry functionality")
	public void validate_quick_entry_functionality() {
	   
	}

	@Then("Validate Quick journal functionality")
	public void validate_quick_journal_functionality() {
	   
	}

	@Then("Validate Direct receipt functionality")
	public void validate_direct_receipt_functionality() {
	 
	}

	@Then("Validate Customer Account functionality")
	public void validate_customer_account_functionality() {
	
	}

	@Then("Validate Transfer functionality")
	public void validate_transfer_functionality() {
	 
	}

	@Then("Validate Multiple transactions functionality")
	public void validate_multiple_transactions_functionality() {
	 
	}

	@Then("Validate New invoice functionality")
	public void validate_new_invoice_functionality() {
	
	}

	@Then("Validate refund functionality")
	public void validate_refund_functionality() {
	  
	}

	@Then("Verify delete functionality")
	public void verify_delete_functionality() {
	   
	}

	@Then("Validate Bank Transfer functionality")
	public void validate_bank_transfer_functionality() {
	  
	}



	
	

}
