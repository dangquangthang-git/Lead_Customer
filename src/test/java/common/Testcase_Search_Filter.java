package common;

import com.aventstack.extentreports.Status;
import commons.BaseTest;
import commons.GlobalConstants;
import company.individual.Testcase_Create_Individual_Lead;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pageObjects.dsb.LeadPO;
import pageUIs.LeadPageUI;
import reportConfigs.ExtentManager;
import staticVariables.staticVars;

import java.awt.*;
import java.io.File;
import java.lang.reflect.Method;


public class Testcase_Search_Filter extends BaseTest {
    @BeforeClass
    public void before() {
        leadPage = Testcase_Create_Individual_Lead.leadPage;
    }

    String leadInfo = "leadInfo.xlsx";
    String saveFile = "example.xlsx";
    String leadInfoPath = GlobalConstants.PROJECT_PATH + File.separator + "src\\main\\resources\\uploadFiles" + File.separator + leadInfo;
    String successMessage = "Đã tải file lên thành công";
    String savePath = GlobalConstants.PROJECT_PATH + File.separator + "src\\main\\resources\\downloadFiles" + File.separator + saveFile;
    public static String indiLeadId;
    public static String orgaLeadId;

    @Test
    public void TC01_User_Search_Individual(Method method) {
        ExtentManager.startTest(method.getName(), "Search individual lead");
        ExtentManager.getTest().log(Status.INFO, "STEP01: search by Lead name: " + staticVars.individualLeadData.fullName);
        leadPage.searchByLeadName(staticVars.individualLeadData.fullName);
        ExtentManager.getTest().log(Status.INFO, "STEP02: verify Lead name:");
        leadPage.verifyResult(LeadPageUI.filterSearch.TABLE_DATA_NAME, staticVars.individualLeadData.fullName);
        ExtentManager.getTest().log(Status.INFO, "STEP03: search by Lead address: " + staticVars.commonLeadData.address);
        leadPage.searchByAddress(staticVars.commonLeadData.address);
        ExtentManager.getTest().log(Status.INFO, "STEP04: verify Lead address:");
        leadPage.verifyResult(LeadPageUI.filterSearch.TABLE_DATA_ADDRESS, staticVars.commonLeadData.address);
        indiLeadId = leadPage.getLeadId();
    }

    @Test
    public void TC02_User_Search_Organization(Method method) {
        ExtentManager.startTest(method.getName(), "Search organization lead");
        ExtentManager.getTest().log(Status.INFO, "STEP01: search by Lead name: " + staticVars.organizationLeadData.leadOrgaName);
        leadPage.searchByLeadName(staticVars.organizationLeadData.leadOrgaName);
        ExtentManager.getTest().log(Status.INFO, "STEP02: verify Lead name:");
        leadPage.verifyResult(LeadPageUI.filterSearch.TABLE_DATA_NAME, staticVars.organizationLeadData.leadOrgaName);
        ExtentManager.getTest().log(Status.INFO, "STEP03: search by Lead address: " + staticVars.commonLeadData.address);
        leadPage.searchByAddress(staticVars.commonLeadData.address);
        ExtentManager.getTest().log(Status.INFO, "STEP04: verify Lead address:");
        leadPage.verifyResult(LeadPageUI.filterSearch.TABLE_DATA_ADDRESS, staticVars.commonLeadData.address);
        orgaLeadId = leadPage.getLeadId();
    }

    @Test
    public void TC03_User_Filter(Method method) {
        ExtentManager.startTest(method.getName(), "Filter lead");
        ExtentManager.getTest().log(Status.INFO, "STEP01: click to filter icon");
        leadPage.clickToFilterIcon();
        ExtentManager.getTest().log(Status.INFO, "STEP02: click to individual and new option");
        leadPage.checkToIndividualAndNew();
        ExtentManager.getTest().log(Status.INFO, "STEP03: click to filter icon");
        leadPage.clickToFilterIcon();
        ExtentManager.getTest().log(Status.INFO, "STEP04: verify table data type: cá nhân");
        leadPage.verifyResult(LeadPageUI.filterSearch.TABLE_DATA_TYPE, "Cá nhân");
        ExtentManager.getTest().log(Status.INFO, "STEP04: verify table data status: new");
        leadPage.verifyResult(LeadPageUI.filterSearch.TABLE_DATA_STATUS, "New");

        ExtentManager.getTest().log(Status.INFO, "STEP01: click to filter icon");
        leadPage.clickToFilterIcon();
        ExtentManager.getTest().log(Status.INFO, "STEP02: click to organization and open deal and connected option");
        leadPage.checkToOrganizationAndOpendealAndConnected();
        ExtentManager.getTest().log(Status.INFO, "STEP01: click to filter icon");
        leadPage.clickToFilterIcon();
        ExtentManager.getTest().log(Status.INFO, "STEP04: verify table data type: tổ chức");
        leadPage.verifyResult(LeadPageUI.filterSearch.TABLE_DATA_TYPE, "Tổ chức");
        ExtentManager.getTest().log(Status.INFO, "STEP04: verify table data status: connected, open deal");
        leadPage.verifyResults(LeadPageUI.filterSearch.TABLE_DATA_STATUS, "Connected", "Open deal");
    }

    @Test
    public void TC04_User_Download_UploadFile(Method method) throws AWTException {
        ExtentManager.startTest(method.getName(), "Handle files");
        ExtentManager.getTest().log(Status.INFO, "STEP01: handel files");
        leadPage.handleFile(leadInfoPath, savePath);
        ExtentManager.getTest().log(Status.INFO, "STEP02: verify message upload");
        leadPage.verifyUpload(successMessage);
    }

    private LeadPO leadPage;

}
