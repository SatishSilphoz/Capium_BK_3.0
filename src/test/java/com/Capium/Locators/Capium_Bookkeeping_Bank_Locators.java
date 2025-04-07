package com.Capium.Locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class Capium_Bookkeeping_Bank_Locators {

	
	@FindBy(xpath="//span[text()='Bank ']")
	@CacheLookup
	public WebElement Bank ;
	
	@FindBy(xpath="//a[@id='mnuBankLeft']")
	@CacheLookup
	public WebElement Dashboard ;
	
	@FindBy(xpath="//input[@id='txtBankName']")
	@CacheLookup
	public WebElement BankName ;
	
	@FindBy(xpath="//input[@id='txtSortBranchCode']")
	@CacheLookup
	public WebElement SortBranchCode;
	
	@FindBy(xpath="//input[@id='txtBankAccountNo']")
	@CacheLookup
	public WebElement AccountNO;
	
	@FindBy(xpath="//button[text()=' Save']")
	@CacheLookup
	public WebElement SaveBank;
	
	@FindBy(xpath="(//a[@class='azure'])[1]")
	@CacheLookup
	public WebElement CreatedBank;
	
	@FindBy(xpath="(//a[@type='button'])[2]")
	@CacheLookup
	public WebElement Manualimport;
	
	@FindBy(xpath="(//input[@type='text'])[2]")
	@CacheLookup
	public WebElement Typebox1;
	
	@FindBy(xpath="(//input[@type='text'])[6]")
	@CacheLookup
	public WebElement Typebox2;
	
	@FindBy(xpath="(//td[@class='col-action'])[1]")
	@CacheLookup
	public WebElement Description1;
	
	@FindBy(xpath="(//td[@class='col-action'])[2]")
	@CacheLookup
	public WebElement Description2;
	
	@FindBy(xpath="(//input[@type='text'])[3]")
	@CacheLookup
	public WebElement Paidout;
	
	@FindBy(xpath="(//input[@type='text'])[8]")
	@CacheLookup
	public WebElement Paidin;
	
	@FindBy(xpath="(//button[@type='button'])[3]")
	@CacheLookup
	public WebElement SavecloseManualimport;
	
	@FindBy(xpath="(//a[@type='button'])[1]")
	@CacheLookup
	public WebElement Bankimport;
	
	@FindBy(xpath="")
	@CacheLookup
	public WebElement DownloadBankimport;
	
	@FindBy(xpath="//a[text()='Quick Entry']")
	@CacheLookup
	public WebElement Quickentry;
	
	@FindBy(xpath="(//input[@type='text'])[6]")
	@CacheLookup
	public WebElement CustomerSupplier;
	
	@FindBy(xpath="(//input[@type='text'])[8]")
	@CacheLookup
	public WebElement Account;
	
	@FindBy(xpath="(//input[@type='text'])[9]")
	@CacheLookup
	public WebElement InvoiceDate;
	
	@FindBy(xpath="//i[@class='fa fa-save']")
	@CacheLookup
	public WebElement QuickentrySave;
	
	@FindBy(xpath="(//a[text()='Quick Journal'])[1]")
	@CacheLookup
	public WebElement QuickJournal;
	
	@FindBy(xpath="//input[@id='txtAmount_Quick']")
	@CacheLookup
	public WebElement QuickJournalAmountText;
	
	@FindBy(xpath="(//button[@type='button'])[4]")
	@CacheLookup
	public WebElement SaveQuickJournal;
	
	@FindBy(xpath="(//input[@type='text'])[9]")
	@CacheLookup
	public WebElement JournalAccountText;
	
	@FindBy(xpath="(//td[@class='col-action'])[2]")
	@CacheLookup
	public WebElement JournalDescriptionText;
	
	@FindBy(xpath="//i[@class='fa fa-save']")
	@CacheLookup
	public WebElement JournalSave;
	
	@FindBy(xpath="//span[text()='Make Advance Payment']")
	@CacheLookup
	public WebElement MakeadvancePayment;
	
	@FindBy(xpath="//i[@class='fa fa-save']")
	@CacheLookup
	public WebElement SaveSupplierAccount;
	
	@FindBy(xpath="//i[@class='fa fa-save']")
	@CacheLookup
	public WebElement SaveTransfer;
	
	@FindBy(xpath="//textarea[@name='desc']")
	@CacheLookup
	public WebElement MultipleTransactionsDescription;
	
	@FindBy(xpath="//textarea[@name='desc']")
	@CacheLookup
	public WebElement MultipletransactionsAmount;
	
	@FindBy(xpath="//input[@name='amount']")
	@CacheLookup
	public WebElement ADDMultipletransaction;
	
	@FindBy(xpath="//i[@class='fa fa-save']")
	@CacheLookup
	public WebElement SaveMultipletransaction;
	
	@FindBy(xpath="//i[@class='fa fa-plus azure']")
	@CacheLookup
	public WebElement Addsupplier;
	
	@FindBy(xpath="//input[@id='txtCName']")
	@CacheLookup
	public WebElement supplierNameText;
	
	@FindBy(xpath="(//i[@class='fa fa-save'])[2]")
	@CacheLookup
	public WebElement Savesupplier;
	
	@FindBy(xpath="(//button[@type='button'])[5]")
	@CacheLookup
	public WebElement ADDItem;
	
	@FindBy(xpath="//input[@id='txtItemName']")
	@CacheLookup
	public WebElement ItemName;
	
	@FindBy(xpath="//input[@name='Price']")
	@CacheLookup
	public WebElement ItemPrice;
	
	@FindBy(xpath="(//button[@type='button'])[15]")
	@CacheLookup
	public WebElement SaveItem;
	
	@FindBy(xpath="//i[@class='fa fa-save']")
	@CacheLookup
	public WebElement SaveInvoice;
	
	@FindBy(xpath="//button[text()='New Credit Note']")
	@CacheLookup
	public WebElement ADDNewcreditnote;
	
	@FindBy(xpath="//i[@class='fa fa-save']")
	@CacheLookup
	public WebElement ADDNewCreditNoteSave;
	
	@FindBy(xpath="//a[text()='Bank Transfer']")
	@CacheLookup
	public WebElement BankTransfer;
	
	@FindBy(xpath="(//i[@class='fa fa-plus'])[2]")
	@CacheLookup
	public WebElement ADDBankTransfer;
	
	@FindBy(xpath="//input[@name='TotalAmount']")
	@CacheLookup
	public WebElement AmountADDBankTransfer;
	
	@FindBy(xpath="//i[@class='fa fa-save']")
	@CacheLookup
	public WebElement SaveADDBankTransfer;
	
	
	
	
	
	
	
	
	
	
	
}
