package jdbcTest;

import java.sql.*;

public class MyPostgresTestConnection {
    public static Connection getMyConnection() throws SQLException, ClassNotFoundException {
        return MyPostgresConnUtils.getPostgresConnection();
    }

    public static Customer runQuery(String customer_Id) throws SQLException, ClassNotFoundException {
        System.out.println("Get connection... ");

        Connection conn = MyPostgresTestConnection.getMyConnection();
        System.out.println("Opened connection: " + conn);
        Statement statement = conn.createStatement();
        String sql1 = "SELECT * FROM public.customer WHERE customer_id = ?;";
        PreparedStatement pstm = conn.prepareStatement(sql1);
        pstm.setString(1, customer_Id);
        ResultSet rs = pstm.executeQuery();
        Customer customer = null;
        while (rs.next()) {
            long userId = rs.getLong(1);
            String customerId = rs.getString("customer_id");
            System.out.println("--------------------");
            System.out.println("userId: " + userId);
            System.out.println("customerId: " + customerId);
            customer = new Customer(userId, customerId);
        }
//        Đóng kết nối
        conn.close();
        System.out.println("---------- Closed connection ----------");
        return customer;
    }

}


