Feature: User login to general store

  Scenario: Successful login with name and country
    Given I launch the app
    When I select "Egypt" as country
    And I enter "Khaled" as name
    And I select gender as "Male"
    And I click the Let's Shop button
    Then I should be taken to the product page

