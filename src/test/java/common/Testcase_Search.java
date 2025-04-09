package common;

import commons.BaseTest;
import company.individual.Testcase_Create_Individual_Lead;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pageObjects.dsb.LeadPO;
import staticVariables.staticVars;

public class Testcase_Search extends BaseTest {
    @BeforeClass
    public void before() {
        leadPage = Testcase_Create_Individual_Lead.leadPage;
        System.out.println(leadPage);
    }
    @Test
    public void TC01_User_Search_By_Name_Individual() {
        leadPage.searchByLeadName(staticVars.individualLeadData.fullName);
        leadPage.assertName(staticVars.individualLeadData.fullName);
        leadPage.searchByAddress(staticVars.commonLeadData.address);
        leadPage.assertAddress(staticVars.commonLeadData.address);
    }

    @Test
    public void TC01_User_Search_By_Name_Organization() {
        leadPage.searchByLeadName(staticVars.organizationLeadData.leadOrgaName);
        leadPage.assertName(staticVars.organizationLeadData.leadOrgaName);
        leadPage.searchByAddress(staticVars.commonLeadData.address);
        leadPage.assertAddress(staticVars.commonLeadData.address);
    }

    private LeadPO leadPage;

}
