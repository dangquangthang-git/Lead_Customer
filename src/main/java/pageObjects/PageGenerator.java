package pageObjects;

import org.openqa.selenium.WebDriver;
import pageObjects.dsb.HomePO;
import pageObjects.dsb.LeadPO;
import pageObjects.dsb.LoginPO;
import pageObjects.dsb.CustAssetPO;
import pageObjects.dsb.CustProfilePO;

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

    public static CustProfilePO getCustProfilePage(WebDriver driver) {
        return new CustProfilePO(driver);
    }

    public static CustAssetPO getCustAssetPage(WebDriver driver) {
        return new CustAssetPO(driver);
    }
}
