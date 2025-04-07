package com.Capium.TestRunFiles;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "D:\\Capium_BK_3.0\\src\\test\\resources\\Feature_CapiumPurchase\\BookkeepingDashboard.feature",
                                glue = "com.Capium.stepDefinations",
                                		plugin={"pretty","html:target/cucumber.html",
                                "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"})

public class CucumberRunnerTests extends AbstractTestNGCucumberTests{

}
