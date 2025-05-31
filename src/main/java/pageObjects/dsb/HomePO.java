package pageObjects.dsb;

import commons.BasePage;
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

    public void clickToT0CustomerList() {
        waitForElementClickable(driver, HomePageUI.T0_BUTTON);
        clickToElement(driver, HomePageUI.T0_BUTTON);
    }

    public void enterToCustomerIdTextBox(String customerId) {
        waitForElementClickable(driver, HomePageUI.CUSTOMER_TEXTBOX);
        sendkeyToElement(driver, HomePageUI.CUSTOMER_TEXTBOX, customerId);
    }

    public void clickToSearch() {
//        waitForElementClickable(driver, HomePageUI.SEARCH_BUTTON);
//        clickToElement(driver, HomePageUI.SEARCH_BUTTON);
    }

    public CustProfilePO openCustomerProfile() {
//        waitForElementClickable(driver, );
//        clickToElement(driver, HomePageUI);
        return PageGenerator.getCustProfilePage(driver);
    }

    public CustAssetPO openCustomerAsset() {
//        waitForElementClickable(driver, );
//        clickToElement(driver, HomePageUI);
        return PageGenerator.getCustAssetPage(driver);
    }

    public void verifyCustomerInfo() {
//        waitForElementVisible(driver, );

    }
}
