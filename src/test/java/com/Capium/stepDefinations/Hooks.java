package com.Capium.stepDefinations;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.Capium.Utilies.HelperClass;
import com.aventstack.extentreports.*;
import com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.service.ExtentService;

import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.Scenario;

public class Hooks {
	private static ExtentReports extent = ExtentService.getInstance();
    private static ExtentTest scenarioTest;

    @BeforeAll
    public static void setup() {
        HelperClass.setUpDriver();
        System.out.println("Starting the Test Execution...");
    }

    @Before
    public void beforeScenario(Scenario scenario) {
        scenarioTest = extent.createTest(scenario.getName());
        System.out.println("Starting Scenario: " + scenario.getName());
    }

    @AfterStep
    public void afterStep(Scenario scenario) {
        WebDriver driver = HelperClass.getDriver();
        if (scenario.isFailed()) {
            try {
                TakesScreenshot ts = (TakesScreenshot) driver;
                File src = ts.getScreenshotAs(OutputType.FILE);
                String screenshotPath = "screenshots/" + scenario.getName().replace(" ", "_") + ".png";
                FileUtils.copyFile(src, new File(screenshotPath));

                final byte[] screenshot = ts.getScreenshotAs(OutputType.BYTES);
                scenario.attach(screenshot, "image/png", scenario.getName());
                scenarioTest.log(Status.FAIL, "Step Failed: " + scenario.getName(),
                        MediaEntityBuilder.createScreenCaptureFromPath(screenshotPath).build());
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            scenarioTest.log(Status.PASS, "Step Passed: " + scenario.getName());
        }
    }

    @After
    public void afterScenario(Scenario scenario) {
        if (scenario.isFailed()) {
            scenarioTest.log(Status.FAIL, "Scenario Failed: " + scenario.getName());
        } else {
            scenarioTest.log(Status.PASS, "Scenario Passed: " + scenario.getName());
        }
    }

    @AfterAll
    public static void tearDown() {
//        System.out.println("Ending Test Execution...");
//        try {
//            if (HelperClass.getDriver().findElement(By.xpath("//i[@class='icon fa fa-power-off']")) != null &&
//                HelperClass.getDriver().findElement(By.xpath("//i[@class='icon fa fa-power-off']")).isDisplayed()) {
//                HelperClass.getDriver().findElement(By.xpath("//i[@class='icon fa fa-power-off']")).click();
//            }
//            else if (HelperClass.getDriver().findElement(By.xpath("//div[@class='profile-logo']//label")) != null &&
//                     HelperClass.getDriver().findElement(By.xpath("//div[@class='profile-logo']//label")).isDisplayed()) {
//                HelperClass.getDriver().findElement(By.xpath("//div[@class='profile-logo']//label")).click();
//                if (HelperClass.getDriver().findElement(By.xpath("//a[normalize-space()='Logout']")) != null &&
//                    HelperClass.getDriver().findElement(By.xpath("//a[normalize-space()='Logout']")).isDisplayed()) {
//                    HelperClass.getDriver().findElement(By.xpath("//a[normalize-space()='Logout']")).click();
//                }
//            }
//        } catch (Exception e) {
//            System.out.println("Logout failed: " + e.getMessage());
//        }
//        try {
//          //  HelperClass.tearDown(); 
//            System.out.println("Teardown complete.");
//        } catch (Exception e) {
//            System.out.println("Error during teardown: " + e.getMessage());
//        }
//        try {
//            extent.flush();
//            System.out.println("Extent report flushed.");
//        } catch (Exception e) {
//            System.out.println("Error flushing extent report: " + e.getMessage());
       // }
    }
}