@SmokeTest 
Feature: Validate Application Search 

Scenario Outline: Validate Application Search -TC01 
	Given User navigaated to Application 
	Then Clicked on Applications Tab 
	Given User entered "<applicationName>" in search box 
	And Selected application from search results 
	
	Examples: 
		|applicationName	|
		|innovative			|
		
		
		
		
		
		
		
		
		
		
		
