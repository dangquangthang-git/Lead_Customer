package customerProfile;

import common.Testcase_Login;
import commons.BaseTest;
import io.restassured.RestAssured;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pageObjects.PageGenerator;
import pageObjects.dsb.CustProfilePO;
import pageObjects.dsb.HomePO;
import staticVariables.custProfileVar;

import static utilities.MySQLConnection.fetchCustomerData;

public class Testcase_Verify_CustInfo extends BaseTest {
    private String customerId;
    private HomePO homePO;
    private CustProfilePO custProfile;

    @BeforeClass
    public void before() {
        driver = Testcase_Login.sharedriver;
        homePO = PageGenerator.getHomePage(driver);
        RestAssured.baseURI = "https://accounts-uat.vndirect.com.vn";

        // Cấu hình kết nối cơ sở dữ liệu
        String custId = custProfileVar.CUSTOMER_ID;
        String databaseUrl = "jdbc:postgresql://10.210.38.71/online_account_krx?stringtype=unspecified";
        String databaseUser = "account_uat";
        String databasePassword = "Grant158";

        // Lấy thông tin khách hàng từ cơ sở dữ liệu
        String query = "SELECT customer_id, mobile_phone, username, address, email FROM customer WHERE customer_id = ?";
        System.out.println("Executing query: " + query);
        fetchCustomerData(databaseUrl, databaseUser, databasePassword, query, custId);
    }


    @Test
    public void TC01_VerifyCustomerProfile() {
        System.out.println("abcd");
        // Bài kiểm tra kiểm tra thông tin khách hàng
//        homePO.clickToT0CustomerList();
//        homePO.enterToCustomerIdTextBox(customerId);
//        homePO.clickToSearch();
//        custProfile = homePO.openCustomerProfile();

        // Ví dụ các phương thức kiểm tra thông tin khách hàng
//        custProfile.verifyFullname();
//        custProfile.verifyCustomerInfo();
    }
}
