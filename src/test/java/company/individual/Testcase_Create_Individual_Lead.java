package company.individual;

import common.Testcase_Login;
import commons.BaseTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pageObjects.PageGenerator;
import pageObjects.dsb.HomePO;
import pageObjects.dsb.LeadPO;
import staticVariables.staticVars;


public class Testcase_Create_Individual_Lead extends BaseTest {
    @BeforeClass
    public void before() {
        driver = Testcase_Login.driver;
        homePage = PageGenerator.getHomePage(driver);
    }

    @Test
    public void TC01_User_Create_Lead_Individual() {
        leadPage = homePage.moveToTabLead();
        System.out.println(leadPage);
        leadPage.openIndividualCreateLeadPopUp();
        leadPage.enterToFullNameTextBox(staticVars.individualLeadData.fullName);
        leadPage.enterToDOBTextBox(staticVars.individualLeadData.dateOfBirth);
        leadPage.selectMaleGenderRadioButton();
        leadPage.enterToMobilePhoneTextBox(staticVars.individualLeadData.indiMobilePhone);
        leadPage.enterToEmailTextBox(staticVars.individualLeadData.individualEmail);
        leadPage.enterToAddressTextBox(staticVars.commonLeadData.province, staticVars.commonLeadData.district, staticVars.commonLeadData.ward, staticVars.commonLeadData.specificAddress);
        leadPage.selectLeadSource(staticVars.commonLeadData.leadSource);
        leadPage.enterToDescryptionTextBox(staticVars.commonLeadData.descryptionText);
        leadPage.enterToMissionNameTextBox(staticVars.commonLeadData.missionName);
        leadPage.enterToMissionTimeTextBox(staticVars.commonLeadData.missionTime);
        leadPage.selectInteractChannel();
        leadPage.enterMissionNoteTextBox(staticVars.commonLeadData.missionNote);
        leadPage.clickToSaveButton();
    }




    public static LeadPO leadPage;
    private HomePO homePage;
}
