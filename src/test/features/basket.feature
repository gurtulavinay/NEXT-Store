Feature:
  As a user
  I should be adding product to bag

  @menu
  Scenario Outline: Validate submenu results
    //Scenario outline is used when we are creating group menu options
    //Scenario is used for general scripts

    Given I'm on the home page "https://www.next.co.uk"
    When I choose a menu option "<menu>"
    When I choose a submenu option "<subMenu>"
    Then I should be in the appropriate results page "<resultsHeader>"



    Examples:
      | menu  | subMenu | resultsHeader |
      | MEN   | Jeans   | Men's Jeans   |
      | WOMEN | Jeans   | Women's Jeans |
      | BOYS  | Shirts  | Boy's Shirts  |
