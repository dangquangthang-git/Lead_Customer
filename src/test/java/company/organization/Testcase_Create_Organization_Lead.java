package company.organization;

import commons.BaseTest;
import company.individual.Testcase_Create_Individual_Lead;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pageObjects.dsb.HomePO;
import pageObjects.dsb.LeadPO;
import pageObjects.dsb.LoginPO;
import staticVariables.staticVars;

public class Testcase_Create_Organization_Lead extends BaseTest {
    @BeforeTest
    public void before() {

        leadPage = Testcase_Create_Individual_Lead.leadPage;
        System.out.println(leadPage);
    }

    @Test
    public void TC01_User_Create_Lead_Organization() {
        leadPage.openOrganizationCreateLeadPopUp();
        leadPage.enterToOrgaLeadNameTextBox();
        leadPage.enterToRepresentativeTextBox();
        leadPage.enterToMobilePhoneTextBox(staticVars.commonLeadData.mobilePhone);
        leadPage.enterToEmailTextBox(staticVars.commonLeadData.email);
        leadPage.enterToAddressTextBox(staticVars.commonLeadData.province, staticVars.commonLeadData.district, staticVars.commonLeadData.ward, staticVars.commonLeadData.specificAddress);
        leadPage.selectLeadSource(staticVars.commonLeadData.leadSource);
        leadPage.enterToDescryptionTextBox(staticVars.commonLeadData.descryptionText);
        leadPage.enterToMissionNameTextBox(staticVars.commonLeadData.missionName);
        leadPage.enterToMissionTimeTextBox(staticVars.commonLeadData.missionTime);
        leadPage.selectInteractChannel();
        leadPage.enterMissionNoteTextBox(staticVars.commonLeadData.missionNote);
        leadPage.clickToSaveButton();
    }

    private LeadPO leadPage;
    private LoginPO loginPage;
    private HomePO homePage;
}
