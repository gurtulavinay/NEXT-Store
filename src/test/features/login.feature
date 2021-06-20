Feature:
  As a user
  I should able to Login

  @login
  Scenario: The user should able to Login with valid data
    Given I'm on the home page "https://www.next.co.uk"
    When I click on my account link
    When I enter Email address or Customer number "gurtula.vinay@gmail.com"
    When I enter password "Gurtula23"
    When I click on sign In button
    Then I should able to login successfully

