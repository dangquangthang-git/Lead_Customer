package company.individual;

import com.aventstack.extentreports.Status;
import commons.BaseTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pageObjects.dsb.LeadPO;
import reportConfigs.ExtentManager;
import staticVariables.staticVars;

import java.lang.reflect.Method;

import static common.Testcase_Search_Filter.indiLeadId;

public class Testcase_Verify_Edit_Individual_Info extends BaseTest {
    @BeforeClass
    public void before() {
        leadPage = Testcase_Create_Individual_Lead.leadPage;
        System.out.println(leadPage);
    }

    @Test(retryAnalyzer = reportConfigs.RetryAnalyzer.class)
    public void TC01_User_Verify_Individual_Info(Method method) {
        ExtentManager.startTest(method.getName(), "Verify individual info");
        ExtentManager.getTest().log(Status.INFO, "STEP01:search by Lead name " + staticVars.individualLeadData.fullName);
        leadPage.searchByLeadName(staticVars.individualLeadData.fullName);
        ExtentManager.getTest().log(Status.INFO, "STEP02:click to edit icon");
        leadPage.clickToEditIcon();
        ExtentManager.getTest().log(Status.INFO, "STEP03:verify Lead name " + staticVars.individualLeadData.fullName);
        leadPage.verifyLeadName(staticVars.individualLeadData.fullName);
        ExtentManager.getTest().log(Status.INFO, "STEP04:verify Lead DOB " + staticVars.individualLeadData.dateOfBirth);
        leadPage.verifyDOB(staticVars.individualLeadData.dateOfBirth);
        ExtentManager.getTest().log(Status.INFO, "STEP05:verify Lead mobile phone " + staticVars.individualLeadData.indiMobilePhone);
        leadPage.verifyMobilePhone(staticVars.individualLeadData.indiMobilePhone);
        ExtentManager.getTest().log(Status.INFO, "STEP06:verify Lead mobile phone " + staticVars.individualLeadData.individualEmail);
        leadPage.verifyEmail(staticVars.individualLeadData.individualEmail);
        ExtentManager.getTest().log(Status.INFO, "STEP07:verify Lead status: New");
        leadPage.leadStatus("NEW");
        ExtentManager.getTest().log(Status.INFO, "STEP08:verify individual Lead Id " + indiLeadId);
        leadPage.verifyLeadID(indiLeadId);
    }

    @Test
    public void TC02_User_Edit_Individual_Info(Method method) {
        ExtentManager.startTest(method.getName(), "Edit individual info");
        ExtentManager.getTest().log(Status.INFO, "STEP01: Click to icon edit");
        leadPage.clickToIconEditInfo("Thông tin cá nhân");
        ExtentManager.getTest().log(Status.INFO, "STEP02: enter new Lead name box " + staticVars.editInfo.editLeadName);
        leadPage.enterNewLeadName(staticVars.editInfo.editLeadName);
        ExtentManager.getTest().log(Status.INFO, "STEP03: enter new Lead DOB box " + staticVars.editInfo.editDOB);
        leadPage.enterNewDOB(staticVars.editInfo.editDOB);
        ExtentManager.getTest().log(Status.INFO, "STEP04: click to submit change");
        leadPage.clickToSubmitChange("Thông tin cá nhân");
        ExtentManager.getTest().log(Status.INFO, "STEP05: verify new lead name");
        leadPage.verifyLeadName(staticVars.editInfo.editLeadName);
        System.out.println(staticVars.editInfo.editLeadName);

        ExtentManager.getTest().log(Status.INFO, "STEP06: Click to icon edit");
        leadPage.clickToIconEditInfo("Thông tin liên hệ");
        ExtentManager.getTest().log(Status.INFO, "STEP07: enter new Lead phone textbox " + staticVars.editInfo.editPhone);
        leadPage.enterNewPhone(staticVars.editInfo.editPhone);
        ExtentManager.getTest().log(Status.INFO, "STEP08: enter new Lead email textbox " + staticVars.editInfo.editEmail);
        leadPage.enterNewEmail(staticVars.editInfo.editEmail);
        ExtentManager.getTest().log(Status.INFO, "STEP09: click to submit change");
        leadPage.clickToSubmitChange("Thông tin liên hệ");
    }

    @Test
    public void TC03_User_Verify_Mission(Method method) {
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
    }

    private LeadPO leadPage;
}
