package com.project.stepdefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.cucumber.listener.Reporter;

import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class Login_DDT_Test {

	
	
	@Given("^User navigaated to LinkedIn$")
	public void NavigatedToApplication()
	{
		
		System.out.println("Navigated to LinkedIn");
	}
	
	@Then("^Entered \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_entered_and(String arg1, String arg2) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("Username is : "+arg1);
	    System.out.println("Password is : "+arg2);
	}

	@Then("^Clicked on SignIn button$")
	public void clicked_on_Login_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Clicked on Singin Button");
	}
	
	

}
