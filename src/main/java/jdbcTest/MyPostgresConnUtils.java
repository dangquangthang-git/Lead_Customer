package jdbcTest;

import java.sql.Connection;
import java.sql.DriverManager;

public class MyPostgresConnUtils {
    public static Connection getPostgresConnection() {
        String hostName = "10.210.38.71";
        String dbName = "online_account_krx";
        String userName = "account_uat";
        String password = "Grant158";
        return getPostgresConnection(hostName, dbName, userName, password);
    }


    private static Connection getPostgresConnection(String hostName, String dbName, String userName, String password) {
        Connection conn = null;
        try {
            Class.forName("org.postgresql.Driver");
            String connectionURL = "jdbc:postgresql://" + hostName + ":5432/" + dbName;
            conn = DriverManager.getConnection(connectionURL, userName, password);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return conn;
    }

}
