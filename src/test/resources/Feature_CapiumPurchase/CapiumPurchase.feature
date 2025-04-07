Feature: Bookkeeping Purchases Dashboard and charts

 Background: User login
    Given Launch the browser
    And User need to enter the Application Url "https://app.capium.com/sign-in.aspx?"
    When User Enter username is "anwar.udayagiri@capium.com" and Password is "Qa@1234567890"
    Then User Click on login button
    And redirect to Bookkeeping module
    
   Scenario: Bookkeeping purchase tab
   Given Validate Purchase in Client Page
   And Validate Dashboard in Purchase
   And Validate Add Purchases in Purchases Summary
   And Validate Save and Close in Create New  Purchase Page
   And Validate + in Supplier Name
   And Validate Save in Add New Supplier
   And Validate Supplier Name and Save in Add New  Supplier
   And Validate Existing Supplier Name in Create New  Purchase
   And Validate Save and Close in Create New  Purchase Page
   And Validate Amount and Save in Create New  Purchase Page
   And Validate Vat Rate and Save and Close
    