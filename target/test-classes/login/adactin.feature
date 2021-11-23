Feature: verify the adactin login details
Scenario Outline: verify the logic with valid username and  valid password
    Given user is on adactin login page
    When enter the details valid "<username>" and  "<password>" 
    And click on login button
    Then verify adactin 

    Examples: 
      | Username | Password |
      |tholsb123   | thols@1996   |
       