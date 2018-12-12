package evolutiongaminghometask.step_definitions;

import cucumber.api.java.en.Then;
import evolutiongaminghometask.pages.AnnouncementsList;
import evolutiongaminghometask.pages.MemoPage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import java.util.List;

/**
 * Created by Пользователь on 09.12.2018.
 */
public class MemoPageStepDefinitions {
    WebDriver driver = AbstractStepDefinitions.getDriver();

    private MemoPage memoPage = new MemoPage(driver);
    private List<String> listOfFavoritesIds = new AnnouncementsList(driver).getListOfFavorites();


    @Then("^I see selected ads? there$")
    public void I_see_selected_ad_there() {
        memoPage.verifyOpened();
        Assert.assertEquals(memoPage.getNumberOfFavorites(), listOfFavoritesIds.size());
        Assert.assertEquals(memoPage.getIdsOfFavoriteItems(), listOfFavoritesIds);
    }

}
