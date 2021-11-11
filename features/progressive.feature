
Feature: Progressive LogIn Account Validation

Scenario: Varifying Account By Using Invalid Credentials

Given user is on homepage
When user click on login button
And user enter invalid username
And user enter invalid password
And user click on login
Then displays invalid information





