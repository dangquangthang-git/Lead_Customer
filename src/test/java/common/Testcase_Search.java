package common;

import commons.BaseTest;
import company.individual.Testcase_Create_Individual_Lead;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pageObjects.dsb.LeadPO;
import pageUIs.LeadPageUI;
import staticVariables.staticVars;

public class Testcase_Search extends BaseTest {
    @BeforeClass
    public void before() {
        leadPage = Testcase_Create_Individual_Lead.leadPage;
        System.out.println(leadPage);
    }

    @Test
    public void TC01_User_Search_Individual() {
        leadPage.searchByLeadName(staticVars.individualLeadData.fullName);
        leadPage.verifyResult(LeadPageUI.filterSearch.TABLE_DATA_NAME, staticVars.individualLeadData.fullName);
        leadPage.searchByAddress(staticVars.commonLeadData.address);
        leadPage.verifyResult(LeadPageUI.filterSearch.TABLE_DATA_ADDRESS, staticVars.commonLeadData.address);
    }

    @Test
    public void TC02_User_Search_Organization() {
        leadPage.searchByLeadName(staticVars.organizationLeadData.leadOrgaName);
        leadPage.verifyResult(LeadPageUI.filterSearch.TABLE_DATA_NAME, staticVars.organizationLeadData.leadOrgaName);
        leadPage.searchByAddress(staticVars.commonLeadData.address);
        leadPage.verifyResult(LeadPageUI.filterSearch.TABLE_DATA_ADDRESS, staticVars.commonLeadData.address);
    }

    @Test
    public void TC03_User_Filter() {
        leadPage.clickToFilterIcon();
        leadPage.checkToIndividualAndNew();
        leadPage.verifyResult(LeadPageUI.filterSearch.TABLE_DATA_TYPE, "Cá nhân");
        leadPage.verifyResult(LeadPageUI.filterSearch.TABLE_DATA_STATUS, "New");


    }

    private LeadPO leadPage;

}
