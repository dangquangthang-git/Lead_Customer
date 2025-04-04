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
    }

    @Test
    public void TC01_User_Create_Lead_Individual() {
        leadPage = homePage.moveToTabLead();
        leadPage.openCreateLeadPopUp();
        leadPage.enterToFullNameTextBox(staticVars.leadData.fullName);
        leadPage.enterToDOBTextBox(staticVars.leadData.dateOfBirth);
        leadPage.selectMaleGenderRadioButton();
        leadPage.enterToMobilePhoneTextBox(staticVars.leadData.mobilePhone);
        leadPage.enterToEmailTextBox(staticVars.leadData.email);
        leadPage.enterToAddressTextBox(staticVars.leadData.address);
        leadPage.selectLeadSource(staticVars.leadData.leadSource);
        leadPage.enterToDescryptionTextBox(staticVars.leadData.descryptionText);
        leadPage.enterToMissionNameTextBox(staticVars.leadData.missionName);
        leadPage.enterToMissionTimeTextBox(staticVars.leadData.missionTime);
        leadPage.selectInteractChannel();
        leadPage.enterMissionNoteTextBox(staticVars.leadData.missionNote);
        leadPage.clickToSaveButton();

    }


//    @Test
//    public void TC01_User_Lead_Page() {
//
//        leadPage.searchByLeadName(staticVars.leadData.leadName);
//        leadPage.searchByAddress(staticVars.leadData.leadAddres);
//    }

    private LeadPO leadPage;
    private LoginPO loginPage;
    private HomePO homePage;
}
