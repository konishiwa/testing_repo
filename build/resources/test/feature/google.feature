Feature: Example google automation

Scenario Outline: Open google homepage, search for docker, and verify the first result contains docker
    Given i open the google homepage
     When i search for <search>
     Then the first result should link to <website>
  
    Examples: 
      | search | website                 | 
      | docker | https://www.docker.com/ | 