package evolutiongaminghometask.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AnnouncementsListFilter extends BasePage {
    public AnnouncementsListFilter(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//td[@class=\"filter_name\" and contains(text(), 'Age')]//input[@name[contains(.,'min')]]")
    private WebElement minAgeFilterInput;

    @FindBy(xpath = "//td[@class=\"filter_name\" and contains(., 'Age')]//input[@name[contains(.,'max')]]")
    private WebElement maxAgeFilterInput;

    @FindBy(xpath = "//td[@class=\"filter_name\" and contains(., 'Price')]//input[@name[contains(.,'min')]]")
    private WebElement minPriceFilterInput;

    @FindBy(xpath = "//td[@class=\"filter_name\" and contains(., 'Price')]//input[@name[contains(.,'max')]]")
    private WebElement maxPriceFilterInput;

    @FindBy(css = "input[value='AnnouncementsListFilter']")
    private WebElement searchAnnouncements;


    public void filterBy(String filterName, String minValue, String maxValue) {
        if (filterName.equals("Age")) {
            minAgeFilterInput.clear();
            minAgeFilterInput.sendKeys(minValue);

            maxAgeFilterInput.clear();
            maxAgeFilterInput.sendKeys(maxValue);
        }
        if (filterName.equals("Price")) {
            minPriceFilterInput.clear();
            minPriceFilterInput.sendKeys(minValue);

            maxPriceFilterInput.clear();
            maxPriceFilterInput.sendKeys(maxValue);
        }
    }

    public void clickSearchButton() {
        searchAnnouncements.click();
    }

}
