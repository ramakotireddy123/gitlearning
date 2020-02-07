@fun
Feature: Login Functionality
@smoke
Scenario: Login with valid credentials
 Given User should be Login page
 When User enter valid credentials and submit 
 Then User should be in homepage
 @Reg
 Scenario: Login with invalid credentials
 Given User should be Login page
 When User enter invalid credentials and submit 
 Then system should throw error message
 
 

