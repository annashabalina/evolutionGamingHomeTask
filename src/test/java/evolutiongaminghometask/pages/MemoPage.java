package evolutiongaminghometask.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by Пользователь on 09.12.2018.
 */
public class MemoPage extends BasePage {
    public MemoPage(WebDriver driver) {
        super(driver);
    }

    @FindBys({
            @FindBy(css = "input[type=checkbox]")
    })
    private List<WebElement> itemsIfMemoList;

    public int getNumberOfFavorites() {
        return itemsIfMemoList.size();
    }

    public List<String> getIdsOfFavoriteItems() {
        List<String> ids = new ArrayList<>();
        for (WebElement i : itemsIfMemoList) {
            ids.add(i.getAttribute("id"));
        }
        Collections.sort(ids);
        return ids;
    }

    public void verifyOpened() {
        By recentlyViewedAds = By.linkText("Recently viewed ads");
        wait.until(ExpectedConditions.elementToBeClickable(recentlyViewedAds));
    }
}
