package customerProfile;

import common.Testcase_Login;
import commons.BaseTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pageObjects.PageGenerator;
import pageObjects.dsb.HomePO;
import pageObjects.dsb.CustProfilePO;

import java.lang.reflect.Method;

public class Testcase_Verify_CustInfo extends BaseTest {
    String customerId;

    @BeforeClass
    public void before() {
        driver = Testcase_Login.sharedriver;
        homePO = PageGenerator.getHomePage(driver);
    }

    @Test
    public void TC01_VerifyCustomerProfile(Method method) {
        homePO.clickToT0CustomerList();
        homePO.enterToCustomerIdTextBox(customerId);
        homePO.clickToSearch();
        custProfile = homePO.openCustomerProfile();

//        custProfile.verifyCustomerInfo();
    }

    private HomePO homePO;
    private CustProfilePO custProfile;
}
