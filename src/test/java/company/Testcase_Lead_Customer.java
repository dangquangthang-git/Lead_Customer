package company;

import commons.BaseTest;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Testcase_Lead_Customer extends BaseTest {
    public WebDriver driver;

    @Parameters({"browser", "url"})
    @BeforeTest
    public void before(String browserName, String url) {
        driver = getBrowserDriver(browserName, url);
    }

    @Test
    public void testcase() {
        System.out.println("con gà");
    }

    @AfterTest
    public void after() {
        driver.close();
    }
}
