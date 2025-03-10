package com.Capium.Locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;


public class CapiumLoginLocators {
	
	
	
	@FindBy(xpath="//input[@id='txtusername']")
    @CacheLookup
    public WebElement inputUsername;
	
	@FindBy(xpath="//input[@id='txtpassword']")
	 @CacheLookup
	 public WebElement inputPassword;
	
	@FindBy(xpath="//button[@id='btnLogin']")
	 @CacheLookup
	 public WebElement btnLogin;
	
	@FindBy(xpath="//span[@id='ErrSignIn']")
	@CacheLookup
	public WebElement InvalidmsgUnPwd;
	
	@FindBy(xpath="//img[@src='/images/logo-login.png']")
	@CacheLookup
	public WebElement divHomePageTitle;
	
	@FindBy(xpath="(//img[@alt='logo'])[2]")
	@CacheLookup
	public WebElement CapiumCicon;
	
	@FindBy(xpath="//a[@href='/']//parent::span")
	@CacheLookup
	public WebElement CapiumHome;
	
	@FindBy(xpath="(//h6[text()='Bookkeeping'])[1]")
	@CacheLookup
	public WebElement Bookkeeping;
	
	@FindBy(xpath="//span[text()=' Dashboard ']//parent::a")
	@CacheLookup
	public WebElement AccountsProDashboard;
	
	@FindBy(xpath="//i[@class='fa fa-refresh']")
	@CacheLookup
	public WebElement ClickonRefresh;
	
	@FindBy(xpath="//i[@class='fa fa-arrows-h']")
	@CacheLookup
	public WebElement clickonMaximizebtn;
	
	@FindBy(xpath="//input[@id='txtSearch']")
	@CacheLookup
	public WebElement clickonSearchbar;
	
	@FindBy(xpath="//button[text()='Client']")
	@CacheLookup
	public WebElement ClickOnClientbtn;
	
	
	@FindBy(xpath="(//span[@class='menu-text'])[1]")
	@CacheLookup
	public WebElement ClickonDashboard;
		
	@FindBy(xpath="//span[text()='VAT Summary']")
	@CacheLookup
	public WebElement Vatsummary;	
	
	@FindBy(xpath="//a[@title='Minimise']")
	@CacheLookup
	public WebElement MinimiseVatsummary;
	
	@FindBy(xpath="(//img[@alt='logo'])[2]")
	@CacheLookup
	public WebElement HomecIcon;
	
	@FindBy(xpath="//button[@id='btnAddNewClient']")
	@CacheLookup
	public WebElement BkAddclient;
	
	@FindBy(xpath="//button[text()='Save']")
	@CacheLookup
	public WebElement BkAddclientSave;
	
	
	
	@FindBy(xpath="//input[@id='Name']")
	@CacheLookup
	public WebElement ClientnameBK;
	
	@FindBy(xpath="(//i[@class='fa fa-angle-double-right'])[1]")
	@CacheLookup
	public WebElement ClickonLast;

	@FindBy(xpath="//input[@id='txtSearch']")
	@CacheLookup
	public WebElement Textsearch;
	
	@FindBy(xpath="(//i[@class='fa fa-search azure'])[1]")
	@CacheLookup
	public WebElement Clickonsearch;
	
	@FindBy(xpath="(//a[@data-toggle='tab'])[2]")
	@CacheLookup
	public WebElement ClickonVatclients;
	
	@FindBy(xpath="(//a[text()='2'])[2]")
	@CacheLookup
	public WebElement page2;
	
	@FindBy(xpath="(//span[text()='Previous'])[2]")
	@CacheLookup
	public WebElement previousbutton;
	
	@FindBy(xpath="(//i[@class='fa fa-angle-double-left'])[2]")
	@CacheLookup
	public WebElement firstbutton;
	
	
	@FindBy(xpath="(//span[text()='Next'])[2]")
	@CacheLookup
	public WebElement Nextbutton;
	
	@FindBy(xpath="(//i[@class='fa fa-angle-double-right'])[2]")
	@CacheLookup
	public WebElement Lastbutton;
	
	@FindBy(xpath="//select[@id='CboType']")
	@CacheLookup
	public WebElement scrolling;
	
	
	
}
