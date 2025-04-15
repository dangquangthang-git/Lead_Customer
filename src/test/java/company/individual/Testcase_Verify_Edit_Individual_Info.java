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

    @Test
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

    @Test
    public void TC05_User_Add_Mission() {
        leadPage.clickToAddMission();
        leadPage.enterAddMissionName(staticVars.addMission.addMissionName);
        leadPage.enterAddMissionTime(staticVars.addMission.addMissionTime);
        leadPage.enterAddMissionInteractChannel();
        leadPage.enterAddMissionNote(staticVars.addMission.addMissionNote);
        leadPage.clickToAddMissionSubmit();
    }

    private LeadPO leadPage;
}
