package evolutiongaminghometask.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * Created by Пользователь on 09.12.2018.
 */
public class AnnouncementDetails extends BasePage {

    public AnnouncementDetails(WebDriver driver) {
        super(driver);
    }

    public void clickOnLink(String linkText) {
        WebElement link = driver.findElement(By.linkText(linkText));
        link.click();
    }
}
