package pageObjects.dsb;

import commons.BasePage;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import pageUIs.LeadPageUI;

import java.util.List;

public class LeadPO extends BasePage {
    WebDriver driver;

    public LeadPO(WebDriver driver) {
        this.driver = driver;
    }


    public void searchByLeadName(String leadName) {
        sleepInSecond(4);
        waitForElementVisible(driver, LeadPageUI.filterSearch.SEARCH_BY_NAME);
        sendkeyToElement(driver, LeadPageUI.filterSearch.SEARCH_BY_NAME, leadName);
        sleepInSecond(5);
    }

    public void searchByAddress(String leadAddres) {
        clickToElement(driver, LeadPageUI.filterSearch.CLEAR_LEAD_NAME);
        sleepInSecond(1);
        waitForElementVisible(driver, LeadPageUI.filterSearch.SEARCH_BY_ADDRESS);
        sendkeyToElement(driver, LeadPageUI.filterSearch.SEARCH_BY_ADDRESS, leadAddres);
        sleepInSecond(5);
        clickToElement(driver, LeadPageUI.filterSearch.CLEAR_LEAD_ADDRESS);
        sleepInSecond(1);
    }

    public void verifyResult(String column, String fieldResult) {
        sleepInSecond(2);
        List<WebElement> nameList = getListElement(driver, column);
        for (WebElement element : nameList) {
            Assert.assertEquals(element.getText(), fieldResult);
        }
    }

    public void verifyResults(String column, String fieldResult1, String fieldResult2) {
        sleepInSecond(2);
        List<WebElement> nameList = getListElement(driver, column);
        for (WebElement element : nameList) {
            String actualText = element.getText().trim();
            Assert.assertTrue(
                    actualText.equals(fieldResult1) || actualText.equals(fieldResult2),
                    "❌ Mismatch: '" + actualText + "' không khớp với '" + fieldResult1 + "' hoặc '" + fieldResult2 + "'"
            );
        }
    }

    public void openIndividualCreateLeadPopUp() {
        waitForElementPresent(driver, LeadPageUI.commonLeadInfo.CREATE_LEAD_BUTTON);
        hoverToElement(driver, LeadPageUI.commonLeadInfo.CREATE_LEAD_BUTTON);
        hoverToElement(driver, LeadPageUI.commonLeadInfo.INDIVIDUAL_LEAD_CREATE);
        clickToElement(driver, LeadPageUI.commonLeadInfo.INDIVIDUAL_LEAD_CREATE);
    }

    public void openOrganizationCreateLeadPopUp() {
        sleepInSecond(5);
        waitForElementClickable(driver, LeadPageUI.commonLeadInfo.CREATE_LEAD_BUTTON);
        hoverToElement(driver, LeadPageUI.commonLeadInfo.CREATE_LEAD_BUTTON);
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", getElement(driver, LeadPageUI.commonLeadInfo.ORGANIZATION_LEAD_CREATE));
        sleepInSecond(1);
    }


    public void enterToFullNameTextBox(String fullName) {
        waitForElementClickable(driver, LeadPageUI.individualInfo.LEAD_FULLNAME_TEXTBOX);
        sendkeyToElement(driver, LeadPageUI.individualInfo.LEAD_FULLNAME_TEXTBOX, fullName);
    }

    public void enterToDOBTextBox(String dateOfBirth) {
        waitForElementClickable(driver, LeadPageUI.individualInfo.LEAD_DOB_TEXTBOX);
        sendkeyToElement(driver, LeadPageUI.individualInfo.LEAD_DOB_TEXTBOX, dateOfBirth);
        pressKeyToElement(driver, LeadPageUI.individualInfo.LEAD_DOB_TEXTBOX, Keys.ENTER);
    }

    public void selectMaleGenderRadioButton() {
        waitForElementClickable(driver, LeadPageUI.individualInfo.MALE_GENDER_RADIO);
        checkToCheckboxRadio(driver, LeadPageUI.individualInfo.MALE_GENDER_RADIO);
    }

    public void enterToMobilePhoneTextBox(String mobilePhone) {
        waitForElementClickable(driver, LeadPageUI.commonLeadInfo.MOBILEPHONE_TEXTBOX);
        sendkeyToElement(driver, LeadPageUI.commonLeadInfo.MOBILEPHONE_TEXTBOX, mobilePhone);
    }

    public void enterToEmailTextBox(String email) {
        waitForElementClickable(driver, LeadPageUI.commonLeadInfo.EMAIL_TEXTBOX);
        sendkeyToElement(driver, LeadPageUI.commonLeadInfo.EMAIL_TEXTBOX, email);
    }

    public void enterToAddressTextBox(String province, String district, String ward, String specificAddress) {
        waitForElementPresent(driver, LeadPageUI.commonLeadInfo.ADDRESS_TEXTBOX);
        scrollToElement(driver, LeadPageUI.commonLeadInfo.ADDRESS_TEXTBOX);
        clickToElement(driver, LeadPageUI.commonLeadInfo.ADDRESS_TEXTBOX);
        sleepInSecond(1);
        clickToElement(driver, LeadPageUI.commonLeadInfo.PROVINCE);
        clickToElement(driver, LeadPageUI.commonLeadInfo.PROVINCE_OPTION);
        pressKeyToElement(driver, LeadPageUI.commonLeadInfo.PROVINCE, Keys.ENTER);
        clickToElement(driver, LeadPageUI.commonLeadInfo.DISTRICT);
        sendkeyToElement(driver, LeadPageUI.commonLeadInfo.DISTRICT, district);
        pressKeyToElement(driver, LeadPageUI.commonLeadInfo.DISTRICT, Keys.ENTER);
        clickToElement(driver, LeadPageUI.commonLeadInfo.WARD);
        sendkeyToElement(driver, LeadPageUI.commonLeadInfo.WARD, ward);
        pressKeyToElement(driver, LeadPageUI.commonLeadInfo.WARD, Keys.ENTER);
        clickToElement(driver, LeadPageUI.commonLeadInfo.SPECIFIC_ADDRESS);
        sendkeyToElement(driver, LeadPageUI.commonLeadInfo.SPECIFIC_ADDRESS, specificAddress);
        pressKeyToElement(driver, LeadPageUI.commonLeadInfo.SPECIFIC_ADDRESS, Keys.ENTER);
        clickToElement(driver, LeadPageUI.commonLeadInfo.ADDRESS_SAVE_BUTTON);
    }

    public void selectLeadSource(String leadSource) {
        waitForElementPresent(driver, LeadPageUI.commonLeadInfo.LEAD_SOURCE);
        scrollToElement(driver, LeadPageUI.commonLeadInfo.LEAD_SOURCE);
        clickToElement(driver, LeadPageUI.commonLeadInfo.LEAD_SOURCE);
        hoverToElement(driver, LeadPageUI.commonLeadInfo.LEAD_OPTION);
        clickToElement(driver, LeadPageUI.commonLeadInfo.LEAD_OPTION);
    }

    public void enterToDescryptionTextBox(String descryptionText) {
        waitForElementClickable(driver, LeadPageUI.commonLeadInfo.DESCRYPTION_TEXTBOX);
        sendkeyToElement(driver, LeadPageUI.commonLeadInfo.DESCRYPTION_TEXTBOX, descryptionText);
    }

    public void enterToMissionNameTextBox(String missionName) {
        waitForElementClickable(driver, LeadPageUI.commonLeadInfo.MISSION_NAME_TEXTBOX);
        sendkeyToElement(driver, LeadPageUI.commonLeadInfo.MISSION_NAME_TEXTBOX, missionName);
    }

    public void enterToMissionTimeTextBox(String missionTime) {
        waitForElementClickable(driver, LeadPageUI.commonLeadInfo.EXECUTIVE_TIME);
        sendkeyToElement(driver, LeadPageUI.commonLeadInfo.EXECUTIVE_TIME, missionTime);
        pressKeyToElement(driver, LeadPageUI.commonLeadInfo.EXECUTIVE_TIME, Keys.ENTER);
    }

    public void selectInteractChannel() {
        clickToElement(driver, LeadPageUI.commonLeadInfo.INTERACT_CHANNEL_PARENT);
        clickToElement(driver, LeadPageUI.commonLeadInfo.INTERACT_CHANNEL_OPTION);
    }

    public void enterMissionNoteTextBox(String missionNote) {
        waitForElementClickable(driver, LeadPageUI.commonLeadInfo.MISSTION_NOTE);
        sendkeyToElement(driver, LeadPageUI.commonLeadInfo.MISSTION_NOTE, missionNote);
    }

    public void clickToSaveButton() {
        waitForElementClickable(driver, LeadPageUI.commonLeadInfo.SAVE_BUTTON);
        clickToElement(driver, LeadPageUI.commonLeadInfo.SAVE_BUTTON);
    }

    public void enterToOrgaLeadNameTextBox(String leadOrgaName) {
        waitForElementClickable(driver, LeadPageUI.organizationInfo.LEAD_ORGANAME_TEXTBOX);
        sendkeyToElement(driver, LeadPageUI.organizationInfo.LEAD_ORGANAME_TEXTBOX, leadOrgaName);
    }

    public void enterToRepresentativeTextBox(String repName) {
        waitForElementClickable(driver, LeadPageUI.organizationInfo.REPRESENTATIVE_TEXTBOX);
        sendkeyToElement(driver, LeadPageUI.organizationInfo.REPRESENTATIVE_TEXTBOX, repName);
    }

    public void clickToFilterIcon() {
        waitForElementVisible(driver, LeadPageUI.filterSearch.FILTER_ICON);
        clickToElement(driver, LeadPageUI.filterSearch.FILTER_ICON);
        sleepInSecond(1);
    }

    public void checkToIndividualAndNew() {
        waitForElementClickable(driver, LeadPageUI.filterSearch.INDIVIDUAL_CHECKBOX);
        clickToElement(driver, LeadPageUI.filterSearch.INDIVIDUAL_CHECKBOX);
        sleepInSecond(1);
        clickToElement(driver, LeadPageUI.filterSearch.NEW_STATUS);
        sleepInSecond(1);
        clickToElement(driver,LeadPageUI.filterSearch.APPLY_FILTER);
    }

    public void checkToOrganizationAndOpendealAndConnected() {
        sleepInSecond(1);
        clickToElement(driver, LeadPageUI.filterSearch.CHECKED_INDIVIDUAL_CHECKBOX);
        clickToElement(driver, LeadPageUI.filterSearch.CHECKED_NEW_STATUS);
        waitForElementClickable(driver, LeadPageUI.filterSearch.ORGA_CHECKBOX);
        clickToElement(driver, LeadPageUI.filterSearch.ORGA_CHECKBOX);
        clickToElement(driver, LeadPageUI.filterSearch.CONNECTED_STATUS);
        clickToElement(driver, LeadPageUI.filterSearch.OPEN_DEAL_STATUS);
        sleepInSecond(1);
        clickToElement(driver,LeadPageUI.filterSearch.APPLY_FILTER);
    }
}
