package pageObjects;

import org.openqa.selenium.WebDriver;
import pageObjects.dsb.HomePO;
import pageObjects.dsb.LeadPO;
import pageObjects.dsb.LoginPO;

public class PageGenerator {
    public static HomePO getHomePage(WebDriver driver) {
        return new HomePO(driver);
    }

    public static LeadPO getLeadPage(WebDriver driver) {
        return new LeadPO(driver);
    }

    public static LoginPO getLoginPage(WebDriver driver) {
        return new LoginPO(driver);
    }
}
