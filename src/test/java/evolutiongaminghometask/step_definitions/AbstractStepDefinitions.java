package evolutiongaminghometask.step_definitions;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import evolutiongaminghometask.pages.AnnouncementsList;
import evolutiongaminghometask.pages.MemoPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

/**
 * Created by Пользователь on 09.12.2018.
 */
public class AbstractStepDefinitions {
    protected static WebDriver driver;

    public static WebDriver getDriver() {
        return driver;
    }

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "src/test/driver/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }

    @After
    public void tearDown() {
        AnnouncementsList list = new AnnouncementsList(getDriver());
        list.cleanStaticListOfFavorites();
        driver.quit();
    }

}
