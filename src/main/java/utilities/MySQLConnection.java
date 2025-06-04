package utilities;

import java.sql.*;

public class MySQLConnection {
    public static void fetchCustomerData(String databaseURL, String user, String password, String query, String custId) {
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        try {
            // Kết nối đến cơ sở dữ liệu PostgreSQL
            conn = DriverManager.getConnection(databaseURL, user, password);
            // Tạo PreparedStatement từ câu lệnh SQL SELECT
            pstmt = conn.prepareStatement(query);
            pstmt.setString(1, custId);  // Thiết lập giá trị cho parameter trong câu lệnh SQL
            // Thực thi truy vấn và lấy kết quả
            rs = pstmt.executeQuery();
            // Xử lý kết quả trả về
            if (rs.next()) {
                String customerId = rs.getString("customer_id");
                String mobilePhone = rs.getString("mobile_phone");
                String username = rs.getString("username");
                String address = rs.getString("address");
                String email = rs.getString("email");

                // In ra thông tin khách hàng (hoặc lưu vào đối tượng)
                System.out.println("Customer ID: " + customerId);
                System.out.println("MobilePhone: " + mobilePhone);
                System.out.println("Username: " + username);
                System.out.println("Address: " + address);
                System.out.println("Email: " + email);
            } else {
                System.out.println("No customer found with the given ID: " + custId);
            }
        } catch (SQLException e) {
            System.out.println("Error while fetching customer data: " + e.getMessage());
        } finally {
            try {
                // Đảm bảo đóng kết nối và các tài nguyên
                if (rs != null) rs.close();
                if (pstmt != null) pstmt.close();
                if (conn != null) conn.close();
            } catch (SQLException e) {
                System.out.println("Failed to close resources: " + e.getMessage());
            }
        }
    }
}
