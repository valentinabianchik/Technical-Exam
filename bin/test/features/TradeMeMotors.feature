@TradeMe

Feature: TradeMe IU

Scenario: "As a user I can see all the car makes in the makes dropdown"
Given I navigate to the TradeMe motor page
Then I can verify that the number of motor makes is 79

Scenario: "As a user I can validate that each make has the wright amount of cars"
Given I navigate to the TradeMe motor page
When I select the car make <Make>
Then I can see the <Amounts> in the results

Examples:
    | Amounts  | Make     |
    | 29       | Austin   |
    | 140      | Citroen  |
    | 438      | Chevrolet|


