package common;

import commons.BaseTest;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import pageObjects.PageGenerator;
import pageObjects.dsb.HomePO;
import pageObjects.dsb.LeadPO;
import pageObjects.dsb.LoginPO;
import staticVariables.staticVars;

import java.util.Set;

public class Testcase_Login extends BaseTest {
    public static WebDriver driver;

    @Parameters({"browser", "url"})
    @BeforeTest
    public void before(String browserName, String url) {
        driver = getBrowserDriver(browserName, url);
        loginPage = PageGenerator.getLoginPage(driver);

    }

    @Test
    public void TC01_User_Login() {
        loginPage.enterToUserName(staticVars.loginData.userName);
        loginPage.enterToPassword(staticVars.loginData.password);
        homePage = loginPage.clickToLoginButton();
    }
    private HomePO homePage;
    private LoginPO loginPage;
    private LeadPO leadPage;
}
