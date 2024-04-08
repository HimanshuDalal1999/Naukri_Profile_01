Feature: Validate Naukri Application

Scenario: Verify Login Functionality of the Naukri Application
Given User should be at Login Page
When User click on Login button
And User enters Username as "dalalhimanshu6477@gmail.com"
And User enters Password as "Himanshu@2264"
And User clicks on Login button
Then User sould redirects to Home page