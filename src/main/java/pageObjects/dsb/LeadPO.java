package pageObjects.dsb;

import commons.BasePage;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import pageUIs.LeadPageUI;

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

    public void openCreateLeadPopUp() {
        waitForElementPresent(driver, LeadPageUI.CREATE_LEAD_BUTTON);
        hoverToElement(driver, LeadPageUI.CREATE_LEAD_BUTTON);
        hoverToElement(driver, LeadPageUI.INDIVIDUAL_LEAD_CREATE);
        clickToElement(driver, LeadPageUI.INDIVIDUAL_LEAD_CREATE);
    }

    public void enterToFullNameTextBox(String fullName) {
        waitForElementClickable(driver, LeadPageUI.LEAD_FULLNAME_TEXTBOX);
        sendkeyToElement(driver, LeadPageUI.LEAD_FULLNAME_TEXTBOX, fullName);
    }

    public void enterToDOBTextBox(String dateOfBirth) {
        waitForElementClickable(driver, LeadPageUI.LEAD_DOB_TEXTBOX);
        sendkeyToElement(driver, LeadPageUI.LEAD_DOB_TEXTBOX, dateOfBirth);
        pressKeyToElement(driver, LeadPageUI.LEAD_DOB_TEXTBOX, Keys.ENTER);
    }

    public void selectMaleGenderRadioButton() {
        waitForElementClickable(driver, LeadPageUI.MALE_GENDER_RADIO);
        checkToCheckboxRadio(driver, LeadPageUI.MALE_GENDER_RADIO);
    }

    public void enterToMobilePhoneTextBox(String mobilePhone) {
        waitForElementClickable(driver, LeadPageUI.MOBILEPHONE_TEXTBOX);
        sendkeyToElement(driver, LeadPageUI.MOBILEPHONE_TEXTBOX, mobilePhone);
    }

    public void enterToEmailTextBox(String email) {
        waitForElementClickable(driver, LeadPageUI.EMAIL_TEXTBOX);
        sendkeyToElement(driver, LeadPageUI.EMAIL_TEXTBOX, email);
    }

    public void enterToAddressTextBox(String address) {
        waitForElementPresent(driver, LeadPageUI.ADDRESS_TEXTBOX);
        scrollToElement(driver, LeadPageUI.ADDRESS_TEXTBOX);
        sendkeyToElement(driver, LeadPageUI.ADDRESS_TEXTBOX, address);
    }

    public void selectLeadSource(String leadSource) {
        waitForElementPresent(driver, LeadPageUI.LEAD_SOURCE);
        scrollToElement(driver, LeadPageUI.LEAD_SOURCE);
        clickToElement(driver, LeadPageUI.LEAD_SOURCE);
        hoverToElement(driver, LeadPageUI.LEAD_OPTION);
        clickToElement(driver, LeadPageUI.LEAD_OPTION);
    }

    public void enterToDescryptionTextBox(String descryptionText) {
        waitForElementClickable(driver, LeadPageUI.DESCRYPTION_TEXTBOX);
        sendkeyToElement(driver, LeadPageUI.DESCRYPTION_TEXTBOX, descryptionText);
    }

    public void enterToMissionNameTextBox(String missionName) {
        waitForElementClickable(driver, LeadPageUI.MISSION_NAME_TEXTBOX);
        sendkeyToElement(driver, LeadPageUI.MISSION_NAME_TEXTBOX, missionName);
    }

    public void enterToMissionTimeTextBox(String missionTime) {
        waitForElementClickable(driver, LeadPageUI.EXECUTIVE_TIME);
        sendkeyToElement(driver, LeadPageUI.EXECUTIVE_TIME, missionTime);
        pressKeyToElement(driver, LeadPageUI.EXECUTIVE_TIME, Keys.ENTER);
    }

    public void selectInteractChannel() {
        clickToElement(driver, LeadPageUI.INTERACT_CHANNEL_PARENT);
        clickToElement(driver, LeadPageUI.INTERACT_CHANNEL_OPTION);
    }

    public void enterMissionNoteTextBox(String missionNote) {
        waitForElementClickable(driver, LeadPageUI.MISSTION_NOTE);
        sendkeyToElement(driver, LeadPageUI.MISSTION_NOTE, missionNote);
    }

    public void clickToSaveButton() {
        waitForElementClickable(driver, LeadPageUI.SAVE_BUTTON);
        clickToElement(driver, LeadPageUI.SAVE_BUTTON);
    }
}
