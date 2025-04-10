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
        leadPage.closeInfoPopUP(staticVars.individualLeadData.fullName);
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

    private LeadPO leadPage;
}
