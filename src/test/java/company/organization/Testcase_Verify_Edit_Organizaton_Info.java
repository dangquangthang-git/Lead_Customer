package company.organization;

import com.aventstack.extentreports.Status;
import commons.BaseTest;
import company.individual.Testcase_Create_Individual_Lead;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pageObjects.dsb.LeadPO;
import reportConfigs.ExtentManager;
import staticVariables.staticVars;

import java.lang.reflect.Method;

import static common.Testcase_Search_Filter.indiLeadId;
import static common.Testcase_Search_Filter.orgaLeadId;

public class Testcase_Verify_Edit_Organizaton_Info extends BaseTest {
    @BeforeClass
    public void before() {
        leadPage = Testcase_Create_Individual_Lead.leadPage;
        System.out.println(leadPage);
    }

    @Test
    public void TC01_User_Verify_Organization_Info(Method method) {
        ExtentManager.startTest(method.getName(), "Verify organization info");
        ExtentManager.getTest().log(Status.INFO, "STEP01:close info pop up");
        leadPage.closeInfoPopUP();
        ExtentManager.getTest().log(Status.INFO, "STEP02: clear Lead name search box");
        leadPage.clearLeadNameSearchBox();
        ExtentManager.getTest().log(Status.INFO, "STEP03:search by Lead name " + staticVars.organizationLeadData.leadOrgaName);
        leadPage.searchByLeadName(staticVars.organizationLeadData.leadOrgaName);
        ExtentManager.getTest().log(Status.INFO, "STEP04:click to edit icon");
        leadPage.clickToEditIcon();
        ExtentManager.getTest().log(Status.INFO, "STEP05:verify Lead name " + staticVars.organizationLeadData.leadOrgaName);
        leadPage.verifyLeadName(staticVars.organizationLeadData.leadOrgaName);
        ExtentManager.getTest().log(Status.INFO, "STEP06:verify Lead rep name " + staticVars.organizationLeadData.repName);
        leadPage.verifyRepName(staticVars.organizationLeadData.repName);
        ExtentManager.getTest().log(Status.INFO, "STEP07:verify Lead mobile phone " + staticVars.organizationLeadData.organMobilePhone);
        leadPage.verifyMobilePhone(staticVars.organizationLeadData.organMobilePhone);
        ExtentManager.getTest().log(Status.INFO, "STEP08:verify Lead email " + staticVars.organizationLeadData.organizationEmail);
        leadPage.verifyEmail(staticVars.organizationLeadData.organizationEmail);
        ExtentManager.getTest().log(Status.INFO, "STEP09:verify Lead status: New");
        leadPage.leadStatus("NEW");
        ExtentManager.getTest().log(Status.INFO, "STEP10:verify organization Lead Id " + orgaLeadId);
        leadPage.verifyLeadID(orgaLeadId);
    }

    @Test
    public void TC02_User_Edit_Organization_Info(Method method) {
        ExtentManager.startTest(method.getName(), "Edit individual info");
        ExtentManager.getTest().log(Status.INFO, "STEP01: Click to icon edit");
        leadPage.clickToIconEditInfo("Thông tin cá nhân");
        ExtentManager.getTest().log(Status.INFO, "STEP02: enter new Lead name box " + staticVars.editInfo.editLeadName);
        leadPage.enterNewLeadName(staticVars.editInfo.editOrgaName);
        ExtentManager.getTest().log(Status.INFO, "STEP03: enter new Lead DOB box " + staticVars.editInfo.editDOB);
        leadPage.enterNewRepName(staticVars.editInfo.editRepName);
        ExtentManager.getTest().log(Status.INFO, "STEP04: click to submit change");
        leadPage.clickToSubmitChange("Thông tin cá nhân");
        ExtentManager.getTest().log(Status.INFO, "STEP05: verify new lead name");
        leadPage.verifyLeadName(staticVars.editInfo.editOrgaName);
        System.out.println(staticVars.editInfo.editOrgaName);

        ExtentManager.getTest().log(Status.INFO, "STEP06: Click to icon edit");
        leadPage.clickToIconEditInfo("Thông tin liên hệ");
        ExtentManager.getTest().log(Status.INFO, "STEP07: enter new Lead phone textbox " + staticVars.editInfo.editPhone);
        leadPage.enterNewPhone(staticVars.editInfo.editOrgaPhone);
        ExtentManager.getTest().log(Status.INFO, "STEP08: enter new Lead email textbox " + staticVars.editInfo.editEmail);
        leadPage.enterNewEmail(staticVars.editInfo.editOrgaEmail);
        ExtentManager.getTest().log(Status.INFO, "STEP09: click to submit change");
        leadPage.clickToSubmitChange("Thông tin liên hệ");
    }

    @Test
    public void TC03_User_Verify_Edit_Mission(Method method) {
        ExtentManager.startTest(method.getName(), "Verify mission");
        ExtentManager.getTest().log(Status.INFO, "STEP01: move to mission tab");
        leadPage.moveToMissionTab();
        ExtentManager.getTest().log(Status.INFO, "STEP02: Verify mission name " + staticVars.commonLeadData.missionName);
        leadPage.verifyMissionName(staticVars.commonLeadData.missionName);
        ExtentManager.getTest().log(Status.INFO, "STEP03: Verify mission note " + staticVars.commonLeadData.missionNote);
        leadPage.verifyMissionNote(staticVars.commonLeadData.missionNote);
    }

    @Test
    public void TC04_User_Edit_Mission(Method method) {
        ExtentManager.startTest(method.getName(), "Edit mission");
        ExtentManager.getTest().log(Status.INFO, "STEP01: click to mission tab edit icon");
        leadPage.clickToMissionTabEditIcon();
        ExtentManager.getTest().log(Status.INFO, "STEP02: enter new mission name " + staticVars.editInfo.editMissionName);
        leadPage.enterNewMissionName(staticVars.editInfo.editMissionName);
        ExtentManager.getTest().log(Status.INFO, "STEP03: enter new mission name " + staticVars.editInfo.editMissionNote);
        leadPage.enterNewMissionNote(staticVars.editInfo.editMissionNote);
        ExtentManager.getTest().log(Status.INFO, "STEP04: Click to icon submit edit");
        leadPage.clickToSubmitMissionEdit();
        ExtentManager.getTest().log(Status.INFO, "STEP05: Verify mission name " + staticVars.editInfo.editMissionName);
        leadPage.verifyMissionName(staticVars.editInfo.editMissionName);
        ExtentManager.getTest().log(Status.INFO, "STEP06: Verify mission note " + staticVars.editInfo.editMissionNote);
        leadPage.verifyMissionNote(staticVars.editInfo.editMissionNote);
    }

    @Test
    public void TC05_User_Add_Mission(Method method) {
        ExtentManager.startTest(method.getName(), "Add new mission");
        ExtentManager.getTest().log(Status.INFO, "STEP01: click to add mission icon");
        leadPage.clickToAddMission();
        ExtentManager.getTest().log(Status.INFO, "STEP02: enter new extra mission name " + staticVars.addMission.addMissionName);
        leadPage.enterAddMissionName(staticVars.addMission.addMissionName);
        ExtentManager.getTest().log(Status.INFO, "STEP03: enter new extra mission name " + staticVars.addMission.addMissionTime);
        leadPage.enterAddMissionTime(staticVars.addMission.addMissionTime);
        ExtentManager.getTest().log(Status.INFO, "STEP04: enter new extra interact channel ");
        leadPage.enterAddMissionInteractChannel();
        ExtentManager.getTest().log(Status.INFO, "STEP05: enter new extra mission note " + staticVars.addMission.addMissionNote);
        leadPage.enterAddMissionNote(staticVars.addMission.addMissionNote);
        ExtentManager.getTest().log(Status.INFO, "STEP06: click to add mission submit");
        leadPage.clickToAddMissionSubmit();
        ExtentManager.getTest().log(Status.INFO, "STEP07: click to close info pop up");
        leadPage.closeInfoPopUP();
        ExtentManager.getTest().log(Status.INFO, "STEP08: clear Lead name search box");
        leadPage.clearLeadNameSearchBox();
    }

    private LeadPO leadPage;
}
