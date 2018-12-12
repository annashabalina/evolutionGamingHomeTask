package evolutiongaminghometask.step_definitions;

import cucumber.api.java.en.Given;
import org.openqa.selenium.WebDriver;

public class CommonStepDefinitions {

    WebDriver driver = AbstractStepDefinitions.getDriver();
    private static final String BASE_URL = "https://www.ss.com/en";

    @Given("^I am on \"([^\"]*)\" page$")
    public void i_am_on_page(String pageUrl) {
        driver.get(BASE_URL + "/" + pageUrl);
    }

}