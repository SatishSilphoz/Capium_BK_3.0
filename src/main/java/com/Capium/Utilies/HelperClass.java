package com.Capium.Utilies;
import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class HelperClass {
	
	private static HelperClass helperClass;
    
    private static WebDriver driver;
    private static WebDriverWait wait;
    public final static int TIMEOUT = 12;
    private static String screenshotDirectory = "screenshots/"; 
     private HelperClass() {
                   
             ChromeOptions options = new ChromeOptions();
             options.addArguments("--start-maximized");
             driver = new ChromeDriver(options);
             driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(TIMEOUT));
         }    
              
     public static void openPage(String url) {
         if (driver == null) {
             setUpDriver();  // Ensure WebDriver is initialized
         }
         driver.get(url);
     }
  
      
     public static WebDriver getDriver() {
         if (driver == null) {
             setUpDriver();
         }
         return driver;
     }
      
    public static void setUpDriver() {
          
        if (helperClass==null) {
              
            helperClass = new HelperClass();
        }
    }
      
     public static void tearDown() {
           
         if(driver!=null) {
        	 setUpDriver(); 
             driver.close();
             driver.quit();
         }
           
         helperClass = null;
     } 
     
     public static WebDriverWait getWait() {
    	 return new WebDriverWait(HelperClass.getDriver(), Duration.ofSeconds(TIMEOUT));
        
    }
     
     public static String GetUserName() {
         return "Capium Username";
        }
        
        public static String GetPassword() {
         return "Capium password";
        }
        
       public static String getTitile() {
       	return driver.getTitle();
       }
        
        public static String getCuurentUrl() {
       	 return driver.getCurrentUrl();
        }
        
        // sendKeys methods
        public static void sendKeys(By locator, String text) {
            WebElement element = driver.findElement(locator);
            element.clear();  
            element.sendKeys(text);  
        }
        
        public static List<WebElement> Listoptions(By locator) {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(TIMEOUT));
            wait.until(ExpectedConditions.visibilityOfElementLocated(locator)); 
            return driver.findElements(locator);
        }

        public static void ClickandAnyTypeofWebelemnt(By locator) {
       	 WebDriverWait wait =HelperClass.getWait();
       	WebElement element = driver.findElement(locator);
       	 wait.until(ExpectedConditions.visibilityOf(element));
           element.click(); 
            
       }

        public static boolean isButtonEnabled(By locator) {
       	 WebDriverWait wait =HelperClass.getWait();
           try {
               WebElement button = driver.findElement(locator);
               wait.until(ExpectedConditions.visibilityOf(button));
               return button.isEnabled();
           } catch (Exception e) {
               System.out.println("Error occurred while checking button: " + e.getMessage());
               return false;  
           }
       }
        public static void sendKeysAndPressEnter(By locator, String text) {
            WebElement element = driver.findElement(locator);
            element.clear();  
            element.sendKeys(text + "\n"); 
        }
        
        // Select class methods dropdowns
        public static void selectOptionByVisibleText(By dropdownLocator, String visibleText) {
            WebElement dropdown = driver.findElement(dropdownLocator);
            Select select = new Select(dropdown);
            select.selectByVisibleText(visibleText);
        }

        public static void selectOptionByValue(By dropdownLocator, String value) {
            WebElement dropdown = driver.findElement(dropdownLocator);
            Select select = new Select(dropdown);
            select.selectByValue(value);
        }

        public static void ClickDropdown(By  dplocator) {
       	 WebElement dropdown = driver.findElement(dplocator);
            Select select = new Select(dropdown);
        }
        
        public static void selectFromDropdownAndObserveResults(By dropdownLocator) throws IOException {
           
            WebDriverWait wait =HelperClass.getWait();
            WebElement dropdownElement = driver.findElement(dropdownLocator);  // Change the locator as per your dropdown
            wait.until(ExpectedConditions.visibilityOf(dropdownElement));
            Select dropdown = new Select(dropdownElement);
            List<WebElement> options = dropdown.getOptions();
            for (WebElement option : options) {
                dropdown.selectByVisibleText(option.getText());
                wait.until(ExpectedConditions.visibilityOf(option));
                System.out.println("Selected option: " + option.getText());
                HelperClass.captureScreenshot(option.getText());
            }
        }
       
        public static void selectOptionByIndex(By dropdownLocator, int index) {
            WebElement dropdown = driver.findElement(dropdownLocator);
            Select select = new Select(dropdown);
            select.selectByIndex(index);
        }
        
        // capture scrrenshot method
        public static String captureScreenshot(String screenshotName) throws IOException {
            TakesScreenshot screenshot = (TakesScreenshot) driver;
            File sourceFile = screenshot.getScreenshotAs(OutputType.FILE);
            String screenshotPath = screenshotDirectory + screenshotName + ".png";
            File destinationFile = new File(screenshotPath);
            FileUtils.copyFile(sourceFile, destinationFile);

            return screenshotPath;
        }
        
        // Window handlemethods
        
        public static String getCurrentWindowHandle(WebDriver driver) {
            return driver.getWindowHandle(); 
        }
        
        public static Set<String> getAllWindowHandles(WebDriver driver) {
            return driver.getWindowHandles(); 
        }
        
        public static void switchToWindow(WebDriver driver, String windowHandle) {
            driver.switchTo().window(windowHandle); 
        }
        
        public static void switchToParentWindow(WebDriver driver, String parentWindowHandle) {
            driver.switchTo().window(parentWindowHandle); 
        }
        
        public static void closeCurrentWindow(WebDriver driver) {
            driver.close(); 
        }
        
        public static void closeAllWindows(WebDriver driver) {
            driver.quit(); 
        }
        public static void verify(By locator) {
			WebElement element=driver.findElement(locator);
			
			String cicon=element.getText();
		
			Assert.assertTrue(element.getText().contains(cicon));
		
}
        public static void scrolling1() {
        	
        	 JavascriptExecutor js = (JavascriptExecutor) driver;
             js.executeScript("window.scrollBy(0,2000)");
             
             
        }
        public static void scrollUntilElementVisible(WebDriver driver, WebElement element) {
       	 JavascriptExecutor js = (JavascriptExecutor) driver;
           js.executeScript("arguments[0].scrollIntoView(true);", element);
       }
       
        public static void scrolling3() {
          	 JavascriptExecutor js = (JavascriptExecutor) driver;
               js.executeScript("window.scrollBy(0,-3000)");
               
               
          }
        public static void pagenumberdropdown() {
        	
        
        WebElement dropdown = driver.findElement(By.xpath("//select[@name='TblClientList_VAT_length']"));
        Select select = new Select(dropdown);
        select.selectByValue("25");
        
       
}
        public static void SearchAndSelectClient(By searchFieldLocator, String searchText, By suggestionLocator) {
          
            WebElement searchField = wait.until(ExpectedConditions.visibilityOfElementLocated(searchFieldLocator));
            searchField.clear(); 
            searchField.sendKeys(searchText);
            wait.until(ExpectedConditions.visibilityOfElementLocated(suggestionLocator));
            WebElement firstSuggestion = driver.findElement(suggestionLocator);
            firstSuggestion.click();
        }
        public static void refresh() {
        	driver.navigate().refresh();
        	
}
        
        public static void SelectDropdownvaluesOneByOne(By Drodownloactor) {
        
        	WebElement dropdownlocator = driver.findElement(Drodownloactor);  
            Select dropdown = new Select(dropdownlocator);
            List<WebElement> options = dropdown.getOptions();
            for (WebElement option : options) {
                dropdown.selectByVisibleText(option.getText());
                System.out.println("Selected: " + option.getText());
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
}
            }
        }
         public static void Searchclient(String Clientname, By Locator1) throws InterruptedException {       
    
                WebElement searchBox = driver.findElement(By.id("txtSearch"));
                searchBox.sendKeys(Clientname);
                JavascriptExecutor js = (JavascriptExecutor) driver;
                WebElement firstSuggestion = driver.findElement(Locator1);
                js.executeScript("arguments[0].click();", firstSuggestion);
}
}
