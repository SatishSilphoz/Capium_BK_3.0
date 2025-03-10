package com.Capium.Actions;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.Capium.Locators.CapiumLoginLocators;
import com.Capium.Utilies.HelperClass;




public class CapiumLoginActions {
private WebDriver driver;
	CapiumLoginLocators capiumloginlocators= null;
	public CapiumLoginActions() {
		 
        this.capiumloginlocators = new CapiumLoginLocators();
 
        PageFactory.initElements(HelperClass.getDriver(),capiumloginlocators);
    }
	
	
	 public void setUserName(String strUserName) {
		 capiumloginlocators.inputUsername.clear();
		 capiumloginlocators.inputUsername.sendKeys(strUserName);
	    }
		  
		   
		  public void SetPassword(String password) {
			  capiumloginlocators.inputPassword.clear();
			  capiumloginlocators.inputPassword.sendKeys(password);
		  }  
		  
		  public void ClickBtnLogin() {
			  capiumloginlocators.btnLogin.click();
		  }
		  
		  public void  VerifyhomePage() {
			  WebDriverWait wait = HelperClass.getWait();
			  wait.until(ExpectedConditions.visibilityOf(capiumloginlocators.divHomePageTitle));
			     capiumloginlocators.divHomePageTitle.isDisplayed();   
			  }
		
		 public void C_icon() {
			 WebDriverWait wait = HelperClass.getWait();
	            wait.until(ExpectedConditions.elementToBeClickable(capiumloginlocators.CapiumCicon));
	            capiumloginlocators.CapiumCicon.click();
		       
			  }
			  
		public void C_Home()
		{
			 WebDriverWait wait = HelperClass.getWait();
			 
	            wait.until(ExpectedConditions.elementToBeClickable(capiumloginlocators.CapiumHome));
	            capiumloginlocators.CapiumHome.click();
		}
		
		public boolean isUserOnHomePageAfterLogin() {
		    WebDriverWait wait = HelperClass.getWait();
		    
		    try {
		        wait.until(ExpectedConditions.elementToBeClickable(capiumloginlocators.CapiumCicon));
		        capiumloginlocators.CapiumCicon.click();
		        System.out.println("Clicked on Capium C Icon");
		    } catch (Exception e) {
		        System.out.println("Error while clicking Capium C Icon: " + e.getMessage());
		        return false;
		    }

		    try {
		        wait.until(ExpectedConditions.elementToBeClickable(capiumloginlocators.CapiumHome));
		        capiumloginlocators.CapiumHome.click();
		        System.out.println("Clicked on Home Button");
		    } catch (Exception e) {
		        System.out.println("Error while clicking Home Button: " + e.getMessage());
		        return false;
		    }

		    try {
		        wait.until(ExpectedConditions.visibilityOf(capiumloginlocators.divHomePageTitle));
		        if (capiumloginlocators.divHomePageTitle.isDisplayed()) {
		            System.out.println("User is on the Home Page after Login");
		            return true; 
		        } else {
		            System.out.println("Home Page title is not visible, user may not be on the Home Page");
		            return false;
		        }
		    } catch (Exception e) {
		        System.out.println("Error while verifying Home Page after login: " + e.getMessage());
		        return false;
		    }
		}
     
		public void ClickonBookkeeping() {
			 WebDriverWait wait = HelperClass.getWait();
			 wait.until(ExpectedConditions.visibilityOf(capiumloginlocators.Bookkeeping));
			 capiumloginlocators.Bookkeeping.click();
		}
		
		
		public void ClickMonthlySubmittedDropdown() {
			WebDriverWait wait = HelperClass.getWait();
			 wait.until(ExpectedConditions.presenceOfElementLocated(By.id("CboYear")));
			HelperClass.ClickDropdown(By.id("CboYear"));
		}
		
		public void SelectRespectiveYearSubmission() throws IOException {
			HelperClass.selectFromDropdownAndObserveResults(By.id("CboYear"));
		}
		
		public void clickOnRefreshbtn() {
			WebDriverWait wait = HelperClass.getWait();
			wait.until(ExpectedConditions.elementToBeClickable(capiumloginlocators.ClickonRefresh));
			capiumloginlocators.ClickonRefresh.click();
		}
		
		public void ClickOnMaximizebtn() {
			
			WebDriverWait wait = HelperClass.getWait();
			wait.until(ExpectedConditions.elementToBeClickable(capiumloginlocators.clickonMaximizebtn));
			capiumloginlocators.clickonMaximizebtn.click();
			
		}
		
		public void selectClientType() {
			WebDriverWait wait = HelperClass.getWait();
			 wait.until(ExpectedConditions.presenceOfElementLocated(By.id("CboType")));
			HelperClass.selectOptionByVisibleText(By.id("CboType"), "Limited");
		}
		
		public void ClickonSearchBar() {
			WebDriverWait wait = HelperClass.getWait();
			 wait.until(ExpectedConditions.elementToBeClickable(capiumloginlocators.clickonSearchbar));
			capiumloginlocators.clickonSearchbar.click();
		}
		
		public void EnterUser_or_id_Name() {
			HelperClass.sendKeysAndPressEnter(By.id("txtSearch"), "Anwar A");
		}
		
		public void ClickOnDueDropDown() {
			WebDriverWait wait = HelperClass.getWait();
			 wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.id("CboDueWithin")));
			 HelperClass.ClickDropdown(By.id("CboDueWithin"));
			 
		}
		
		public void SelectDueTypeinDropdown() throws IOException { 
			 HelperClass.selectFromDropdownAndObserveResults(By.id("CboDueWithin"));
			
		}
		
		public void ClickOnStatusDropdown() {
			WebDriverWait wait = HelperClass.getWait();
			 wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.id("CboStatus")));
			 HelperClass.ClickDropdown(By.id("CboStatus"));
		}
		
		public void SelectStatusInDropdown() throws IOException {
			HelperClass.selectFromDropdownAndObserveResults(By.id("CboStatus"));
		}
		
		public void ClickOnClientBtn() {
			WebDriverWait wait = HelperClass.getWait();
			 wait.until(ExpectedConditions.elementToBeClickable(capiumloginlocators.ClickOnClientbtn));
			capiumloginlocators.ClickOnClientbtn.click();
		}
		public void verify() {
			HelperClass.verify(By.xpath("//i[@class='icon']/img"));
			
		
}
		public void verifybk() {
			HelperClass.verify(By.xpath("(//h6[text()='Bookkeeping'])[1]"));
}
		public void verifydashboard() {
			HelperClass.verify(By.xpath("(//span[@class='menu-text'])[1]"));
		
}
		public void ClickOnDashboard() {
			WebDriverWait wait = HelperClass.getWait();
			 wait.until(ExpectedConditions.elementToBeClickable(capiumloginlocators.ClickonDashboard));
			capiumloginlocators.ClickonDashboard.click();
}
		public void verifyVatsummary() {
			HelperClass.verify(By.xpath("//span[text()='VAT Summary']"));
		
}
		public void Minimisevatsummary() {
			WebDriverWait wait = HelperClass.getWait();
			 wait.until(ExpectedConditions.elementToBeClickable(capiumloginlocators.MinimiseVatsummary));
			capiumloginlocators.MinimiseVatsummary.click();
}
		public void verifyHomecIcon() {
			HelperClass.verify(By.xpath("(//img[@alt='logo'])[2]"));
			
		
}
		public void BkAddclient() {
			WebDriverWait wait = HelperClass.getWait();
			 wait.until(ExpectedConditions.elementToBeClickable(capiumloginlocators.BkAddclient));
			capiumloginlocators.BkAddclient.click();
}
		public void BkAddclientSave() {
			WebDriverWait wait = HelperClass.getWait();
			 wait.until(ExpectedConditions.elementToBeClickable(capiumloginlocators.BkAddclientSave));
			capiumloginlocators.BkAddclientSave.click();
}
		public void Clientnamebk() {
			WebDriverWait wait = HelperClass.getWait();
			 wait.until(ExpectedConditions.visibilityOf(capiumloginlocators.ClientnameBK));
			capiumloginlocators.ClientnameBK.sendKeys("AutomationBK");
}
		public void Clickonlast() {
			WebDriverWait wait = HelperClass.getWait();
			 wait.until(ExpectedConditions.elementToBeClickable(capiumloginlocators.ClickonLast));
			capiumloginlocators.ClickonLast.click();

		
			
		}
		public void TextSearch() {
			WebDriverWait wait = HelperClass.getWait();
			 wait.until(ExpectedConditions.elementToBeClickable(capiumloginlocators.Textsearch));
			capiumloginlocators.Textsearch.sendKeys("AutomationBK");
}
		public void ClickonSearch() {
			WebDriverWait wait = HelperClass.getWait();
			 wait.until(ExpectedConditions.elementToBeClickable(capiumloginlocators.Clickonsearch));
			capiumloginlocators.Clickonsearch.click();
}	
		public void Clickonvatclients() {
			WebDriverWait wait = HelperClass.getWait();
			 wait.until(ExpectedConditions.elementToBeClickable(capiumloginlocators.Clickonsearch));
			capiumloginlocators.ClickonVatclients.click();
		
}
		public void Selectmonth() throws IOException {
			HelperClass.selectFromDropdownAndObserveResults(By.id("CboMonth"));
		}
		public void SelectVatstatus() {
			
			
		}
		public void Selectpaymentstatus() throws IOException {
			HelperClass.selectFromDropdownAndObserveResults(By.id("CboPayment"));
}
		
		public void pagenumber2() {
			
			WebDriverWait wait = HelperClass.getWait();
			 wait.until(ExpectedConditions.elementToBeClickable(capiumloginlocators.page2));
			capiumloginlocators.page2.click();	
		}
public void previousbutton() {
			
			WebDriverWait wait = HelperClass.getWait();
			 wait.until(ExpectedConditions.elementToBeClickable(capiumloginlocators.previousbutton));
			capiumloginlocators.previousbutton.click();	
		}

public void firstbutton() {
	
	WebDriverWait wait = HelperClass.getWait();
	 wait.until(ExpectedConditions.elementToBeClickable(capiumloginlocators.firstbutton));
	capiumloginlocators.firstbutton.click();	
}
public void nextbutton() {
	
	WebDriverWait wait = HelperClass.getWait();
	 wait.until(ExpectedConditions.elementToBeClickable(capiumloginlocators.Nextbutton));
	capiumloginlocators.Nextbutton.click();	
}
public void lastbutton() {
	
	WebDriverWait wait = HelperClass.getWait();
	 wait.until(ExpectedConditions.elementToBeClickable(capiumloginlocators.Lastbutton));
	capiumloginlocators.Lastbutton.click();	
}
public void scrolling() {
	HelperClass.scrollUntilElementVisible(driver, capiumloginlocators.scrolling);
}

}