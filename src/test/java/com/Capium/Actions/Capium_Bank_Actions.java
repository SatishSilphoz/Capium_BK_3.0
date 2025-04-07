package com.Capium.Actions;

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
	HelperClass.Searchclient("bank purpose",By.xpath("(//a[text()='bank purpose'])[2]"));
}

}