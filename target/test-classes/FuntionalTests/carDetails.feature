Feature: Car Detail test feature 

Scenario: I can search for car details in website

 Given I am in the website
 When I enter carNo "OV12UYY"
 And click find vehicle
 Then I should see the search results
