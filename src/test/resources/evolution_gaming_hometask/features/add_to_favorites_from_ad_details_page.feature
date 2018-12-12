Feature:  Add a single ad to list of favourites
  Go to any category, search for an ad, open it, scroll down to see “Add to favorites”. Once you click it, it gets added to the “Memo" section (on the top in the header menu).

  Scenario: I add an ad to list of Favourites from the details page on the add

    Given I am on "animals/dogs" page
    When I set Age filter param to 0 - 1
    And I set Price filter param to 0 - 100
    And I click Search button
    And I click on first ad in the list
    And I click on "Add to favorites" from details of the ad
    And I open Memo page from header
    Then I see selected ad there