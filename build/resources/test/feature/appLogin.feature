Feature: As a user I want to be able to login

  # Use Case 1: Employee is Authenticated
  @Login
  Scenario Outline: Login Authentication
    Given I am on the application
    When <name> logs in with <password>
    Then the application shows the <status> login status

    Examples: 
      | name     | password | status  |
      | hkonishi | test     | success |
      | hkonishi | test1    | fail    |

	# Use Case 2: Employee is able to search for employees
	@Login
  Scenario Outline: Employee is able to search for another employee(s)
    Given I am on the application
    When <name> logs in with <password>
    Then the results will be shown

    Examples: 
      | name                        | password |
      | hkonishi | test     |

  # Use Case 3: Can click and view an employee
  Scenario Outline: Click and view an employee
    Given I am on the application
    When <name> logs in with <password>
    Then the user is able to click on the <number> employee and view their profile

    Examples: 
      | name                        | password | number |
      | hkonishi@pyramidsystems.com | test     | first  |
      | hkonishi@pyramidsystems.com | test     | last   |

  # Use Case 3: Employee edit personal profile basic contact information
  Scenario Outline: Edit an employee
    Given I am on the application
    When <name> logs in with <password>
    And the user chooses to edit their profile
    And they change the <attribute> attribute
    Then the attribute will be updated

    Examples: 
      | name                        | password | attribute  |
      | hkonishi@pyramidsystems.com | test     | name       |
      | hkonishi@pyramidsystems.com | test     | phone      |
      | hkonishi@pyramidsystems.com | test     | address    |
      | hkonishi@pyramidsystems.com | test     | email      |
      | hkonishi@pyramidsystems.com | test     | job skills |

  # Use Case 4: Employee is able to search for
  Scenario Outline: Employee is able to search for another employee(s)
    Given I am on the application
    When <name> logs in with <password>
    And the user chooses to search
    And they chose to search for <searchTerm>
    Then the attribute <results> results will be shown

    Examples: 
      | name                        | password | searchTerm | results |
      | hkonishi@pyramidsystems.com | test     | attribute1 | yes     |
      | hkonishi@pyramidsystems.com | test     | attribute2 | no      |
