package company;

import common.Testcase_Login;
import commons.BaseTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pageObjects.PageGenerator;
import pageObjects.dsb.HomePO;
import pageObjects.dsb.LeadPO;
import pageObjects.dsb.LoginPO;
import staticVariables.staticVars;


public class Testcase_Create_Lead extends BaseTest {
    @BeforeTest
    public void before() {
        driver = Testcase_Login.driver;
        homePage = PageGenerator.getHomePage(driver);
        System.out.println("Cookies: done");
    }

    @Test
    public void TC01_User_Lead_Page() {
        leadPage = homePage.moveToTabLead();
        leadPage.searchByLeadName(staticVars.leadData.leadName);
        leadPage.searchByAddress(staticVars.leadData.leadAddres);
    }

    private LeadPO leadPage;
    private LoginPO loginPage;
    private HomePO homePage;
}
