package evolutiongaminghometask.step_definitions;

import cucumber.api.java.en.When;
import evolutiongaminghometask.pages.AnnouncementsListFilter;
import evolutiongaminghometask.pages.SearchPage;
import org.openqa.selenium.WebDriver;

/**
 * Created by Пользователь on 09.12.2018.
 */
public class SearchStepDefinitions {
    WebDriver driver = AbstractStepDefinitions.getDriver();
    private AnnouncementsListFilter filter = new AnnouncementsListFilter(driver);
    private SearchPage searchPage = new SearchPage(driver);

    @When("^I set (.*) filter param to (\\d+) - (\\d+)$")
    public void i_set_filter_param_to(String filterName, String minValue, String maxValue) {
        filter.filterBy(filterName, minValue, maxValue);
    }

    @When("^I click Search button$")
    public void i_click_Search_button() {
        searchPage.clickSearchButton();
    }

    @When("^I set Ought word or phrase to \"([^\"]*)\"$")
    public void i_set_Ought_word_or_phrase_to(String param) {
        searchPage.searchForWordOrPhrase(param);
    }

    @When("^I select  \"([^\"]*)\" from \"([^\"]*)\" dropdown$")
    public void i_select_from_dropdown(String valueFromDropdown, String dropdownName) {
        searchPage.selectFromDropdown(valueFromDropdown, dropdownName);
    }
}
