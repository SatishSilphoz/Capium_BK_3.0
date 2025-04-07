package com.Capium.Actions;
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.Capium.Locators.Bookkeeping_Dashboard_locators;
import com.Capium.Utilies.HelperClass;

public class Bookkeeping_dashboard_Actions {
	
	Bookkeeping_Dashboard_locators bkDashboardLocators =null;
	public Bookkeeping_dashboard_Actions()
	{
		this.bkDashboardLocators = new Bookkeeping_Dashboard_locators();
		 PageFactory.initElements(HelperClass.getDriver(),bkDashboardLocators);
	}
	
	public void RefreshVatsummary() {
		WebDriverWait wait = HelperClass.getWait();
		 wait.until(ExpectedConditions.elementToBeClickable(bkDashboardLocators.ClickonRefresh));
		bkDashboardLocators.ClickonRefresh.click();
	}
	public void Monthly_Submmitted_returns() throws IOException {
		WebDriverWait wait = HelperClass.getWait();
		 wait.until(ExpectedConditions.visibilityOf(bkDashboardLocators.VatsummaryMonthdropdown));
		HelperClass.selectFromDropdownAndObserveResults(By.id("CboYear"));
	}
	public void MinimiseVatsummary() {
		WebDriverWait wait = HelperClass.getWait();
		 wait.until(ExpectedConditions.elementToBeClickable(bkDashboardLocators.MinimiseVatsummary));
		bkDashboardLocators.MinimiseVatsummary.click();
	}
//	public void MaximiseVatsummary() {
//		WebDriverWait wait = HelperClass.getWait();
//		 wait.until(ExpectedConditions.elementToBeClickable(bkDashboardLocators.MinimiseVatsummary));
//		bkDashboardLocators.MaximiseVatsummary.click();	
//	}
	
	
	public void ValidateAddclientPage_btn() throws InterruptedException {
		Thread.sleep(4000);
		// WebDriverWait wait = HelperClass.getWait();
		 //wait.until(ExpectedConditions.elementToBeClickable(bkDashboardLocators.Addclientbuttton));
	 bkDashboardLocators.Addclientbuttton.click();
	}
	public void ValidateClosecleintPage() {
		 WebDriverWait wait = HelperClass.getWait();
		 wait.until(ExpectedConditions.elementToBeClickable(bkDashboardLocators.Close_Client_AddPage));
		 bkDashboardLocators.Close_Client_AddPage.click();
	}
	public void ValidateClientType() throws IOException, InterruptedException  {
		HelperClass.SelectDropdownvaluesOneByOne(By.id("CboType"));
	}
	public void ValidateTextSearch() {
		
		WebDriverWait wait = HelperClass.getWait();
		 wait.until(ExpectedConditions.elementToBeClickable(bkDashboardLocators.ValidatetxtSearch));
		bkDashboardLocators.ValidatetxtSearch.sendKeys("anwar");
		
	}
	public void ValidateVatClient() {
		WebDriverWait wait = HelperClass.getWait();
		 wait.until(ExpectedConditions.elementToBeClickable(bkDashboardLocators.ValidateVatClient));
		bkDashboardLocators.ValidateVatClient.click();
	}
	public void MonthInVatClients() throws IOException, InterruptedException {
		HelperClass.SelectDropdownvaluesOneByOne(By.id("CboMonth"));
	}
	public void VatStatus() throws InterruptedException {
		HelperClass.SelectDropdownvaluesOneByOne(By.id("CboStatus"));
	}
	public void PaymentStatus() throws InterruptedException  {
		HelperClass.SelectDropdownvaluesOneByOne(By.id("CboPayment"));
	}
	
	public void ClickonAllclients () {
		HelperClass.refresh();
		bkDashboardLocators.Allclients.click();
	}
	
	public void Clickon3 () {
		WebDriverWait wait = HelperClass.getWait();
		 wait.until(ExpectedConditions.elementToBeClickable(bkDashboardLocators.ThreeNumber));
		bkDashboardLocators.ThreeNumber.click();
}
	public void ClickonPreviuousbutton() {
		bkDashboardLocators.Previousbutton.click();		
}
	public void ClickonLastButton() {
		bkDashboardLocators.Firstbutton.click();
	}
	
	public void Nextbutton() {
		bkDashboardLocators.Nextbutton.click();
	}
	public void Lastbutton() {
		bkDashboardLocators.Lastbutton.click();
	}
}