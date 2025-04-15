package common;

import com.aventstack.extentreports.Status;
import commons.BaseTest;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import pageObjects.PageGenerator;
import pageObjects.dsb.HomePO;
import pageObjects.dsb.LeadPO;
import pageObjects.dsb.LoginPO;
import reportConfigs.ExtentManager;
import staticVariables.staticVars;

import java.lang.reflect.Method;

public class Testcase_Login extends BaseTest {
    public static WebDriver driver;
    String browserName;

    @Parameters({"browser", "url"})
    @BeforeTest
    public void before(String browserName, String url) {
        driver = getBrowserDriver(browserName, url);
        this.browserName = browserName;
        loginPage = PageGenerator.getLoginPage(driver);
    }

    @Test
    public void TC01_User_Login(Method method) {
        ExtentManager.startTest(method.getName(), "Log in DSB");
        ExtentManager.getTest().log(Status.INFO, "STEP01: enter userName: " + staticVars.loginData.userName);
        loginPage.enterToUserName(staticVars.loginData.userName);
        ExtentManager.getTest().log(Status.INFO, "STEP02: enter password: " + staticVars.loginData.password);
        loginPage.enterToPassword(staticVars.loginData.password);
        ExtentManager.getTest().log(Status.INFO, "STEP03: Click to Log in button");
        homePage = loginPage.clickToLoginButton();
    }

    private HomePO homePage;
    private LoginPO loginPage;
    private LeadPO leadPage;
}
