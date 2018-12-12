package evolutiongaminghometask.step_definitions;

import cucumber.api.java.en.Then;
import evolutiongaminghometask.pages.Header;
import org.openqa.selenium.WebDriver;

/**
 * Created by Пользователь on 09.12.2018.
 */
public class HeaderPageStepDefinitions {
    WebDriver driver = AbstractStepDefinitions.getDriver();
    private Header header = new Header(driver);

    @Then("^I open (.*) page from header$")
    public void i_open_page_from_header(String linkText) {
        header.goToPage(linkText);
    }
}
