package com.project.utilities;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;


public class BaseTest
{
	public static WebDriver driver;
	public static ConfigReader config =new ConfigReader();
	

	//Open Browser
	public void openBrowser(String browserName) throws InterruptedException
	{
		if(browserName.equalsIgnoreCase("GC"))
		{
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Lib\\chromedriver.exe");
			driver=new ChromeDriver();
		}
		else if(browserName.equalsIgnoreCase("FF"))
		{
			System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"\\Lib\\geckodriver.exe");
			driver=new FirefoxDriver();
		}
		else if(browserName.equalsIgnoreCase("IE"))
		{
			System.setProperty("webdriver.ie.driver", System.getProperty("user.dir")+"\\Lib\\IEDriverServer.exe");
			driver=new InternetExplorerDriver();
		}
		else if(browserName.equalsIgnoreCase("Edge"))
		{
			System.setProperty("webdriver.edge.driver", System.getProperty("user.dir")+"\\Lib\\MicrosoftWebDriver.exe");
			driver=new EdgeDriver();
			
		}
		else
		{
			System.out.println("Please enter valid browser name");
		}
		
		
		
		
	}
		
	//Launch Application
	public void launchApplication() throws FileNotFoundException, IOException, InterruptedException
	{
		//Open Browser
		openBrowser(config.getBrowser());
		
		//Navigate to application
		driver.get(config.getURL());
		Thread.sleep(2000);
		
		//Maximize the window
		driver.manage().window().maximize();
	}
	
	
	
	//Close Browser
	public void closeBrowser() throws InterruptedException
	{
		Thread.sleep(2000);
		driver.close();
		
	}
		

}
