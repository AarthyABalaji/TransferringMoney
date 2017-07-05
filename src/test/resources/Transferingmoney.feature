Feature: Transferring money between accounts

  Scenario Outline: Earning interest
    Given I have an account of type <account-type> with a balance <initial-balance>
    When the monthly interest is calculated
    Then I should have earned at an annual interest rate <interest-rate>
    And I should have a new balance of <new-balance>

    Examples: 
      | account-type | initial-balance | interest-rate | new-balance |
      | "current"    |           10000 |             1 | "10008.33"  |
      | "savings"    |           10000 |             3 | "10025"     |
      | "supersaver" |           10000 |             5 | "10041.67"  |
