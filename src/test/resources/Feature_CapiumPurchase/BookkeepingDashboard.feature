Feature: Bookkeeping dashboard

Background: User login
    Given Launch the browser
    And User need to enter the Application Url "https://app.capium.com/sign-in.aspx?"
    When User Enter username is "anwar.udayagiri@capium.com" and Password is "Qa@1234567890"
    Then User Click on login button
    And redirect to Bookkeeping module

Scenario: Dashboard functionality
Given Validate RefreshButton in VAT Summery which is at Right Side
And Validate Returns in previous month which is in VAT Summery
And Validate Minimise in VAT Summery
And Validate Add Client
Then Validate Add Client Page
And Validate All Clients
And Validate Client Type
And Validate Text search
And Validate Vat client
And Validate Month in VAT Clients
And Validate VAT Status
And Validate Payment Status
And Validate Client List
And Validate First and Previous button
And Validate Next button
And Validate Last button
And Validate Scroll bar
 