Feature:Search Page
  Scenario Outline: Search taken domain

    Given Navigate to Website
    When User enter valid "test12345asd@test.com" and "qwerty12345"
    Then search a "<takenDomainName>" and click search button

    Examples:
      |takenDomainName|
      |Sema |

#       |Turkey |


