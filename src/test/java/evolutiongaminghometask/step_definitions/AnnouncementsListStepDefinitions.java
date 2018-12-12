package evolutiongaminghometask.step_definitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import evolutiongaminghometask.pages.AnnouncementsList;
import org.openqa.selenium.WebDriver;

public class AnnouncementsListStepDefinitions {
    WebDriver driver = AbstractStepDefinitions.getDriver();
    private AnnouncementsList announcementsList = new AnnouncementsList(driver);

    @When("^I select (\\d+) items?$")
    public void i_select_items(int numberOfItems) {
        announcementsList.selectNumberOfItems(numberOfItems);
    }

    @Given("^I click on \"([^\"]*)\" from Announcements list page$")
    public void i_click_on_from_Announcements_list_page(String linkText) {
        announcementsList.clickLink(linkText);
    }

    @When("^I click on first ad in the list$")
    public void i_click_on_first_ad_in_the_list() {
        announcementsList.clickOnFirstAddInTheList();
    }
}
