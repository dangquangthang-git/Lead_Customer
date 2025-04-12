package company.individual;

import commons.BaseTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pageObjects.dsb.LeadPO;
import staticVariables.staticVars;

import static common.Testcase_Search.indiLeadId;

public class Testcase_Verify_Edit_Individual_Info extends BaseTest {
    @BeforeClass
    public void before() {
        leadPage = Testcase_Create_Individual_Lead.leadPage;
        System.out.println(leadPage);
    }

    @Test
    public void TC01_User_Verify_Individual_Info() {
        leadPage.searchByLeadName(staticVars.individualLeadData.fullName);
        leadPage.clickToEditIcon();
        leadPage.verifyLeadName(staticVars.individualLeadData.fullName);
        leadPage.verifyDOB(staticVars.individualLeadData.dateOfBirth);
        leadPage.verifyMobilePhone(staticVars.individualLeadData.indiMobilePhone);
        leadPage.verifyEmail(staticVars.individualLeadData.individualEmail);
        leadPage.leadStatus("NEW");
        leadPage.verifyLeadID(indiLeadId);
    }

    @Test
    public void TC02_User_Edit_Individual_Info() {
        leadPage.clickToIconEditInfo("Thông tin cá nhân");
        leadPage.enterNewLeadName(staticVars.editInfo.editLeadName);
        leadPage.enterNewDOB(staticVars.editInfo.editDOB);
        leadPage.clickToSubmitChange("Thông tin cá nhân");
        leadPage.verifyLeadName(staticVars.editInfo.editLeadName);
        System.out.println(staticVars.editInfo.editLeadName);

        leadPage.clickToIconEditInfo("Thông tin liên hệ");
        leadPage.enterNewPhone(staticVars.editInfo.editPhone);
        leadPage.enterNewEmail(staticVars.editInfo.editEmail);
        leadPage.clickToSubmitChange("Thông tin liên hệ");
    }

    @Test
    public void TC03_User_Verify_Mission() {
        leadPage.moveToMissionTab();
        leadPage.verifyMissionName(staticVars.commonLeadData.missionName);
        leadPage.verifyMissionNote(staticVars.commonLeadData.missionNote);
    }

    @Test
    public void TC04_User_Edit_Mission() {
        leadPage.clickToMissionTabEditIcon();
        leadPage.enterNewMissionName(staticVars.editInfo.editMissionName);
        leadPage.enterNewMissionNote(staticVars.editInfo.editMissionNote);
        leadPage.clickToSubmitMissionEdit();
        leadPage.verifyMissionName(staticVars.editInfo.editMissionName);
        leadPage.verifyMissionNote(staticVars.editInfo.editMissionNote);
    }

    private LeadPO leadPage;
}
