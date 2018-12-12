package evolutiongaminghometask.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

/**
 * Created by Пользователь on 09.12.2018.
 */
public class Header extends BasePage {
    public Header(WebDriver driver) {
        super(driver);
    }

    public void goToPage(String linkText) {
        WebElement link = driver.findElement(By.linkText(linkText));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", link);
        wait.until(ExpectedConditions.elementToBeClickable(link));
        link.click();
    }
}
