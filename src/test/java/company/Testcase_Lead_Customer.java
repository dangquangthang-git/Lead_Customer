package company;

import staticVariables.staticVars;
import commons.BaseTest;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import pageObjects.PageGenerator;
import pageObjects.dsb.HomePO;
import pageObjects.dsb.LeadPO;
import pageObjects.dsb.LoginPO;

public class Testcase_Lead_Customer extends BaseTest {
    public WebDriver driver;

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

    @Test
    public void TC02_User_HomePage() {
        leadPage = homePage.moveToTabLead();
    }

    @Test
    public void TC03_User_Lead_Page() {
        leadPage.searchByLeadName(staticVars.leadData.leadName);
        leadPage.searchByAddress(staticVars.leadData.leadAddres);
    }

    @AfterTest
    public void after() {
        driver.close();
    }

    private HomePO homePage;
    private LoginPO loginPage;
    private LeadPO leadPage;


}
