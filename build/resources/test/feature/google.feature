Feature: Example google automation

@GoogleExample
Scenario Outline: Open google homepage, search for docker, and verify the first result contains docker
    Given i open the google homepage
     When i search for <search>
     Then the first result should link to <website>
  
    Examples: 
      | search | website    | 
      | docker | docker     | 