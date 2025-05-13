package company.organization;

import com.aventstack.extentreports.Status;
import commons.BaseTest;
import company.individual.Testcase_Create_Individual_Lead;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pageObjects.dsb.HomePO;
import pageObjects.dsb.LeadPO;
import pageObjects.dsb.LoginPO;
import reportConfigs.ExtentManager;
import staticVariables.staticVars;

import java.lang.reflect.Method;

public class Testcase_Create_Organization_Lead extends BaseTest {
    @BeforeClass
    public void before() {
        leadPage = Testcase_Create_Individual_Lead.leadPage;
        System.out.println(leadPage);
    }

    @Test
    public void TC01_User_Create_Lead_Organization(Method method) {
        ExtentManager.startTest(method.getName(), "Create individual lead");
        ExtentManager.getTest().log(Status.INFO, "STEP01: open create Lead popup");
        leadPage.openOrganizationCreateLeadPopUp();
        ExtentManager.getTest().log(Status.INFO, "STEP02: enter Lead organization name " + staticVars.organizationLeadData.leadOrgaName);
        leadPage.enterToOrgaLeadNameTextBox(staticVars.organizationLeadData.leadOrgaName);
        ExtentManager.getTest().log(Status.INFO, "STEP03: enter Lead organization rep name " + staticVars.organizationLeadData.repName);
        leadPage.enterToRepresentativeTextBox(staticVars.organizationLeadData.repName);
        ExtentManager.getTest().log(Status.INFO, "STEP04: enter Lead organization mobile phone " + staticVars.organizationLeadData.organMobilePhone);
        leadPage.enterToMobilePhoneTextBox(staticVars.organizationLeadData.organMobilePhone);
        ExtentManager.getTest().log(Status.INFO, "STEP05: enter Lead organization email " + staticVars.organizationLeadData.organizationEmail);
        leadPage.enterToEmailTextBox(staticVars.organizationLeadData.organizationEmail);
        ExtentManager.getTest().log(Status.INFO, "STEP06: enter Lead organization address");
        leadPage.enterToAddressTextBox(staticVars.commonLeadData.province, staticVars.commonLeadData.district, staticVars.commonLeadData.ward, staticVars.commonLeadData.specificAddress);
        ExtentManager.getTest().log(Status.INFO, "STEP07: enter Lead organization address " + staticVars.commonLeadData.leadSource);
        leadPage.selectLeadSource(staticVars.commonLeadData.leadSource);
        ExtentManager.getTest().log(Status.INFO, "STEP08: enter Lead organization descryption " + staticVars.commonLeadData.descryptionText);
        leadPage.enterToDescryptionTextBox(staticVars.commonLeadData.descryptionText);
        ExtentManager.getTest().log(Status.INFO, "STEP09: enter Lead organization mission name " + staticVars.commonLeadData.missionName);
        leadPage.enterToMissionNameTextBox(staticVars.commonLeadData.missionName);
        ExtentManager.getTest().log(Status.INFO, "STEP10: enter Lead organization mission time " + staticVars.commonLeadData.missionTime);
        leadPage.enterToMissionTimeTextBox(staticVars.commonLeadData.missionTime);
        ExtentManager.getTest().log(Status.INFO, "STEP11: enter Lead interact channel");
        leadPage.selectInteractChannel();
        ExtentManager.getTest().log(Status.INFO, "STEP12: enter Lead organization mission note " + staticVars.commonLeadData.missionNote);
        leadPage.enterMissionNoteTextBox(staticVars.commonLeadData.missionNote);
        ExtentManager.getTest().log(Status.INFO, "STEP13: click to save button");
        leadPage.clickToSaveButton();
    }

    private LeadPO leadPage;
}
