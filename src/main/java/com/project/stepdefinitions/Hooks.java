package com.project.stepdefinitions;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import com.cucumber.listener.Reporter;
import com.project.utilities.BaseTest;
import com.project.utilities.ConfigReader;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks  extends BaseTest
{
	public static WebDriver driver;
	

	
	
	
	@Before
    public void beforeScenario() throws InterruptedException, FileNotFoundException, IOException{
     
     //Reporter.addStepLog("Launching Browser");
     launchApplication();
     //Reporter.addStepLog("Browser Launched Sucessfully");
       
    }	
	
	@After
    public void afterScenario() throws InterruptedException{
    
		//Reporter.addStepLog("About to close the browser");      
        closeBrowser();
        //Reporter.addStepLog("Browser closed sucessfully");
    }
	
	
		
		
		

}
