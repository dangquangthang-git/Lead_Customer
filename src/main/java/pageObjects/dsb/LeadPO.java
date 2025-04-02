package pageObjects.dsb;

import commons.BasePage;
import commons.BaseTest;
import org.openqa.selenium.WebDriver;
import pageUIs.LeadPageUI;
import pageUIs.LoginPageUI;

public class LeadPO extends BasePage {
    WebDriver driver;

    public LeadPO(WebDriver driver) {
        this.driver = driver;
    }


    public void searchByLeadName(String leadName) {
        waitForElementClickable(driver, LeadPageUI.SEARCH_NAME_TEXTBOX);
        sendkeyToElement(driver, LeadPageUI.SEARCH_NAME_TEXTBOX, leadName);
        sleepInSecond(2);
        clickToElement(driver, LeadPageUI.CLEAR_LEAD_NAME);
    }

    public void searchByAddress(String leadAddres) {
        waitForElementClickable(driver, LeadPageUI.SEARCH_ADDRESS_TEXTBOX);
        sendkeyToElement(driver, LeadPageUI.SEARCH_ADDRESS_TEXTBOX, leadAddres);
        sleepInSecond(2);
        clickToElement(driver, LeadPageUI.CLEAR_LEAD_ADDRESS);
        sleepInSecond(2);
    }
}
