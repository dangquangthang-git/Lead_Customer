package pageObjects.dsb;

import commons.BasePage;
import commons.BaseTest;
import org.openqa.selenium.WebDriver;
import pageObjects.PageGenerator;
import pageUIs.HomePageUI;

public class HomePO extends BasePage {
    WebDriver driver;

    public HomePO(WebDriver driver) {
        this.driver = driver;
    }

    public LeadPO moveToTabLead() {
        waitForElementClickable(driver, HomePageUI.LEAD_TAB);
        clickToElement(driver, HomePageUI.LEAD_TAB);
        return PageGenerator.getLeadPage(driver);
    }
}
