package com.project.runners;

import java.io.File;
import java.net.InetAddress;
import java.net.UnknownHostException;

import org.junit.BeforeClass;
import org.testng.annotations.AfterClass;

import com.cucumber.listener.Reporter;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
        features = {"Features/SmokeTest/"},
        glue = {"com.project.stepdefinitions"},
        plugin = {"com.cucumber.listener.ExtentCucumberFormatter:TestResults/CMS GOV Test Automation.html"},
        format = {
                "json:target/cucumber-regression.json",
                "pretty",
                "html:target/cucumber/Login"}
)



public class Smoke_Test_Runner extends AbstractTestNGCucumberTests {
   
	@BeforeClass
    public static void setup() {
       System.setProperty("cucumberReportPath", "TestResults/CMS_Gov_TestAutomation.html");
       //System.err.println("Hello");
       Reporter.setTestRunnerOutput("Test Execution Started");
    }
	
	
	@AfterClass
    public static void teardown() throws UnknownHostException {
        Reporter.loadXMLConfig(new File(System.getProperty("user.dir")+"\\config\\extent-config.xml"));
        
        //OS Details
        Reporter.setSystemInfo("OS", System.getProperty("os.name"));
        
        //User Details
        Reporter.setSystemInfo("user", System.getProperty("user.name"));
        
        //Host Name
        Reporter.setSystemInfo("Host Name", InetAddress.getLocalHost().getHostName());
        
        //Target Environment
        Reporter.setSystemInfo("Target Environent", "Sandbox QA");
        
        Reporter.setTestRunnerOutput("Test Execution Completed");
    }
}