package evolutiongaminghometask.step_definitions;

import cucumber.api.java.en.When;
import evolutiongaminghometask.pages.AnnouncementDetails;
import org.openqa.selenium.WebDriver;

/**
 * Created by Пользователь on 09.12.2018.
 */
public class AnnouncementDetailsStepDefinitions {

    WebDriver driver = AbstractStepDefinitions.getDriver();
    private AnnouncementDetails announcementDetails = new AnnouncementDetails(driver);

    @When("^I click on \"([^\"]*)\" from details of the ad$")
    public void i_click_on_from_details_of_the_ad(String linkText) {
        announcementDetails.clickOnLink(linkText);
    }
}
