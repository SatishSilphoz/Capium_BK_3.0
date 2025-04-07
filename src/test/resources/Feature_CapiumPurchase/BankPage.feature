Feature: BankPage

Background: User login
    Given Launch the browser
    And User need to enter the Application Url "https://app.capium.com/sign-in.aspx?redir=%2f"
    When User Enter username is "anwar.udayagiri@capium.com" and Password is "Qa@1234567890"
    Then User Click on login button
    And redirect to Bookkeeping module
    
Scenario: Bank Page Functionality
Given SearchClientAndSelect
Then Validate bank page
Then Open bank page
When Validate the dashboard page
And Validate Add bank
And Verify and Open bank which we added
Then Validate Manual import functionality
And Validate bank import funtionality
And Validate Quick entry functionality
And Validate Quick journal functionality
Then Validate Direct receipt functionality
And Validate Customer Account functionality
And Validate Transfer functionality
And Validate Multiple transactions functionality
And Validate New invoice functionality
And Validate refund functionality
And Verify delete functionality
Then Validate Bank Transfer functionality

