@List
Feature: Test different actions on the Static Table page

Rule: The user can return  values from the table and validate them


Scenario Outline: As a Test Engineer, I want to validate that a text is present inside the list
Given I navigate to the list page
When I search <state> in the list
Then I can find <city> in the list

Examples:
|state|city      |
|W    |Hawaii    |
|C    |California|