Feature: Login to account
         Existing stackoverflow user should be able to login into the account using correct credentials
         
Scenario: Login into account with correct details
Given User navigates to stackoverflow website
And User clikcs on the login button on homepage
And User enters a valid username
And User enters a valid password
When User clicks on the login button
Then User should be taken to the successful login page

