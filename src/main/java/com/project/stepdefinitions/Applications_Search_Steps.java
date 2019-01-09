package com.project.stepdefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.cucumber.listener.Reporter;
import com.project.utilities.BaseTest;

import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class Applications_Search_Steps extends BaseTest {

	
	//Page Objects
	@FindBy(how = How.ID, using = "cms-find")
	public WebElement applicationsTab;

	
	
	
	
	//Step Definitions
	@Given("^User navigaated to Application$")
	public void navigatedToApplication()
	{
		Reporter.addStepLog("Given User sucessfully navigated to application");
	}
	
	@Given("^Clicked on Applications Tab$")
	public void clickOnApplicationsTab() throws InterruptedException
	{
		Thread.sleep(1000);
		driver.findElement(By.id("cms-find")).click();
		Thread.sleep(3000);
		Reporter.addStepLog("Given User sucessfully navigated to application");
	}
	
	
	@Given("^User entered \"([^\"]*)\" in search box$")
	public void enterApplicationName(String applicationName)
	{
		Reporter.addStepLog("Given Application Name is : "+applicationName);
		
	}
	
	@Then("^Selected application from search results$")
	public void clicked_on_Login_button() throws Throwable {
	   Reporter.addStepLog("Selected Application from Search Results");
	}
	
	

}
