package company.individual;

import com.aventstack.extentreports.Status;
import common.Testcase_Login;
import commons.BaseTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pageObjects.PageGenerator;
import pageObjects.dsb.HomePO;
import pageObjects.dsb.LeadPO;
import reportConfigs.ExtentManager;
import staticVariables.staticVars;

import java.lang.reflect.Method;


public class Testcase_Create_Individual_Lead extends BaseTest {
    @BeforeClass
    public void before() {
        this.driver = Testcase_Login.sharedriver;
        homePage = PageGenerator.getHomePage(driver);
    }

    @Test
    public void TC01_User_Create_Lead_Individual(Method method) {
        ExtentManager.startTest(method.getName(), "Create individual lead");
        ExtentManager.getTest().log(Status.INFO, "STEP01: move to tab Lead");
        leadPage = homePage.moveToTabLead();
        System.out.println(leadPage);
        ExtentManager.getTest().log(Status.INFO, "STEP02: open create Lead popup");
        leadPage.openIndividualCreateLeadPopUp();
        ExtentManager.getTest().log(Status.INFO, "STEP03: enter Lead fullname " + staticVars.individualLeadData.fullName);
        leadPage.enterToFullNameTextBox(staticVars.individualLeadData.fullName);
        ExtentManager.getTest().log(Status.INFO, "STEP04: enter Lead DOB " + staticVars.individualLeadData.dateOfBirth);
        leadPage.enterToDOBTextBox(staticVars.individualLeadData.dateOfBirth);
        ExtentManager.getTest().log(Status.INFO, "STEP05: select Gender: Male");
        leadPage.selectMaleGenderRadioButton();
        ExtentManager.getTest().log(Status.INFO, "STEP06: gender mobilephone " + staticVars.individualLeadData.indiMobilePhone);
        leadPage.enterToMobilePhoneTextBox(staticVars.individualLeadData.indiMobilePhone);
        ExtentManager.getTest().log(Status.INFO, "STEP07: enter Lead Email " + staticVars.individualLeadData.individualEmail);
        leadPage.enterToEmailTextBox(staticVars.individualLeadData.individualEmail);
        ExtentManager.getTest().log(Status.INFO, "STEP08: select Lead Address");
        leadPage.enterToAddressTextBox(staticVars.commonLeadData.province, staticVars.commonLeadData.district, staticVars.commonLeadData.ward, staticVars.commonLeadData.specificAddress);
        ExtentManager.getTest().log(Status.INFO, "STEP09: select Lead Source " + staticVars.commonLeadData.leadSource);
        leadPage.selectLeadSource(staticVars.commonLeadData.leadSource);
        ExtentManager.getTest().log(Status.INFO, "STEP10: enter descryption textbox");
        leadPage.enterToDescryptionTextBox(staticVars.commonLeadData.descryptionText);
        ExtentManager.getTest().log(Status.INFO, "STEP11: enter mission name textbox " + staticVars.commonLeadData.missionName);
        leadPage.enterToMissionNameTextBox(staticVars.commonLeadData.missionName);
        ExtentManager.getTest().log(Status.INFO, "STEP11: enter mission time textbox " + staticVars.commonLeadData.missionTime);
        leadPage.enterToMissionTimeTextBox(staticVars.commonLeadData.missionTime);
        ExtentManager.getTest().log(Status.INFO, "STEP12: select interact channel");
        leadPage.selectInteractChannel();
        ExtentManager.getTest().log(Status.INFO, "STEP13: enter mission note textbox " + staticVars.commonLeadData.missionNote);
        leadPage.enterMissionNoteTextBox(staticVars.commonLeadData.missionNote);
        ExtentManager.getTest().log(Status.INFO, "STEP14: click to save button");
        leadPage.clickToSaveButton();
    }


    public static LeadPO leadPage;
    private HomePO homePage;
}
