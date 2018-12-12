package evolutiongaminghometask.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by Пользователь on 09.12.2018.
 */
public class AnnouncementsList extends BasePage {
    private static List<String> listOfFavoriteAds = new ArrayList<>();

    public AnnouncementsList(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "tr [id=head_line]+tr")
    private WebElement firstAnnouncementInTheList;

    public void clickOnFirstAddInTheList() {
        listOfFavoriteAds.add(firstAnnouncementInTheList.findElement(By.tagName("input")).getAttribute("id"));
        firstAnnouncementInTheList.click();
    }

    public void selectNumberOfItems(int numberOfItems) {
        By inputCssSelector = By.cssSelector("input[type=checkbox]");

        wait.until(
                ExpectedConditions.numberOfElementsToBeMoreThan(
                        inputCssSelector, 0)
        );

        List<WebElement> inputs = driver.findElements(inputCssSelector);
        for (int i = 0; i < numberOfItems; i++) {
            WebElement currentEl = inputs.get(i);
            listOfFavoriteAds.add(currentEl.getAttribute("id"));
            currentEl.click();
        }
    }

    public void clickLink(String linkText) {
        By link = By.linkText(linkText);
        wait.until(ExpectedConditions.elementToBeClickable(link));
        driver.findElement(link).click();
    }

    public List<String> getListOfFavorites() {
        Collections.sort(listOfFavoriteAds);
        return listOfFavoriteAds;
    }

    public void cleanStaticListOfFavorites() {
        listOfFavoriteAds.clear();
    }

}
