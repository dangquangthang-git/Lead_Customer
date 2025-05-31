package customerProfile;

import common.Testcase_Login;
import commons.BaseTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pageObjects.PageGenerator;
import pageObjects.dsb.CustAssetPO;
import pageObjects.dsb.HomePO;

import java.lang.reflect.Method;

public class Testcase_Verify_Customer_AssetProfile extends BaseTest {
    @BeforeClass
    public void before() {
        driver = Testcase_Login.sharedriver;
        homePO = PageGenerator.getHomePage(driver);
    }

    @Test
    public void TC01_VerifyCustomerAsset(Method method) {
        homePO.clickToT0CustomerList();
        String customerId = "";
        homePO.enterToCustomerIdTextBox(customerId);
        homePO.clickToSearch();
        custAssetPO = homePO.openCustomerAsset();

//        custProfile.verifyCustomerInfo();
    }

    private CustAssetPO custAssetPO;
    private HomePO homePO;
}
