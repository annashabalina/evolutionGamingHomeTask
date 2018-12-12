Feature:  Add an ad to list of favorites from Search menu
  Add an ad to list of favorites from search results

  Scenario: I search for "Puppy" and add one of search results to favorites

    Given I am on "search/" page
    When I set Ought word or phrase to "Puppy"
    And  I select  "Animals" from "Section" dropdown
    And  I select  "Dogs, puppies" from "Category" dropdown
    And  I select  "Riga" from "Town, region" dropdown
    And I click Search button
    And I select 1 item
    And I click on "Pievienot izvēlētos Memo" from Announcements list page
    And I open Memo page from header
    Then  I see selected ad there