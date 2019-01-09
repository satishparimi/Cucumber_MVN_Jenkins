package com.project.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Applications_Search_Page {

	
	Applications_Search_Page() {
	
		
	}

	@FindBy(how = How.ID, using = "cms-find")
	private WebElement Applications;

	public WebElement getApplicationsTab() {
		return Applications;
	}
}
