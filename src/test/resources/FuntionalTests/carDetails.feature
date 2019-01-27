Feature: Car Detail test feature 

Scenario: I can search for existing car details in website

 Given I am in the website
 When I enter carNo "OV12UYY"
 And click find vehicle
 Then I should see the search results
 
 Scenario: Searching for non existing car details in website

 Given I am in the website
 When I enter carNo "abc"
 And click find vehicle
 Then I should see the message "Sorry record not found"
 
Scenario: Searching for invalid car no in website

 Given I am in the website
 When I enter carNo "a!!€€"
 And click find vehicle
 Then I should see the error message "Please enter a valid car registration"
 
 Scenario: Searching for blank car no in website

 Given I am in the website
 When I enter carNo " "
 And click find vehicle
 Then I should see the error message "Please enter a valid car registration"
 
