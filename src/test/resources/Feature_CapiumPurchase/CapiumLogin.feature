Feature: Login into Capium

  Scenario: User login
    Given Launch the browser
    And User need to enter the Application Url "https://app.capium.com/sign-in.aspx?redir=%2f"
    When User Enter username is "anwar.udayagiri@capium.com" and Password is "Qa@1234567890"
    Then User Click on login button
    And redirect to Bookkeeping module
    Then Logout from application

 
