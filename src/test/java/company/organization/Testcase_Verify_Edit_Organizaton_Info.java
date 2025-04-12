package company.organization;

import commons.BaseTest;
import company.individual.Testcase_Create_Individual_Lead;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pageObjects.dsb.LeadPO;
import staticVariables.staticVars;

import static common.Testcase_Search.indiLeadId;
import static common.Testcase_Search.orgaLeadId;

public class Testcase_Verify_Edit_Organizaton_Info extends BaseTest {
    @BeforeClass
    public void before() {
        leadPage = Testcase_Create_Individual_Lead.leadPage;
        System.out.println(leadPage);
    }

    @Test
    public void TC01_User_Verify_Organization_Info() {
        leadPage.closeInfoPopUP();
        leadPage.clearLeadNameSearchBox();
        leadPage.searchByLeadName(staticVars.organizationLeadData.leadOrgaName);
        leadPage.clickToEditIcon();
        leadPage.verifyLeadName(staticVars.organizationLeadData.leadOrgaName);
        leadPage.verifyRepName(staticVars.organizationLeadData.repName);
        leadPage.verifyMobilePhone(staticVars.organizationLeadData.organMobilePhone);
        leadPage.verifyEmail(staticVars.organizationLeadData.organizationEmail);
        leadPage.leadStatus("NEW");
        leadPage.verifyLeadID(orgaLeadId);
    }

    @Test
    public void TC02_User_Edit_Organization_Info() {
        leadPage.clickToIconEditInfo("Thông tin cá nhân");
        leadPage.enterNewLeadName(staticVars.editInfo.editOrgaName);
        leadPage.enterNewRepName(staticVars.editInfo.editRepName);
        leadPage.clickToSubmitChange("Thông tin cá nhân");
        leadPage.verifyLeadName(staticVars.editInfo.editOrgaName);
        System.out.println(staticVars.editInfo.editOrgaName);

        leadPage.clickToIconEditInfo("Thông tin liên hệ");
        leadPage.enterNewPhone(staticVars.editInfo.editOrgaPhone);
        leadPage.enterNewEmail(staticVars.editInfo.editOrgaEmail);
        leadPage.clickToSubmitChange("Thông tin liên hệ");
    }

    @Test
    public void TC03_User_Verify_Edit_Mission() {
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
        leadPage.closeInfoPopUP();
    }


    private LeadPO leadPage;
}
