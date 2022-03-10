Feature: ERP Login by using test data
  I want to use this template for my feature file

  @tag2
  Scenario Outline: Login with valid user credentials
    Given Launch the ERP Application 
    When Enter "<username>" and "<password>" click on Login
    Then Validate the "<Result>"

    Examples: 
      | username | password | Result    |
      | admin    |  master  | Dashboard |

