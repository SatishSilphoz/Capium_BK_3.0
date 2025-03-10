Feature: Login into Capium

  Scenario: User login
    Given Launch the browser
    And User need to enter the Application Url "https://app.capium.com/sign-in.aspx?"
    When User Enter username is "rajasekhar.sriram@capium.com" and Password is "Pandya12345678@"
    Then User Click on login button

  Scenario: Accounts Production Dashboard
    Given Launch the browser
    And User need to enter the Application Url "https://app.capium.com/sign-in.aspx?"
    When User Enter username is "rajasekhar.sriram@capium.com" and Password is "Pandya12345678@"
    Then User Click on login button
    Then Validate C i.e Capium icon in Home Page
    And Validate Bookkeeping in Home Page
    When Validate DashBoard in Home Page
    And Validate RefreshButton in VAT Summery which is at Right Side
    And Validate Sidebar-toggler in VAT Summery which is at Right Side
    And Validate Returns in previous month which is in VAT Summery
    When Validate Monthly Submitted Returns  in VAT Summery
    And Validate Minimise in VAT Summery
    And Validate Add Client
    And Validate Add Client Page
    And Validate All Clients
    And Validate Client Type
    And Validate Text search
    And Validate VAT Clients
    And Validate Client Type
    And Validate Text search
    And Validate Month in VAT Clients
    And Validate VAT Status
    And Validate Payment Status
    And Validate Client List
    And Validate First and Previous button
    And Validate Next button
    And Validate Last button
    And Validate Scroll bar
