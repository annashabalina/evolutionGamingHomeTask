package evolutiongaminghometask.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class SearchPage extends BasePage {
    public SearchPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//td[contains(.,\"Ought word or phrase\")]/following-sibling::td/input")
    private WebElement oughtWordOrPhraseInput;

    @FindBy(css = "input[value='Search']")
    private WebElement searchButton;

    public void selectFromDropdown(String valueFromDropdown, String dropdownName) {
        WebElement dropdown = driver.findElement(By.xpath("//td[contains(.,\"" + dropdownName + "\")]/following-sibling::td/select"));
        Select select = new Select(dropdown);

        /*open dropdown
         * select option by visible text
         * close dropdown after option is selected
         */
        dropdown.click();
        select.selectByVisibleText(valueFromDropdown);
        dropdown.click();
    }

    public void searchForWordOrPhrase(String param) {
        oughtWordOrPhraseInput.clear();
        oughtWordOrPhraseInput.sendKeys(param);

        try {
            WebElement result = driver.findElement(By.xpath("//div[contains(.,'" + param + "')]/b[1]"));
            result.click();
        } catch (StaleElementReferenceException e) {
            WebElement newResult = driver.findElement(By.xpath("//div[contains(.,'" + param + "')]/b[1]"));
            newResult.click();
        }
    }

    public void clickSearchButton() {
        searchButton.click();
    }
}
