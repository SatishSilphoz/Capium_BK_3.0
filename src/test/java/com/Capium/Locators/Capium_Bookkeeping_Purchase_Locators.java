package com.Capium.Locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;


public class Capium_Bookkeeping_Purchase_Locators {

	
	@FindBy(xpath="//input[@id='txtSearch']")
	@CacheLookup
	public WebElement EnterClientName_inSearchbar;
	
	
	
	
	
	
}
