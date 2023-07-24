@Test 

Feature: Test Google Search funcionality

Scenario: As an user I enter a serch criteria on Google
Given I am on the Google Page
When I enter a search criteria
And I click on the search button
Then The results matchs the criteria
