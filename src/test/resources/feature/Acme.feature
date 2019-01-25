Feature: Example google automation

@API
Scenario: GET /emps endpoint
    Given I get a 200 status from /emps endpoint

@login
Scenario Outline: Employee is authenticated
    Given i open the ACME login page
     When i login with username <username> and password <password>
     Then i should be on the homepage
  
    Examples: 
      | username | password   | 
      | username | password   | 

      
Scenario Outline: Employee is able to view the list of employees in the database
    Given i open the ACME login page
     When i login with username <username> and password <password>
     Then i should be on the homepage
  
    Examples: 
      | username | password   | 
      | username | password   | 
      
Scenario Outline: Employee is able to edit their personal profile that has basic contact information (name, email, phone, and address) and their skills
    Given i login to ACME
    When i click on my name
    And i open my
  
    Examples: 
      | username | password   | 
      | username | password   | 
            
Scenario Outline: Profile details is persisted in the database
    Given i open the ACME login page
     When i login with username <username> and password <password>
     Then i should be on the homepage
  
    Examples: 
      | username | password   | 
      | username | password   |     
        
Scenario Outline: An unbounded number of skills can be provided and stored with the profile
    Given i open the ACME login page
     When i login with username <username> and password <password>
     Then i should be on the homepage
  
    Examples: 
      | username | password   | 
      | username | password   | 