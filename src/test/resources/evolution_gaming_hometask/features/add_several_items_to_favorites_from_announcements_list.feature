Feature:  Add several ads to list of favorites
  Go to any category, list ads, select top three ads and add them to favorites

  Scenario: I add first 3 ads from animals/dogs page to the list of favorites

    Given I am on "animals/dogs/" page
    When I select 3 items
    And I click on "Pievienot izvēlētos Memo" from Announcements list page
    And I open Memo page from header
    Then I see selected ads there