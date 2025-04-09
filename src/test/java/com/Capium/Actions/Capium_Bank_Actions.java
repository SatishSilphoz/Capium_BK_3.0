package com.Capium.Actions;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

import com.Capium.Locators.Capium_Bookkeeping_Bank_Locators;
import com.Capium.Utilies.HelperClass;

public class Capium_Bank_Actions {

	Capium_Bookkeeping_Bank_Locators bankLocators=null;
	public Capium_Bank_Actions()
	{
		this.bankLocators = new Capium_Bookkeeping_Bank_Locators();
		 PageFactory.initElements(HelperClass.getDriver(),bankLocators);
	}
public void SearchClient() throws InterruptedException {
	
	HelperClass.Searchclient("bank purpose",By.xpath("(//a[@class='azure'])[1]"));
}
public void Bankverified() {
bankLocators.Bank.isDisplayed();
bankLocators.Bank.click();

}
public void ClickonDashboard() {
	bankLocators.Dashboard.click();
	bankLocators.BankDashboard.isDisplayed();
}
public void Verifybankdashboard() {
	bankLocators.BankDashboard.isDisplayed();
}
public void validatebankadding() {
	
	bankLocators.AddBank.click();
	bankLocators.BankName.sendKeys("HDFC");
	bankLocators.SortBranchCode.sendKeys("7162313");
	bankLocators.AccountNO.sendKeys("9161341");
	bankLocators.SaveBank.click();
}

public void validatecreatedbank() throws InterruptedException {
	bankLocators.CreatedBank.isDisplayed();
	Thread.sleep(2000);
	bankLocators.CreatedBank.click();
}
public void validatebankimportfunctionality() throws InterruptedException, AWTException {
	bankLocators.Bankimport.click();
bankLocators.UploadBankimport.click();
Robot robot = new Robot();
robot.keyPress(KeyEvent.VK_CONTROL);
robot.keyPress(KeyEvent.VK_L);
robot.keyRelease(KeyEvent.VK_L);
robot.keyRelease(KeyEvent.VK_CONTROL);
Thread.sleep(500);
StringSelection stringSelection = new StringSelection("C:\\Users\\user\\OneDrive - Default Directory\\Bank_Import_Template.csv");
Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);
robot.keyPress(KeyEvent.VK_CONTROL);
robot.keyPress(KeyEvent.VK_V);
robot.keyRelease(KeyEvent.VK_V);
robot.keyRelease(KeyEvent.VK_CONTROL);
robot.keyPress(KeyEvent.VK_ENTER);
robot.keyRelease(KeyEvent.VK_ENTER);
Thread.sleep(1000);
bankLocators.Clickimport.click();
bankLocators.Continue.click();
bankLocators.alertok.click();
bankLocators.Backbutton.click();
Thread.sleep(1000);
bankLocators.Backbutton.click();
}

public void manualimportfunctionality() {
	bankLocators.Manualimport.click();
	bankLocators.Typebox1.sendKeys("type1");
	bankLocators.Description1.sendKeys("des1");
	bankLocators.Paidout.sendKeys("100");
	bankLocators.Typebox2.sendKeys("type2");
	bankLocators.Description2.sendKeys("des2");
	bankLocators.Paidin.sendKeys("100");
	bankLocators.SavecloseManualimport.click();
}
public void validatequickentryadding() throws InterruptedException {
	bankLocators.Quickentry.click();
	HelperClass.Searchclient("raja", By.xpath("//a[text()='sriram']"));
	bankLocators.QuickentryAccount1.sendKeys("sales");
	bankLocators.InvoiceDate1.sendKeys("25/02/2025");
	bankLocators.outsideclick.click();
	HelperClass.Searchclient("sriram", By.xpath("//a[text()='raja']"));
	bankLocators.QuickentryAccount1.sendKeys("purchase");
	bankLocators.InvoiceDate1.sendKeys("25/02/2025");
	bankLocators.outsideclick.click();
	bankLocators.QuickentrySave.click();
}
public void validatejournaladding() {
	bankLocators.QuickJournal.click();
	bankLocators.QuickJournalAmountText.sendKeys("100");
	bankLocators.SaveQuickJournal.click();
}
public void validatedirectpayment() {
	HelperClass.selectOptionByValue(By.xpath("(//select[@class='ddlaactioncss input-xs'])[1]"), "post");
	HelperClass.SearchAndSelectClient(By.xpath("(//input[@type='text'])[9]"), "sales", By.xpath("//li[@title='Turnover']/a"));
	bankLocators.Journaldescription.sendKeys("des1");
}
}
