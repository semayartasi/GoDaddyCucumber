Feature:Login Page
  Scenario: Login with valid credentials

    Given Navigate to Website
    When User enter valid "test12345asd@test.com" and "qwerty12345"
    Then User should be able to login successfully
