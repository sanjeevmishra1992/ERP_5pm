Feature: ERP Login Module

  Scenario: ERP_TC1_Verify admin user able to login with valid user credentials
    Given ERP Application is launched 
    When user enters valid user name and password and click on login
    Then ERP Homepage should display
    
 Scenario: ERP_TC2_Verify admin user able to logout the application
    Given ERP Application is launched 
    When user enters valid user name and password and click on login
    And  user clicks on logout option
    Then validate logout  
