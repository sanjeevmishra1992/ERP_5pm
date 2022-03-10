Feature: Sample Test case for read the Test Data
  I want to use this template for my feature file

  @tag2
  Scenario Outline: Marks of the Student
    Given Display the Student "<name>"
    When I check for the <marks> in step
    Then I verify the "<status>" in step

    Examples: 
      | name    | marks | status  |
      | Sanjeev |   36  | PASS    |
      | Modi    |   30  | FAIL    |
