Feature: To validate Login functionality 

Scenario: To validate the login function with invalid username and invalid password 
	Given User launch the Facebook url 
	When User enters the username and password in facebook page 
		|UserName|Password|
		|Greens|456789|
		|Hello|1234567|
		|Greenstech|1234|
	And User clicks the login button in facebook page 
	Then User validates the login failure of facebook page 
	
