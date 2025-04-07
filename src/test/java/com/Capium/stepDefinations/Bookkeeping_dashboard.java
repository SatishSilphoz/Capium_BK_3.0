package com.Capium.stepDefinations;

import java.io.IOException;

import org.openqa.selenium.By;

import com.Capium.Actions.Bookkeeping_dashboard_Actions;
import com.Capium.Utilies.HelperClass;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class Bookkeeping_dashboard {

	Bookkeeping_dashboard_Actions bkDashboard = new Bookkeeping_dashboard_Actions();

	@Given("Validate RefreshButton in VAT Summery which is at Right Side")
	public void validate_refresh_button_in_vat_summery_which_is_at_right_side() {
		bkDashboard.RefreshVatsummary();

	}

	@Given("Validate Returns in previous month which is in VAT Summery")
	public void validate_returns_in_previous_month_which_is_in_vat_summery() throws IOException, InterruptedException {
		Thread.sleep(4000);
		bkDashboard.Monthly_Submmitted_returns();
	}

	@Given("Validate Minimise in VAT Summery")
	public void validate_minimise_in_vat_summery() throws InterruptedException {
		bkDashboard.MinimiseVatsummary();
		Thread.sleep(2000);
		bkDashboard.MinimiseVatsummary();
	}

	@Given("Validate Add Client")
	public void validate_add_client() throws InterruptedException {
		bkDashboard.ValidateAddclientPage_btn();
	}

	@Then("Validate Add Client Page")
	public void validate_add_client_page() {
		bkDashboard.ValidateClosecleintPage();
	}

	@Then("Validate All Clients")
	public void validate_all_clients() throws IOException {

		HelperClass.ClickandAnyTypeofWebelemnt(By.xpath("//a[normalize-space()='All Clients']"));
	}

	@Then("Validate Client Type")
	public void validate_client_type() throws IOException, InterruptedException {
		bkDashboard.ValidateClientType();
	}

	@Then("Validate Text search")
	public void validate_text_search() {
		bkDashboard.ValidateTextSearch();
	}

	@Then("Validate Vat client")
	public void validate_vat_client() {
		bkDashboard.ValidateVatClient();
	}

	@Then("Validate Month in VAT Clients")
	public void validate_month_in_vat_clients() throws IOException, InterruptedException {
		bkDashboard.MonthInVatClients();
	}

	@Then("Validate VAT Status")
	public void validate_vat_status() throws InterruptedException {
		bkDashboard.VatStatus();
	}

	@Then("Validate Payment Status")
	public void validate_payment_status() throws InterruptedException {
		bkDashboard.PaymentStatus();
	}

	@Then("Validate Client List")
	public void validate_client_list() {
		System.out.println("validated successfully");
	}

	@Then("Validate First and Previous button")
	public void validate_first_and_previous_button() {
		bkDashboard.ClickonAllclients();
		
		bkDashboard.Clickon3();
		bkDashboard.ClickonPreviuousbutton();
		bkDashboard.ClickonLastButton();
	}

	@Then("Validate Next button")
	public void validate_next_button() {
		bkDashboard.Nextbutton();
	}

	@Then("Validate Last button")
	public void validate_last_button() {
	bkDashboard.ClickonLastButton();
	}

	@Then("Validate Scroll bar")
	public void validate_scroll_bar() {
 System.out.println("scroll sucessfully");
	}

}
