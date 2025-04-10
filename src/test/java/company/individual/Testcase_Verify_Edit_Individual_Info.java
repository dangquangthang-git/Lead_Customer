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
    public void TC02_User_Verify_Edit_Mission() {
        leadPage.moveToMissionTab();
        leadPage.verifyMissionName(staticVars.commonLeadData.missionName);
        leadPage.verifyMissionNote(staticVars.commonLeadData.missionNote);


    }

    private LeadPO leadPage;
}
