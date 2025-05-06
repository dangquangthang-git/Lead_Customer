package pageObjects.dsb;

import commons.BasePage;
import org.openqa.selenium.*;
import org.testng.Assert;
import pageUIs.LeadPageUI;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
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
        sleepInSecond(3);
    }

    public void searchByAddress(String leadAddres) {
        clickToElement(driver, LeadPageUI.filterSearch.CLEAR_LEAD_NAME);
//        sleepInSecond(1);
        waitForElementVisible(driver, LeadPageUI.filterSearch.SEARCH_BY_ADDRESS);
        sendkeyToElement(driver, LeadPageUI.filterSearch.SEARCH_BY_ADDRESS, leadAddres);
        sleepInSecond(3);

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
        clickToElement(driver, LeadPageUI.filterSearch.APPLY_FILTER);
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
        clickToElement(driver, LeadPageUI.filterSearch.APPLY_FILTER);
    }

    public void checkToClearFilter() {
        sleepInSecond(1);
        waitForElementClickable(driver, LeadPageUI.filterSearch.ORGA_CHECKBOX);
        clickToElement(driver, LeadPageUI.filterSearch.ORGA_CHECKBOX);
        clickToElement(driver, LeadPageUI.filterSearch.CONNECTED_STATUS);
        clickToElement(driver, LeadPageUI.filterSearch.OPEN_DEAL_STATUS);
        sleepInSecond(1);
        clickToElement(driver, LeadPageUI.filterSearch.APPLY_FILTER);
    }

    public void handleFile(String filePath, String savePath) throws AWTException {
        clickToElement(driver, LeadPageUI.commonLeadInfo.UPLOAD_BUTTON);
        sleepInSecond(1);
        clickToElement(driver, LeadPageUI.commonLeadInfo.DOWNLOAD_BUTTON);
        handleSaveDialog(savePath);
        sleepInSecond(1);
        getElement(driver, LeadPageUI.commonLeadInfo.INPUT_FILE).sendKeys(filePath);
        sleepInSecond(1);
        clickToElement(driver, LeadPageUI.commonLeadInfo.UPLOAD_SUBMIT);
    }

    public void verifyUpload(String successMessage) {
        waitForElementVisible(driver, LeadPageUI.commonLeadInfo.UPLOAD_SUCCESS_MESSAGE);
        Assert.assertEquals(getElementText(driver, LeadPageUI.commonLeadInfo.UPLOAD_SUCCESS_MESSAGE), successMessage);
    }

    public void handleSaveDialog(String savePath) throws AWTException {
        Robot robot = new Robot();
        robot.setAutoDelay(1000);
        StringSelection selection = new StringSelection(savePath);
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection, null);
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(new StringSelection(""), null);
    }

    public void clickToEditIcon() {
        hoverToElement(driver, LeadPageUI.verifyLeadInfo.RECORD_01);
        hoverToElement(driver, LeadPageUI.verifyLeadInfo.EDIT_ICON);
        sleepInSecond(1);
        clickToElement(driver, LeadPageUI.verifyLeadInfo.EDIT_ICON);
        sleepInSecond(2);
    }

    public void verifyLeadName(String leadNameVerify) {
        Assert.assertEquals(getElementText(driver, LeadPageUI.verifyLeadInfo.LEAD_NAME_VERIFY, leadNameVerify), leadNameVerify);
    }

    public void verifyDOB(String dobVerify) {
        Assert.assertEquals(getElementText(driver, LeadPageUI.verifyLeadInfo.DOB_VERIFY, dobVerify), dobVerify);
    }

    public void verifyRepName(String repNameVerify) {
        Assert.assertEquals(getElementText(driver, LeadPageUI.verifyLeadInfo.DOB_VERIFY, repNameVerify), repNameVerify);
    }

    public void verifyMobilePhone(String phoneVerify) {
        Assert.assertEquals(getElementText(driver, LeadPageUI.verifyLeadInfo.MOBILEPHONE_VERIFY, phoneVerify), phoneVerify);
    }

    public void verifyEmail(String emailVerify) {
        Assert.assertEquals(getElementText(driver, LeadPageUI.verifyLeadInfo.EMAIL_VERIFY, emailVerify), emailVerify);
    }

    public void leadStatus(String statusVerify) {
        Assert.assertEquals(getElementText(driver, LeadPageUI.verifyLeadInfo.LEAD_STATUS_VERIFY, statusVerify), statusVerify);
    }

    public void verifyLeadID(String idVerify) {
        Assert.assertEquals(getElementText(driver, LeadPageUI.verifyLeadInfo.LEAD_ID_VERIFY, idVerify), idVerify);
    }

    public String getLeadId() {
        return getElementText(driver, LeadPageUI.filterSearch.TABLE_DATA_ID);
    }

    public void closeInfoPopUP() {
        sleepInSecond(1);
        clickToElement(driver, LeadPageUI.verifyLeadInfo.ClOSE_INFO_POPUP);
        pressKeyToElement(driver, LeadPageUI.verifyLeadInfo.ClOSE_INFO_POPUP, Keys.ESCAPE);
    }

    public void clearLeadNameSearchBox() {
        waitForElementClickable(driver, LeadPageUI.filterSearch.CLEAR_LEAD_NAME);
        clickToElement(driver, LeadPageUI.filterSearch.CLEAR_LEAD_NAME);
//        waitForElementClickable(driver, LeadPageUI.filterSearch.SEARCH_BY_NAME);
//        getElement(driver, LeadPageUI.filterSearch.SEARCH_BY_NAME).clear();
    }

    public void moveToMissionTab() {
        waitForElementVisible(driver, LeadPageUI.verifyLeadInfo.MISSION_TAB);
        clickToElement(driver, LeadPageUI.verifyLeadInfo.MISSION_TAB);
    }

    public void verifyMissionName(String missionName) {
        waitForElementVisible(driver, LeadPageUI.verifyLeadInfo.MISSION_TAB_NAME_DETAIL, missionName);
        Assert.assertEquals(getElementText(driver, LeadPageUI.verifyLeadInfo.MISSION_TAB_NAME_DETAIL, missionName), missionName);
        System.out.println(getElementText(driver, LeadPageUI.verifyLeadInfo.MISSION_TAB_NAME_DETAIL, missionName));
    }

    public void verifyMissionNote(String missionNote) {
        waitForElementVisible(driver, LeadPageUI.verifyLeadInfo.MISSION_TAB_NOTE_DETAIL, missionNote);
        Assert.assertEquals(getElementText(driver, LeadPageUI.verifyLeadInfo.MISSION_TAB_NOTE_DETAIL, missionNote), missionNote);
    }

    public void clickToIconEditInfo(String blockName) {
        waitForElementClickable(driver, LeadPageUI.verifyLeadInfo.EDIT_ICON_BLOCK, blockName);
        clickToElement(driver, LeadPageUI.verifyLeadInfo.EDIT_ICON_BLOCK, blockName);
    }

    public void enterNewLeadName(String editLeadName) {
        waitForElementClickable(driver, LeadPageUI.editInfo.NAME_EDIT);
        sendkeyToElement(driver, LeadPageUI.editInfo.NAME_EDIT, editLeadName);
    }

    public void enterNewDOB(String editDOB) {
        waitForElementClickable(driver, LeadPageUI.editInfo.INDI_DOB_EDIT);
        sendkeyToElement(driver, LeadPageUI.editInfo.INDI_DOB_EDIT, editDOB);
        pressKeyToElement(driver, LeadPageUI.editInfo.INDI_DOB_EDIT, Keys.ENTER, editDOB);
        sleepInSecond(1);
    }

    public void clickToSubmitChange(String blockName) {
//        waitForElementClickable(driver, LeadPageUI.editInfo.SUBMIT_CHANGE, blockName);
        sleepInSecond(1);
        scrollToElement(driver, LeadPageUI.editInfo.SUBMIT_CHANGE, blockName);
        clickToElementByJS(driver, LeadPageUI.editInfo.SUBMIT_CHANGE, blockName);
        sleepInSecond(1);
    }

    public void enterNewPhone(String editPhone) {
        waitForElementClickable(driver, LeadPageUI.editInfo.MOBILEPHONE_EDIT);
        sendkeyToElement(driver, LeadPageUI.editInfo.MOBILEPHONE_EDIT, editPhone);
        sleepInSecond(1);
    }

    public void enterNewEmail(String editEmail) {
        waitForElementClickable(driver, LeadPageUI.editInfo.EMAIL_EDIT);
        sendkeyToElement(driver, LeadPageUI.editInfo.EMAIL_EDIT, editEmail);
        sleepInSecond(1);
    }

    public void enterNewRepName(String editRepName) {
        waitForElementClickable(driver, LeadPageUI.editInfo.ORGAN_REPNAME_EDIT);
        sendkeyToElement(driver, LeadPageUI.editInfo.ORGAN_REPNAME_EDIT, editRepName);
    }

    public void clickToMissionTabEditIcon() {
        waitForElementClickable(driver, LeadPageUI.editInfo.MISSION_EDIT_ICON);
        clickToElement(driver, LeadPageUI.editInfo.MISSION_EDIT_ICON);
        sleepInSecond(1);
    }

    public void enterNewMissionName(String editMissionName) {
        waitForElementClickable(driver, LeadPageUI.editInfo.MISSION_NAME_EDIT);
        clearTextbox(driver, LeadPageUI.editInfo.MISSION_NAME_EDIT);
        sendkeyToElement(driver, LeadPageUI.editInfo.MISSION_NAME_EDIT, editMissionName);
    }

    public void enterNewMissionNote(String editMissionNote) {
        waitForElementClickable(driver, LeadPageUI.editInfo.MISSION_NOTE_EDIT);
        clearTextbox(driver, LeadPageUI.editInfo.MISSION_NOTE_EDIT);
        sendkeyToElement(driver, LeadPageUI.editInfo.MISSION_NOTE_EDIT, editMissionNote);
        sleepInSecond(1);
    }

    public void clickToSubmitMissionEdit() {
        waitForElementClickable(driver, LeadPageUI.editInfo.MISSION_SUBMIT_EDIT);
        clickToElement(driver, LeadPageUI.editInfo.MISSION_SUBMIT_EDIT);
    }

    public void enterAddMissionName(String addMissionName) {
        waitForElementClickable(driver, LeadPageUI.editInfo.ADD_MISSION_NAME);
        clearTextbox(driver, LeadPageUI.editInfo.ADD_MISSION_NAME);
        sendkeyToElement(driver, LeadPageUI.editInfo.ADD_MISSION_NAME, addMissionName);
    }

    public void clickToAddMission() {
//        waitForElementClickable(driver, LeadPageUI.editInfo.ADD_MISSION);
        sleepInSecond(2);
        clickToElement(driver, LeadPageUI.editInfo.ADD_MISSION);
    }

    public void enterAddMissionTime(String missionTime) {
        waitForElementClickable(driver, LeadPageUI.editInfo.ADD_MISSION_TIME);
        sendkeyToElement(driver, LeadPageUI.editInfo.ADD_MISSION_TIME, missionTime);
        pressKeyToElement(driver, LeadPageUI.editInfo.ADD_MISSION_TIME, Keys.ENTER);
    }

    public void enterAddMissionNote(String missionNote) {
        waitForElementClickable(driver, LeadPageUI.editInfo.ADD_MISSION_DESCRYPTION);
        sendkeyToElement(driver, LeadPageUI.editInfo.ADD_MISSION_DESCRYPTION, missionNote);
        sleepInSecond(1);
    }

    public void clickToAddMissionSubmit() {
        waitForElementVisible(driver, LeadPageUI.editInfo.ADD_MISSION_SUBMIT);
        clickToElement(driver, LeadPageUI.editInfo.ADD_MISSION_SUBMIT);
    }

    public void enterAddMissionInteractChannel() {
        clickToElement(driver, LeadPageUI.editInfo.ADD_MISSION_INTERACT_CHANNEL);
        clickToElement(driver, LeadPageUI.editInfo.ADD_INTERACT_CHANNEL_OPTION);
    }

    public void clearLeadAddress() {
        WebElement clearBtn = getElement(driver, LeadPageUI.filterSearch.CLEAR_LEAD_ADDRESS);
        clearBtn.click();
        sleepInSecond(1);
    }
}
