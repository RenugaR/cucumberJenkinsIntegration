@P1 @FacebookLogin @Regression 
Feature: To validate Login functionality 

Background:
Given User launch the Facebook url 

@TC03 @Smoke
Scenario: To validate the login function with invalid username and invalid password 
	When User enters the username and password in facebook page 
	And User clicks the login button in facebook page 
	Then User validates the login failure of facebook page 
	
@TC01 @Smoke
Scenario: To validate the login function with invalid username and invalid password 
	When User enters the username and password in facebook page 
		|UserName|Password|
		|Greens|456789|
		|Hello|1234567|
		|Greenstech|1234|
	And User clicks the login button in facebook page 
	Then User validates the login failure of facebook page
	
@login @TC02 
Scenario Outline: To validate the login function with the combinations of username and  password 
	When User enters the "<username>" and "<password>" in facebook page 
	And User clicks the login button in facebook page 
	Then User validates the login failure of facebook page 
	
	Examples: 
		| username | password  |
		| Greens   | 456677889 |
		| Hello    |     45678 |
