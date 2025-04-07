package pageObjects.dsb;

import commons.BasePage;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import pageUIs.LeadPageUI;

public class LeadPO extends BasePage {
    WebDriver driver;

    public LeadPO(WebDriver driver) {
        this.driver = driver;
    }


    public void searchByLeadName(String leadName) {
        waitForElementClickable(driver, LeadPageUI.commonLeadInfo.SEARCH_NAME_TEXTBOX);
        sendkeyToElement(driver, LeadPageUI.commonLeadInfo.SEARCH_NAME_TEXTBOX, leadName);
        sleepInSecond(2);
        clickToElement(driver, LeadPageUI.commonLeadInfo.CLEAR_LEAD_NAME);
    }

    public void searchByAddress(String leadAddres) {
        waitForElementClickable(driver, LeadPageUI.commonLeadInfo.SEARCH_ADDRESS_TEXTBOX);
        sendkeyToElement(driver, LeadPageUI.commonLeadInfo.SEARCH_ADDRESS_TEXTBOX, leadAddres);
        sleepInSecond(2);
        clickToElement(driver, LeadPageUI.commonLeadInfo.CLEAR_LEAD_ADDRESS);
        sleepInSecond(2);
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

    public void enterToOrgaLeadNameTextBox() {

    }

    public void enterToRepresentativeTextBox() {
    }
}
