import java.sql.*;

public class Database {
    private static final String URL = "jdbc:mysql://localhost:3306/student_db?useSSL=false";
    private static final String USER = "root"; // Thay bằng username của bạn
    private static final String PASSWORD = "918465810"; // Nếu có mật khẩu, nhập vào đây

    public static Connection connect() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
}