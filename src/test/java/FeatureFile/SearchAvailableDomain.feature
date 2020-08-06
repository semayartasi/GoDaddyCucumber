Feature:Search Page
  Scenario: Search available domain

    Given Navigate to Website
    And User enter valid "test12345asd@test.com" and "qwerty12345"
    When search a domain name and click search button
    Then user should be able too see available
